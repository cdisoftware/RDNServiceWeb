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
            name = "paCPlantillaCorreo",
            procedureName = "paCPlantillaCorreo",
            resultClasses = CPlantillaCorreoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCPlantillaCorreoMod",
            procedureName = "paCPlantillaCorreoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPlantillaCorreoEntity {

    @Id
    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("NombrePlantilla")
    private String NombrePlantilla;

    @JsonProperty("IdTipoPlantilla")
    private Integer IdTipoPlantilla;

    @JsonProperty("Asunto")
    private String Asunto;

    @JsonProperty("EmailRemite")
    private String EmailRemite;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("MomentoEnvio")
    private Integer MomentoEnvio;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("ImagenEnc")
    private String ImagenEnc;

    @JsonProperty("ImagenPie")
    private String ImagenPie;

    @JsonProperty("IdModuloEstado")
    private Integer IdModuloEstado;
}
