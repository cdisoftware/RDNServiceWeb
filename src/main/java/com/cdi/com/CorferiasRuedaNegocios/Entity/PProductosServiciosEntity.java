package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paPProductosServicios",
            procedureName = "paPProductosServicios",
            resultClasses = PProductosServiciosEntity.class)
})
public class PProductosServiciosEntity {

    @Id
    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("FichaTecnica")
    public String FichaTecnica;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("NombreProducto")
    public String NombreProducto;

    @JsonProperty("FichaTecnicaEng")
    public String FichaTecnicaEng;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("ValidaBuscOfre")
    public Integer ValidaBuscOfre;
}
