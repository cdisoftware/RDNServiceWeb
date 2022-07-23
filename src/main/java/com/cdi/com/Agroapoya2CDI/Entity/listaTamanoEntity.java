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
            name = "sp_listaTamano",
            procedureName = "sp_listaTamano",
            resultClasses = listaTamanoEntity.class)
})
public class listaTamanoEntity {

    @Id
    @JsonProperty("id_tamano")
    public Integer id_tamano;

    @JsonProperty("des_tamano")
    public String des_tamano;
}
