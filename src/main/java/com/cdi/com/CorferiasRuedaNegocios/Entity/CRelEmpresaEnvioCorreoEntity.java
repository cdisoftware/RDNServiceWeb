package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paCRelEmpresaEnvioCorreo",
            procedureName = "paCRelEmpresaEnvioCorreo",
            resultClasses = CRelEmpresaEnvioCorreoEntity.class),
     @NamedStoredProcedureQuery(
            name = "paCRelEmpresaEnvioCorreoMod",
            procedureName = "paCRelEmpresaEnvioCorreoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRelEmpresaEnvioCorreoEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("IdEnvioCorreo")
    private Integer IdEnvioCorreo;

    @JsonProperty("Participante")
    private String Participante;
}
