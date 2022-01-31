
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
            name = "paPChat",
            procedureName = "paPChat",
            resultClasses = PChatEntity.class)
})
public class PChatEntity {

    @Id
    @JsonProperty("IdChat")
    public Integer IdChat;

    @JsonProperty("IdTipoChat")
    public Integer IdTipoChat;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("FechaActiva")
    public String FechaActiva;

    @JsonProperty("HoraDesde")
    public String HoraDesde;

    @JsonProperty("HoraHasta")
    public String HoraHasta;

    @JsonProperty("Mensaje")
    public String Mensaje;

    @JsonProperty("NombreRueda")
    public String NombreRueda;

    @JsonProperty("IdJornadaActiva")
    public Integer IdJornadaActiva;

    @JsonProperty("Horad")
    public String Horad;

    @JsonProperty("dia")
    public String dia;
}
