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
            name = "paCAgenda",
            procedureName = "paCAgenda",
            resultClasses = CAgendaEntity.class)
})
public class CAgendaEntity {

    @Id
    @JsonProperty("IdAgenda")
    private Integer IdAgenda;

    @JsonProperty("FechaCita")
    private String FechaCita;

    @JsonProperty("HoraCita")
    private String HoraCita;

    @JsonProperty("UbicacionCita")
    private String UbicacionCita;

    @JsonProperty("EstadoCita")
    private Integer EstadoCita;

    @JsonProperty("DescEstadoCita")
    private String DescEstadoCita;

    @JsonProperty("Solicita")
    private Integer Solicita;

    @JsonProperty("QuienSolicita")
    private String QuienSolicita;

    @JsonProperty("PaisSolicita")
    private String PaisSolicita;

    @JsonProperty("ContactoSolicita")
    private String ContactoSolicita;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("EmailSolicita")
    private String EmailSolicita;

    @JsonProperty("TipoParticipanteS")
    private String TipoParticipanteS;

    @JsonProperty("Aprueba")
    private Integer Aprueba;

    @JsonProperty("EmpresaAprueba")
    private String EmpresaAprueba;

    @JsonProperty("PaisAprueba")
    private String PaisAprueba;

    @JsonProperty("ContactoAprueba")
    private String ContactoAprueba;

    @JsonProperty("TelefonoAprueba")
    private String TelefonoAprueba;

    @JsonProperty("EmailAprueba")
    private String EmailAprueba;

    @JsonProperty("TipoParticipanteA")
    private String TipoParticipanteA;

    @JsonProperty("FechayHoraSolicitud")
    private String FechayHoraSolicitud;

    @JsonProperty("FechayHoraAprobacion")
    private String FechayHoraAprobacion;

    @JsonProperty("FechayHoraCancela")
    private String FechayHoraCancela;

    @JsonProperty("Motivocancelacion")
    private String Motivocancelacion;

    @JsonProperty("QuienCancela")
    private String QuienCancela;

    @JsonProperty("FechayHoraRechazo")
    private String FechayHoraRechazo;

    @JsonProperty("MotivoRechazo")
    private String MotivoRechazo;

    @JsonProperty("QuienRechaza")
    private String QuienRechaza;

    @JsonProperty("FechayHoraReagenda")
    private String FechayHoraReagenda;

    @JsonProperty("MotivoReagenda")
    private String MotivoReagenda;

    @JsonProperty("QuienReagenda")
    private String QuienReagenda;

    @JsonProperty("FechaInicioRdn")
    private String FechaInicioRdn;

    @JsonProperty("FechaFinRdn")
    private String FechaFinRdn;

    @JsonProperty("IdContactoSolicita")
    private Integer IdContactoSolicita;

    @JsonProperty("IdContactoAprueba")
    private Integer IdContactoAprueba;

    @JsonProperty("TipoCita")
    private Integer TipoCita;

    @JsonProperty("DptoSolicitante")
    private String DptoSolicitante;

    @JsonProperty("DptoAprueba")
    private String DptoAprueba;

    @JsonProperty("CiudadSolicitante")
    private String CiudadSolicitante;

    @JsonProperty("CiudadAprueba")
    private String CiudadAprueba;

    @JsonProperty("CelularSolicita")
    private String CelularSolicita;

    @JsonProperty("CelularAprueba")
    private String CelularAprueba;

    @JsonProperty("IdParticipanteS")
    private Integer IdParticipanteS;

    @JsonProperty("IdParticipanteA")
    private Integer IdParticipanteA;
}
