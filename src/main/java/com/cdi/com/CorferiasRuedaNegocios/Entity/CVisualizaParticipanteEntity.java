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
    public Integer Id;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("NombreRDN")
    public String NombreRDN;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("Empresa")
    public String Empresa;

    @JsonProperty("Nit")
    public String Nit;

    @JsonProperty("Pais")
    public String Pais;

    @JsonProperty("IdPais")
    public Integer IdPais;

    @JsonProperty("Departamento")
    public String Departamento;

    @JsonProperty("IdDepartamento")
    public String IdDepartamento;

    @JsonProperty("Ciudad")
    public String Ciudad;

    @JsonProperty("IdCiudad")
    public String IdCiudad;

    @JsonProperty("DireccionEmpresa")
    public String DireccionEmpresa;

    @JsonProperty("TelefonoEmpresa")
    public String TelefonoEmpresa;

    @JsonProperty("EmailEmpresa")
    public String EmailEmpresa;

    @JsonProperty("PaginaWeb")
    public String PaginaWeb;

    @JsonProperty("TipoPerfil")
    public Integer TipoPerfil;

    @JsonProperty("NombrePerfil")
    public String NombrePerfil;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("NombreContacto")
    public String NombreContacto;

    @JsonProperty("EmailContacto")
    public String EmailContacto;

    @JsonProperty("TelefonoContacto")
    public String TelefonoContacto;

    @JsonProperty("Cargo")
    public String Cargo;

    @JsonProperty("Dependencia")
    public String Dependencia;

    @JsonProperty("Identificacion")
    public String Identificacion;

    @JsonProperty("NoIdentificacion")
    public String NoIdentificacion;

    @JsonProperty("Idioma")
    public String Idioma;

    @JsonProperty("NumeroEntradas")
    public Integer NumeroEntradas;

    @JsonProperty("CitasSolicitadas")
    public Integer CitasSolicitadas;

    @JsonProperty("CitasAprobadas")
    public Integer CitasAprobadas;

    @JsonProperty("CitasRechazadas")
    public Integer CitasRechazadas;

    @JsonProperty("CitasCanceladas")
    public Integer CitasCanceladas;

    @JsonProperty("Matricula")
    public String Matricula;

    @JsonProperty("NumeroEmpleados")
    public String NumeroEmpleados;

    @JsonProperty("FechaConstitucion")
    public String FechaConstitucion;

    @JsonProperty("TipoActividad")
    public String TipoActividad;

    @JsonProperty("DescriActividad")
    public String DescriActividad;

    @JsonProperty("Importa")
    public String Importa;

    @JsonProperty("Exporta")
    public String Exporta;

    @JsonProperty("Referidos")
    public String Referidos;

    @JsonProperty("EstadoEmpresaPart")
    public Integer EstadoEmpresaPart;

    @JsonProperty("Estado")
    public String Estado;

    @JsonProperty("FechaAprobacion")
    public String FechaAprobacion;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("FechaActualizacion")
    public String FechaActualizacion;

    @JsonProperty("IdSector")
    public String IdSector;

    @JsonProperty("NombreSector")
    public String NombreSector;

    @JsonProperty("IdCategoria")
    public String IdCategoria;

    @JsonProperty("NombreCategoria")
    public String NombreCategoria;

    @JsonProperty("IdSubcategoria")
    public String IdSubcategoria;

    @JsonProperty("NombreSubcategoria")
    public String NombreSubcategoria;

    @JsonProperty("ProductosOfrece")
    public String ProductosOfrece;

    @JsonProperty("ProductosBusca")
    public String ProductosBusca;

    @JsonProperty("FechaInicioRdn")
    public String FechaInicioRdn;

    @JsonProperty("FechaFinRdn")
    public String FechaFinRdn;

    @JsonProperty("Ubicacion")
    public String Ubicacion;

    @JsonProperty("CantidadEspacio")
    public Integer CantidadEspacio;

    @JsonProperty("TerminosCondiciones")
    public String TerminosCondiciones;

    @JsonProperty("Genero")
    public String Genero;

    @JsonProperty("Contrasena")
    public String Contrasena;

}
