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
            name = "paCActualizaAuditoria",
            procedureName = "paCActualizaAuditoria",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CActualizaAuditoriaEntity {

    @Id
    @JsonProperty("Cons")
    private Integer Cons;

    @JsonProperty("TABLA")
    private String TABLA;

    @JsonProperty("OP_INS")
    private String OP_INS;

    @JsonProperty("OP_DEL")
    private String OP_DEL;

    @JsonProperty("OP_UPD")
    private String OP_UPD;
    
  

}
