package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ClientePagosTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.ClientePagosTransService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ClientePagosTransServiceImplementacion implements ClientePagosTransService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ClientePagosTransEntity> ConsultaClientePagosTrans(Integer Bandera, Integer Cd_csnctivo, Integer IdSector, Integer idConductor) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ClientePagosTrans");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_csnctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idConductor", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_csnctivo", Cd_csnctivo);
            tpoDoc.setParameter("IdSector", IdSector);
            tpoDoc.setParameter("idConductor", idConductor);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
