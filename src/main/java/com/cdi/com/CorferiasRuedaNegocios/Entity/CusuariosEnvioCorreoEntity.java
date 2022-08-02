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
            name = "paCRemitenteCorreo",
            procedureName = "paCRemitenteCorreo",
            resultClasses = CusuariosEnvioCorreoEntity.class)
})
public class CusuariosEnvioCorreoEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("CorreoRemitente")
    public String CorreoRemitente;

    @JsonProperty("ServicePath")
    public String ServicePath;

    @JsonProperty("Clave")
    public String Clave;
}
