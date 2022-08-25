package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_evidencia",
            procedureName = "paC_evidencia",
            resultClasses = evidenciaEntity.class)
})
public class evidenciaEntity {

    @Id
    @JsonProperty("id_evidencia")
    public Integer id_evidencia;

    @JsonProperty("id_conductor")
    public Integer id_conductor;

    @JsonProperty("id_factura")
    public Integer id_factura;

    @JsonProperty("estado_Entrega")
    public Integer estado_Entrega;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("Observacion")
    public String Observacion;
}
