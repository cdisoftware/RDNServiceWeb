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
            name = "paCVisualizaParticipante",
            procedureName = "paCVisualizaParticipante",
            resultClasses = CVisualizaParticipanteEntity.class)
})
public class CVisualizaParticipanteEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Empresa")
    private String Empresa;

    @JsonProperty("Nit")
    private String Nit;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Departamento")
    private String Departamento;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("IdCiudad")
    private String IdCiudad;

    @JsonProperty("DireccionEmpresa")
    private String DireccionEmpresa;

    @JsonProperty("TelefonoEmpresa")
    private String TelefonoEmpresa;

    @JsonProperty("EmailEmpresa")
    private String EmailEmpresa;

    @JsonProperty("PaginaWeb")
    private String PaginaWeb;

    @JsonProperty("TipoPerfil")
    private Integer TipoPerfil;

    @JsonProperty("NombrePerfil")
    private String NombrePerfil;

    @JsonProperty("Observaciones")
    private String Observaciones;

    @JsonProperty("NombreContacto")
    private String NombreContacto;

    @JsonProperty("EmailContacto")
    private String EmailContacto;

    @JsonProperty("TelefonoContacto")
    private String TelefonoContacto;

    @JsonProperty("Cargo")
    private String Cargo;

    @JsonProperty("Dependencia")
    private String Dependencia;

    @JsonProperty("Identificacion")
    private String Identificacion;

    @JsonProperty("NoIdentificacion")
    private String NoIdentificacion;

    @JsonProperty("Idioma")
    private String Idioma;

    @JsonProperty("NumeroEntradas")
    private Integer NumeroEntradas;

    @JsonProperty("CitasSolicitadas")
    private Integer CitasSolicitadas;

    @JsonProperty("CitasAprobadas")
    private Integer CitasAprobadas;

    @JsonProperty("CitasRechazadas")
    private Integer CitasRechazadas;

    @JsonProperty("CitasCanceladas")
    private Integer CitasCanceladas;

    @JsonProperty("Matricula")
    private String Matricula;

    @JsonProperty("NumeroEmpleados")
    private String NumeroEmpleados;

    @JsonProperty("FechaConstitucion")
    private String FechaConstitucion;

    @JsonProperty("TipoActividad")
    private String TipoActividad;

    @JsonProperty("DescriActividad")
    private Integer DescriActividad;

    @JsonProperty("Importa")
    private String Importa;

    @JsonProperty("Exporta")
    private String Exporta;

    @JsonProperty("Referidos")
    private String Referidos;

    @JsonProperty("EstadoEmpresaPart")
    private Integer EstadoEmpresaPart;

    @JsonProperty("Estado")
    private String Estado;

    @JsonProperty("FechaAprobacion")
    private String FechaAprobacion;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("FechaActualizacion")
    private String FechaActualizacion;

    @JsonProperty("IdSector")
    private String IdSector;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("IdCategoria")
    private String IdCategoria;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("IdSubcategoria")
    private String IdSubcategoria;

    @JsonProperty("NombreSubcategoria")
    private String NombreSubcategoria;

    @JsonProperty("ProductosOfrece")
    private String ProductosOfrece;

    @JsonProperty("ProductosBusca")
    private String ProductosBusca;

    @JsonProperty("FechaInicioRdn")
    private String FechaInicioRdn;

    @JsonProperty("FechaFinRdn")
    private String FechaFinRdn;

    @JsonProperty("Ubicacion")
    private String Ubicacion;

    @JsonProperty("CantidadEspacio")
    private Integer CantidadEspacio;

    @JsonProperty("TerminosCondiciones")
    private String TerminosCondiciones;

    @JsonProperty("Genero")
    private String Genero;

    @JsonProperty("Contrasena")
    private String Contrasena;

}
