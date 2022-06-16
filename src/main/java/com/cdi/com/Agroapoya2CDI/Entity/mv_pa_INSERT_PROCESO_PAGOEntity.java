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
            name = "mv_pa_INSERT_PROCESO_PAGO",
            procedureName = "mv_pa_INSERT_PROCESO_PAGO",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class mv_pa_INSERT_PROCESO_PAGOEntity {

    @Id
    @JsonProperty("ID_CLNTE")
    public Integer ID_CLNTE;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("COD_PEDIDO")
    public String COD_PEDIDO;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

}
