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
            name = "paCUsuarioPermiso",
            procedureName = "paCUsuarioPermiso",
            resultClasses = CUsuarioPermisoEntity.class)
})
public class CUsuarioPermisoEntity {

    @Id
    @JsonProperty("Permiso")
    private Integer Permiso;
}
