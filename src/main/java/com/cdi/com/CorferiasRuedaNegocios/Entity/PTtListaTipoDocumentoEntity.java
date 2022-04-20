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
            name = "paPTtListaTipoDocumento",
            procedureName = "paPTtListaTipoDocumento",
            resultClasses = PTtListaTipoDocumentoEntity.class)
})
public class PTtListaTipoDocumentoEntity {

    @Id
    @JsonProperty("IdIdentificacion")
    public Integer IdIdentificacion;

    @JsonProperty("NombreIdentificacion")
    public String NombreIdentificacion;

    @JsonProperty("Sigla")
    public String Sigla;
}
