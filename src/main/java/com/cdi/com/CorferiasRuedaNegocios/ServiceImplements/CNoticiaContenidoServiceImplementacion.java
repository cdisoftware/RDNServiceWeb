package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CNoticiaContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CNoticiaContenidoService;
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
public class CNoticiaContenidoServiceImplementacion implements CNoticiaContenidoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CNoticiaContenidoEntity> ConsultaNoticiaContenido(Integer Bandera, Integer IdRueda, String Idioma) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCNoticiaContenido");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("Idioma", Idioma);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCNoticiaContenido");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarNoticiaContenido(CNoticiaContenidoEntity entidad, Integer Bandera,
            String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCNoticiaContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdNoticia", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtlNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTtlNoticiaUno", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtlNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloNoticiaDos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloNoticiaTres", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTextoNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTextoNoticiaUno", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTextoNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTextoNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTextoNoticiaDos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTextoNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTextoNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTextoNoticiaTres", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTextoNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdNoticia", entidad.getIdNoticia());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("TituloNoticiaUno", entidad.getTituloNoticiaUno());
            rolconsola.setParameter("LetraTtlNoticiaUno", entidad.getLetraTextoNoticiaUno());
            rolconsola.setParameter("TamanoTtlNoticiaUno", entidad.getTamanoTextoNoticiaUno());
            rolconsola.setParameter("ColorTtlNoticiaUno", entidad.getColorTtlNoticiaUno());
            rolconsola.setParameter("TituloNoticiaDos", entidad.getTituloNoticiaDos());
            rolconsola.setParameter("LetraTtNoticiaDos", entidad.getLetraTtlNoticiaDos());
            rolconsola.setParameter("TamanoTituloNoticiaDos", entidad.getTamanoTtlNoticiaDos());
            rolconsola.setParameter("ColorTtNoticiaDos", entidad.getColorTtlNoticiaDos());
            rolconsola.setParameter("TituloNoticiaTres", entidad.getTituloNoticiaTres());
            rolconsola.setParameter("LetraTtNoticiaTres", entidad.getLetraTtlNoticiaTres());
            rolconsola.setParameter("TamanoTituloNoticiaTres", entidad.getTamanoTtlNoticiaTres());
            rolconsola.setParameter("ColorTtNoticiaTres", entidad.getColorTtlNoticiaTres());
            rolconsola.setParameter("TextoNoticiaUno", entidad.getTextoNoticiaUno());
            rolconsola.setParameter("LetraTextoNoticiaUno", entidad.getLetraTextoNoticiaUno());
            rolconsola.setParameter("TamanoTextoNoticiaUno", entidad.getTamanoTextoNoticiaUno());
            rolconsola.setParameter("ColorTextoNoticiaUno", entidad.getColorTextoNoticiaUno());
            rolconsola.setParameter("TextoNoticiaDos", entidad.getTextoNoticiaDos());
            rolconsola.setParameter("LetraTextoNoticiaDos", entidad.getLetraTextoNoticiaDos());
            rolconsola.setParameter("TamanoTextoNoticiaDos", entidad.getTamanoTextoNoticiaDos());
            rolconsola.setParameter("ColorTextoNoticiaDos", entidad.getColorTextoNoticiaDos());
            rolconsola.setParameter("TextoNoticiaTres", entidad.getTextoNoticiaTres());
            rolconsola.setParameter("LetraTextoNoticiaTres", entidad.getLetraTextoNoticiaTres());
            rolconsola.setParameter("TamanoTextoNoticiaTres", entidad.getTamanoTextoNoticiaTres());
            rolconsola.setParameter("ColorTextoNoticiaTres", entidad.getColorTextoNoticiaTres());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCNoticiaContenidoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarNoticiaContenido(CNoticiaContenidoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCNoticiaContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdNoticia", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtlNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTtlNoticiaUno", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtlNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloNoticiaDos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloNoticiaTres", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTextoNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTextoNoticiaUno", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTextoNoticiaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTextoNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTextoNoticiaDos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTextoNoticiaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTextoNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTextoNoticiaTres", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTextoNoticiaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdNoticia", entidad.getIdNoticia());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("TituloNoticiaUno", entidad.getTituloNoticiaUno());
            rolconsola.setParameter("LetraTtlNoticiaUno", entidad.getLetraTextoNoticiaUno());
            rolconsola.setParameter("TamanoTtlNoticiaUno", entidad.getTamanoTextoNoticiaUno());
            rolconsola.setParameter("ColorTtlNoticiaUno", entidad.getColorTtlNoticiaUno());
            rolconsola.setParameter("TituloNoticiaDos", entidad.getTituloNoticiaDos());
            rolconsola.setParameter("LetraTtNoticiaDos", entidad.getLetraTtlNoticiaDos());
            rolconsola.setParameter("TamanoTituloNoticiaDos", entidad.getTamanoTtlNoticiaDos());
            rolconsola.setParameter("ColorTtNoticiaDos", entidad.getColorTtlNoticiaDos());
            rolconsola.setParameter("TituloNoticiaTres", entidad.getTituloNoticiaTres());
            rolconsola.setParameter("LetraTtNoticiaTres", entidad.getLetraTtlNoticiaTres());
            rolconsola.setParameter("TamanoTituloNoticiaTres", entidad.getTamanoTtlNoticiaTres());
            rolconsola.setParameter("ColorTtNoticiaTres", entidad.getColorTtlNoticiaTres());
            rolconsola.setParameter("TextoNoticiaUno", entidad.getTextoNoticiaUno());
            rolconsola.setParameter("LetraTextoNoticiaUno", entidad.getLetraTextoNoticiaUno());
            rolconsola.setParameter("TamanoTextoNoticiaUno", entidad.getTamanoTextoNoticiaUno());
            rolconsola.setParameter("ColorTextoNoticiaUno", entidad.getColorTextoNoticiaUno());
            rolconsola.setParameter("TextoNoticiaDos", entidad.getTextoNoticiaDos());
            rolconsola.setParameter("LetraTextoNoticiaDos", entidad.getLetraTextoNoticiaDos());
            rolconsola.setParameter("TamanoTextoNoticiaDos", entidad.getTamanoTextoNoticiaDos());
            rolconsola.setParameter("ColorTextoNoticiaDos", entidad.getColorTextoNoticiaDos());
            rolconsola.setParameter("TextoNoticiaTres", entidad.getTextoNoticiaTres());
            rolconsola.setParameter("LetraTextoNoticiaTres", entidad.getLetraTextoNoticiaTres());
            rolconsola.setParameter("TamanoTextoNoticiaTres", entidad.getTamanoTextoNoticiaTres());
            rolconsola.setParameter("ColorTextoNoticiaTres", entidad.getColorTextoNoticiaTres());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCNoticiaContenidoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
