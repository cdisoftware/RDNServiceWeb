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
 * @author Pedro p Manejo de Excepciones web
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPLogWeb",
            procedureName = "paPLogWeb",
            resultClasses = PLogWebEntity.class)
})
public class PLogWebEntity implements Serializable {

    @Id
    @JsonProperty("IdLog")
    private Integer IdLog;

    @JsonProperty("VistaWeb")
    private String VistaWeb;

    @JsonProperty("MensajeError")
    private String MensajeError;

    @JsonProperty("Metodo")
    private String Metodo;

    @JsonProperty("Servicio")
    private String Servicio;

    @JsonProperty("NumeroIncidentes")
    private Integer NumeroIncidentes;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

}
