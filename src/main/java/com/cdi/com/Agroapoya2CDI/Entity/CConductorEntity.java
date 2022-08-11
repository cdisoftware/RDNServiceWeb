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
            name = "paC_Conductor",
            procedureName = "paC_Conductor",
            resultClasses = CConductorEntity.class)
})
public class CConductorEntity {

    @Id
    @JsonProperty("ID_CNDCTOR")
    public Integer ID_CNDCTOR;

    @JsonProperty("USUCODIG_TRANS")
    public Integer USUCODIG_TRANS;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TIPO_DOCUMENTO")
    public Integer TIPO_DOCUMENTO;

    @JsonProperty("desTipoDoc")
    public String desTipoDoc;

    @JsonProperty("NUMERO_ID")
    public String NUMERO_ID;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("CD_DPTO")
    public Integer CD_DPTO;

    @JsonProperty("desDepto")
    public String desDepto;

    @JsonProperty("CD_CDAD")
    public Integer CD_CDAD;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("DIRECCION")
    public String DIRECCION;

    @JsonProperty("COORDENADAS")
    public String COORDENADAS;

    @JsonProperty("id_carroceria")
    public Integer id_carroceria;

    @JsonProperty("desCarroceria")
    public String desCarroceria;

    @JsonProperty("id_pesoCargaCarro")
    public Integer id_pesoCargaCarro;

    @JsonProperty("desPeso")
    public String desPeso;
}
