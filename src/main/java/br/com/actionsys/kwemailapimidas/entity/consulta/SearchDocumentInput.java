package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.Date;

@Generated("jsonschema2pojo")
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchDocumentInput {

    @SerializedName("ItemId")
    @Expose
    public String itemId;
    @SerializedName("ItemStatus")
    @Expose
    public String itemStatus;

    //Identificador da Nota Fiscal
    @SerializedName("OccurenceId")
    @Expose
    public int occurenceId;
    @SerializedName("Page")
    @Expose
    public int page;
    @SerializedName("PreOccurenceId")
    @Expose
    public int preOccurenceId;
    @SerializedName("To")
    @Expose
    public String to;
    @SerializedName("StartDate")
    @Expose
    public String startDate;
    @SerializedName("EndDate")
    @Expose
    public String endDate;
}
