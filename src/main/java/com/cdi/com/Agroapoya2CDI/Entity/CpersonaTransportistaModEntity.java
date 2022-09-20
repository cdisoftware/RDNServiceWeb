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
            name = "paC_personaTransportistaMod",
            procedureName = "paC_personaTransportistaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CpersonaTransportistaModEntity {

    @Id
    @JsonProperty("codUsuario")
    public Integer codUsuario;

    @JsonProperty("nombres")
    public String nombres;

    @JsonProperty("apellido")
    public String apellido;

    @JsonProperty("telefono")
    public String telefono;

    @JsonProperty("correo")
    public String correo;

    @JsonProperty("tipo_identificacion")
    public Integer tipo_identificacion;

    @JsonProperty("numero_identificacion")
    public String numero_identificacion;

    @JsonProperty("direccion")
    public String direccion;

    @JsonProperty("CMNTRIO")
    public String CMNTRIO;

    @JsonProperty("TOKEN")
    public String TOKEN;

    @JsonProperty("dpto")
    public Integer dpto;

    @JsonProperty("ciudad")
    public Integer ciudad;

    @JsonProperty("Complemento_direccion")
    public String Complemento_direccion;

    @JsonProperty("COORDENADAS")
    public String COORDENADAS;

    @JsonProperty("TPO_TRANSPORTE")
    public String TPO_TRANSPORTE;

    @JsonProperty("frma_pgo")
    public Integer frma_pgo;

    @JsonProperty("tpo_cnta")
    public Integer tpo_cnta;

    @JsonProperty("nocuenta")
    public String nocuenta;

    @JsonProperty("id_bnco")
    public Integer id_bnco;

    @JsonProperty("id_tpoprsn")
    public Integer id_tpoprsn;

}
