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
            name = "paCListaParticipantesRDN",
            procedureName = "paCListaParticipantesRDN",
            resultClasses = CListaParticipantesRDNEntity.class)
})

public class CListaParticipantesRDNEntity {

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Participante")
    private String Participante;

    @JsonProperty("Nit")
    private String Nit;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

}
