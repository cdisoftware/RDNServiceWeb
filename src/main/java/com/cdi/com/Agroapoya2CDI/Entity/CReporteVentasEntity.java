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
            name = "paC_ReporteVentas",
            procedureName = "paC_ReporteVentas",
            resultClasses = CReporteVentasEntity.class)
})
public class CReporteVentasEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("usucodigCliente")
    public Integer usucodigCliente;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("DOCUMENTO_USUARIO")
    public String DOCUMENTO_USUARIO;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("unidadesEntregar")
    public Integer unidadesEntregar;

    @JsonProperty("observacionesCliente")
    public String observacionesCliente;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

    @JsonProperty("tipoPago")
    public Integer tipoPago;

    @JsonProperty("descTipoPago")
    public String descTipoPago;

    @JsonProperty("IDGRUPO")
    public Integer IDGRUPO;

    @JsonProperty("tipo_compra")
    public Integer tipo_compra;

    @JsonProperty("descTipoCompra")
    public String descTipoCompra;

    @JsonProperty("tipo_usuarioCompra")
    public Integer tipo_usuarioCompra;

    @JsonProperty("descUsuarioCompra")
    public String descUsuarioCompra;

    @JsonProperty("ESTDO")
    public Integer ESTDO;

    @JsonProperty("descEstado")
    public String descEstado;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("COD_PEDIDO")
    public String COD_PEDIDO;

    @JsonProperty("ID_CLNTE")
    public Integer ID_CLNTE;

    @JsonProperty("Vlor_PagarForm")
    public String Vlor_PagarForm;

    @JsonProperty("EstadoPago")
    public Integer EstadoPago;

    @JsonProperty("DESCRIPCION_ESTADO")
    public String DESCRIPCION_ESTADO;

}
