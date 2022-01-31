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
            name = "paCProgramacionCorreo",
            procedureName = "paCProgramacionCorreo",
            resultClasses = CProgramacionCorreoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCProgramacionCorreoMod",
            procedureName = "paCProgramacionCorreoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CProgramacionCorreoEntity {

    @Id
    @JsonProperty("IdEnvioCorreo")
    private Integer IdEnvioCorreo;

    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("IdTipoEnvio")
    private Integer IdTipoEnvio;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("IdCiudad")
    private String IdCiudad;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("EstadoParticipante")
    private Integer EstadoParticipante;

    @JsonProperty("Estado")
    private String Estado;

    @JsonProperty("FechaEnvio")
    private String FechaEnvio;

    @JsonProperty("HoraEnvio")
    private String HoraEnvio;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;

    @JsonProperty("Identificacion")
    private String Identificacion;

    @JsonProperty("NombrePlantilla")
    private String NombrePlantilla;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("FechaHoraRealEnvio")
    private String FechaHoraRealEnvio;

}
