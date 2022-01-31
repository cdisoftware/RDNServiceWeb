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
            name = "paCCamposParticipante",
            procedureName = "paCCamposParticipante",
            resultClasses = CCamposParticipanteEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCCamposParticipanteMod",
            procedureName = "paCCamposParticipanteMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CCamposParticipanteEntity {

    @Id
    @JsonProperty("IdCampo")
    private Integer IdCampo ;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("DepartamentoEmpresa")
    private Integer DepartamentoEmpresa ;

    @JsonProperty("CiudadEmpresa")
    private Integer CiudadEmpresa;

    @JsonProperty("TelefonoEmpresa")
    private Integer TelefonoEmpresa;

    @JsonProperty("DireccionEmpresa")
    private Integer DireccionEmpresa;

    @JsonProperty("PalabrasEmpresa")
    private Integer PalabrasEmpresa;

    @JsonProperty("UrlEmpresa")
    private Integer UrlEmpresa;

    @JsonProperty("TelefonoContacto")
    private Integer TelefonoContacto;

    @JsonProperty("GeneroContacto")
    private Integer GeneroContacto;

    @JsonProperty("CorreoOpcional")
    private Integer CorreoOpcional;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

}
