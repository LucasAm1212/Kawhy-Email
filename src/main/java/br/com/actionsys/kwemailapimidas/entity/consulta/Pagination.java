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

@Data
public class Pagination {

    @JsonProperty("Count")
    public String count;
    @JsonProperty("CurrentPage")
    public String currentPage;
    @JsonProperty("PageLength")
    public String pageLenght;
    @JsonProperty("TotalPages")
    public String totalPages;

}
