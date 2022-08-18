package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TransActivosEntity;
import com.cdi.com.Agroapoya2CDI.Services.TransActivosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TransActivosServiceImplementacion implements TransActivosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TransActivosEntity> ConsultaTrascActivos(Integer bandera, Integer id_condutor, Integer usucodigTrans) {
        try {
            StoredProcedureQuery trans = repositorio.createNamedStoredProcedureQuery("paC_TransActivos");
            trans.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            trans.registerStoredProcedureParameter("id_condutor", Integer.class, ParameterMode.IN);
            trans.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);

            trans.setParameter("bandera", bandera);
            trans.setParameter("id_condutor", id_condutor);
            trans.setParameter("usucodigTrans", usucodigTrans);

            return trans.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
