package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorEntity;
import com.cdi.com.Agroapoya2CDI.Services.CConductorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CConductorServiceImplementacion implements CConductorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CConductorEntity> ConsultaCConductor(CConductorEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_Conductor");
            respu.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("USUCODIG_TRANS", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("nombreConductor", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("placa", String.class, ParameterMode.IN);

            respu.setParameter("bandera", bandera);
            respu.setParameter("USUCODIG_TRANS", entidad.getUSUCODIG_TRANS());
            respu.setParameter("nombreConductor", entidad.getNMBRE_CNDCTOR());
            respu.setParameter("placa", entidad.getPLCA());

            return respu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
