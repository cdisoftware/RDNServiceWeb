package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPAgenda",
            procedureName = "paPAgenda",
            resultClasses = PAgendaEntity.class)
})
public class PAgendaEntity {

    @Id
    @JsonProperty("IdAgenda")
    public Integer IdAgenda;

    @JsonProperty("FechaCita")
    public String FechaCita;

    @JsonProperty("HoraCita")
    public String HoraCita;

    @JsonProperty("EstadoCita")
    public Integer EstadoCita;

    @JsonProperty("DescEstadoCita")
    public String DescEstadoCita;

    @JsonProperty("EmpresaSolicitada")
    public String EmpresaSolicitada;

    @JsonProperty("ContactoSolicita")
    public String ContactoSolicita;

    @JsonProperty("ContactoAprueba")
    public String ContactoAprueba;

    @JsonProperty("IdContactoA")
    public Integer IdContactoA;

    @JsonProperty("IdContactoS")
    public Integer IdContactoS;

    @JsonProperty("MotivoRechazo")
    public String MotivoRechazo;

    @JsonProperty("MotivoReagenda")
    public String MotivoReagenda;

    @JsonProperty("MotivoCancelacion")
    public String MotivoCancelacion;

    @JsonProperty("IdParticipanteS")
    public Integer IdParticipanteS;

    @JsonProperty("IdParticipanteA")
    public Integer IdParticipanteA;

    @JsonProperty("MotivoReserva")
    public String MotivoReserva;

    @JsonProperty("HoraFinCita")
    public String HoraFinCita;

    @JsonProperty("idSala")
    public String idSala;

    @JsonProperty("linkSala")
    public String linkSala;

    @JsonProperty("IdTipoRueda")
    public Integer IdTipoRueda;

}
