
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TipoViasEntity;
import com.cdi.com.Agroapoya2CDI.Services.TipoViasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TipoViasServiceImplementacion implements TipoViasService{
  @PersistenceContext
        private EntityManager repositorio;
    @Override
    public List<TipoViasEntity> ConsultaTipoVias(Integer Bandera) {
         try {
            StoredProcedureQuery via = repositorio.createNamedStoredProcedureQuery("paT_TipoVias");
            via.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            via.setParameter("Bandera", Bandera);
            return via.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
