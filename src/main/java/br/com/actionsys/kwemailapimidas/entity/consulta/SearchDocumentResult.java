package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

@Data
public class SearchDocumentResult {

    @JsonProperty("Items")
    public List<Items> items = null;
    @JsonProperty("Message")
    public String message;
    @JsonProperty("Pagination")
    public Pagination pagination;
    @JsonProperty("Success")
    public boolean sucess;

}
