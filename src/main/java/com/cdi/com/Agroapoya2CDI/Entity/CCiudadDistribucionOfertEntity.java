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
            name = "paCCiudadDistribucionOferta",
            procedureName = "paCCiudadDistribucionOferta",
            resultClasses = CCiudadDistribucionOfertEntity.class)
})
public class CCiudadDistribucionOfertEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;
    
    @JsonProperty("CD_PAIS")
    public Integer CD_PAIS;
    
    @JsonProperty("CD_RGION")
    public Integer CD_RGION;
    
    @JsonProperty("CD_MNCPIO")
    public Integer CD_MNCPIO;
    
    @JsonProperty("Cuidad")
    public String Cuidad;
}
