package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SearchDocumentInput {

    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("ItemStatus")
    private String itemStatus;

    //Identificador da Nota Fiscal
    @JsonProperty("OccurenceId")
    private int occurenceId;
    @JsonProperty("Page")
    private int page;
    @JsonProperty("PreOccurenceId")
    private int preOccurenceId;
    @JsonProperty("To")
    private String to;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;
}
