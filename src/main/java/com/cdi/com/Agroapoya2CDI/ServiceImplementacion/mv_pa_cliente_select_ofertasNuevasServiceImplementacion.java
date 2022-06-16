package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_pa_cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Services.mv_pa_cliente_select_ofertasNuevasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mv_pa_cliente_select_ofertasNuevasServiceImplementacion implements mv_pa_cliente_select_ofertasNuevasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mv_pa_cliente_select_ofertasNuevasEntity> ConsultaClientOfertNew(Integer US_CLIENTE, Integer TIPOCOMPRA, String NOMBRE, Integer ID_SECTOR, Integer CD_MNCPIO) {
        try {
            StoredProcedureQuery consclientofertnew = repositorio.createNamedStoredProcedureQuery("mv_pa_cliente_select_ofertasNuevas");
            consclientofertnew.registerStoredProcedureParameter("US_CLIENTE", Integer.class, ParameterMode.IN);
            consclientofertnew.registerStoredProcedureParameter("TIPOCOMPRA", Integer.class, ParameterMode.IN);
            consclientofertnew.registerStoredProcedureParameter("NOMBRE", String.class, ParameterMode.IN);
            consclientofertnew.registerStoredProcedureParameter("ID_SECTOR", Integer.class, ParameterMode.IN);
            consclientofertnew.registerStoredProcedureParameter("CD_MNCPIO", Integer.class, ParameterMode.IN);
            consclientofertnew.setParameter("US_CLIENTE", US_CLIENTE);
            consclientofertnew.setParameter("TIPOCOMPRA", TIPOCOMPRA);
            consclientofertnew.setParameter("NOMBRE", NOMBRE);
            consclientofertnew.setParameter("ID_SECTOR", ID_SECTOR);
            consclientofertnew.setParameter("CD_MNCPIO", CD_MNCPIO);
            return consclientofertnew.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
