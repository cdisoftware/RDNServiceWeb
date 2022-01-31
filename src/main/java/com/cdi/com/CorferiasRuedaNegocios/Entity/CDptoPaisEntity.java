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
import lombok.Data;

/**
 *
 * @author Pedro p lista de ciudades por pais
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCDptoPais",
            procedureName = "paCDptoPais",
            resultClasses = CDptoPaisEntity.class)
})
public class CDptoPaisEntity implements Serializable {

    @Id
    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("NombreCiudad")
    private String NombreCiudad;
}
