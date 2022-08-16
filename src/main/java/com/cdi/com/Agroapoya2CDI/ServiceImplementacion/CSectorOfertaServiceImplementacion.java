package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CSectorOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSectorOfertaServiceImplementacion implements CSectorOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CSectorOfertaEntity> ConsultaCSectorOferta(Integer bandera, Integer CD_CNSCTVO) {
        try {
            StoredProcedureQuery res = repositorio.createNamedStoredProcedureQuery("paCSectorOferta");
            res.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            res.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            res.setParameter("bandera", bandera);
            res.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            return res.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
