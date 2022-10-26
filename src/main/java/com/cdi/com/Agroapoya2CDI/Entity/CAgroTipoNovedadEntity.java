
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
            name = "paC_AgroTipoNovedad",
            procedureName = "paC_AgroTipoNovedad",
            resultClasses = CAgroTipoNovedadEntity.class)
})
public class CAgroTipoNovedadEntity {
    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("solicitaTiempo")
    public Integer solicitaTiempo;
}
