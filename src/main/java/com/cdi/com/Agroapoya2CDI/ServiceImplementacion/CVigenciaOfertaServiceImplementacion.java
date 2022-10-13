package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaEntoty;
import com.cdi.com.Agroapoya2CDI.Services.CVigenciaOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CVigenciaOfertaServiceImplementacion implements CVigenciaOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CVigenciaOfertaEntoty> ConsultaCVigenciaOferta(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA) {
        try {
            StoredProcedureQuery ofertvig = repositorio.createNamedStoredProcedureQuery("paCVigenciaOferta");
            ofertvig.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            ofertvig.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            ofertvig.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);

            ofertvig.setParameter("BANDERA", BANDERA);
            ofertvig.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            ofertvig.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);

            return ofertvig.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
