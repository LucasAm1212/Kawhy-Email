package br.com.actionsys.kwemailapimidas.entity.consulta.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsultaRequest {

    private String sessionId;
    private SearchDocumentInput searchDocumentInput;

}
