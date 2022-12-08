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
//Entidade de PreOccurrence
public class PreOccurrence {

    @SerializedName("ChannelType")
    @Expose
    public String channelType;
    @SerializedName("CreationDate")
    @Expose
    public Integer creationDate;
    @SerializedName("EmailAccount")
    @Expose
    public EmailAccount emailAccount;
    @SerializedName("EmailSubject")
    @Expose
    public String emailSubject;
    @SerializedName("From")
    @Expose
    public String from;
    @SerializedName("Id")
    @Expose
    public Integer id;
    @SerializedName("MessageGuid")
    @Expose
    public String messageGuid;
    @SerializedName("Status")
    @Expose
    public String status;
    @SerializedName("To")
    @Expose
    public String to;

}