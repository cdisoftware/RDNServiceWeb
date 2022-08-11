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
            name = "paT_menu",
            procedureName = "paT_menu",
            resultClasses = menuEntity.class)
})
public class menuEntity {

    @Id
    @JsonProperty("IdMenu")
    public Integer IdMenu;

    @JsonProperty("IdTipoUsuario")
    public Integer IdTipoUsuario;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Icono")
    public String Icono;

    @JsonProperty("pathMenu")
    public String pathMenu;
}
