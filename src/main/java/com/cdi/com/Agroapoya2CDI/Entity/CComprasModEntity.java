package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_ComprasMod",
            procedureName = "paC_ComprasMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CComprasModEntity {

    @Id
    @JsonProperty("Cd_cnsctivo")
    public Integer Cd_cnsctivo;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("Id_grupo")
    public Integer Id_grupo;

    @JsonProperty("TipoComra")
    public Integer TipoComra;

    @JsonProperty("TipoUsuarioCompra")
    public Integer TipoUsuarioCompra;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("UrlCdgoCmpatir")
    public String UrlCdgoCmpatir;
}
