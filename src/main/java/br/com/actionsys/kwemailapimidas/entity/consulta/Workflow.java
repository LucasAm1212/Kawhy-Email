package br.com.actionsys.kwemailapimidas.entity.consulta;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("jsonschema2pojo")
// --- Getters and Setters ---
@Getter
@Setter
//Transformar em String
@ToString
//Ignorar se for null
@JsonIgnoreProperties(ignoreUnknown = true)
//Entidade de Workflow
public class Workflow {

    @SerializedName("CauseDescription")
    @Expose
    public String causeDescription;
    @SerializedName("CauseId")
    @Expose
    public Integer causeId;
    @SerializedName("Comments")
    @Expose
    public String comments;
    @SerializedName("OccurrenceId")
    @Expose
    public Integer occurrenceId;
    @SerializedName("RejectionDescription")
    @Expose
    public String rejectionDescription;
    @SerializedName("Status")
    @Expose
    public String status;

}
