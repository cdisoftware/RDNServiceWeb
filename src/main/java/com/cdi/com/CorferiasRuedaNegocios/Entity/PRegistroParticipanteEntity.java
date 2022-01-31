package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPRegistroParticipante",
            procedureName = "paPRegistroParticipante",
            resultClasses = PRegistroParticipanteEntity.class)
})
public class PRegistroParticipanteEntity implements Serializable {

    @Id
    @JsonProperty("IdParticipante")
    private Integer IdParticipante ;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;

    @JsonProperty("NoIdentificacion")
    private String NoIdentificacion ;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("IdDepartamento")
    private Integer IdDepartamento;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Url")
    private String Url;

    @JsonProperty("Observacion")
    private String Observacion;

    @JsonProperty("imagen")
    private String imagen ;
}
