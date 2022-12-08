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

//Entidade de EmailAccount
public class EmailAccount {
    @SerializedName("Email")
    @Expose
    public String email;
    @SerializedName("Username")
    @Expose
    public String username;

}