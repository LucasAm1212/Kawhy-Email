package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
//Chama Classe SearchDocumentResult e SearchDocumentWithAttachmentsResult
public class ConsultaResponse {
    @JsonProperty("SearchDocumentResult")
    private SearchDocumentResult searchDocumentResult;

}