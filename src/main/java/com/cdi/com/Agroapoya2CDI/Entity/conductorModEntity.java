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
            name = "paC_conductorMod",
            procedureName = "paC_conductorMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class conductorModEntity {

    @Id
    @JsonProperty("ID_CNDCTOR")
    public Integer ID_CNDCTOR;

    @JsonProperty("USUCODIG_TRANS")
    public Integer USUCODIG_TRANS;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TIPO_DOCUMENTO")
    public Integer TIPO_DOCUMENTO;

    @JsonProperty("NUMERO_ID")
    public String NUMERO_ID;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("CD_DPTO")
    public String CD_DPTO;

    @JsonProperty("CD_CDAD")
    public String CD_CDAD;

    @JsonProperty("DIRECCION")
    public String DIRECCION;

    @JsonProperty("COORDENADAS")
    public String COORDENADAS;

}
