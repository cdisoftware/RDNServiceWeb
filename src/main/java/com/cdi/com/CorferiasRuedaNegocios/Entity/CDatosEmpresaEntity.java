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
            name = "paCDatosEmpresa",
            procedureName = "paCDatosEmpresa",
            resultClasses = CDatosEmpresaEntity.class)
})
public class CDatosEmpresaEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Empresa")
    private String Empresa;

    @JsonProperty("Nit")
    private String Nit;

    @JsonProperty("DireccionEmpresa")
    private String DireccionEmpresa;

    @JsonProperty("TelefonoEmpresa")
    private String TelefonoEmpresa;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Departamento")
    private String Departamento;

    @JsonProperty("IdDepartamento")
    private Integer IdDepartamento;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("Url")
    private String Url;

    @JsonProperty("descripcion")
    private String descripcion;

    @JsonProperty("imagen")
    private String imagen;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("EmpresaContacto")
    private String EmpresaContacto;

}
