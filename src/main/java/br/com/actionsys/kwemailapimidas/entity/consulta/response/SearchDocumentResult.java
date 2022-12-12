package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class SearchDocumentResult {

    @JsonProperty("Items")
    private List<Items> items;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Pagination")
    private Pagination pagination;
    @JsonProperty("Success")
    private boolean sucess;

}
