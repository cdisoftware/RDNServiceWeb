package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCAyudaUsuarioRdn",
            procedureName = "paCAyudaUsuarioRdn",
            resultClasses = CAyudaUsuarioRdnEntity.class)
})
public class CAyudaUsuarioRdnEntity implements Serializable {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRdn")
    private String NombreRdn;

    @JsonProperty("FechaInicioRdn")
    private String FechaInicioRdn;

    @JsonProperty("FechaFinRdn")
    private String FechaFinRdn;
}
