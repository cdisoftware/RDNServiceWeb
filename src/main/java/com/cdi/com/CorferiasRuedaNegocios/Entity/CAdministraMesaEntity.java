package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCAdministraMesa",
            procedureName = "paCAdministraMesa",
            resultClasses = CAdministraMesaEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCAdministraMesaMod",
            procedureName = "paCAdministraMesaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAdministraMesaEntity {

    @Id
    @JsonProperty("IdMesa")
    private Integer IdMesa ;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio ;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("NoInicioMesa")
    private Integer NoInicioMesa;

    @JsonProperty("NoFinMesa")
    private Integer NoFinMesa;

    @JsonProperty("Pabellon")
    private String Pabellon;

    @JsonProperty("Nivel")
    private String Nivel;

    @JsonProperty("CriterioPais")
    private Integer CriterioPais;

    @JsonProperty("CriterioEmpresa")
    private Integer CriterioEmpresa;

    @JsonProperty("CriterioContacto")
    private Integer CriterioContacto;

    @JsonProperty("IdTipoSeleccion")
    private Integer IdTipoSeleccion;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("Orden")
    private String Orden;

    @JsonProperty("IdPais")
    private Integer IdPais ;

    @JsonProperty("NombrePais")
    private String NombrePais ;

    @JsonProperty("NombreRueda")
    private String NombreRueda ;

}
