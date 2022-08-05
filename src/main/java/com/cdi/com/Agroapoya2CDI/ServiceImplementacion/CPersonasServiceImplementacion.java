package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;



import com.cdi.com.Agroapoya2CDI.Entity.CPersonasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPersonasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPersonasServiceImplementacion implements CPersonasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPersonasEntity> ConsultaCPersonas(CPersonasEntity entidad, Integer bandera, String TipoPersona) {
        try {
            StoredProcedureQuery person = repositorio.createNamedStoredProcedureQuery("paCPersonas");
            person.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            person.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            person.registerStoredProcedureParameter("TipoPersona", String.class, ParameterMode.IN);

            person.setParameter("bandera", bandera);
            person.setParameter("Nombre", entidad.getNombre_persona());
            person.setParameter("TipoPersona", TipoPersona);

            return person.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
