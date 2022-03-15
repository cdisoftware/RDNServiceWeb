package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecuperaDatosUsuarioEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRecuperaDatosUsuarioService;
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
public class CRecuperaDatosUsuarioServiceImplementacion implements CRecuperaDatosUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRecuperaDatosUsuarioEntity> ConsultaCRecDatosUser(CRecuperaDatosUsuarioEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery consrdtsuser = repositorio.createNamedStoredProcedureQuery("paCRecuperaDatosUsuario");
            consrdtsuser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consrdtsuser.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            consrdtsuser.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            consrdtsuser.setParameter("Bandera", Bandera);
            consrdtsuser.setParameter("Email", entidad.getEmail());
            consrdtsuser.setParameter("IdUsuario", IdUsuario);
            return consrdtsuser.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRecuperaDatosUsuario consulta");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
