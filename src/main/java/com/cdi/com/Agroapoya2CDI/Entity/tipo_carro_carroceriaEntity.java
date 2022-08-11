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
            name = "paT_tipo_carro_carroceria",
            procedureName = "paT_tipo_carro_carroceria",
            resultClasses = tipo_carro_carroceriaEntity.class)
})
public class tipo_carro_carroceriaEntity {

    @Id
    @JsonProperty("id_tipoCarro")
    public Integer id_tipoCarro;

    @JsonProperty("Descripion")
    public String Descripion;
}
