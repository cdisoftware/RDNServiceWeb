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
            name = "paCCordenadasSector",
            procedureName = "paCCordenadasSector",
            resultClasses = CCordenadasSectorEntity.class)
})
public class CCordenadasSectorEntity {

    @Id
    @JsonProperty("consecutivo")
    public Integer consecutivo;

    @JsonProperty("id_oferta")
    public Integer id_oferta;

    @JsonProperty("Latitud")
    public String Latitud;

    @JsonProperty("Longitud")
    public String Longitud;
}
