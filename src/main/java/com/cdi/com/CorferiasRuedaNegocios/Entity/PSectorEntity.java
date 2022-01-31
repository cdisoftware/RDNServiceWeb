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
            name = "paPSector",
            procedureName = "paPSector",
            resultClasses = PSectorEntity.class)
})
public class PSectorEntity implements Serializable {

    @Id
    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("Estado")
    private Integer Estado;
}
