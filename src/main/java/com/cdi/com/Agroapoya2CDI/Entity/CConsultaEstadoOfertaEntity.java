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
            name = "paCConsultaEstadoOferta",
            procedureName = "paCConsultaEstadoOferta",
            resultClasses = CConsultaEstadoOfertaEntity.class)
})
public class CConsultaEstadoOfertaEntity {

    @Id
    @JsonProperty("CD_ESTDO_OFERTA")
    public Integer CD_ESTDO_OFERTA;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("imagen_icono")
    public String imagen_icono;

}
