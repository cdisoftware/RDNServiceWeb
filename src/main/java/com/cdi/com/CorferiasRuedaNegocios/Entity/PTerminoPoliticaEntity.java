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
            name = "paPTerminoPolitica",
            procedureName = "paPTerminoPolitica",
            resultClasses = PTerminoPoliticaEntity.class)
})
public class PTerminoPoliticaEntity {

    @Id
    @JsonProperty("Max")
    private Integer Max;

    @JsonProperty("Modulo")
    private String Modulo;

    @JsonProperty("Texto")
    private String Texto;

    @JsonProperty("FechaPublica")
    private String FechaPublica;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Obliga")
    private Integer Obliga;
}
