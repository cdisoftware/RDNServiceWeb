package com.cdi.com.CorferiasRuedaNegocios.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import lombok.Data;

@Data
public class meetwherebyEntity {   

    @JsonProperty("roonMode")
    private String roonMode;

    @JsonProperty("isLocked")
    private Boolean isLocked;
    
    @JsonProperty("endDate")
    private String endDate;

    @JsonProperty("fields")
    private String fields;
}
