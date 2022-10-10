package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoNoEntrgaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoNoEntrgaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoNoEntrgaServiceImplementacion implements CTipoNoEntrgaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoNoEntrgaEntity> ConsultaTipoNoEntrega(Integer Bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_TipoNoEntrga");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.setParameter("Bandera", Bandera);
            return respu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
