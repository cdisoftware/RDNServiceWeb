package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinGrupalEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinGrupalService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCalculaPrecioFinGrupalServiceImplementacion implements CCalculaPrecioFinGrupalService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCalculaPrecioFinGrupalEntity> ConsultaCCalculaPrecioFinGrupal(Integer BANDERA, Integer CD_CNSCTVO,
            Integer ID_SCTOR_OFRTA, Integer tpo_cmsion_grupal, Integer vlor_cmsion_grupal, Integer vlor_dmcilio_grupal, Integer mnmo_prsnas_xgrupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCCalculaPrecioFinGrupal");
            tpoDoc.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("tpo_cmsion_grupal", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("vlor_cmsion_grupal", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("vlor_dmcilio_grupal", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("mnmo_prsnas_xgrupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("BANDERA", BANDERA);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            tpoDoc.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);
            tpoDoc.setParameter("tpo_cmsion_grupal", tpo_cmsion_grupal);
            tpoDoc.setParameter("vlor_cmsion_grupal", vlor_cmsion_grupal);
            tpoDoc.setParameter("vlor_dmcilio_grupal", vlor_dmcilio_grupal);
            tpoDoc.setParameter("mnmo_prsnas_xgrupo", mnmo_prsnas_xgrupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
