package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Pedro p lista perfil rdn
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCListaPerfilRdn",
            procedureName = "paCListaPerfilRdn",
            resultClasses = CListaPerfilRdnEntity.class)
})
public class CListaPerfilRdnEntity implements Serializable {

    @Id
    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("Descripcion")
    private String Descripcion;

}
