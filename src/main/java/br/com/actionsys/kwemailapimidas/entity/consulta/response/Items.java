package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
//Entidade de Items
public class Items {

    @JsonProperty("AccessKey")
    private String accessKey;
    @JsonProperty("Comments")
    private String comments;
    @JsonProperty("CreationDate")
    private String creationDate;
    @JsonProperty("DocumentCode")
    private String documentCode;
    @JsonProperty("DocumentGroup")
    private String documentGroup;
    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("ItemId")
    private Integer itemId;
    @JsonProperty("MimeType")
    private String mimeType;
    @JsonProperty("PreOccurrence")
    private PreOccurrence preOccurrence;
    @JsonProperty("RelatedFiles")
    private List<RelatedFiles> relatedFiles;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Workflow")
    private Workflow workflow;

}