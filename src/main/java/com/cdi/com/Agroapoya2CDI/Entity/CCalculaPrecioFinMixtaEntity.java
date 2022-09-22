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
            name = "paCCalculaPrecioFinMixta",
            procedureName = "paCCalculaPrecioFinMixta",
            resultClasses = CCalculaPrecioFinMixtaEntity.class)
})
public class CCalculaPrecioFinMixtaEntity {

    @Id
    @JsonProperty("PRECIO_FINAL_INDIVIDUAL")
    public String PRECIO_FINAL_INDIVIDUAL;

    @JsonProperty("PRECIO_ARRANQUE_LIDER")
    public String PRECIO_ARRANQUE_LIDER;

    @JsonProperty("PRECIO_FINAL_PARTICIPANTE")
    public String PRECIO_FINAL_PARTICIPANTE;

    @JsonProperty("PRECIO_FINAL_INDIVIDUAL_F")
    public String PRECIO_FINAL_INDIVIDUAL_F;

    @JsonProperty("PRECIO_ARRANQUE_LIDER_F")
    public String PRECIO_ARRANQUE_LIDER_F;

    @JsonProperty("PRECIO_FINAL_PARTICIPANTE_F")
    public String PRECIO_FINAL_PARTICIPANTE_F;

}
