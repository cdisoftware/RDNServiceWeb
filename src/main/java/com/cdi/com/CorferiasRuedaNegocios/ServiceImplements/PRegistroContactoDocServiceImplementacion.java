package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoDocEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroContactoDocService;
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
public class PRegistroContactoDocServiceImplementacion implements PRegistroContactoDocService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PRegistroContactoDocEntity> ConsultaPRegistroContactoDoc(Integer Bandera, Integer IdParticipante, String NoIdentificacion, 
            String IdIdentificacion, Integer IdRuedaNegocio) {
        try {
            StoredProcedureQuery resgistcontactdoc = repositorio.createNamedStoredProcedureQuery("paPRegistroContactoDoc");
            resgistcontactdoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            resgistcontactdoc.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            resgistcontactdoc.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            resgistcontactdoc.registerStoredProcedureParameter("IdIdentificacion", String.class, ParameterMode.IN);
            resgistcontactdoc.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            resgistcontactdoc.setParameter("Bandera", Bandera);
            resgistcontactdoc.setParameter("IdParticipante", IdParticipante);
            resgistcontactdoc.setParameter("NoIdentificacion", NoIdentificacion);
            resgistcontactdoc.setParameter("IdIdentificacion", IdIdentificacion);
            resgistcontactdoc.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            return resgistcontactdoc.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRegistroContactoDoc");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
