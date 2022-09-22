package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CconductoresTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CconductoresTransportesNuevosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CconductoresTransportesNuevosServiceImplementacion implements CconductoresTransportesNuevosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CconductoresTransportesNuevosEntity> ConsultaConductoresTransportes(Integer Bandera, Integer usucodigTrans, Integer CD_CNSCTVO) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_conductoresTransportesNuevos");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("usucodigTrans", usucodigTrans);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
