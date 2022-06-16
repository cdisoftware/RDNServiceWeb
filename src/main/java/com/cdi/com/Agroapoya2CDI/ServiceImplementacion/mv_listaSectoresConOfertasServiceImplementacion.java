package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_listaSectoresConOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Services.mv_listaSectoresConOfertasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mv_listaSectoresConOfertasServiceImplementacion implements mv_listaSectoresConOfertasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mv_listaSectoresConOfertasEntity> ConsultaListSctorsOferts(Integer bandera, Integer ciudad) {
        try {
            StoredProcedureQuery conslistsector = repositorio.createNamedStoredProcedureQuery("mv_listaSectoresConOfertas");
            conslistsector.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            conslistsector.registerStoredProcedureParameter("ciudad", Integer.class, ParameterMode.IN);
            conslistsector.setParameter("bandera", bandera);
            conslistsector.setParameter("ciudad", ciudad);
            return conslistsector.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
