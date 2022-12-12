package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
//Entidade de Workflow
public class Workflow {

    @JsonProperty("CauseDescription")
    private String causeDescription;
    @JsonProperty("CauseId")
    private Integer causeId;
    @JsonProperty("Comments")
    private String comments;
    @JsonProperty("OccurrenceId")
    private Integer occurrenceId;
    @JsonProperty("RejectionDescription")
    private String rejectionDescription;
    @JsonProperty("Status")
    private String status;

}
