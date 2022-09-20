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
            name = "paC_personaClienteMod",
            procedureName = "paC_personaClienteMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CpersonaClienteModEntity {

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

    @JsonProperty("RZON_SCIAL")
    public String RZON_SCIAL;

    @JsonProperty("NIT")
    public String NIT;

    @JsonProperty("COORDENADAS")
    public String COORDENADAS;

    @JsonProperty("TPO_CLNTEINST")
    public Integer TPO_CLNTEINST;
}
