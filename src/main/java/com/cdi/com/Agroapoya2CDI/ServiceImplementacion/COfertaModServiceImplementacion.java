package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.COfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COfertaModServiceImplementacion implements COfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InAcCOfertaMod(COfertaModEntity entidad, Integer bandera, String ID_EMPAQUE) {
        try {
            StoredProcedureQuery insertofrta = repositorio.createNamedStoredProcedureQuery("paCOfertaMod");
            insertofrta.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_PRDCTO", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("ID_EMPAQUE", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("UND_EMPQUE", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_CNDCION", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_TMNO", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("DSCRPCION_PRDCTO", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("VR_UNDAD_EMPQUE", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_UNDAD", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("VR_TOTAL_OFRTA", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("VGNCIA_DESDE", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_JRNDA", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_RGION", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_MNCPIO", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("UBCCION_PRCLA", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("COORDENADAS_PRCLA", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("USUCODIG", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("ID_PRODUCTOR", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("CRCTRZCION", String.class, ParameterMode.IN);
            insertofrta.registerStoredProcedureParameter("OBS_EDICION", String.class, ParameterMode.IN);

            insertofrta.setParameter("bandera", bandera);
            insertofrta.setParameter("CD_PRDCTO", entidad.getCD_PRDCTO());
            insertofrta.setParameter("ID_EMPAQUE", ID_EMPAQUE);
            insertofrta.setParameter("UND_EMPQUE", entidad.getUND_EMPQUE());
            insertofrta.setParameter("CD_CNDCION", entidad.getCD_CNDCION());
            insertofrta.setParameter("CD_TMNO", entidad.getCD_TMNO());
            insertofrta.setParameter("DSCRPCION_PRDCTO", entidad.getDSCRPCION_PRDCTO());
            insertofrta.setParameter("VR_UNDAD_EMPQUE", entidad.getVR_UNDAD_EMPQUE());
            insertofrta.setParameter("CD_UNDAD", entidad.getCD_UNDAD());
            insertofrta.setParameter("VR_TOTAL_OFRTA", entidad.getVR_TOTAL_OFRTA());
            insertofrta.setParameter("VGNCIA_DESDE", entidad.getVGNCIA_DESDE());
            insertofrta.setParameter("CD_JRNDA", entidad.getCD_JRNDA());
            insertofrta.setParameter("CD_RGION", entidad.getCD_RGION());
            insertofrta.setParameter("CD_MNCPIO", entidad.getCD_MNCPIO());
            insertofrta.setParameter("UBCCION_PRCLA", entidad.getUBCCION_PRCLA());
            insertofrta.setParameter("COORDENADAS_PRCLA", entidad.getCOORDENADAS_PRCLA());
            insertofrta.setParameter("USUCODIG", entidad.getUSUCODIG());
            insertofrta.setParameter("ID_PRODUCTOR", entidad.getID_PRODUCTOR());
            insertofrta.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertofrta.setParameter("CRCTRZCION", entidad.getCRCTRZCION());
            insertofrta.setParameter("OBS_EDICION", entidad.getOBS_EDICION());

            insertofrta.execute();
            return JSONObject.quote((String) insertofrta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
