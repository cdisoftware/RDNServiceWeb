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
            name = "paCValoracionOferta",
            procedureName = "paCValoracionOferta",
            resultClasses = CValoracionOfertaEntity.class)
})
public class CValoracionOfertaEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("TPO_OFRTA")
    public Integer TPO_OFRTA;

    @JsonProperty("Dscpcion_tpo_ofrta")
    public String Dscpcion_tpo_ofrta;

    @JsonProperty("tpo_cmsion_indvdual")
    public Integer tpo_cmsion_indvdual;

    @JsonProperty("Nom_tpo_cmsion_indvdual")
    public String Nom_tpo_cmsion_indvdual;

    @JsonProperty("vlor_cmsion_indvdual")
    public String vlor_cmsion_indvdual;

    @JsonProperty("mnmo_unddes_indvdual")
    public Integer mnmo_unddes_indvdual;

    @JsonProperty("mxmo_unddes_indvdual")
    public Integer mxmo_unddes_indvdual;

    @JsonProperty("vlor_dmnclio_indvdual")
    public String vlor_dmnclio_indvdual;

    @JsonProperty("vlor_fnal_indvdual")
    public String vlor_fnal_indvdual;

    @JsonProperty("tpo_cmsion_grpal")
    public Integer tpo_cmsion_grpal;

    @JsonProperty("Nom_tpo_cmsion_grpal")
    public String Nom_tpo_cmsion_grpal;

    @JsonProperty("vlor_cmsion_grpal")
    public String vlor_cmsion_grpal;

    @JsonProperty("mnmo_unddes_lider")
    public String mnmo_unddes_lider;

    @JsonProperty("mxmo_unddes_lider")
    public String mxmo_unddes_lider;

    @JsonProperty("prcntje_dcto_lider")
    public String prcntje_dcto_lider;

    @JsonProperty("vlor_dmnclio_grpal")
    public String vlor_dmnclio_grpal;

    @JsonProperty("cntdad_grpos")
    public String cntdad_grpos;

    @JsonProperty("unddes_xgrpo")
    public String unddes_xgrpo;

    @JsonProperty("mnmo_unddes_prcpnte")
    public String mnmo_unddes_prcpnte;

    @JsonProperty("mxmo_unddes_prcpnte")
    public String mxmo_unddes_prcpnte;

    @JsonProperty("cntdad_cmpras_indvdles")
    public String cntdad_cmpras_indvdles;

    @JsonProperty("vlor_fnal_lider")
    public String vlor_fnal_lider;

    @JsonProperty("vlor_fnal_prtcpnte")
    public String vlor_fnal_prtcpnte;

    @JsonProperty("vgncia_desde")
    public String vgncia_desde;

    @JsonProperty("vgncia_hasta")
    public String vgncia_hasta;

    @JsonProperty("hora_desde")
    public String hora_desde;

    @JsonProperty("hora_hasta")
    public String hora_hasta;

    @JsonProperty("fcha_vgncia")
    public String fcha_vgncia;

    @JsonProperty("observaciones")
    public String observaciones;

}
