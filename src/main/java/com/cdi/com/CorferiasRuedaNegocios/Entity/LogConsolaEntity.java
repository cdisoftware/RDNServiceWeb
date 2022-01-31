package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Pedro p Manejo de Excepciones
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paLogConsola",
            procedureName = "paLogConsola",
            resultClasses = LogConsolaEntity.class)
})
public class LogConsolaEntity implements Serializable {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Fecha")
    public String Fecha;

    @JsonProperty("Servicio")
    public String Servicio;

    @JsonProperty("Mensaje")
    public String Mensaje;

    @JsonProperty("Codigo")
    public String Codigo;

    @JsonProperty("Tipo")
    public Integer Tipo;
}
