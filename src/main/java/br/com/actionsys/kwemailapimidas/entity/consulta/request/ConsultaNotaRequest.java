package br.com.actionsys.kwemailapimidas.entity.consulta.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsultaNotaRequest {

    private GetConfigurationResult getConfigurationResult;
    
}
