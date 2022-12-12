package br.com.actionsys.kwemailapimidas.entity.consulta.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RelatedFiles {

    @JsonProperty("Extension")
    private String extension;
    @JsonProperty("File")
    private byte[] file;

}
