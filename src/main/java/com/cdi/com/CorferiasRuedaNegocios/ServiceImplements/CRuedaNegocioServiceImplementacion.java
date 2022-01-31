package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRuedaNegocioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRuedaNegocioService;
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
public class CRuedaNegocioServiceImplementacion implements CRuedaNegocioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRuedaNegocioEntity> ConsultaRuedaNegocios(CRuedaNegocioEntity entidad,Integer bandera, String Idioma, 
            Integer Idusuario,Integer TipoPart) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCRuedaNegocio");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreRdn", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdClaseRdn", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdTipoRdn", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdUbicacion", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaInicio", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoPart", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("Idusuario", Idusuario);
            permisos.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            permisos.setParameter("NombreRdn", entidad.getNombreRdn());
            permisos.setParameter("IdClaseRdn", entidad.getIdClaseRueda());
            permisos.setParameter("IdTipoRdn", entidad.getIdTipoRueda());
            permisos.setParameter("IdPais", entidad.getIdPais());
            permisos.setParameter("IdUbicacion", entidad.getIdUbicacion());
            permisos.setParameter("FechaInicio", entidad.getFechaInicio());
            permisos.setParameter("FechaFin", entidad.getFechaFin());
            permisos.setParameter("TipoPart", TipoPart);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRuedaNegocio");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
