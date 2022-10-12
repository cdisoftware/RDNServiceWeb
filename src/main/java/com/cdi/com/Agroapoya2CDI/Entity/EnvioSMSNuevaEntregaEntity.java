package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_EnvioSMSNuevaEntrega",
            procedureName = "paC_EnvioSMSNuevaEntrega",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class EnvioSMSNuevaEntregaEntity {

    @Id
    @JsonProperty("id_cliete")
    public Integer id_cliete;

    @JsonProperty("Timepo")
    public Integer Timepo;

    @JsonProperty("HorMin")
    public String HorMin;

}
