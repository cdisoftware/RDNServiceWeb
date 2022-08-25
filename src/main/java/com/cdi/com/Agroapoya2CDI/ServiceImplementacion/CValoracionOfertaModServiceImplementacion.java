package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValoracionOfertaModServiceImplementacion implements CValoracionOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CValoracionOfertaMod(CValoracionOfertaModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paCValoracionOfertaMod");
            insertbackup.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TPO_OFRTA", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TPO_CMSION_INDVDUAL", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_CMSION_INDVDUAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("MNMO_UNDDES_INDVDUAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("MXMO_UNDDES_INDVDUAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_DMNCLIO_INDVDUAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_FNAL_INDVDUAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TPO_CMSION_GRPAL", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_CMSION_GRPAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("MNMO_UNDDES_LIDER", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("MXMO_UNDDES_LIDER", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("PRCNTJE_DCTO_LIDER", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_DMNCLIO_GRPAL", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CNTDAD_GRPOS", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("UNDDES_XGRPO", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("MNMO_UNDDES_PRCPNTE", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("MXMO_UNDDES_PRCPNTE", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CNTDAD_CMPRAS_INDVDLES", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_FNAL_LIDER", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VLOR_FNAL_PRTCPNTE", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VGNCIA_DESDE", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("VGNCIA_HASTA", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("HORA_DESDE", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("HORA_HASTA", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("FCHA_ENTRGA", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("OBSERVACIONES", String.class, ParameterMode.IN);

            insertbackup.setParameter("BANDERA", BANDERA);
            insertbackup.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertbackup.setParameter("TPO_OFRTA", entidad.getTPO_OFRTA());
            insertbackup.setParameter("TPO_CMSION_INDVDUAL", entidad.getTPO_CMSION_INDVDUAL());
            insertbackup.setParameter("VLOR_CMSION_INDVDUAL", entidad.getVLOR_CMSION_INDVDUAL());
            insertbackup.setParameter("MNMO_UNDDES_INDVDUAL", entidad.getMNMO_UNDDES_INDVDUAL());
            insertbackup.setParameter("MXMO_UNDDES_INDVDUAL", entidad.getMXMO_UNDDES_INDVDUAL());
            insertbackup.setParameter("VLOR_DMNCLIO_INDVDUAL", entidad.getVLOR_DMNCLIO_INDVDUAL());
            insertbackup.setParameter("VLOR_FNAL_INDVDUAL", entidad.getVLOR_FNAL_INDVDUAL());
            insertbackup.setParameter("TPO_CMSION_GRPAL", entidad.getTPO_CMSION_GRPAL());
            insertbackup.setParameter("VLOR_CMSION_GRPAL", entidad.getVLOR_CMSION_GRPAL());
            insertbackup.setParameter("MNMO_UNDDES_LIDER", entidad.getMNMO_UNDDES_LIDER());
            insertbackup.setParameter("MXMO_UNDDES_LIDER", entidad.getMXMO_UNDDES_LIDER());
            insertbackup.setParameter("PRCNTJE_DCTO_LIDER", entidad.getPRCNTJE_DCTO_LIDER());
            insertbackup.setParameter("VLOR_DMNCLIO_GRPAL", entidad.getVLOR_DMNCLIO_GRPAL());
            insertbackup.setParameter("CNTDAD_GRPOS", entidad.getCNTDAD_GRPOS());
            insertbackup.setParameter("UNDDES_XGRPO", entidad.getUNDDES_XGRPO());
            insertbackup.setParameter("MNMO_UNDDES_PRCPNTE", entidad.getMNMO_UNDDES_PRCPNTE());
            insertbackup.setParameter("MXMO_UNDDES_PRCPNTE", entidad.getMXMO_UNDDES_PRCPNTE());
            insertbackup.setParameter("CNTDAD_CMPRAS_INDVDLES", entidad.getCNTDAD_CMPRAS_INDVDLES());
            insertbackup.setParameter("VLOR_FNAL_LIDER", entidad.getVLOR_FNAL_LIDER());
            insertbackup.setParameter("VLOR_FNAL_PRTCPNTE", entidad.getVLOR_FNAL_PRTCPNTE());
            insertbackup.setParameter("VGNCIA_DESDE", entidad.getVGNCIA_DESDE());
            insertbackup.setParameter("VGNCIA_HASTA", entidad.getVGNCIA_HASTA());
            insertbackup.setParameter("HORA_DESDE", entidad.getHORA_DESDE());
            insertbackup.setParameter("HORA_HASTA", entidad.getHORA_HASTA());
            insertbackup.setParameter("FCHA_ENTRGA", entidad.getFCHA_ENTRGA());
            insertbackup.setParameter("OBSERVACIONES", entidad.getOBSERVACIONES());
            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
