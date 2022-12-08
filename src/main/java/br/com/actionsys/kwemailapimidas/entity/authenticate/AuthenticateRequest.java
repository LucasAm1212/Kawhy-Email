package br.com.actionsys.kwemailapimidas.entity.authenticate;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AuthenticateRequest {

    private String login;
    private String password;

}
