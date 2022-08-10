package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.JornadasOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.JornadasOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class JornadasOfertaServiceImplementacion implements JornadasOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<JornadasOfertaEntity> ConsultaJornadaOferta(Integer prmtro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_JornadasOferta");
            tpoDoc.registerStoredProcedureParameter("prmtro", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("prmtro", prmtro);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
