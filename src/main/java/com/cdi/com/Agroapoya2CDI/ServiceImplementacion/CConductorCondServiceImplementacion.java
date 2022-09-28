package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorCondEntity;
import com.cdi.com.Agroapoya2CDI.Services.CConductorCondService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CConductorCondServiceImplementacion implements CConductorCondService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CConductorCondEntity> ConsultaCConductorCond(Integer bandera, Integer id_conductor) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ConductorCond");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_conductor", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("id_conductor", id_conductor);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
