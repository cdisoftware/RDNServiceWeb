package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ConductorEntity;
import com.cdi.com.Agroapoya2CDI.Services.ConductorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConductorServiceImplementacion implements ConductorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConductorEntity> ConsultaConductor(ConductorEntity entidad, Integer bandera, Integer Cd_cnsctivo, Integer CODIGO_TRANS, Integer CD_PAIS, Integer CD_RGION, Integer CD_MNCPIO) {
        try {
            StoredProcedureQuery conduct = repositorio.createNamedStoredProcedureQuery("paT_Conductor");
            conduct.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            conduct.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            conduct.registerStoredProcedureParameter("NMBRE_CNDCTOR", String.class, ParameterMode.IN);
            conduct.registerStoredProcedureParameter("CODIGO_TRANS", Integer.class, ParameterMode.IN);
            conduct.registerStoredProcedureParameter("CD_PAIS", Integer.class, ParameterMode.IN);
            conduct.registerStoredProcedureParameter("CD_RGION", Integer.class, ParameterMode.IN);
            conduct.registerStoredProcedureParameter("CD_MNCPIO", Integer.class, ParameterMode.IN);

            conduct.setParameter("bandera", bandera);
            conduct.setParameter("Cd_cnsctivo", Cd_cnsctivo);
            conduct.setParameter("NMBRE_CNDCTOR", entidad.getNombre_conductor());
            conduct.setParameter("CODIGO_TRANS", CODIGO_TRANS);
            conduct.setParameter("CD_PAIS", CD_PAIS);
            conduct.setParameter("CD_RGION", CD_RGION);
            conduct.setParameter("CD_MNCPIO", CD_MNCPIO);

            return conduct.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
