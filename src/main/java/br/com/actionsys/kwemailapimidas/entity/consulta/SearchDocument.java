package br.com.actionsys.kwemailapimidas.entity.consulta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchDocument {

    // Valor retornado da classe Authenticate, com o token de acesso
    @SerializedName("sessionId")
    @Expose
    public String sessionId;
    @SerializedName("searchDocumentInput")
    @Expose
    public SearchDocumentInput searchDocumentInput;
}
