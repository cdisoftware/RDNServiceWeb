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
 * @author Pedro perfil rueda negocio
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPPerfilRuedaNegocio",
            procedureName = "paPPerfilRuedaNegocio",
            resultClasses = PPerfilRuedaNegocioEntity.class)
})
public class PPerfilRuedaNegocioEntity implements Serializable {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("DescripcionRDN")
    private String DescripcionRDN;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Participa")
    private Integer Participa;

    @JsonProperty("PerfilAsociado")
    private Integer PerfilAsociado;

}
