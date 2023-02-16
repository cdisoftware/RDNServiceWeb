package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Pedro p lista de ciudades por pais
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCCiudadDpto",
            procedureName = "paCCiudadDpto",
            resultClasses = CCiudadDptoEntity.class)
})
public class CCiudadDptoEntity implements Serializable {

    @Id
    @JsonProperty("IdCiudad")
    public String IdCiudad;

    @JsonProperty("NombreCiudad")
    public String NombreCiudad;
}
