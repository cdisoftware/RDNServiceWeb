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
            name = "paCDatosTablero",
            procedureName = "paCDatosTablero",
            resultClasses = CDatosTableroEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCDatosTableroMod",
            procedureName = "paCDatosTableroMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CDatosTableroEntity {

    @Id
    @JsonProperty("IdCaja")
    private Integer IdCaja ;

    @JsonProperty("NombreCaja")
    private String NombreCaja;

    @JsonProperty("Sql")
    private String Sql ;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("IdTipoGrupo")
    private Integer IdTipoGrupo;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("DescripcionActualiza")
    private String DescripcionActualiza;

    @JsonProperty("Estado")
    private Integer Estado;

}
