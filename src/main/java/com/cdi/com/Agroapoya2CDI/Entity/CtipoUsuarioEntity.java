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
            name = "paC_tipoUsuario",
            procedureName = "paC_tipoUsuario",
            resultClasses = CtipoUsuarioEntity.class)
})
public class CtipoUsuarioEntity {

    @Id
    @JsonProperty("IdTipoUsuario")
    public Integer IdTipoUsuario;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
