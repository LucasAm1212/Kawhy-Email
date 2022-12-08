package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
//Chama Classe SearchDocumentResult e SearchDocumentWithAttachmentsResult
public class ConsultaResponse {
    @JsonProperty("SearchDocumentResult")
    public SearchDocumentResult searchDocumentResult;

    /*@JsonProperty("SearchDocumentResult")
    public SearchDocumentWithAttachmentsResult searchDocumentWithAttachmentsResult;*/
}