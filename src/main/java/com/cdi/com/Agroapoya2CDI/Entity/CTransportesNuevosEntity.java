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
            name = "paC_TransportesNuevos",
            procedureName = "paC_TransportesNuevos",
            resultClasses = CTransportesNuevosEntity.class)
})
public class CTransportesNuevosEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("idSector")
    public Integer idSector;

    @JsonProperty("descSector")
    public String descSector;

    @JsonProperty("idMunicipioLlegada")
    public Integer idMunicipioLlegada;

    @JsonProperty("DescCidudadLlegada")
    public String DescCidudadLlegada;

    @JsonProperty("idDeptoLlegada")
    public Integer idDeptoLlegada;

    @JsonProperty("DescDeptoLlegada")
    public String DescDeptoLlegada;

    @JsonProperty("idMunicipioOrigen")
    public Integer idMunicipioOrigen;

    @JsonProperty("DescCidudadOrigen")
    public String DescCidudadOrigen;

    @JsonProperty("idDeptoOrigen")
    public Integer idDeptoOrigen;

    @JsonProperty("DescDeptoOrigen")
    public String DescDeptoOrigen;

    @JsonProperty("COORDENADAS_PRCLA")
    public String COORDENADAS_PRCLA;

    @JsonProperty("UBCCION_PRCLA")
    public String UBCCION_PRCLA;

    @JsonProperty("unidades")
    public Integer unidades;

    @JsonProperty("ValorFlete")
    public String ValorFlete;

    @JsonProperty("ValorFleteForm")
    public String ValorFleteForm;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("fechaRecoge")
    public String fechaRecoge;

    @JsonProperty("estadoOferta")
    public Integer estadoOferta;

    @JsonProperty("NumeroConductores")
    public Integer NumeroConductores;

    @JsonProperty("NumeroConductoresNOActivos")
    public Integer NumeroConductoresNOActivos;

    @JsonProperty("numConduteresReal")
    public Integer numConduteresReal;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("coordenadasLlegada")
    public String coordenadasLlegada;

}
