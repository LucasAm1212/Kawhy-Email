package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleatedFiles {

    @SerializedName("Extension")
    public String extension;
    @SerializedName("File")
    public byte[] file;

}
