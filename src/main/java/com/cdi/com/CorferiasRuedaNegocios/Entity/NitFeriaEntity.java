package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class NitFeriaEntity implements Serializable {
    
    @Id
    @JsonProperty("stand")
    public String stand;
    
    @JsonProperty("nivel")
    public String nivel;
    
    @JsonProperty("pabellon")
    public String pabellon;    
    
}
