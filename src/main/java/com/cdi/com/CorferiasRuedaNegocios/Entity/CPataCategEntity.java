package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Pedro p patacateg
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCPataCateg",
            procedureName = "paCPataCateg",
            resultClasses = CPataCategEntity.class)

})
public class CPataCategEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("Categoria")
    public String Categoria;

    @JsonProperty("OrdenCategoria")
    public Integer OrdenCategoria;

    @JsonProperty("CodigoIdioma")
    public String CodigoIdioma;

    @JsonProperty("bandera")
    public String bandera;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("idcategoriapata")
    public Integer idcategoriapata;

    @JsonProperty("Imagenes")
    public String Imagenes;

}
