package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pagination {

    @JsonProperty("Count")
    private String count;
    @JsonProperty("CurrentPage")
    private String currentPage;
    @JsonProperty("PageLength")
    private String pageLenght;
    @JsonProperty("TotalPages")
    private String totalPages;

}
