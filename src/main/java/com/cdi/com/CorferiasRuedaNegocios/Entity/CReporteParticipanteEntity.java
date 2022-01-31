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
            name = "paCReporteParticipante",
            procedureName = "paCReporteParticipante",
            resultClasses = CReporteParticipanteEntity.class)
})
public class CReporteParticipanteEntity {

    @Id
    @JsonProperty("IdParticipante")
    private Integer IdParticipante ;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;

    @JsonProperty("Nit")
    private String Nit ;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("Departamento")
    private String Departamento;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("ContactosPart")
    private Integer ContactosPart;

    @JsonProperty("Ruedas")
    private String Ruedas;

    @JsonProperty("Sectores")
    private String Sectores;

    @JsonProperty("CitasAprobadas")
    private Integer CitasAprobadas;

    @JsonProperty("CitasSolicitadas")
    private Integer CitasSolicitadas;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("PerfilesAsociados")
    private String PerfilesAsociados;

}
