package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Services.cliente_select_ofertasNuevasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class cliente_select_ofertasNuevasServiceImplementacion implements cliente_select_ofertasNuevasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<cliente_select_ofertasNuevasEntity> ConsultaClienteSelectOfertas(Integer US_CLIENTE) {
        try {
            StoredProcedureQuery consbackup = repositorio.createNamedStoredProcedureQuery("pa_cliente_select_ofertasNuevas");
            consbackup.registerStoredProcedureParameter("US_CLIENTE", Integer.class, ParameterMode.IN);

            consbackup.setParameter("US_CLIENTE", US_CLIENTE);

            return consbackup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
