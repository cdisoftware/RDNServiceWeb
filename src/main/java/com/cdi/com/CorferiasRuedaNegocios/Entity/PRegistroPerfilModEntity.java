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
    public Integer IdParticipante;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    public Integer IdPerfilRueda;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("IdUsuarioC")
    public Integer IdUsuarioC;

    @JsonProperty("AceptaTerminos")
    public Integer AceptaTerminos;

    @JsonProperty("Ip")
    public String Ip;

    @JsonProperty("IdContacto")
    public Integer IdContacto;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("FechaAprobacion")
    public String FechaAprobacion;

    @JsonProperty("FechaModifica")
    public String FechaModifica;

    @JsonProperty("BuscOfrec")
    public Integer BuscOfrec;

}
