package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValoracionOfertaServiceImplementacion implements CValoracionOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CValoracionOfertaEntity> ConsultaCValoracionOferta(Integer BANDERA, Integer CD_CNSCTVO) {
        try {
            StoredProcedureQuery valor = repositorio.createNamedStoredProcedureQuery("paCValoracionOferta");
            valor.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            valor.setParameter("BANDERA", BANDERA);
            valor.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            return valor.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
