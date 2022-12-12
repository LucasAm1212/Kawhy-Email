package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
//Entidade de PreOccurrence
public class PreOccurrence {

    @JsonProperty("ChannelType")
    private String channelType;
    @JsonProperty("CreationDate")
    private Integer creationDate;
    @JsonProperty("EmailAccount")
    private EmailAccount emailAccount;
    @JsonProperty("EmailSubject")
    private String emailSubject;
    @JsonProperty("From")
    private String from;
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("MessageGuid")
    private String messageGuid;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("To")
    private String to;

}