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
            name = "paCReporteEvaEnc",
            procedureName = "paCReporteEvaEnc",
            resultClasses = CReporteEvaEncEntity.class)
})
public class CReporteEvaEncEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdEvaluacion")
    public Integer IdEvaluacion;

    @JsonProperty("Participante")
    public String Participante;

    @JsonProperty("TipoId")
    public String TipoId;

    @JsonProperty("Nit")
    public String Nit;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("NombreRueda")
    public String NombreRueda;

    @JsonProperty("Contacto")
    public String Contacto;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("Estado")
    public String Estado;

    @JsonProperty("FechaActivacion")
    public String FechaActivacion;

    @JsonProperty("FechaInactiva")
    public String FechaInactiva;

    @JsonProperty("IdPerfilRueda")
    public Integer IdPerfilRueda;

    @JsonProperty("DescPerfil")
    public String DescPerfil;

    @JsonProperty("IdTipoEvaEnc")
    public Integer IdTipoEvaEnc;

    @JsonProperty("Tipo")
    public String Tipo;

    @JsonProperty("FechaPublicacion")
    public String FechaPublicacion;

    @JsonProperty("Codigo")
    public String Codigo;

    @JsonProperty("IdContacto")
    public Integer IdContacto;
}
