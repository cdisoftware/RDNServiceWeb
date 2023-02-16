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
    public Integer IdRuedaNegocio;

    @Id
    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("NombreEmpresa")
    public String NombreEmpresa;

    @JsonProperty("IdPais")
    public Integer IdPais;

    @JsonProperty("IdDepartamento")
    public Integer IdDepartamento;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("PaginaWeb")
    public String PaginaWeb;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Pais")
    public String Pais;

    @JsonProperty("Departamento")
    public String Departamento;

    @JsonProperty("Ciudad")
    public String Ciudad;

    @JsonProperty("Nit")
    public String Nit;

    @JsonProperty("CuentaAgenda")
    public Integer CuentaAgenda;

    @JsonProperty("AprobacionCitas")
    public Integer AprobacionCitas;

}
