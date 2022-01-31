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
            name = "paPConsultaChat",
            procedureName = "paPConsultaChat",
            resultClasses = PConsultaChatEntity.class)
})
public class PConsultaChatEntity {

    @Id
    @JsonProperty("IdSala")
    private Integer IdSala;

    @JsonProperty("IdTipoSala")
    private Integer IdTipoSala;

    @JsonProperty("TipoSala")
    private String TipoSala;

    @JsonProperty("Mensaje")
    private String Mensaje;

    @JsonProperty("IdContactoS")
    private Integer IdContactoS;

    @JsonProperty("ContactoS")
    private String ContactoS;

    @JsonProperty("EstadoS")
    private Integer EstadoS;

    @JsonProperty("EstadoMensajeS")
    private String EstadoMensajeS;

    @JsonProperty("IdContactoA")
    private Integer IdContactoA;

    @JsonProperty("ContactoA")
    private String ContactoA;

    @JsonProperty("EstadoA")
    private Integer EstadoA;

    @JsonProperty("EstadoMensajeA")
    private String EstadoMensajeA;

    @JsonProperty("IdUsuarioC")
    private String IdUsuarioC;

    @JsonProperty("UsuarioSoporte")
    private String UsuarioSoporte;

    @JsonProperty("EstadoMensajeUC")
    private String EstadoMensajeUC;

    @JsonProperty("FechaMensaje")
    private String FechaMensaje;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    private String NombreRDN;
    
    @JsonProperty("IdMensaje")
    private Integer IdMensaje;
}
