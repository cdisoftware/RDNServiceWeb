
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.estadoEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Services.estadoEntregaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class estadoEntregaServiceImplementacion implements estadoEntregaService{
@PersistenceContext
        private EntityManager repositorio;
    @Override
    public List<estadoEntregaEntity> ConsultaEstadoEntrega(Integer bandera) {
        try {
            StoredProcedureQuery entrega = repositorio.createNamedStoredProcedureQuery("paC_estadoEntrega");
            entrega.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            entrega.setParameter("bandera", bandera);
            return entrega.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
