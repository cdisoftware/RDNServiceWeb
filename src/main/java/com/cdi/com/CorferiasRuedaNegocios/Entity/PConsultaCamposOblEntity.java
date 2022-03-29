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
            name = "paPConsultaCamposObl",
            procedureName = "paPConsultaCamposObl",
            resultClasses = PConsultaCamposOblEntity.class)
})
public class PConsultaCamposOblEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("DepartamentoEmpresa")
    public Integer DepartamentoEmpresa;

    @JsonProperty("CiudadEmpresa")
    public Integer CiudadEmpresa;

    @JsonProperty("TelefonoEmpresa")
    public Integer TelefonoEmpresa;

    @JsonProperty("DireccionEmpresa")
    public Integer DireccionEmpresa;

    @JsonProperty("PalabrasEmpresa")
    public Integer PalabrasEmpresa;

    @JsonProperty("UrlEmpresa")
    public Integer UrlEmpresa;

    @JsonProperty("TelefonoContacto")
    public Integer TelefonoContacto;

    @JsonProperty("GeneroContacto")
    public Integer GeneroContacto;

    @JsonProperty("CorreoOpcional")
    public Integer CorreoOpcional;
}
