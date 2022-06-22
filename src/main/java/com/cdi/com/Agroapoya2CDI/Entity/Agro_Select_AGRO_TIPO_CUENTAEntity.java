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
            name = "Agro_Select_AGRO_TIPO_CUENTA",
            procedureName = "Agro_Select_AGRO_TIPO_CUENTA",
            resultClasses = Agro_Select_AGRO_TIPO_CUENTAEntity.class)
})
public class Agro_Select_AGRO_TIPO_CUENTAEntity {

    @Id
    @JsonProperty("ID_TPO_CUENTA")
    public Integer ID_TPO_CUENTA;

    @JsonProperty("DSCRPCION_TPOCUENTA")
    public String DSCRPCION_TPOCUENTA;

    @JsonProperty("CD_ESTDO")
    public Integer CD_ESTDO;
}
