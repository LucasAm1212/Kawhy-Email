package br.com.actionsys.kwemailapimidas.route;

import br.com.actionsys.kwemailapimidas.entity.consulta.Items;
import br.com.actionsys.kwemailapimidas.entity.consulta.ConsultaResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.gson.GsonDataFormat;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static org.apache.camel.LoggingLevel.INFO;

@Component
@Slf4j
public class FileRoute extends RouteBuilder {

    //"C:\Users\LuizBastos\Documents\apache-camel\";
    private String path = "/home/lucas/desenv/workspace-actionsys/kawhyEmailAPI-master/raiz/";

    @Override
    public void configure() throws Exception {

        Processor myprocess = exchange -> {
            ConsultaResponse response = (ConsultaResponse) exchange.getIn().getBody();
            log.info("response" + response);
        };


        from("file://" + path + "input?delete=true")
                .log(INFO, this.log, "Serialized: ${body}")
                .unmarshal().json(ConsultaResponse.class)
                .process(myprocess)
                .to("file://" + path + "output?flatten=true");

                //java.io.File file = new java.io.File("/home/lucas/desenv/workspace-actionsys/kawhyEmailAPI-master/raiz/arquivo.xml");
                //FileOutputStream in = new FileOutputStream(file) ;
                //in.write();
                //in.close();

        //Login Autenticado
        //from("timer://scheduler?period=100s")
                //.to("direct:http");

        /*AuthenticateRequest req = new AuthenticateRequest();

        req.setLogin("ACTION");
        req.setPassword("6K5X3HYS");

        from("direct:http")
                .setBody().constant(req).marshal().json()
                .setHeader("CamelHttpMethod").simple("POST")
                .setHeader("Content-type").simple("application/json")
                .to("https://ani-ws.midassolutions.com.br/actionsys/wcf/argo.wcf.wcfnix.svc/rest/AuthenticateRequest?throwExceptionOnFailure=false")
                .process(exchange -> {
                    exchange.getIn().getBody();
                })
                .unmarshal().json(AuthenticateResponse.class)
                .process(exchange -> {
                    exchange.getIn().getBody();
                })
                .log(INFO, this.log,"${body}");*/
    }
}
