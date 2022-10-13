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
            name = "paC_EstadoTransporteMod",
            procedureName = "paC_EstadoTransporteMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class CEstadoTransporteModEntity {

    @Id
    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("IdConctor")
    public Integer IdConctor;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;
}
