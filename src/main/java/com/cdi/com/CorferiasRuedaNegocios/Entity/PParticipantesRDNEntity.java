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
            name = "paPParticipantesRDN",
            procedureName = "paPParticipantesRDN",
            resultClasses = PParticipantesRDNEntity.class)
})
public class PParticipantesRDNEntity {

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @Id
    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("IdDepartamento")
    private Integer IdDepartamento;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("PaginaWeb")
    private String PaginaWeb;

    @JsonProperty("imagen")
    private String imagen;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Observacion")
    private String Observacion;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("Departamento")
    private String Departamento;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("Nit")
    private String Nit;

    @JsonProperty("CuentaAgenda")
    private Integer CuentaAgenda;

}
