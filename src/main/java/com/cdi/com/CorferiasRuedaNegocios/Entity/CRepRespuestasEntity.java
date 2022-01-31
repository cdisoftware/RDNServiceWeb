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
            name = "paCRepRespuestas",
            procedureName = "paCRepRespuestas",
            resultClasses = CRepRespuestasEntity.class)
})
public class CRepRespuestasEntity {

    @Id
    @JsonProperty("IdParticipante")
    private Integer IdParticipante ;

    @JsonProperty("Contacto")
    private String Contacto;

    @JsonProperty("Email")
    private String Email ;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("R1")
    private String R1;

    @JsonProperty("R2")
    private String R2;

    @JsonProperty("R3")
    private String R3;

    @JsonProperty("R4")
    private String R4;

    @JsonProperty("R5")
    private String R5;

    @JsonProperty("R6")
    private String R6;

    @JsonProperty("R7")
    private String R7;

    @JsonProperty("R8")
    private String R8;

    @JsonProperty("R9")
    private String R9;

    @JsonProperty("R10")
    private String R10;

}
