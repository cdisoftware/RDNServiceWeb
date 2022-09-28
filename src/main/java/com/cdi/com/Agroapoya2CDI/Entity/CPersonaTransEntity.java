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
            name = "paC_PersonaTrans",
            procedureName = "paC_PersonaTrans",
            resultClasses = CPersonaTransEntity.class)
})
public class CPersonaTransEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("TIPO_DOCUMENTO")
    public Integer TIPO_DOCUMENTO;

    @JsonProperty("DOCUMENTO_USUARIO")
    public String DOCUMENTO_USUARIO;

    @JsonProperty("CD_DPTO")
    public Integer CD_DPTO;

    @JsonProperty("CD_CDAD")
    public Integer CD_CDAD;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("COORDENADAS_DIR")
    public String COORDENADAS_DIR;

    @JsonProperty("ID_FRMA_PGO")
    public Integer ID_FRMA_PGO;

    @JsonProperty("ID_TPO_CUENTA")
    public Integer ID_TPO_CUENTA;

    @JsonProperty("NOCUENTA")
    public String NOCUENTA;

    @JsonProperty("ID_BNCO")
    public Integer ID_BNCO;

    @JsonProperty("ID_TPO_PRSNA")
    public Integer ID_TPO_PRSNA;

    @JsonProperty("NMBRE_ID")
    public String NMBRE_ID;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

}
