package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_EnvioCorreoTransprtistaViejeEntity;
import com.cdi.com.Agroapoya2CDI.Services.mv_EnvioCorreoTransprtistaViejeService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mv_EnvioCorreoTransprtistaViejeServiceImplementacion implements mv_EnvioCorreoTransprtistaViejeService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mv_EnvioCorreoTransprtistaViejeEntity> ConsultaEnvioCorreoTransptsta(Integer id_trans, Integer consecutico) {
        try {
            StoredProcedureQuery enviocorreo = repositorio.createNamedStoredProcedureQuery("mv_EnvioCorreoTransprtistaVieje");
            enviocorreo.registerStoredProcedureParameter("id_trans", Integer.class, ParameterMode.IN);
            enviocorreo.registerStoredProcedureParameter("consecutico", Integer.class, ParameterMode.IN);

            enviocorreo.setParameter("id_trans", id_trans);
            enviocorreo.setParameter("consecutico", consecutico);

            return enviocorreo.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
