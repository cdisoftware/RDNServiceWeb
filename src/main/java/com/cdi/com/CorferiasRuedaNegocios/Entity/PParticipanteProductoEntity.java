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
            name = "paPParticipanteProducto",
            procedureName = "paPParticipanteProducto",
            resultClasses = PParticipanteProductoEntity.class)
})
public class PParticipanteProductoEntity {

    @Id
    @JsonProperty("IdProducto")
    private Integer IdProducto;

    @JsonProperty("Idparticipante")
    private String Idparticipante;

    @JsonProperty("DescripcionProducto")
    private String DescripcionProducto;

    @JsonProperty("FichaTecnica")
    private String FichaTecnica;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("NombreProducto")
    private String NombreProducto;

    @JsonProperty("NombreRueda")
    private String NombreRueda;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;

}
