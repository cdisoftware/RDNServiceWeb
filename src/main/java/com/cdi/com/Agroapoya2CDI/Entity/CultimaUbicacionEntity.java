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
            name = "paC_ultimaUbicacion",
            procedureName = "paC_ultimaUbicacion",
            resultClasses = CultimaUbicacionEntity.class)
})
public class CultimaUbicacionEntity {

    @Id
    @JsonProperty("cd_cnscutivo")
    public Integer cd_cnscutivo;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("id_conductor")
    public Integer id_conductor;

    @JsonProperty("IdSector")
    public Integer IdSector;

}
