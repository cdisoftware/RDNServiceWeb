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
            name = "paC_NovedadMod",
            procedureName = "paC_NovedadMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CNovedadModEntity {

    @Id
    @JsonProperty("IdNov")
    public Integer IdNov;

    @JsonProperty("IdSubNov")
    public Integer IdSubNov;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("TipoUsu")
    public Integer TipoUsu;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("TiempoRetraso")
    public String TiempoRetraso;

    @JsonProperty("Timepo")
    public Integer Timepo;

    @JsonProperty("HorMin")
    public String HorMin;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("idConductor")
    public Integer idConductor;

    @JsonProperty("idSector")
    public Integer idSector;
}
