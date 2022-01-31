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
            name = "paCEvaluacion",
            procedureName = "paCEvaluacion",
            resultClasses = CEvaluacionEntity.class)
})
public class CEvaluacionEntity {

    @Id
    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("TituloEncuesta")
    private String TituloEncuesta;

    @JsonProperty("NombreRueda")
    private String NombreRueda;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdEstado")
    private Integer IdEstado;

    @JsonProperty("Estado")
    private String Estado;

    @JsonProperty("IdRequiereFirma")
    private Integer IdRequiereFirma;

    @JsonProperty("RequiereFirma")
    private String RequiereFirma;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("IdPublicar")
    private Integer IdPublicar;

    @JsonProperty("Publicar")
    private String Publicar;

    @JsonProperty("FechaPublicacion")
    private String FechaPublicacion;

    @JsonProperty("FechaActivacion")
    private String FechaActivacion;

    @JsonProperty("FechaInactiva")
    private String FechaInactiva;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("DescPerfil")
    private String DescPerfil;

    @JsonProperty("IdTipoEvaEnc")
    private Integer IdTipoEvaEnc;

    @JsonProperty("Tipo")
    private String Tipo;

    @JsonProperty("Vigencia")
    private String Vigencia;

    @JsonProperty("Codigo")
    private String Codigo;
    
    @JsonProperty ("ImagenBit")
    private String ImagenBit;
}
