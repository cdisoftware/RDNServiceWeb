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
            name = "sp_productos",
            procedureName = "sp_productos",
            resultClasses = productosEntity.class)
})
public class productosEntity {

    @Id
    @JsonProperty("id_producto")
    public Integer id_producto;

    @JsonProperty("des_producto")
    public String des_producto;
}
