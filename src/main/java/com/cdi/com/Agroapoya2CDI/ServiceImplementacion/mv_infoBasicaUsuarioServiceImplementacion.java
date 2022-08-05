package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_infoBasicaUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Services.mv_infoBasicaUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mv_infoBasicaUsuarioServiceImplementacion implements mv_infoBasicaUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mv_infoBasicaUsuarioEntity> ConsultaInfoBascUser(mv_infoBasicaUsuarioEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery consinfouser = repositorio.createNamedStoredProcedureQuery("paC_infoBasicaUsuario");
            consinfouser.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consinfouser.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
             consinfouser.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);
            consinfouser.setParameter("bandera", bandera);
            consinfouser.setParameter("usucodig", entidad.getUSUCODIG());
              consinfouser.setParameter("correo", entidad.getCORREO_PERSONA());
            return consinfouser.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
