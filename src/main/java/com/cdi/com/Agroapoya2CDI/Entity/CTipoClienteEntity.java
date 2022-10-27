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
            name = "paC_TipoCliente",
            procedureName = "paC_TipoCliente",
            resultClasses = CTipoClienteEntity.class)
})
public class CTipoClienteEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("CD_TIPO_CLIENTE")
    public Integer CD_TIPO_CLIENTE;

    @JsonProperty("RAZON_SOCIAL")
    public String RAZON_SOCIAL;

    @JsonProperty("NIT")
    public String NIT;

    @JsonProperty("DIRECCION_ENTREGA")
    public String DIRECCION_ENTREGA;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("DescTipoCliente")
    public String DescTipoCliente;
}
