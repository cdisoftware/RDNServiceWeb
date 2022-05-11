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
    @JsonProperty("id")
    public Integer id;
    
    @JsonProperty("IdAgenda")
    public Integer IdAgenda;

    @JsonProperty("IdContacto")
    public Integer IdContacto;

    @JsonProperty("IdRueda")
    public Integer IdRueda;

    @JsonProperty("FechaCita")
    public String FechaCita;

    @JsonProperty("HoraInicio")
    public String HoraInicio;

    @JsonProperty("HoraIniFormato")
    public String HoraIniFormato;

    @JsonProperty("HoraFinFormato")
    public String HoraFinFormato;

    @JsonProperty("UbicacionCita")
    public String UbicacionCita;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("Participante")
    public String Participante;

    @JsonProperty("Contacto")
    public Integer Contacto;

    @JsonProperty("NombreContacto")
    public String NombreContacto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("Ciudad")
    public String Ciudad;

    @JsonProperty("IdPais")
    public Integer IdPais;

    @JsonProperty("Pais")
    public String Pais;

    @JsonProperty("EstadoCita")
    public Integer EstadoCita;

    @JsonProperty("DescripcionEstado")
    public String DescripcionEstado;

    @JsonProperty("TipoUsuario")
    public String TipoUsuario;

    @JsonProperty("Motivo")
    public String Motivo;

}
