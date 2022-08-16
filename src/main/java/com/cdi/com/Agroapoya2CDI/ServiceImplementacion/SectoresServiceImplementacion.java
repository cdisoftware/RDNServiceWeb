package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.SectoresEntity;
import com.cdi.com.Agroapoya2CDI.Services.SectoresService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class SectoresServiceImplementacion implements SectoresService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<SectoresEntity> ConsultaSectores(Integer bandera, String NOMBRE_SECTOR, Integer CD_PAIS, Integer CD_RGION, Integer CD_MNCPIO) {
        try {
            StoredProcedureQuery sect = repositorio.createNamedStoredProcedureQuery("paT_Sectores");
            sect.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            sect.registerStoredProcedureParameter("NOMBRE_SECTOR", String.class, ParameterMode.IN);
            sect.registerStoredProcedureParameter("CD_PAIS", Integer.class, ParameterMode.IN);
            sect.registerStoredProcedureParameter("CD_RGION", Integer.class, ParameterMode.IN);
            sect.registerStoredProcedureParameter("CD_MNCPIO", Integer.class, ParameterMode.IN);
            sect.setParameter("bandera", bandera);
            sect.setParameter("NOMBRE_SECTOR", NOMBRE_SECTOR);
            sect.setParameter("CD_PAIS", CD_PAIS);
            sect.setParameter("CD_RGION", CD_RGION);
            sect.setParameter("CD_MNCPIO", CD_MNCPIO);
            return sect.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
