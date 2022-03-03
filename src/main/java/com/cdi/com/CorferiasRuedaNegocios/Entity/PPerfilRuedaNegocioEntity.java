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
    public Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    public String NombreRDN;

    @JsonProperty("DescripcionRDN")
    public String DescripcionRDN;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Participa")
    public Integer Participa;

    @JsonProperty("PerfilAsociado")
    public Integer PerfilAsociado;

    @JsonProperty("DescripcionPerfil")
    public String DescripcionPerfil;

}