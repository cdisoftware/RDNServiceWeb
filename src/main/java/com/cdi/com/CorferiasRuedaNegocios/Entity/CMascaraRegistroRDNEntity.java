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
            name = "paCMascaraRegistroRDN",
            procedureName = "paCMascaraRegistroRDN",
            resultClasses = CMascaraRegistroRDNEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCMascaraRegistroRdnMod",
            procedureName = "paCMascaraRegistroRdnMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CMascaraRegistroRDNEntity {

    @Id
    @JsonProperty("IdLabel")
    private Integer IdLabel;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;
}
