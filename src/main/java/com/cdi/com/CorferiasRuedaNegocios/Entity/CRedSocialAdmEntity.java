package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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
            name = "paCRedSocialAdm",
            procedureName = "paCRedSocialAdm",
            resultClasses = CRedSocialAdmEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCRedSocialAdmModifica",
            procedureName = "paCRedSocialAdmModifica",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRedSocialAdmEntity implements Serializable {

    @Id
    @JsonProperty("IdRed")
    private Integer IdRed;

    @JsonProperty("NombreRed")
    private String NombreRed;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Estado")
    private Integer Estado;
}
