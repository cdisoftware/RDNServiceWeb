package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_ReporteUsuarios",
            procedureName = "paC_ReporteUsuarios",
            resultClasses = CReporteUsuariosEntity.class)
})
public class CReporteUsuariosEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("IdTipoPersona")
    public Integer IdTipoPersona;

    @JsonProperty("DesTipoPersona")
    public String DesTipoPersona;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ApellidoPersona")
    public String ApellidoPersona;

    @JsonProperty("NumeroCelular")
    public String NumeroCelular;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("IdTipoDocumento")
    public Integer IdTipoDocumento;

    @JsonProperty("DesTipoDocumento")
    public String DesTipoDocumento;

    @JsonProperty("NumeroDoc")
    public String NumeroDoc;

    @JsonProperty("IdPais")
    public Integer IdPais;

    @JsonProperty("DesPais")
    public String DesPais;

    @JsonProperty("IdDepartamento")
    public Integer IdDepartamento;

    @JsonProperty("DesDepto")
    public String DesDepto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("DesCiudad")
    public String DesCiudad;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Observacion")
    public String Observacion;

}
