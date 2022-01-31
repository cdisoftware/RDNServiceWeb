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
            name = "paCValidaPermiso",
            procedureName = "paCValidaPermiso",
            resultClasses = CValidaPermisoEntity.class)
})
public class CValidaPermisoEntity {

    @Id
    @JsonProperty("IdLista")
    private Integer IdLista;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Permiso")
    private Integer Permiso;
}
