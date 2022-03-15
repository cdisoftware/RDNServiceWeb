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
            name = "paCAdminSalasConfig",
            procedureName = "paCAdminSalasConfig",
            resultClasses = CAdminSalasConfigEntity.class)
})
public class CAdminSalasConfigEntity {

    @Id
     @JsonProperty("Id")
    public Integer Id;
    
    @JsonProperty("tipoSala")
    public String tipoSala;

    @JsonProperty("permisos")
    public String permisos;

}
