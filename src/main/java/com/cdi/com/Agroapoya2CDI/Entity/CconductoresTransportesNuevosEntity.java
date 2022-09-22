
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
            name = "paC_conductoresTransportesNuevos",
            procedureName = "paC_conductoresTransportesNuevos",
            resultClasses = CconductoresTransportesNuevosEntity.class)
})
public class CconductoresTransportesNuevosEntity {
     @Id
    @JsonProperty("idConductor")
    public Integer idConductor;

    @JsonProperty("nombreConductor")
    public String nombreConductor;

    @JsonProperty("numIdCoductor")
    public String numIdCoductor;

    @JsonProperty("placaConductor")
    public String placaConductor;

    @JsonProperty("telConductor")
    public String telConductor;

    @JsonProperty("direccionConductor")
    public String direccionConductor;

    @JsonProperty("COORDENADAS")
    public String COORDENADAS;

    @JsonProperty("distanciakM")
    public String distanciakM;

}
