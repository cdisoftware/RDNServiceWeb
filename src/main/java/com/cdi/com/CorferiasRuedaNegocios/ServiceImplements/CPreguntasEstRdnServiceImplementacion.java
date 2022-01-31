package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEstRdnService;
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
public class CPreguntasEstRdnServiceImplementacion implements CPreguntasEstRdnService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPreguntasEstRdnEntity> ConsultaPreguntasEstRdn(Integer bandera, String Idioma, Integer IdRdn, Integer IdPerfil) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCPreguntasEstRdn");
            roles.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            roles.setParameter("bandera", bandera);
            roles.setParameter("Idioma", Idioma);
            roles.setParameter("IdRdn", IdRdn);
            roles.setParameter("IdPerfil", IdPerfil);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasEstRdn");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
