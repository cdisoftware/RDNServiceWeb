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
    private Integer idcontacto;

    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Participante")
    private String Participante;

    @JsonProperty("TipoIdContacto")
    private String TipoIdContacto;

    @JsonProperty("NroIdContacto")
    private Integer NroIdContacto;

    @JsonProperty("Contacto")
    private String Contacto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("RuedadeNegocios")
    private String Ruedadenegocios;

    @JsonProperty("Estado")
    private String Estado;

    @JsonProperty("FechaActivacion")
    private String FechaActivacion;

    @JsonProperty("FechaInactiva")
    private String FechaInactiva;

    @JsonProperty("Perfil")
    private String Perfil;

    @JsonProperty("IdTipoEvaEnc")
    private Integer IdTipoEvaEnc;

    @JsonProperty("TipoEvaluacion")
    private String TipoEvaluacion;

    @JsonProperty("FechaPublicacion")
    private String FechaPublicacion;

    @JsonProperty("Codigo")
    private String Codigo;

    @JsonProperty("RegistroRespuesta")
    private String RegistroRespuesta;
    
     @JsonProperty("Pregunta1")
    private String Pregunta1;
     
     @JsonProperty("Pregunta2")
    private String Pregunta2;
     
     @JsonProperty("Pregunta3")
    private String Pregunta3;
     
     @JsonProperty("Pregunta4")
    private String Pregunta4;
     
     @JsonProperty("Pregunta5")
    private String Pregunta5;
     
     @JsonProperty("Pregunta6")
    private String Pregunta6;
     
     @JsonProperty("Pregunta7")
    private String Pregunta7;
     
     @JsonProperty("Pregunta8")
    private String Pregunta8;
     
     @JsonProperty("Pregunta9")
    private String Pregunta9;
     
     @JsonProperty("Pregunta10")
    private String Pregunta10;

}
