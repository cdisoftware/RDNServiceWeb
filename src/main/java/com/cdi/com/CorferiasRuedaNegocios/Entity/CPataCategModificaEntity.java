/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

/**
 *
 * @author Pedro p patacateg
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCPataCategModifica",
            procedureName = "paCPataCategModifica",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPataCategModificaEntity implements Serializable {

    @Id
    @JsonProperty("IdCategoriaPata")
    private Integer IdCategoriaPata;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Categoria")
    private String Categoria;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("OrdenCategoria")
    private Integer OrdenCategoria;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("IdIdioma")
    private Integer IdIdioma;

}
