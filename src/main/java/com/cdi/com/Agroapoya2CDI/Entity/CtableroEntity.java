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
            name = "paC_tablero",
            procedureName = "paC_tablero",
            resultClasses = CtableroEntity.class)
})
public class CtableroEntity {

    @Id
    @JsonProperty("IdCaja")
    public Integer IdCaja;

    @JsonProperty("NombreCaja")
    public String NombreCaja;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("IdPlataforma")
    public Integer IdPlataforma;
}
