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
            name = "paT_SubMenu",
            procedureName = "paT_SubMenu",
            resultClasses = TSubMenuEntity.class)
})
public class TSubMenuEntity {

    @Id
    @JsonProperty("IdSubMenu")
    public Integer IdSubMenu;

    @JsonProperty("IdMenu")
    public Integer IdMenu;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Icono")
    public String Icono;

    @JsonProperty("PathMenu")
    public String PathMenu;
}
