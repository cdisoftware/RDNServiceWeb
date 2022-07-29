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
            name = "paCRepRespuestasGeneral",
            procedureName = "paCRepRespuestasGeneral",
            resultClasses = CRepRespuestasGeneralEntity.class)
})
public class CRepRespuestasGeneralEntity {

    @Id
    @JsonProperty("idcontacto")
    public Integer idcontacto;

    @JsonProperty("IdEvaluacion")
    public Integer IdEvaluacion;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("Participante")
    public String Participante;

    @JsonProperty("TipoIdContacto")
    public String TipoIdContacto;

    @JsonProperty("NroIdContacto")
    public String NroIdContacto;

    @JsonProperty("Contacto")
    public String Contacto;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("RuedadeNegocios")
    public String Ruedadenegocios;

    @JsonProperty("Estado")
    public String Estado;

    @JsonProperty("FechaActivacion")
    public String FechaActivacion;

    @JsonProperty("FechaInactiva")
    public String FechaInactiva;

    @JsonProperty("Perfil")
    public String Perfil;

    @JsonProperty("IdTipoEvaEnc")
    public Integer IdTipoEvaEnc;

    @JsonProperty("TipoEvaluacion")
    public String TipoEvaluacion;

    @JsonProperty("FechaPublicacion")
    public String FechaPublicacion;

    @JsonProperty("Codigo")
    public String Codigo;

    @JsonProperty("RegistroRespuesta")
    public String RegistroRespuesta;
    
     @JsonProperty("Pregunta1")
    public String Pregunta1;
     
     @JsonProperty("Pregunta2")
    public String Pregunta2;
     
     @JsonProperty("Pregunta3")
    public String Pregunta3;
     
     @JsonProperty("Pregunta4")
    public String Pregunta4;
     
     @JsonProperty("Pregunta5")
    public String Pregunta5;
     
     @JsonProperty("Pregunta6")
    public String Pregunta6;
     
     @JsonProperty("Pregunta7")
    public String Pregunta7;
     
     @JsonProperty("Pregunta8")
    public String Pregunta8;
     
     @JsonProperty("Pregunta9")
    public String Pregunta9;
     
     @JsonProperty("Pregunta10")
    public String Pregunta10;

}
