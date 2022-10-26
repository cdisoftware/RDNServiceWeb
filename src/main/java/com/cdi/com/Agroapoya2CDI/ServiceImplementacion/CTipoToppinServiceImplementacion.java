package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoToppinEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoToppinService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoToppinServiceImplementacion implements CTipoToppinService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoToppinEntity> ConsultaCTipoToppin(Integer Bandera) {
        try {
            StoredProcedureQuery toppin = repositorio.createNamedStoredProcedureQuery("paC_TipoToppin");
            toppin.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);

            toppin.setParameter("Bandera", Bandera);
            return toppin.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
