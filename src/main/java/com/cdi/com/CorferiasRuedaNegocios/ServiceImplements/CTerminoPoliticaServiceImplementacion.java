package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CTerminoPoliticaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CTerminoPoliticaService;
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
public class CTerminoPoliticaServiceImplementacion implements CTerminoPoliticaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CTerminoPoliticaEntity> ConsultaTerminoPolitica(Integer TipoDoc,
            Integer IdRueda, String Idioma, Integer IdTerminoPolitica) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paCTerminoPolitica");
            consfiltros.registerStoredProcedureParameter("TipoDoc", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdTerminoPolitica", Integer.class, ParameterMode.IN);
            consfiltros.setParameter("TipoDoc", TipoDoc);
            consfiltros.setParameter("IdRueda", IdRueda);
            consfiltros.setParameter("Idioma", Idioma);
            consfiltros.setParameter("IdTerminoPolitica", IdTerminoPolitica);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCTerminoPolitica");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
