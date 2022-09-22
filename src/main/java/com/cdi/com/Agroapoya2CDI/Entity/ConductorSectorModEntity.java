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
            name = "paC_conductorSectorMod",
            procedureName = "paC_conductorSectorMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class ConductorSectorModEntity {

    @Id
    @JsonProperty("Cd_cnsctivo")
    public Integer Cd_cnsctivo;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;

    @JsonProperty("Id_Conductor")
    public Integer Id_Conductor;

    @JsonProperty("UsucodigTrans")
    public Integer UsucodigTrans;

    @JsonProperty("vlor_flete")
    public String vlor_flete;

    @JsonProperty("IdEstado")
    public Integer IdEstado;
}
