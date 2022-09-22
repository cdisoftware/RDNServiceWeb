package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinMixtaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinMixtaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCalculaPrecioFinMixtaServiceImplementacion implements CCalculaPrecioFinMixtaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCalculaPrecioFinMixtaEntity> ConsultaCalcPrecioFinMixta(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA, Integer tpo_cmsion_indvdual, Integer vlor_cmsion_indvdual,
            Integer tpo_cmsion_grupal, Integer vlor_cmsion_grupal, Integer vlor_dmcilio_indvdual, Integer vlor_dmcilio_grupal, Integer mnmo_prsnas_xgrupo) {
        try {
            StoredProcedureQuery calc = repositorio.createNamedStoredProcedureQuery("paCCalculaPrecioFinMixta");
            calc.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("tpo_cmsion_indvdual", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("vlor_cmsion_indvdual", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("tpo_cmsion_grupal", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("vlor_cmsion_grupal", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("vlor_dmcilio_indvdual", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("vlor_dmcilio_grupal", Integer.class, ParameterMode.IN);
            calc.registerStoredProcedureParameter("mnmo_prsnas_xgrupo", Integer.class, ParameterMode.IN);

            calc.setParameter("BANDERA", BANDERA);
            calc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            calc.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);
            calc.setParameter("tpo_cmsion_indvdual", tpo_cmsion_indvdual);
            calc.setParameter("vlor_cmsion_indvdual", vlor_cmsion_indvdual);
            calc.setParameter("tpo_cmsion_grupal", tpo_cmsion_grupal);
            calc.setParameter("vlor_cmsion_grupal", vlor_cmsion_grupal);
            calc.setParameter("vlor_dmcilio_indvdual", vlor_dmcilio_indvdual);
            calc.setParameter("vlor_dmcilio_grupal", vlor_dmcilio_grupal);
            calc.setParameter("mnmo_prsnas_xgrupo", mnmo_prsnas_xgrupo);

            return calc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
