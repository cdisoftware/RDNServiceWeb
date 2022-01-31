package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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
            name = "paPRegistroPerfilMod",
            procedureName = "paPRegistroPerfilMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            }),
    @NamedStoredProcedureQuery(
            name = "paPRelacionContactoMod",
            procedureName = "paPRelacionContactoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PRegistroPerfilModEntity implements Serializable {

    @Id
    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("AceptaTerminos")
    private Integer AceptaTerminos;

    @JsonProperty("Ip")
    private String Ip;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("FechaAprobacion")
    private String FechaAprobacion;

    @JsonProperty("FechaModifica")
    private String FechaModifica;

}
