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
            name = "paCVigenciaOferta",
            procedureName = "paCVigenciaOferta",
            resultClasses = CVigenciaOfertaEntoty.class)
})
public class CVigenciaOfertaEntoty {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("vgncia_desde")
    public String vgncia_desde;

    @JsonProperty("vgncia_hasta")
    public String vgncia_hasta;

    @JsonProperty("hora_desde")
    public String hora_desde;

    @JsonProperty("hora_hasta")
    public String hora_hasta;

    @JsonProperty("fcha_vgncia")
    public String fcha_vgncia;

    @JsonProperty("observaciones")
    public String observaciones;
}
