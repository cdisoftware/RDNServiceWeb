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
            name = "paC_TipoConductor",
            procedureName = "paC_TipoConductor",
            resultClasses = CTipoConductorEntity.class)
})
public class CTipoConductorEntity {

    @Id
    @JsonProperty("IdConductor")
    public Integer IdConductor;

    @JsonProperty("USUCODIG_TRANS")
    public Integer USUCODIG_TRANS;

    @JsonProperty("NombreConductor")
    public String NombreConductor;

    @JsonProperty("IdTipoDocumento")
    public Integer IdTipoDocumento;

    @JsonProperty("DescTipoDocumento")
    public String DescTipoDocumento;

    @JsonProperty("NumeroDocumento")
    public String NumeroDocumento;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("IdPais")
    public Integer IdPais;

    @JsonProperty("IdDepa")
    public Integer IdDepa;

    @JsonProperty("DescDepa")
    public String DescDepa;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("DesCiudad")
    public String DesCiudad;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("Placa")
    public String Placa;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("IdCarroceria")
    public Integer IdCarroceria;

    @JsonProperty("DesCarroceria")
    public String DesCarroceria;

    @JsonProperty("IdPesoCargaCarro")
    public Integer IdPesoCargaCarro;

    @JsonProperty("DesPesoCarro")
    public String DesPesoCarro;

}
