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
            name = "mv_EnvioCorreoTransprtistaVieje",
            procedureName = "mv_EnvioCorreoTransprtistaVieje",
            resultClasses = mv_EnvioCorreoTransprtistaViejeEntity.class)
})
public class mv_EnvioCorreoTransprtistaViejeEntity {

    @Id
    @JsonProperty("id_clnte")
    public Integer id_clnte;

    @JsonProperty("IMAGEN")
    public String IMAGEN;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("Fecha_Recogida")
    public String Fecha_Recogida;

    @JsonProperty("Fecha_Entrega")
    public String Fecha_Entrega;

    @JsonProperty("Dep_Orig")
    public String Dep_Orig;

    @JsonProperty("Ciudad_Orig")
    public String Ciudad_Orig;

    @JsonProperty("Ubicacion_Parcela")
    public String Ubicacion_Parcela;

    @JsonProperty("COORDENADAS_PRCLA")
    public String COORDENADAS_PRCLA;

    @JsonProperty("Transportista")
    public String Transportista;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("Placa")
    public String Placa;

    @JsonProperty("ID_TRNSPORTISTA")
    public Integer ID_TRNSPORTISTA;

    @JsonProperty("Doc_Conducto")
    public String Doc_Conducto;

    @JsonProperty("CORREOTRANS")
    public String CORREOTRANS;

    @JsonProperty("VR_TRNSform")
    public String VR_TRNSform;

    @JsonProperty("VLR_PGR_TRNSP_ENTForm")
    public String VLR_PGR_TRNSP_ENTForm;

    @JsonProperty("vlr_descargaform")
    public String vlr_descargaform;

    @JsonProperty("VR_TRNSPORTE")
    public String VR_TRNSPORTE;

    @JsonProperty("Vr_Pagar_Trans")
    public String Vr_Pagar_Trans;

    @JsonProperty("VLR_DESCARGA")
    public String VLR_DESCARGA;

    @JsonProperty("Razon_Social")
    public String Razon_Social;

    @JsonProperty("Cliente_Institucional")
    public String Cliente_Institucional;

    @JsonProperty("cel_Cliente_inst")
    public String cel_Cliente_inst;

    @JsonProperty("DIRECCION_ENTREGA")
    public String DIRECCION_ENTREGA;

    @JsonProperty("Ciudad_Entrega")
    public String Ciudad_Entrega;

    @JsonProperty("Dep_Entrega")
    public String Dep_Entrega;

    @JsonProperty("Coord_Entrega")
    public String Coord_Entrega;

    @JsonProperty("UniCompradas")
    public Integer UniCompradas;

    @JsonProperty("aceptarDescarga")
    public Integer aceptarDescarga;

    @JsonProperty("AceptaDescargaString")
    public String AceptaDescargaString;

    @JsonProperty("VLR_DESCARGAFORMTOTAL")
    public String VLR_DESCARGAFORMTOTAL;

    @JsonProperty("VLR_DESCARGATOTAL")
    public String VLR_DESCARGATOTAL;

}
