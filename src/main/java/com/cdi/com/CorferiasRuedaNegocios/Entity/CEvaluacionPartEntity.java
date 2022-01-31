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
            name = "paCEvaluacionPart",
            procedureName = "paCEvaluacionPart",
            resultClasses = CEvaluacionPartEntity.class)
})
public class CEvaluacionPartEntity {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("Participante")
    private String Participante;

    @JsonProperty("Nit")
    private String Nit;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("NombrePais")
    private String NombrePais;

    @JsonProperty("Url")
    private String Url;

    @JsonProperty("NombreCompleto")
    private String NombreCompleto;

    @JsonProperty("email")
    private String email;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Cargo")
    private String Cargo;

    @JsonProperty("FechaCita")
    private String FechaCita;

    @JsonProperty("EmpresasCitas")
    private String EmpresasCitas;

}
