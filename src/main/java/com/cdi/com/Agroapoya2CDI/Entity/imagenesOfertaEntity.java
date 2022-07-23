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
            name = "sp_imagenesOferta",
            procedureName = "sp_imagenesOferta",
            resultClasses = imagenesOfertaEntity.class)
})
public class imagenesOfertaEntity {

    @Id
    @JsonProperty("ID_IMAGEN")
    public Integer ID_IMAGEN;

    @JsonProperty("imagen")
    public String imagen;
}
