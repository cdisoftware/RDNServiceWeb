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
            name = "paCTipoCosteoOferta",
            procedureName = "paCTipoCosteoOferta",
            resultClasses = CTipoCosteoOfertaEntity.class)
})
public class CTipoCosteoOfertaEntity {

    @Id
    @JsonProperty("codigo")
    public Integer codigo;
    
    @JsonProperty("nombre")
    public String nombre;
}
