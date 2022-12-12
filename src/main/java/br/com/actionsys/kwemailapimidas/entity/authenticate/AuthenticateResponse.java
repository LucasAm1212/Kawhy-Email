package br.com.actionsys.kwemailapimidas.entity.authenticate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthenticateResponse {

    @JsonProperty("AuthenticateRequestResult")
    private String authenticateRequestResult;

}
