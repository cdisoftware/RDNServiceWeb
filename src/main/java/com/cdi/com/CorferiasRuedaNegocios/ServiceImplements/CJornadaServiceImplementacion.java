package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CJornadaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CJornadaService;
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
public class CJornadaServiceImplementacion implements CJornadaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CJornadaEntity> ConsultaJornada(CJornadaEntity entidad,Integer bandera, String Idioma) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCJornada");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoEvento", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoJornada", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaDesde", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("TipoEvento", entidad.getTipoEvento());
            permisos.setParameter("TipoJornada", entidad.getIdTipoJornada());
            permisos.setParameter("FechaDesde", entidad.getFechaJornada());
            permisos.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCJornada");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
