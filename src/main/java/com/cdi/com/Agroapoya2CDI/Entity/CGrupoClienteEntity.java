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
            name = "paCGrupoCliente",
            procedureName = "paCGrupoCliente",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CGrupoClienteEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("TPO_VNTA")
    public Integer TPO_VNTA;

    @JsonProperty("UsuCodig")
    public Integer UsuCodig;

    @JsonProperty("UNID_GRUPO")
    public Integer UNID_GRUPO;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

}
