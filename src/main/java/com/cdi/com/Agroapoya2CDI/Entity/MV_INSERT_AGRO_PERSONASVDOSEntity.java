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
            name = "paC_personaMod",
            procedureName = "paC_personaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class MV_INSERT_AGRO_PERSONASVDOSEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("CD_TIPO_PRSNA")
    public Integer CD_TIPO_PRSNA;

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

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CD_DPTO")
    public Integer CD_DPTO;

    @JsonProperty("CD_CDAD")
    public Integer CD_CDAD;

    @JsonProperty("CMNTRIO")
    public String CMNTRIO;

    @JsonProperty("TOKEN_PERSONA")
    public String TOKEN_PERSONA;

    @JsonProperty("NIT")
    public String NIT;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("TPO_TRANSPORTE")
    public String TPO_TRANSPORTE;

    @JsonProperty("CD_TIPO_CLIENTE")
    public Integer CD_TIPO_CLIENTE;

    @JsonProperty("RAZON_SOCIAL")
    public String RAZON_SOCIAL;

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
}
