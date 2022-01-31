package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paPEncabezaAgendaPdf",
            procedureName = "paPEncabezaAgendaPdf",
            resultClasses = PEncabezaAgendaPdfEntity.class)
})
public class PEncabezaAgendaPdfEntity {

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;
    
    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("ImagenRueda")
    private String ImagenRueda;

    @JsonProperty("Participante")
    private String Participante ;

    @JsonProperty("Contacto")
    private String Contacto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("IdCiudad")
    private String IdCiudad;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

}
