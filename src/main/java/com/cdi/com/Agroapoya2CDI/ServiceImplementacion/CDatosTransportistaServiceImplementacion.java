package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDatosTransportistaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDatosTransportistaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDatosTransportistaServiceImplementacion implements CDatosTransportistaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CDatosTransportistaEntity> ConsultaCDatosTransportista(Integer bandera, String usucodig, Integer IdConductor) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCDatosTransportista");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodig", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdConductor", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("usucodig", usucodig);
            tpoDoc.setParameter("IdConductor", IdConductor);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
