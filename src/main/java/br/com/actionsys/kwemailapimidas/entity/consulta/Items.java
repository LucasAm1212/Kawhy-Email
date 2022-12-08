package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
//Entidade de Items
public class Items {

    @JsonProperty("AccessKey")
    public String accessKey;
    @JsonProperty("Comments")
    public String comments;
    @JsonProperty("CreationDate")
    public String creationDate;
    @JsonProperty("DocumentCode")
    public String documentCode;
    @JsonProperty("DocumentGroup")
    public String documentGroup;
    @JsonProperty("FileName")
    public String fileName;
    @JsonProperty("ItemId")
    public Integer itemId;
    @JsonProperty("MimeType")
    public String mimeType;
    @JsonProperty("PreOccurrence")
    public PreOccurrence preOccurrence;
    @JsonProperty("RelatedFiles")
    public ReleatedFiles relatedFiles = null;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Workflow")
    public Workflow workflow;

}