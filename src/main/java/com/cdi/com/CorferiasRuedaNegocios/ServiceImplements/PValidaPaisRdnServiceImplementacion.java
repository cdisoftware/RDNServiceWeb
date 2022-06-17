package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaPaisRdnService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PValidaPaisRdnServiceImplementacion implements PValidaPaisRdnService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaPaisRdn(Integer Bandera, Integer IdRdn, Integer IdContacto, Integer IdPerfil) {
        try {
            StoredProcedureQuery conspaisrdn = repositorio.createNamedStoredProcedureQuery("paPValidaPaisRdn");
            conspaisrdn.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            conspaisrdn.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            conspaisrdn.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            conspaisrdn.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);

            conspaisrdn.setParameter("Bandera", Bandera);
            conspaisrdn.setParameter("IdRdn", IdRdn);
            conspaisrdn.setParameter("IdContacto", IdContacto);
            conspaisrdn.setParameter("IdPerfil", IdPerfil);

            conspaisrdn.execute();
            return JSONObject.quote((String) conspaisrdn.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaPaisRdn");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
