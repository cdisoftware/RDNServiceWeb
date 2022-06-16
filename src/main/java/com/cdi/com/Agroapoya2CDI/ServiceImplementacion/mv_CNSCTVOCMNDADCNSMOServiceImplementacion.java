package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_CNSCTVOCMNDADCNSMOEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.cdi.com.Agroapoya2CDI.Services.mv_CNSCTVOCMNDADCNSMOService;
import java.util.ArrayList;
import java.util.List;

@Service
public class mv_CNSCTVOCMNDADCNSMOServiceImplementacion implements mv_CNSCTVOCMNDADCNSMOService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaCNSCTVO() {
        try {
            StoredProcedureQuery actcns = repositorio.createNamedStoredProcedureQuery("mv_CNSCTVOCMNDADCNSMO");
           actcns.execute();
            return JSONObject.quote((String) actcns.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
              return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
