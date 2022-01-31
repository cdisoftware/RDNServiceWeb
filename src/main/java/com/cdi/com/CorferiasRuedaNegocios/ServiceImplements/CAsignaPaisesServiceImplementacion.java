package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaPaisesEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAsignaPaisesService;
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
public class CAsignaPaisesServiceImplementacion implements CAsignaPaisesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CAsignaPaisesEntity> ConsultaAsignaPaises(Integer Bandera, Integer IdUsuario,
            Integer IdRdn, Integer IdPerfilRueda, Integer IdTipoSeleccion, Integer IdAsignaPais) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCAsignaPaises");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdTipoSeleccion", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdAsignaPais", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdUsuario", IdUsuario);
            permisos.setParameter("IdRdn", IdRdn);
            permisos.setParameter("IdPerfilRueda", IdPerfilRueda);
            permisos.setParameter("IdTipoSeleccion", IdTipoSeleccion);
            permisos.setParameter("IdAsignaPais", IdAsignaPais);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAsignaPaises");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
