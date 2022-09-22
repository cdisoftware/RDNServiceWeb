package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinIndividualEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinIndividualService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCalculaPrecioFinIndividualServiceImplementacion implements CCalculaPrecioFinIndividualService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCalculaPrecioFinIndividualEntity> ConsultaCalculaPrecioFinIndiv(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA, Integer tpo_cmsion_indvdual, Integer vlor_cmsion_indvdual) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCCalculaPrecioFinIndividual");
            tpoDoc.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("tpo_cmsion_indvdual", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("vlor_cmsion_indvdual", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("BANDERA", BANDERA);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            tpoDoc.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);
            tpoDoc.setParameter("tpo_cmsion_indvdual", tpo_cmsion_indvdual);
            tpoDoc.setParameter("vlor_cmsion_indvdual", vlor_cmsion_indvdual);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
