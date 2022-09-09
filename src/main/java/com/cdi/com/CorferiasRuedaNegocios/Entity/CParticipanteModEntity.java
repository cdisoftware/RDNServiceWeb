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
            name = "paCParticipanteMod",
            procedureName = "paCParticipanteMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CParticipanteModEntity {

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

    @JsonProperty("AgendaAdicional")
    public Integer AgendaAdicional;

    @JsonProperty("NoCitasMin")
    public Integer NoCitasMin;

    @JsonProperty("NoCitasMax")
    public Integer NoCitasMax;

    @JsonProperty("SoloNacional")
    public Integer SoloNacional;

    @JsonProperty("NacionalExp")
    public Integer NacionalExp;

    @JsonProperty("TipoCita")
    public Integer TipoCita;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("IdContacto")
    public Integer IdContacto;

}
