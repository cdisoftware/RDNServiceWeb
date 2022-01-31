package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paCListaUsuarioAuditoria",
            procedureName = "paCListaUsuarioAuditoria",
            resultClasses = CListaUsuarioAuditoriaEntity.class)
})
public class CListaUsuarioAuditoriaEntity {

    @Id
    @JsonProperty("USUCODIG")
    private Integer USUCODIG;

    @JsonProperty("USUARIO")
    private String USUARIO;

    @JsonProperty("CORREO")
    private String CORREO;

    @JsonProperty("ORIGEN")
    private Integer ORIGEN;

    @JsonProperty("NOIDENTIFICACION")
    private String NOIDENTIFICACION;

    @JsonProperty("TIPO")
    private String TIPO;
}
