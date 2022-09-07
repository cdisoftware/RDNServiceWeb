package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.loginClienteEntity;
import com.cdi.com.Agroapoya2CDI.Services.loginClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class loginClienteServiceImplementacion implements loginClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<loginClienteEntity> ConsultaLoginCliente(loginClienteEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery cons = repositorio.createNamedStoredProcedureQuery("paC_loginCliente");
            cons.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);

            cons.setParameter("bandera", bandera);
            cons.setParameter("usucodig", entidad.getUSUCODIG());
            cons.setParameter("correo", entidad.getCorreoPersona());

            return cons.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
