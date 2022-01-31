package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecintoModificaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRecintoModificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRecintoModificaServiceImplementacion implements CRecintoModificaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarRecinto(CRecintoModificaEntity entidad, Integer bandera, String Idioma, Integer idusuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRecintoModifica");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreRecinto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRecinto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdDepart", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCiudad", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Principal", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("longitud", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("latitud", String.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("idusuario", idusuario);
            rolconsola.setParameter("NombreRecinto", entidad.getNombreRecinto());
            rolconsola.setParameter("IdRecinto", entidad.getIdRecinto());
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.setParameter("IdDepart", entidad.getIdDepartamento());
            rolconsola.setParameter("IdCiudad", entidad.getIdCiudad());
            rolconsola.setParameter("Principal", entidad.getPrincipal());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("Direccion", entidad.getDireccion());
            rolconsola.setParameter("longitud", entidad.getLatitud());
            rolconsola.setParameter("latitud", entidad.getLongitud());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRecintoModifica insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRecinto(CRecintoModificaEntity entidad, Integer bandera, String Idioma, Integer idusuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRecintoModifica");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreRecinto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRecinto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdDepart", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCiudad", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Principal", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("longitud", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("latitud", String.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("idusuario", idusuario);
            rolconsola.setParameter("NombreRecinto", entidad.getNombreRecinto());
            rolconsola.setParameter("IdRecinto", entidad.getIdRecinto());
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.setParameter("IdDepart", entidad.getIdDepartamento());
            rolconsola.setParameter("IdCiudad", entidad.getIdCiudad());
            rolconsola.setParameter("Principal", entidad.getPrincipal());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("Direccion", entidad.getDireccion());
            rolconsola.setParameter("longitud", entidad.getLatitud());
            rolconsola.setParameter("latitud", entidad.getLongitud());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRecintoModifica actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
