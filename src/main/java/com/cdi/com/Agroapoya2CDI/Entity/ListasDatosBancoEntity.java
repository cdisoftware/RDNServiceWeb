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
            name = "paT_ListasDatosBanco",
            procedureName = "paT_ListasDatosBanco",
            resultClasses = ListasDatosBancoEntity.class)
})
public class ListasDatosBancoEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("estado")
    public Integer estado;
}
