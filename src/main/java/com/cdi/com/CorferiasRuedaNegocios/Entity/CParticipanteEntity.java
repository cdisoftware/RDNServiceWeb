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
            name = "paCParticipante",
            procedureName = "paCParticipante",
            resultClasses = CParticipanteEntity.class)
})
public class CParticipanteEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Empresa")
    private String Empresa;

    @JsonProperty("Nit")
    private String Nit;

    @JsonProperty("DireccionEmpresa")
    private String DireccionEmpresa;

    @JsonProperty("TelefonoEmpresa")
    private String TelefonoEmpresa;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Departamento")
    private String Departamento;

    @JsonProperty("IdDepartamento")
    private Integer IdDepartamento;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("Contacto")
    private String Contacto;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("CitasSolicitadas")
    private Integer CitasSolicitadas;

    @JsonProperty("CitasAprobadas")
    private Integer CitasAprobadas;

    @JsonProperty("CitasRechazadas")
    private Integer CitasRechazadas;

    @JsonProperty("CitasCanceladas")
    private Integer CitasCanceladas;

    @JsonProperty("CitasReagendadas")
    private Integer CitasReagendadas;

    @JsonProperty("TipoPerfil")
    private Integer TipoPerfil;

    @JsonProperty("NombrePerfil")
    private String NombrePerfil;

    @JsonProperty("EmailEmpresa")
    private String EmailEmpresa;

    @JsonProperty("PaginaWeb")
    private String PaginaWeb;

    @JsonProperty("EstadoEmpresaPart")
    private Integer EstadoEmpresaPart;

    @JsonProperty("EstadoPart")
    private String EstadoPart;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("SoloNacional")
    private Integer SoloNacional;

    @JsonProperty("NacionalExp")
    private Integer NacionalExp;

    @JsonProperty("AgendaAdicional")
    private Integer AgendaAdicional;

    @JsonProperty("NoCitasMin")
    private Integer NoCitasMin;

    @JsonProperty("NoCitasMax")
    private Integer NoCitasMax;

    @JsonProperty("TipoCita")
    private Integer TipoCita;

    @JsonProperty("Observacion")
    private String Observacion;

    @JsonProperty("IdTipoRueda")
    private Integer IdTipoRueda;

    @JsonProperty("TipoRueda")
    private String TipoRueda;

    @JsonProperty("ImagenPdf")
    private String ImagenPdf;

}
