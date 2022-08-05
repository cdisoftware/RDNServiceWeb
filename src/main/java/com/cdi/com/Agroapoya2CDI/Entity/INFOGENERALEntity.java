package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_ayudasGeneral",
            procedureName = "paC_ayudasGeneral",
            resultClasses = INFOGENERALEntity.class)
})

public class INFOGENERALEntity {

    @Id
     @JsonProperty("IdSubInfo")
    public Integer IdSubInfo;
    
    @JsonProperty("IdInfoGeneral")
    public Integer IdInfoGeneral;

    @JsonProperty("Descricion")
    public String Descricion;

    @JsonProperty("ObservacionUno")
    public String ObservacionUno;

    @JsonProperty("ObservacionDos")
    public String ObservacionDos;

    @JsonProperty("ObservacionTres")
    public String ObservacionTres;

}
