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
            name = "sp_listaCondicion",
            procedureName = "sp_listaCondicion",
            resultClasses = listaCondicionEntity.class)
})
public class listaCondicionEntity {

    @Id
    @JsonProperty("id_condicion")
    public Integer id_condicion;

    @JsonProperty("des_condicion")
    public String des_condicion;
}
