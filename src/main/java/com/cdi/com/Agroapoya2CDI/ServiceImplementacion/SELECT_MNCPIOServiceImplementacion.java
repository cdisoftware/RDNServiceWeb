package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.SELECT_MNCPIOEntity;
import com.cdi.com.Agroapoya2CDI.Services.SELECT_MNCPIOService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class SELECT_MNCPIOServiceImplementacion implements SELECT_MNCPIOService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<SELECT_MNCPIOEntity> ConsultaMNCPIO(Integer CD_RGION) {
        try {
            StoredProcedureQuery consmncpio = repositorio.createNamedStoredProcedureQuery("paT_select_Mncpio");
            consmncpio.registerStoredProcedureParameter("CD_RGION", Integer.class, ParameterMode.IN);
            consmncpio.setParameter("CD_RGION", CD_RGION);
            return consmncpio.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
