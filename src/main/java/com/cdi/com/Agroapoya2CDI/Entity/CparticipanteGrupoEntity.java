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
            name = "paC_participanteGrupo",
            procedureName = "paC_participanteGrupo",
            resultClasses = CparticipanteGrupoEntity.class)
})
public class CparticipanteGrupoEntity {

    @Id
    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("CodPedido")
    public Integer CodPedido;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("IdEstadoPago")
    public Integer IdEstadoPago;

    @JsonProperty("DesEstadoPago")
    public String DesEstadoPago;

    @JsonProperty("UndsCmpradas")
    public Integer UndsCmpradas;

}
