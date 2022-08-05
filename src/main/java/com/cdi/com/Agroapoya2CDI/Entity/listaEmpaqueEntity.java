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
            name = "paT_listaEmpaque",
            procedureName = "paT_listaEmpaque",
            resultClasses = listaEmpaqueEntity.class)
})
public class listaEmpaqueEntity {

    @Id
    @JsonProperty("id_empaque")
    public Integer id_empaque;

    @JsonProperty("des_empaque")
    public String des_empaque;

    @JsonProperty("PESO")
    public Double PESO;
}
