package br.com.actionsys.kwemailapimidas.entity.consulta.request;

import br.com.actionsys.kwemailapimidas.entity.consulta.response.SearchDocumentResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BusinessManagementConfigurationItems {
    @JsonProperty("__type")
    private String type;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("InscricaoMunicipal")
    private String inscricaoMunicipal;

    @JsonProperty("LastGeneratedUniqueNumber")
    private String lastGeneratedUniqueNumber;

    @JsonProperty("LastSearchedDate")
    private String lastSearchedDate;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("Status")
    private Boolean status;

    @JsonProperty("Uf")
    private String uf;

    @JsonProperty("User")
    private String user;

}
