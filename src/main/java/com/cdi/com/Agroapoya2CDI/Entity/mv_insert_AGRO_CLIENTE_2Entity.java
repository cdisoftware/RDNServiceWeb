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
            name = "mv_insert_AGRO_CLIENTE_2",
            procedureName = "mv_insert_AGRO_CLIENTE_2",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class mv_insert_AGRO_CLIENTE_2Entity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("CD_UNDAD")
    public Integer CD_UNDAD;

    @JsonProperty("HRRIO_RCBO_DSDE")
    public Integer HRRIO_RCBO_DSDE;

    @JsonProperty("HRRIO_RCBO_HSTA")
    public Integer HRRIO_RCBO_HSTA;

    @JsonProperty("OBSRVCNES")
    public String OBSRVCNES;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

    @JsonProperty("ID_TRANSPORTISTA")
    public Integer ID_TRANSPORTISTA;

    @JsonProperty("DESCARGA")
    public Integer DESCARGA;

    @JsonProperty("IDGRUPO")
    public Integer IDGRUPO;

}
