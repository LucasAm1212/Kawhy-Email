package br.com.actionsys.kwemailapimidas.route;

import br.com.actionsys.kwemailapimidas.entity.authenticate.AuthenticateRequest;
import br.com.actionsys.kwemailapimidas.entity.authenticate.AuthenticateResponse;
import br.com.actionsys.kwemailapimidas.entity.consulta.request.ConsultaRequest;
import br.com.actionsys.kwemailapimidas.entity.consulta.request.SearchDocumentInput;
import br.com.actionsys.kwemailapimidas.entity.consulta.response.ConsultaResponse;
import br.com.actionsys.kwemailapimidas.entity.consulta.response.Items;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.ExpressionBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.apache.camel.LoggingLevel.INFO;

@Component
@Slf4j
public class FileRoute extends RouteBuilder {

    private String path = "/home/lucas/desenv/workspace-actionsys/kawhyEmailAPI-master/raiz/";

    @Override
    public void configure() throws Exception {

        AuthenticateRequest req = new AuthenticateRequest();

        req.setLogin("ACTION");
        req.setPassword("6K5X3HYS");

        from("timer://scheduler?period=300000s")
        .to("direct:login");

//        Login
        from("direct:login")
            .setBody().constant(req).marshal().json()
            .setHeader("CamelHttpMethod").simple("POST")
            .setHeader("Content-type").simple("application/json")
            .to("https://ani-ws.midassolutions.com.br/actionsys/wcf/argo.wcf.wcfnix.svc/rest/AuthenticateRequest")
            .unmarshal().json(AuthenticateResponse.class)
            .process(exchange -> {
                exchange.getIn().getBody();
            })
            .log(INFO, this.log,"${body}")
        .to("direct:consult");


//        Consulta
        from("direct:consult")
            .transform(ExpressionBuilder.bodyExpression(o -> {
                    AuthenticateResponse body = (AuthenticateResponse) o;

                    ConsultaRequest request = ConsultaRequest.builder()
                            .sessionId(body.getAuthenticateRequestResult())
                            .searchDocumentInput(SearchDocumentInput.builder()
                                    .itemId(0)
                                    .itemStatus("F")
                                    .occurrenceId(0)
                                    .page(1)
                                    .preOccurrenceId(0)
                                    .to("")
                                    .startDate("/Date(151477200000)/")
                                    .endDate("/Date(1665889200000)/")
                            .build())
                    .build();

                    return request;
            }))
            .marshal().json()
            .log(INFO, this.log,"${body}")
            .setHeader("CamelHttpMethod").simple("POST")
            .setHeader("Content-type").simple("application/json")
            .to("https://ani-ws.midassolutions.com.br/actionsys/wcf/argo.wcf.wcfnix.svc/rest/searchdocument")
            .unmarshal().json(ConsultaResponse.class)
            .split(ExpressionBuilder.bodyExpression(o -> {
                    ConsultaResponse body = (ConsultaResponse) o;
                    List<String> result = new ArrayList<>();
                    for (Items items : body.getSearchDocumentResult().getItems()) {
                        Integer idCurrent = items.getWorkflow().getOccurrenceId();
                        result.add(String.valueOf(idCurrent));
                    }
                    return result;
            }))
            .process(exchange -> {
                exchange.getIn().getBody();
            })
        .to("direct:download");


        from("direct:consult")
            .log(INFO, this.log,"${body}");

    }
}
