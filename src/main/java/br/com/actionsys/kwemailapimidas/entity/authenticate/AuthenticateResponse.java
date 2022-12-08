package br.com.actionsys.kwemailapimidas.entity.authenticate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

//@Generated("jsonschema2pojo")
@Data
public class AuthenticateResponse {

    @JsonProperty("AuthenticateRequestResult")
    public String authenticateRequestResult;

}
