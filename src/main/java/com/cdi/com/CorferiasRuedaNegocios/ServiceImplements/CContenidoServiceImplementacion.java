package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CContenidoService;
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
public class CContenidoServiceImplementacion implements CContenidoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CContenidoEntity> ConsultaContenido(Integer Bandera, Integer IdRueda,
            String Idioma, String Contenido) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCContenido");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Contenido", String.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("Contenido", Contenido);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCContenido");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarContenido(CContenidoEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCContenidoModifica");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContenido", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Titulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoLetraTitulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTitulo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTitulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTitulos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTitulos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTitulos", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("NombreContenido", entidad.getNombreContenido());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Titulo", entidad.getTitulo());
            rolconsola.setParameter("TipoLetraTitulo", entidad.getTipoLetraTitulo());
            rolconsola.setParameter("TamanoTitulo", entidad.getTamanoTitulo());
            rolconsola.setParameter("ColorTitulo", entidad.getColorTitulo());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Publicado", entidad.getPublicado());
            rolconsola.setParameter("LetraTitulos", entidad.getLetraTitulos());
            rolconsola.setParameter("TamanoTitulos", entidad.getTamanoTitulos());
            rolconsola.setParameter("ColorTitulos", entidad.getColorTitulos());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCContenidoModifica insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarContenido(CContenidoEntity entidad, Integer Bandera, String Idioma) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCContenidoModifica");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContenido", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Titulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoLetraTitulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTitulo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTitulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTitulos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTitulos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTitulos", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("NombreContenido", entidad.getNombreContenido());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Titulo", entidad.getTitulo());
            rolconsola.setParameter("TipoLetraTitulo", entidad.getTipoLetraTitulo());
            rolconsola.setParameter("TamanoTitulo", entidad.getTamanoTitulo());
            rolconsola.setParameter("ColorTitulo", entidad.getColorTitulo());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Publicado", entidad.getPublicado());
            rolconsola.setParameter("LetraTitulos", entidad.getLetraTitulos());
            rolconsola.setParameter("TamanoTitulos", entidad.getTamanoTitulos());
            rolconsola.setParameter("ColorTitulos", entidad.getColorTitulos());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCContenidoModifica actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
