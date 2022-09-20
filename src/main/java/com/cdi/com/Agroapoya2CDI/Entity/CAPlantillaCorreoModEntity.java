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
            name = "paC_APlantillaCorreoMod",
            procedureName = "paC_APlantillaCorreoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAPlantillaCorreoModEntity {

    @Id
    @JsonProperty("UsucodigAdmin")
    public Integer UsucodigAdmin;

    @JsonProperty("idplantilla")
    public Integer idplantilla;

    @JsonProperty("NombrePlantilla")
    public String NombrePlantilla;

    @JsonProperty("idTipoPlantilla")
    public Integer idTipoPlantilla;

    @JsonProperty("idMomentoEnvio")
    public Integer idMomentoEnvio;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("idEstado")
    public Integer idEstado;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("html")
    public String html;
    
     @JsonProperty("imgEncabezado")
    public String imgEncabezado;
     
      @JsonProperty("imgPiePagina")
    public String imgPiePagina;
}
