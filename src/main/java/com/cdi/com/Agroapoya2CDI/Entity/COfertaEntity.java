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
            name = "paCOferta",
            procedureName = "paCOferta",
            resultClasses = COfertaEntity.class)
})
public class COfertaEntity {

    @Id
    @JsonProperty("Producto")
    public Integer Producto;

    @JsonProperty("Presentacion_emp")
    public Integer Presentacion_emp;

    @JsonProperty("peso")
    public Float peso;

    @JsonProperty("Condicion")
    public Integer Condicion;

    @JsonProperty("Tamano")
    public Integer Tamano;

    @JsonProperty("caracteristicas")
    public String caracteristicas;

    @JsonProperty("VR_UNDAD_EMPQUE")
    public String VR_UNDAD_EMPQUE;

    @JsonProperty("Unidades_disponibles")
    public Integer Unidades_disponibles;

    @JsonProperty("VR_TOTAL_OFRTA")
    public String VR_TOTAL_OFRTA;

    @JsonProperty("fecha_recogida")
    public String fecha_recogida;

    @JsonProperty("jornada")
    public Integer jornada;

    @JsonProperty("Departamentos")
    public Integer Departamentos;

    @JsonProperty("Ciudad")
    public Integer Ciudad;

    @JsonProperty("Ubicacion_parsela")
    public String Ubicacion_parsela;

    @JsonProperty("coordenadas_parcela")
    public String coordenadas_parcela;

    @JsonProperty("Productor")
    public Integer Productor;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("CD_PAIS")
    public Integer CD_PAIS;

    @JsonProperty("Tramite")
    public Integer Tramite;

    @JsonProperty("CodigoOferta")
    public Integer CodigoOferta;

    @JsonProperty("Nombre_productor")
    public String Nombre_productor;

    @JsonProperty("Nombre_Producto")
    public String Nombre_Producto;

    @JsonProperty("Nmbre_tamano")
    public String Nmbre_tamano;

    @JsonProperty("Descripcion_empaque")
    public String Descripcion_empaque;

    @JsonProperty("Nombre_jornada")
    public String Nombre_jornada;

    @JsonProperty("caracterizacion")
    public String caracterizacion;

    @JsonProperty("IMAGEN")
    public String IMAGEN;

    @JsonProperty("vlor_pactado_productor")
    public String vlor_pactado_productor;

    @JsonProperty("vlor_flte_xunidad")
    public String vlor_flte_xunidad;
}
