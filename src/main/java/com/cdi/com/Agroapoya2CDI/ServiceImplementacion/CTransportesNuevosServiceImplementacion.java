package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTransportesNuevosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTransportesNuevosServiceImplementacion implements CTransportesNuevosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTransportesNuevosEntity> ConsultaCTransportesNuevos(Integer Bandera, Integer usucodigTrans, Integer id_conductor) {
        try {
            StoredProcedureQuery trans = repositorio.createNamedStoredProcedureQuery("paC_TransportesNuevos");
            trans.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            trans.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);
            trans.registerStoredProcedureParameter("id_conductor", Integer.class, ParameterMode.IN);

            trans.setParameter("Bandera", Bandera);
            trans.setParameter("usucodigTrans", usucodigTrans);
            trans.setParameter("id_conductor", id_conductor);

            return trans.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
