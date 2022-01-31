package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paCMascara",
            procedureName = "paCMascara",
            resultClasses = CMascaraEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCMascaraMod",
            procedureName = "paCMascaraMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CMascaraEntity {

    @Id
    @JsonProperty("IdTipoGrupo")
    private Integer IdTipoGrupo;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("DescripcionActualiza")
    private String DescripcionActualiza;

}
