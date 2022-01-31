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
            name = "paPRegistroPerfil",
            procedureName = "paPRegistroPerfil",
            resultClasses = PRegistroPerfilEntity.class)
})
public class PRegistroPerfilEntity implements Serializable {

    @Id
    @JsonProperty("Id")
    private Integer Id;
    
    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdTipoPerfil")
    private Integer IdTipoPerfil;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("IdTerminoPolitica")
    private Integer IdTerminoPolitica;

    @JsonProperty("Version")
    private Integer Version;

    @JsonProperty("Texto")
    private String Texto;
}
