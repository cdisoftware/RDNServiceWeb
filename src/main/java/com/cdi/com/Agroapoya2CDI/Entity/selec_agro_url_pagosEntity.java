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
            name = "selec_agro_url_pagos",
            procedureName = "selec_agro_url_pagos",
            resultClasses = selec_agro_url_pagosEntity.class)
})
public class selec_agro_url_pagosEntity {

    @Id
    @JsonProperty("ID_URL")
    public Integer ID_URL;

    @JsonProperty("URL")
    public String URL;

    @JsonProperty("PARAMETRO")
    public String PARAMETRO;

    @JsonProperty("CD_ESTADO")
    public Integer CD_ESTADO;

    @JsonProperty("PARAMETRO2")
    public String PARAMETRO2;
}
