/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            name = "paCSubCatePart",
            procedureName = "paCSubCatePart",
            resultClasses = CSubCatePartEntity.class)
})
public class CSubCatePartEntity {

    @Id
    @JsonProperty("IdSubcategoria")
    private Integer IdSubcategoria;
    
    @JsonProperty("IdSector")
    private Integer IdSector ;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("IdCategoria")
    private Integer IdCategoria ;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("NombreSubcategoria")
    private String NombreSubcategoria;

    @JsonProperty("IdRuedaNEgocio")
    private Integer IdRuedaNEgocio;

    @JsonProperty("Estado")
    private Integer Estado;

}
