package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRecuperaDatosContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRecuperaDatosContactoService;
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
public class PRecuperaDatosContactoServiceImplementacion implements PRecuperaDatosContactoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PRecuperaDatosContactoEntity> ConsultaRecupDatsContact(PRecuperaDatosContactoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery consrdtscontact = repositorio.createNamedStoredProcedureQuery("paPRecuperaDatosContacto");
            consrdtscontact.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consrdtscontact.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            consrdtscontact.setParameter("Bandera", Bandera);
            consrdtscontact.setParameter("Email", entidad.getEmail());
            return consrdtscontact.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRecuperaDatosContacto consulta");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
