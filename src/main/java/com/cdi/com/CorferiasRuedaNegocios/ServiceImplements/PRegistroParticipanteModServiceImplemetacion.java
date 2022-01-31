package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroParticipanteModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroParticipanteModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PRegistroParticipanteModServiceImplemetacion implements PRegistroParticipanteModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaRegistroParticipante(PRegistroParticipanteModEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRegistroParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdDepartamento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCiudad", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("direccion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlPag", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idparticipante", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("NombreEmpresa", entidad.getNombreEmpresa());
            rolconsola.setParameter("NoIdentificacion", entidad.getNoIdentificacion());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("IdDepartamento", entidad.getIdDepartamento());
            rolconsola.setParameter("IdCiudad", entidad.getIdCiudad());
            rolconsola.setParameter("Telefono", entidad.getTelefono());
            rolconsola.setParameter("direccion", entidad.getDireccion());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("UrlPag", entidad.getUrl());;
            rolconsola.setParameter("Observacion", entidad.getObservacion());;
            rolconsola.setParameter("Idparticipante", entidad.getIdParticipante());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
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
    public String ActualizarRegistroParticipante(PRegistroParticipanteModEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRegistroParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdDepartamento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCiudad", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("direccion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlPag", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idparticipante", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("NombreEmpresa", entidad.getNombreEmpresa());
            rolconsola.setParameter("NoIdentificacion", entidad.getNoIdentificacion());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("IdDepartamento", entidad.getIdDepartamento());
            rolconsola.setParameter("IdCiudad", entidad.getIdCiudad());
            rolconsola.setParameter("Telefono", entidad.getTelefono());
            rolconsola.setParameter("direccion", entidad.getDireccion());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("UrlPag", entidad.getUrl());
            rolconsola.setParameter("Observacion", entidad.getObservacion());;
            rolconsola.setParameter("Idparticipante", entidad.getIdParticipante());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPermisosRolMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
