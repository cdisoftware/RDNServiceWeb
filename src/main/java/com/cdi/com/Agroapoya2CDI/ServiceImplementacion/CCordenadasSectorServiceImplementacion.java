package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCordenadasSectorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCordenadasSectorServiceImplementacion implements CCordenadasSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCordenadasSectorEntity> ConsultaCordenadasSector(Integer BANDERA, Integer ID_SCTOR_OFRTA) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCCordenadasSector");
            tpoDoc.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("BANDERA", BANDERA);
            tpoDoc.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
