package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paCVigenciaOfertaMod",
            procedureName = "paCVigenciaOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CVigenciaOfertaModEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("VGNCIA_DESDE")
    public String VGNCIA_DESDE;

    @JsonProperty("VGNCIA_HASTA")
    public String VGNCIA_HASTA;

    @JsonProperty("HORA_DESDE")
    public String HORA_DESDE;

    @JsonProperty("HORA_HASTA")
    public String HORA_HASTA;

    @JsonProperty("FCHA_ENTRGA")
    public String FCHA_ENTRGA;

    @JsonProperty("OBSERVACIONES")
    public String OBSERVACIONES;

    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;

}
