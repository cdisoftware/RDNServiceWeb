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
            name = "paPCitasAgendaPdf",
            procedureName = "paPCitasAgendaPdf",
            resultClasses = PCitasAgendaPdfEntity.class)
})
public class PCitasAgendaPdfEntity {

    @Id
    @JsonProperty("IdAgenda")
    private Integer IdAgenda;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("FechaCita")
    private String FechaCita;

    @JsonProperty("HoraInicio")
    private String HoraInicio;

    @JsonProperty("HoraInicioFormato")
    private String HoraInicioFormato;

    @JsonProperty("HoraFinFormato")
    private String HoraFinFormato;

    @JsonProperty("UbicacionCita")
    private String UbicacionCita;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Participante")
    private String Participante;

    @JsonProperty("Contacto")
    private Integer Contacto;

    @JsonProperty("NombreContacto")
    private String NombreContacto;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("EstadoCita")
    private Integer EstadoCita;

    @JsonProperty("DescripcionEstado")
    private String DescripcionEstado;

    @JsonProperty("TipoUsuario")
    private String TipoUsuario;

    @JsonProperty("Motivo")
    private String Motivo;

}
