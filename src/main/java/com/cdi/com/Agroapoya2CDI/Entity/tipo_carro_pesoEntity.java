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
            name = "paT_tipo_carro_peso",
            procedureName = "paT_tipo_carro_peso",
            resultClasses = tipo_carro_pesoEntity.class)
})
public class tipo_carro_pesoEntity {

    @Id
    @JsonProperty("id_tipoCarro")
    public Integer id_tipoCarro;

    @JsonProperty("Descripion")
    public String Descripion;

    @JsonProperty("pesoKilos")
    public String pesoKilos;
}
