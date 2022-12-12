package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
//Entidade de EmailAccount
public class EmailAccount {
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Username")
    private String username;

}