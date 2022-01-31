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
            name = "paCConfiguraTipoPerfil",
            procedureName = "paCConfiguraTipoPerfil",
            resultClasses = CConfiguraTipoPerfilEntity.class)
})
public class CConfiguraTipoPerfilEntity {

    @Id
    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("DescripcionTipoPerfil")
    private String DescripcionTipoPerfil;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
