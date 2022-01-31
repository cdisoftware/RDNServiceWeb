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
            name = "paCAgendaMod",
            procedureName = "paCAgendaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAgendaModEntity {

    @Id
    @JsonProperty("IdAgenda")
    private Integer IdAgenda;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdParticipanteS")
    private Integer IdParticipanteS;

    @JsonProperty("IdParticipanteA")
    private Integer IdParticipanteA;

    @JsonProperty("EstadoCita")
    private Integer EstadoCita;

    @JsonProperty("FechaCita")
    private String FechaCita;

    @JsonProperty("HoraCita")
    private String HoraCita;

    @JsonProperty("UbicacionCita")
    private String UbicacionCita;

    @JsonProperty("MotivoRechazo")
    private String MotivoRechazo;

    @JsonProperty("MotivoReagenda")
    private String MotivoReagenda;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("FechaCancelacion")
    private String FechaCancelacion;

    @JsonProperty("Motivocancelacion")
    private String Motivocancelacion;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("UltimaMod")
    private String UltimaMod;

    @JsonProperty("QuienSolicita")
    private Integer QuienSolicita;

    @JsonProperty("FechaAprobacion")
    private String FechaAprobacion;
    
    @JsonProperty("QuienCancela")
    private Integer QuienCancela;
    
    @JsonProperty("FechaRechazo")
    private String FechaRechazo;
    
    @JsonProperty("QuienRechaza")
    private Integer QuienRechaza;
    
    @JsonProperty("FechaReagenda")
    private String FechaReagenda;
    
    @JsonProperty("QuienReagenda")
    private Integer QuienReagenda;
    
    @JsonProperty("IdContactoS")
    private Integer IdContactoS;
    
    @JsonProperty("IdContactoA")
    private Integer IdContactoA;
}
