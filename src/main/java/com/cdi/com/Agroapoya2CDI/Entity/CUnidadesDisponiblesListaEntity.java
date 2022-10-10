
package com.cdi.com.Agroapoya2CDI.Entity;
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
            name = "paC_UnidadesDisponiblesLista",
            procedureName = "paC_UnidadesDisponiblesLista",
            resultClasses = CUnidadesDisponiblesListaEntity.class)
})
public class CUnidadesDisponiblesListaEntity {
     @Id
    @JsonProperty("Id_Unidad")
    public Integer Id_Unidad;

    @JsonProperty("DesUnidad")
    public Integer DesUnidad;
}
