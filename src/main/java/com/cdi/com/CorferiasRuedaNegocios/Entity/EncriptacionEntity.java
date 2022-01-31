
package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EncriptacionEntity implements Serializable {

    @Id
    @JsonProperty("Bandera")
    private Integer Bandera;

    @JsonProperty("Clave")
    private String Clave;

}
