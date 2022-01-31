package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRdnPatalogosEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRdnPatalogosService;
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
public class CRdnPatalogosServiceImplementacion implements CRdnPatalogosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRdnPatalogosEntity> ConsultaRdnPatalogos(String Idioma, Integer idusuario,
            Integer IdRdn, Integer IdCategoriaPata, Integer bandera) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCRdnPatalogos");
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdCategoriaPata", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("idusuario", idusuario);
            permisos.setParameter("IdRdn", IdRdn);
            permisos.setParameter("IdCategoriaPata", IdCategoriaPata);
            permisos.setParameter("bandera", bandera);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRdnPatalogos");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarRdnPatalogo(CRdnPatalogosEntity entidad, String Idioma, 
            Integer idusuario, Integer bandera) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRdnPatalogosModifica");
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPataLogo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCategoriaPata", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("OrdenImagen", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Url", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("idusuario", idusuario);
            rolconsola.setParameter("IdPataLogo", entidad.getIdPataLogo());
            rolconsola.setParameter("IdCategoriaPata", entidad.getIdCategoriaPata());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("OrdenImagen", entidad.getOrdenImagen());
            rolconsola.setParameter("Url", entidad.getUrl());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Nombre", entidad.getNombre());
            rolconsola.setParameter("bandera", bandera);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRdnPatalogosModifica insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRdnPatalogo(CRdnPatalogosEntity entidad, String Idioma, Integer idusuario, Integer bandera) {
         try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRdnPatalogosModifica");
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPataLogo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCategoriaPata", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("OrdenImagen", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Url", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("idusuario", idusuario);
            rolconsola.setParameter("IdPataLogo", entidad.getIdPataLogo());
            rolconsola.setParameter("IdCategoriaPata", entidad.getIdCategoriaPata());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("OrdenImagen", entidad.getOrdenImagen());
            rolconsola.setParameter("Url", entidad.getUrl());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Nombre", entidad.getNombre());
            rolconsola.setParameter("bandera", bandera);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRdnPatalogosModifica actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
