package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CConsultaEstadoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CConsultaEstadoOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CConsultaEstadoOfertaServiceImplementacion implements CConsultaEstadoOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CConsultaEstadoOfertaEntity> ConsultaCEstadoOferta(Integer bandera, String CD_CNSCTVO) {
        try {
            StoredProcedureQuery cons = repositorio.createNamedStoredProcedureQuery("paCConsultaEstadoOferta");
            cons.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);

            cons.setParameter("bandera", bandera);
            cons.setParameter("CD_CNSCTVO", CD_CNSCTVO);

            return cons.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
