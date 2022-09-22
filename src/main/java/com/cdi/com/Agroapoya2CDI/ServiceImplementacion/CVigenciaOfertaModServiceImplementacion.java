package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CVigenciaOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CVigenciaOfertaModServiceImplementacion implements CVigenciaOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCVigenciaOferta(CVigenciaOfertaModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery modvigci = repositorio.createNamedStoredProcedureQuery("paCVigenciaOfertaMod");
            modvigci.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("VGNCIA_DESDE", String.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("VGNCIA_HASTA", String.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("HORA_DESDE", String.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("HORA_HASTA", String.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("FCHA_ENTRGA", String.class, ParameterMode.IN);
            modvigci.registerStoredProcedureParameter("OBSERVACIONES", String.class, ParameterMode.IN);

            modvigci.setParameter("BANDERA", BANDERA);
            modvigci.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            modvigci.setParameter("VGNCIA_DESDE", entidad.getVGNCIA_DESDE());
            modvigci.setParameter("VGNCIA_HASTA", entidad.getVGNCIA_HASTA());
            modvigci.setParameter("HORA_DESDE", entidad.getHORA_DESDE());
            modvigci.setParameter("HORA_HASTA", entidad.getHORA_HASTA());
            modvigci.setParameter("FCHA_ENTRGA", entidad.getFCHA_ENTRGA());
            modvigci.setParameter("OBSERVACIONES", entidad.getOBSERVACIONES());

            modvigci.execute();
            return JSONObject.quote((String) modvigci.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
