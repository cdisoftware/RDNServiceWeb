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
            name = "paCReporteAccesoSalas",
            procedureName = "paCReporteAccesoSalas",
            resultClasses = CReporteAccesoSalasEntity.class)
})
public class CReporteAccesoSalasEntity {

    @Id
    @JsonProperty("IdAgenda")
    public Integer IdAgenda;

    @JsonProperty("RuedaNegocio")
    public String RuedaNegocio;

    @JsonProperty("Parte1")
    public String Parte1;

    @JsonProperty("Parte2")
    public String Parte2;

    @JsonProperty("FechaCita")
    public String FechaCita;

    @JsonProperty("HoraCita")
    public String HoraCita;

    @JsonProperty("LinkSala")
    public String LinkSala;

    @JsonProperty("estado_cita")
    public String estado_cita;
}
