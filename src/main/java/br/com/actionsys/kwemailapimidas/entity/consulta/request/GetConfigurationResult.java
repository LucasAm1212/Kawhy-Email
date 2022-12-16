package br.com.actionsys.kwemailapimidas.entity.consulta.request;

import br.com.actionsys.kwemailapimidas.entity.consulta.response.RelatedFiles;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetConfigurationResult {

    @JsonProperty("Message")
    private String message;

    @JsonProperty("BusinessManagementConfigurationItems")
    private List<BusinessManagementConfigurationItems>  businessManagementConfigurationItems;

    @JsonProperty("Success")
    private Boolean success;

}
