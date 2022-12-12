package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SearchDocument {

    // Valor retornado da classe Authenticate, com o token de acesso
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonProperty("searchDocumentInput")
    private SearchDocumentInput searchDocumentInput;
}
