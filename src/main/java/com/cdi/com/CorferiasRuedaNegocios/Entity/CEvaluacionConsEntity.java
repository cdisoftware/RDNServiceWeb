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
            name = "paCEvaluacionCons",
            procedureName = "paCEvaluacionCons",
            resultClasses = CEvaluacionConsEntity.class)
})
public class CEvaluacionConsEntity {

    @Id
    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("TituloEncuesta")
    private String TituloEncuesta;

    @JsonProperty("NombreRueda")
    private String NombreRueda;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("DescPerfil")
    private String DescPerfil;

    @JsonProperty("IdTipoEvaEnc")
    private Integer IdTipoEvaEnc;

    @JsonProperty("Tipo")
    private String Tipo;
}
