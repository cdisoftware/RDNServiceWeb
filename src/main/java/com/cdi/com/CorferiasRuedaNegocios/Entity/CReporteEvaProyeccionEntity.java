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
            name = "paCReporteEvaProyeccion",
            procedureName = "paCReporteEvaProyeccion",
            resultClasses = CReporteEvaProyeccionEntity.class)
})
public class CReporteEvaProyeccionEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("ParticipanteSolicita")
    public String ParticipanteSolicita;

    @JsonProperty("TipoIdsolicita")
    public String TipoIdsolicita;

    @JsonProperty("NitSolicita")
    public String NitSolicita;

    @JsonProperty("ContactoSolicita")
    public String ContactoSolicita;

    @JsonProperty("EmailSolicita")
    public String EmailSolicita;

    @JsonProperty("ParticipanteAprueba")
    public String ParticipanteAprueba;

    @JsonProperty("TipoIdAprueba")
    public String TipoIdAprueba;

    @JsonProperty("NitAprueba")
    public String NitAprueba;

       @JsonProperty("ContactoAprueba")
    public String ContactoAprueba;

    @JsonProperty("EmailAprueba")
    public String EmailAprueba;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("NombreRueda")
    public String NombreRueda;

    @JsonProperty("IdAgenda")
    public Integer IdAgenda;

    @JsonProperty("FechaCita")
    public String FechaCita;

    @JsonProperty("HoraCita")
    public String HoraCita;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Interesado")
    public String Interesado;

    @JsonProperty("valorSpot")
    public Float valorSpot;

    @JsonProperty("Valor3a6meses")
    public Float Valor3a6meses;

    @JsonProperty("Valor6a9meses")
    public Float Valor6a9meses;

    @JsonProperty("Valor9a12meses")
    public Float Valor9a12meses;

     @JsonProperty("IdContactoA")
    public Integer IdContactoA;
    
    @JsonProperty("IdParticipanteA")
    public Integer IdParticipanteA;

    @JsonProperty("IdContactoS")
    public Integer IdContactoS;

    @JsonProperty("IdParticipanteS")
    public Integer IdParticipanteS;

}
