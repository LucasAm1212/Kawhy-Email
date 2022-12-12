package br.com.actionsys.kwemailapimidas.entity.consulta.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
public class SearchDocumentInput {
    @JsonProperty("ItemId")
    private Integer itemId;
    @JsonProperty("ItemStatus")
    private String itemStatus;
    @JsonProperty("OccurrenceId")
    private Integer occurrenceId;
    @JsonProperty("Page")
    private Integer page;
    @JsonProperty("PreOccurrenceId")
    private Integer preOccurrenceId;
    @JsonProperty("To")
    private String to;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;

}
