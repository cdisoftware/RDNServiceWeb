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
            name = "pa_cliente_select_ofertasNuevas",
            procedureName = "pa_cliente_select_ofertasNuevas",
            resultClasses = cliente_select_ofertasNuevasEntity.class)
})
public class cliente_select_ofertasNuevasEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("VigenciaDesde")
    public String VigenciaDesde;

    @JsonProperty("VigenciaHasta")
    public String VigenciaHasta;

    @JsonProperty("Vr_Estimado_ClienteFr")
    public String Vr_Estimado_ClienteFr;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("tamano")
    public String tamano;

    @JsonProperty("Fecha_Registro")
    public String Fecha_Registro;

    @JsonProperty("Identificacion")
    public String Identificacion;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("Ciudad_Orig")
    public String Ciudad_Orig;

    @JsonProperty("Dep_Orig")
    public String Dep_Orig;

    @JsonProperty("Ubicacion_Parcela")
    public String Ubicacion_Parcela;

    @JsonProperty("Nombre_Conductor")
    public String Nombre_Conductor;

    @JsonProperty("Fecha_Entrega")
    public String Fecha_Entrega;

    @JsonProperty("Vr_Pagar_TransForm")
    public String Vr_Pagar_TransForm;

    @JsonProperty("CANT_MIN_MAYOR_TransForm")
    public String CANT_MIN_MAYOR_TransForm;

    @JsonProperty("ID_TRNSPORTISTA")
    public Integer ID_TRNSPORTISTA;

    @JsonProperty("IMAGEN")
    public String IMAGEN;

    @JsonProperty("SCTOR_OFRTA")
    public Integer SCTOR_OFRTA;

    @JsonProperty("productoRestante")
    public String productoRestante;

    @JsonProperty("Precio_Individual")
    public String Precio_Individual;

    @JsonProperty("PrecioGrupo")
    public String PrecioGrupo;

    @JsonProperty("Precio_Individual_Form")
    public String Precio_Individual_Form;

    @JsonProperty("PrecioGrupo_Form")
    public String PrecioGrupo_Form;

    @JsonProperty("id_sector")
    public Integer id_sector;

    @JsonProperty("estado")
    public Integer estado;

    @JsonProperty("SCTOR")
    public Integer SCTOR;

    @JsonProperty("IdTpoVenta")
    public Integer IdTpoVenta;

    @JsonProperty("Cant_Grupos")
    public Integer Cant_Grupos;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("FaltaXLiderGrupo")
    public Integer FaltaXLiderGrupo;

    @JsonProperty("FaltaUnidadesIndividuo")
    public Integer FaltaUnidadesIndividuo;

    @JsonProperty("FaltaUnidadesIndividuoIndividual")
    public Integer FaltaUnidadesIndividuoIndividual;

}
