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
            name = "paC_AplantillaCorreo",
            procedureName = "paC_AplantillaCorreo",
            resultClasses = CAplantillaCorreoEntity.class)
})
public class CAplantillaCorreoEntity {

    @Id
    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("NombrePlantilla")
    public String NombrePlantilla;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("html")
    public String html;

    @JsonProperty("ImgEncabezado")
    public String ImgEncabezado;

    @JsonProperty("ImgPie")
    public String ImgPie;

    @JsonProperty("IdTipoPlantilla")
    public Integer IdTipoPlantilla;

    @JsonProperty("descTipoPlantilla")
    public String descTipoPlantilla;

    @JsonProperty("idMomentoEnvio")
    public Integer idMomentoEnvio;

    @JsonProperty("descMomentoEnvio")
    public String descMomentoEnvio;

}
