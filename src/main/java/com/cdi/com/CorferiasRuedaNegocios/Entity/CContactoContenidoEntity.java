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
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCContactoContenido",
            procedureName = "paCContactoContenido",
            resultClasses = CContactoContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCContactoContenidoMod",
            procedureName = "paCContactoContenidoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CContactoContenidoEntity {

    
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio ;

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("NombreContactoUno")
    private String NombreContactoUno ;

    @JsonProperty("EmailContactoUno")
    private String EmailContactoUno;

    @JsonProperty("EncargadoUno")
    private String EncargadoUno;

    @JsonProperty("TelefonosContactoUno")
    private String TelefonosContactoUno;

    @JsonProperty("NombreContactoDos")
    private String NombreContactoDos;

    @JsonProperty("EmailContactoDos")
    private String EmailContactoDos;

    @JsonProperty("EncargadoDos")
    private String EncargadoDos;

    @JsonProperty("TelefonosContactoDos")
    private String TelefonosContactoDos;

    @JsonProperty("NombreContactoTres")
    private String NombreContactoTres;

    @JsonProperty("EmailContactoTres")
    private String EmailContactoTres;

    @JsonProperty("EncargadoTres")
    private String EncargadoTres;

    @JsonProperty("TelefonosContactoTres")
    private String TelefonosContactoTres;

    @JsonProperty("NombreContactoCuatro")
    private String NombreContactoCuatro;

    @JsonProperty("EmailContactoCuatro")
    private String EmailContactoCuatro ;

    @JsonProperty("EncargadoCuatro")
    private String EncargadoCuatro ;

    @JsonProperty("TelefonosContactoCuatro")
    private String TelefonosContactoCuatro ;

    @JsonProperty("NombreContactoCinco")
    private String NombreContactoCinco ;

    @JsonProperty("EmailContactoCinco")
    private String EmailContactoCinco ;

    @JsonProperty("EncargadoCinco")
    private String EncargadoCinco;

    @JsonProperty("TelefonosContactoCinco")
    private String TelefonosContactoCinco ;

}
