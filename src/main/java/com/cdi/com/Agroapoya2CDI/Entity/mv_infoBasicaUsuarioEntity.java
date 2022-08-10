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
            name = "paC_infoBasicaUsuario",
            procedureName = "paC_infoBasicaUsuario",
            resultClasses = mv_infoBasicaUsuarioEntity.class)
})
public class mv_infoBasicaUsuarioEntity {

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

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("TIPO_DOCUMENTO")
    public Integer TIPO_DOCUMENTO;

    @JsonProperty("DOCUMENTO_USUARIO")
    public String DOCUMENTO_USUARIO;

    @JsonProperty("CD_PAIS")
    public String CD_PAIS;

    @JsonProperty("CD_DPTO")
    public Integer CD_DPTO;

    @JsonProperty("CD_CDAD")
    public Integer CD_CDAD;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMNTRIO")
    public String CMNTRIO;

    @JsonProperty("RAZON_SOCIAL")
    public String RAZON_SOCIAL;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("CD_TIPO_CLIENTE")
    public Integer CD_TIPO_CLIENTE;

    @JsonProperty("CD_TIPO_CLIENTEDESCIP")
    public String CD_TIPO_CLIENTEDESCIP;

    @JsonProperty("SCTOR")
    public Integer SCTOR;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("TOKEN_PERSONA")
    public String TOKEN_PERSONA;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

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
