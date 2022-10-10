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
            name = "paC_TransActivos",
            procedureName = "paC_TransActivos",
            resultClasses = TransActivosEntity.class)
})
public class TransActivosEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IMAGEN")
    public String IMAGEN;

    @JsonProperty("id_conductor")
    public Integer id_conductor;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("descCarroceria")
    public String descCarroceria;

    @JsonProperty("descPesoCarro")
    public String descPesoCarro;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("usucodigTrans")
    public Integer usucodigTrans;

    @JsonProperty("valorFlete")
    public String valorFlete;

    @JsonProperty("valorFleteForm")
    public String valorFleteForm;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("pesoTablaProductor")
    public String pesoTablaProductor;

    @JsonProperty("FechaRecogida")
    public String FechaRecogida;

    @JsonProperty("IdEstado_Oferta")
    public Integer IdEstado_Oferta;

    @JsonProperty("desOferta")
    public String desOferta;

    @JsonProperty("ubicacionParcela")
    public String ubicacionParcela;

    @JsonProperty("coordParcela")
    public String coordParcela;

    @JsonProperty("CD_RGION")
    public Integer CD_RGION;

    @JsonProperty("Dep_Orig")
    public String Dep_Orig;

    @JsonProperty("CD_MNCPIO")
    public Integer CD_MNCPIO;

    @JsonProperty("Ciudad_Orig")
    public String Ciudad_Orig;

    @JsonProperty("desc_SectorEntrega")
    public String desc_SectorEntrega;

    @JsonProperty("desEstadoCarga")
    public String desEstadoCarga;

    @JsonProperty("idEstadoCarga")
    public Integer idEstadoCarga;

    @JsonProperty("fechaEntrega")
    public String fechaEntrega;

    @JsonProperty("CiudadEntrega")
    public String CiudadEntrega;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("UnidadesTotales")
    public Integer UnidadesTotales;
    
    @JsonProperty("etapasOfera")
    public String etapasOfera;
    
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;
    
    @JsonProperty("IdSector")
    public Integer IdSector;
}
