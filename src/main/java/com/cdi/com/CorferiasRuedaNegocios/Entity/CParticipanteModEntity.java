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
    private Integer IdParticipante ;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda ;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("AceptaTerminos")
    private Integer AceptaTerminos;

    @JsonProperty("Ip")
    private String Ip;

    @JsonProperty("AgendaAdicional")
    private Integer AgendaAdicional;

    @JsonProperty("NoCitasMin")
    private Integer NoCitasMin;

    @JsonProperty("NoCitasMax")
    private Integer NoCitasMax;

    @JsonProperty("SoloNacional")
    private Integer SoloNacional;

    @JsonProperty("NacionalExp")
    private Integer NacionalExp;

    @JsonProperty("TipoCita")
    private Integer TipoCita;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Observaciones")
    private String Observaciones;

}
