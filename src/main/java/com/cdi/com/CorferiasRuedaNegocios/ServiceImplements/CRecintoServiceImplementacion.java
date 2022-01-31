
package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecintoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRecintoService;
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
public class CRecintoServiceImplementacion implements CRecintoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRecintoEntity> ConsultaRecinto(Integer bandera, String Idioma, 
            Integer idusuario, String NombreRecinto, Integer IdRecinto, Integer Estado,
            String Imagen, Integer Publicar,Integer IdPais) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCRecinto");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("idusuario", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreRecinto", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRecinto", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("idusuario", idusuario);
            permisos.setParameter("NombreRecinto", NombreRecinto);
            permisos.setParameter("IdRecinto", IdRecinto);
            permisos.setParameter("Estado", Estado);
            permisos.setParameter("Imagen", Imagen);
            permisos.setParameter("Publicar", Publicar);
            permisos.setParameter("IdPais", IdPais);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRecinto");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
