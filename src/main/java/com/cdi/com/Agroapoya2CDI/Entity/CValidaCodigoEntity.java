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
            name = "paC_ValidaCodigo",
            procedureName = "paC_ValidaCodigo",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CValidaCodigoEntity {

    @Id
    @JsonProperty("Cd_cnsctivo")
    public Integer Cd_cnsctivo;

    @JsonProperty("CODIGODOS")
    public String CODIGODOS;

    @JsonProperty("id_sector")
    public Integer id_sector;
}
