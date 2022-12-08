package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
// --- Getters and Setters ---
@Getter
@Setter
//Transformar em String
@ToString
//Ignorar se for null
@JsonIgnoreProperties(ignoreUnknown = true)
//Entidade de SearchDocumentWithAttachmentsResult
public class SearchDocumentWithAttachmentsResult {
    @SerializedName("Items")
    @Expose
    public List<Object> items = null;
    @SerializedName("Message")
    @Expose
    public String message;
    @SerializedName("Pagination")
    @Expose
    public Pagination pagination;
    @SerializedName("Success")
    @Expose
    public boolean sucess;
}
