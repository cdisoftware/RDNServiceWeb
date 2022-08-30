package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.UsuarioAdminEntity;
import com.cdi.com.Agroapoya2CDI.Services.UsuarioAdminService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class UsuarioAdminServiceImplementacion implements UsuarioAdminService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<UsuarioAdminEntity> ConsultaUserAdmin(UsuarioAdminEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery admin = repositorio.createNamedStoredProcedureQuery("paA_UsuarioAdmin");
            admin.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            admin.registerStoredProcedureParameter("CorreoElec", String.class, ParameterMode.IN);

            admin.setParameter("Bandera", Bandera);
            admin.setParameter("CorreoElec", entidad.getCorreoPersona());

            return admin.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
