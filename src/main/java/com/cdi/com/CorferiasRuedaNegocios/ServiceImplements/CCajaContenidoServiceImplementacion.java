package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCajaContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCajaContenidoService;
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
public class CCajaContenidoServiceImplementacion implements CCajaContenidoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CCajaContenidoEntity> ConsultarCajaContenido(Integer Bandera, Integer IdRueda, String Idioma) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCCajaContenido");
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
            entidadLog.setServicio("Servicio paCCajaContenido");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarCajaContenido(CCajaContenidoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCCajaContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCaja", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtlCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTtlCajaUno", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtlCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoPopUpCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTituloCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloCajaDos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTituloCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoPopUpCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTituloCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloCajaTres", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTituloCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoPopUpCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdCaja", entidad.getIdCaja());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("TituloCajaUno", entidad.getTituloCajaUno());
            rolconsola.setParameter("LetraTtlCajaUno", entidad.getLetraTtlCajaUno());
            rolconsola.setParameter("TamanoTtlCajaUno", entidad.getTamanoTtlCajaUno());
            rolconsola.setParameter("ColorTtlCajaUno", entidad.getColorTtlCajaUno());
            rolconsola.setParameter("ImagenCajaUno", entidad.getImagenCajaUno());
            rolconsola.setParameter("TextoPopUpCajaUno", entidad.getTextoPopUpCajaUno());
            rolconsola.setParameter("UrlCajaUno", entidad.getUrlCajaUno());
            rolconsola.setParameter("TituloCajaDos", entidad.getTituloCajaDos());
            rolconsola.setParameter("LetraTituloCajaDos", entidad.getLetraTituloCajaDos());
            rolconsola.setParameter("TamanoTituloCajaDos", entidad.getTamanoTituloCajaDos());
            rolconsola.setParameter("ColorTituloCajaDos", entidad.getColorTituloCajaDos());
            rolconsola.setParameter("ImagenCajaDos", entidad.getImagenCajaDos());
            rolconsola.setParameter("TextoPopUpCajaDos", entidad.getTextoPopUpCajaDos());
            rolconsola.setParameter("UrlCajaDos", entidad.getUrlCajaDos());
            rolconsola.setParameter("TituloCajaTres", entidad.getTituloCajaTres());
            rolconsola.setParameter("LetraTituloCajaTres", entidad.getLetraTituloCajaTres());
            rolconsola.setParameter("TamanoTituloCajaTres", entidad.getTamanoTituloCajaTres());
            rolconsola.setParameter("ColorTituloCajaTres", entidad.getColorTituloCajaTres());
            rolconsola.setParameter("ImagenCajaTres", entidad.getImagenCajaTres());
            rolconsola.setParameter("TextoPopUpCajaTres", entidad.getTextoPopUpCajaTres());
            rolconsola.setParameter("UrlCajaTres", entidad.getUrlCajaTres());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCajaContenidoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarCajaContenido(CCajaContenidoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC) {
        try {
             StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCCajaContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCaja", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTtlCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTtlCajaUno", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTtlCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoPopUpCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlCajaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTituloCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloCajaDos", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTituloCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoPopUpCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlCajaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("LetraTituloCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TamanoTituloCajaTres", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ColorTituloCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextoPopUpCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlCajaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdCaja", entidad.getIdCaja());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("TituloCajaUno", entidad.getTituloCajaUno());
            rolconsola.setParameter("LetraTtlCajaUno", entidad.getLetraTtlCajaUno());
            rolconsola.setParameter("TamanoTtlCajaUno", entidad.getTamanoTtlCajaUno());
            rolconsola.setParameter("ColorTtlCajaUno", entidad.getColorTtlCajaUno());
            rolconsola.setParameter("ImagenCajaUno", entidad.getImagenCajaUno());
            rolconsola.setParameter("TextoPopUpCajaUno", entidad.getTextoPopUpCajaUno());
            rolconsola.setParameter("UrlCajaUno", entidad.getUrlCajaUno());
            rolconsola.setParameter("TituloCajaDos", entidad.getTituloCajaDos());
            rolconsola.setParameter("LetraTituloCajaDos", entidad.getLetraTituloCajaDos());
            rolconsola.setParameter("TamanoTituloCajaDos", entidad.getTamanoTituloCajaDos());
            rolconsola.setParameter("ColorTituloCajaDos", entidad.getColorTituloCajaDos());
            rolconsola.setParameter("ImagenCajaDos", entidad.getImagenCajaDos());
            rolconsola.setParameter("TextoPopUpCajaDos", entidad.getTextoPopUpCajaDos());
            rolconsola.setParameter("UrlCajaDos", entidad.getUrlCajaDos());
            rolconsola.setParameter("TituloCajaTres", entidad.getTituloCajaTres());
            rolconsola.setParameter("LetraTituloCajaTres", entidad.getLetraTituloCajaTres());
            rolconsola.setParameter("TamanoTituloCajaTres", entidad.getTamanoTituloCajaTres());
            rolconsola.setParameter("ColorTituloCajaTres", entidad.getColorTituloCajaTres());
            rolconsola.setParameter("ImagenCajaTres", entidad.getImagenCajaTres());
            rolconsola.setParameter("TextoPopUpCajaTres", entidad.getTextoPopUpCajaTres());
            rolconsola.setParameter("UrlCajaTres", entidad.getUrlCajaTres());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCajaContenidoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
