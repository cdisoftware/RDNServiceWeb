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
            name = "paCDefinirAuditoria",
            procedureName = "paCDefinirAuditoria",
            resultClasses = CDefinirAuditoriaEntity.class)
})
public class CDefinirAuditoriaEntity {

    @Id
    @JsonProperty("Cons")
    private Integer Cons;

    @JsonProperty("Tabla")
    private String Tabla;

    @JsonProperty("AUDITORIA")
    private Integer AUDITORIA;

    @JsonProperty("DSCRPCION")
    private String DSCRPCION;

    @JsonProperty("OP_INS")
    private Integer OP_INS;

    @JsonProperty("OP_DEL")
    private Integer OP_DEL;

    @JsonProperty("OP_UPD")
    private Integer OP_UPD;

    @JsonProperty("TIPO")
    private Integer TIPO;

    @JsonProperty("DAUDITORIA")
    private String DAUDITORIA;
}
