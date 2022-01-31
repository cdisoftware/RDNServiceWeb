package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CFormulaPlantillaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFormulaPlantillaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CFormulaPlantillaModServiceImplementacion implements CFormulaPlantillaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarPlantillaCorreo(CFormulaPlantillaModEntity entidad, Integer bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCFormulaPlantillaMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdFormula", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Html", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("IdFormula", entidad.getIdFormula());
            rolconsola.setParameter("Html", entidad.getHtml());
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCFormulaPlantillaMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPlantillaCorreo(CFormulaPlantillaModEntity entidad, Integer bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCFormulaPlantillaMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdFormula", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Html", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("IdFormula", entidad.getIdFormula());
            rolconsola.setParameter("Html", entidad.getHtml());
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCFormulaPlantillaMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
