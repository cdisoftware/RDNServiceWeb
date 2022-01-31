package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PTerminoPoliticaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PTerminoPoliticaService;
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
public class PTerminoPoliticaServiceImplementacion implements PTerminoPoliticaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PTerminoPoliticaEntity> ConsultaTerminoPolit(Integer bandera, String Idioma, Integer IdRueda, Integer IdParticipante, Integer IdPerfil) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paPTerminoPolitica");
            consciudadpais.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
             consciudadpais.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("bandera", bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("IdRueda", IdRueda);
            consciudadpais.setParameter("IdParticipante", IdParticipante);
            consciudadpais.setParameter("IdPerfil", IdPerfil);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPTerminoPolitica");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
