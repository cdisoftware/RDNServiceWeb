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
            name = "paCDatosTableroPP",
            procedureName = "paCDatosTableroPP")
})
public class CDatosTableroPPEntity implements Serializable{

    @Id
    @JsonProperty("Bandera")
    public Integer Bandera;

    @JsonProperty("IdCaja")
    public Integer IdCaja;

    @JsonProperty("IdTipoGrupo")
    public Integer IdTipoGrupo;

}
