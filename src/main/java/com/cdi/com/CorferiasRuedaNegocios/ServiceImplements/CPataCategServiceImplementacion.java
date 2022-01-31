package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPataCategEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPataCategService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPataCategServiceImplementacion implements CPataCategService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPataCategEntity> ConsultaPataCateg(String Idioma, Integer idusuario, Integer IdRdn, Integer IdCategoriaPata, Integer bandera) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCPataCateg");
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdCategoriaPata", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);

            roles.setParameter("Idioma", Idioma);
            roles.setParameter("idusuario", idusuario);
            roles.setParameter("IdRdn", IdRdn);
            roles.setParameter("IdCategoriaPata", IdCategoriaPata);
            roles.setParameter("bandera", bandera);

            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPataCateg");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
