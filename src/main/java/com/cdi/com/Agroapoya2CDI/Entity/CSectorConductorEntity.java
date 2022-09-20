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
            name = "paC_SectorConductor",
            procedureName = "paC_SectorConductor",
            resultClasses = CSectorConductorEntity.class)
})
public class CSectorConductorEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("Cd_cnsctivo")
    public Integer Cd_cnsctivo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DescSector")
    public String DescSector;

    @JsonProperty("ValorFlete")
    public String ValorFlete;

    @JsonProperty("ValorFleteForm")
    public String ValorFleteForm;

    @JsonProperty("IdEstadoOfertaConductor")
    public Integer IdEstadoOfertaConductor;

    @JsonProperty("DesEstadoOfertaConductor")
    public String DesEstadoOfertaConductor;

    @JsonProperty("TransUsucodig")
    public Integer TransUsucodig;

    @JsonProperty("TransNombre")
    public String TransNombre;

    @JsonProperty("TransApellido")
    public String TransApellido;

    @JsonProperty("TransCelular")
    public String TransCelular;

    @JsonProperty("TrasNumeroDocumento")
    public String TrasNumeroDocumento;

    @JsonProperty("TransTipoIdentificacion")
    public String TransTipoIdentificacion;

    @JsonProperty("TransDireccion")
    public String TransDireccion;

    @JsonProperty("TransComplementoDireccion")
    public String TransComplementoDireccion;

    @JsonProperty("TransCorreo")
    public String TransCorreo;

    @JsonProperty("TransDescDepartamento")
    public String TransDescDepartamento;

    @JsonProperty("TransDescMunicipio")
    public String TransDescMunicipio;

    @JsonProperty("CondUsucodig")
    public Integer CondUsucodig;

    @JsonProperty("CondNombreCompleto")
    public String CondNombreCompleto;

    @JsonProperty("CondCelular")
    public String CondCelular;

    @JsonProperty("CondNumeroDocumento")
    public String CondNumeroDocumento;

    @JsonProperty("CondTipoIdentificacion")
    public String CondTipoIdentificacion;

    @JsonProperty("CondDireccion")
    public String CondDireccion;

    @JsonProperty("CondCorreo")
    public String CondCorreo;

    @JsonProperty("CondDescDepartamento")
    public String CondDescDepartamento;

    @JsonProperty("CondDescMunicipio")
    public String CondDescMunicipio;

    @JsonProperty("CondPlaca")
    public String CondPlaca;

}
