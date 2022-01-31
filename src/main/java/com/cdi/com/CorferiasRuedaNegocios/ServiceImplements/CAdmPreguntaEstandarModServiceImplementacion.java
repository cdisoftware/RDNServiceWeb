package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdmPreguntaEstandarModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdmPreguntaEstandarModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CAdmPreguntaEstandarModServiceImplementacion implements CAdmPreguntaEstandarModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaPreguntaEstandarOtroIdioma(CAdmPreguntaEstandarModEntity entidad, Integer bandera, String Idioma) {
        try {
            //String[] ArrayRespuesta = entidad.getRespuesta().split("\\|");
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCAdmPreguntaEstandarMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPreguntaEstandar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombrePregunta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ListaResp", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdListaResp", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("idusuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdPreguntaEstandar", entidad.getIdPreguntaEstandar());
            rolconsola.setParameter("IdTipoPregunta", entidad.getIdTipoPregunta());
            rolconsola.setParameter("NombrePregunta", entidad.getPregunta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("ListaResp", entidad.getRespuesta());
            rolconsola.setParameter("IdListaResp", entidad.getIdListaRespuesta());

            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));

        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPermisosRolMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaPreguntaEstandar(CAdmPreguntaEstandarModEntity entidad, Integer bandera, String Idioma) {
        try {
            //String[] ArrayRespuesta = entidad.getRespuesta().split("\\|");
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCAdmPreguntaEstandarMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPreguntaEstandar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombrePregunta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ListaResp", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdListaResp", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("idusuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdPreguntaEstandar", entidad.getIdPreguntaEstandar());
            rolconsola.setParameter("IdTipoPregunta", entidad.getIdTipoPregunta());
            rolconsola.setParameter("NombrePregunta", entidad.getPregunta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("ListaResp", entidad.getRespuesta());
            rolconsola.setParameter("IdListaResp", entidad.getIdListaRespuesta());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));

        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPermisosRolMod ACTUALIZAR");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
