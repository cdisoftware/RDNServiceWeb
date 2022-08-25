package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.evidenciaEntity;
import com.cdi.com.Agroapoya2CDI.Services.evidenciaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class evidenciaServiceImplementacion implements evidenciaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<evidenciaEntity> ConsultaEvidencia(Integer bandera, Integer id_evidencia, Integer id_factura) {
        try {
            StoredProcedureQuery evid = repositorio.createNamedStoredProcedureQuery("paC_evidencia");
            evid.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            evid.registerStoredProcedureParameter("id_evidencia", Integer.class, ParameterMode.IN);
            evid.registerStoredProcedureParameter("id_factura", Integer.class, ParameterMode.IN);

            evid.setParameter("bandera", bandera);
            evid.setParameter("id_evidencia", id_evidencia);
            evid.setParameter("id_factura", id_factura);

            return evid.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
