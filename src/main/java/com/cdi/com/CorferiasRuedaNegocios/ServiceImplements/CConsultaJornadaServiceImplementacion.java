package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CConsultaJornadaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CConsultaJornadaService;
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
public class CConsultaJornadaServiceImplementacion implements CConsultaJornadaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CConsultaJornadaEntity> ConsultaJornada(Integer bandera, String Idioma,
            String TipoEvento, Integer TipoJornada, String FechaDesde, Integer IdRueda,
            String NombreRueda) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paCReporteJornada");
            consfiltros.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("TipoEvento", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("TipoJornada", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("FechaDesde", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("NombreRueda", String.class, ParameterMode.IN);
            consfiltros.setParameter("bandera", bandera);
            consfiltros.setParameter("Idioma", Idioma);
            consfiltros.setParameter("TipoEvento", TipoEvento);
            consfiltros.setParameter("TipoJornada", TipoJornada);
            consfiltros.setParameter("FechaDesde", FechaDesde);
            consfiltros.setParameter("IdRueda", IdRueda);
            consfiltros.setParameter("NombreRueda", NombreRueda);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReporteJornada");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
