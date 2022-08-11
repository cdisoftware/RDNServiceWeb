
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_carroceriaEntity;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_carroceriaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class tipo_carro_carroceriaServiceImplementacion implements tipo_carro_carroceriaService{
     @PersistenceContext
        private EntityManager repositorio;
    @Override
    public List<tipo_carro_carroceriaEntity> ConsultaTipoCarroCarroceria(Integer bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_tipo_carro_carroceria");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("bandera", bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}