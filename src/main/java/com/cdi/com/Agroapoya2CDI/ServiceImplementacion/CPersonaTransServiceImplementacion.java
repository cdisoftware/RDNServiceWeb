package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPersonaTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPersonaTransService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPersonaTransServiceImplementacion implements CPersonaTransService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPersonaTransEntity> ConsultaCPersonaTrans(Integer bandera, Integer usucodig, Integer id_conductor) {
        try {
            StoredProcedureQuery consperson = repositorio.createNamedStoredProcedureQuery("paC_PersonaTrans");
            consperson.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consperson.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            consperson.registerStoredProcedureParameter("id_conductor", Integer.class, ParameterMode.IN);

            consperson.setParameter("bandera", bandera);
            consperson.setParameter("usucodig", usucodig);
            consperson.setParameter("id_conductor", id_conductor);

            return consperson.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
