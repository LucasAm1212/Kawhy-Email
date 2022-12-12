package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
//Entidade de SearchDocumentWithAttachmentsResult
public class SearchDocumentWithAttachmentsResult {
    @JsonProperty("Items")
    private List<Object> items = null;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Pagination")
    private Pagination pagination;
    @JsonProperty("Success")
    private boolean sucess;
}
