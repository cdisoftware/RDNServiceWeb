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
            name = "paCOfertaImagenMod",
            procedureName = "paCOfertaImagenMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class COfertaImagenModEntity {

    @Id
    @JsonProperty("ID_IMAGEN1")
    public String ID_IMAGEN1;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("IMAGEN1")
    public String IMAGEN1;

    @JsonProperty("ID_IMAGEN2")
    public String ID_IMAGEN2;

    @JsonProperty("IMAGEN2")
    public String IMAGEN2;

    @JsonProperty("ID_IMAGEN3")
    public String ID_IMAGEN3;

    @JsonProperty("IMAGEN3")
    public String IMAGEN3;

    @JsonProperty("ID_IMAGEN4")
    public String ID_IMAGEN4;

    @JsonProperty("IMAGEN4")
    public String IMAGEN4;

    @JsonProperty("ID_IMAGEN5")
    public String ID_IMAGEN5;

    @JsonProperty("IMAGEN5")
    public String IMAGEN5;

}
