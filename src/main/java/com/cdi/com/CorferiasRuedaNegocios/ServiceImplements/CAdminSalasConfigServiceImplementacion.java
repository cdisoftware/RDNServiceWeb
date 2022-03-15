package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasConfigEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdminSalasConfigService;
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
public class CAdminSalasConfigServiceImplementacion implements CAdminSalasConfigService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CAdminSalasConfigEntity> ConsultaCAdminSalaConf(Integer Bandera, Integer IdRuedaNegocio) {
        try {
            StoredProcedureQuery consalaconf = repositorio.createNamedStoredProcedureQuery("paCAdminSalasConfig");
            consalaconf.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consalaconf.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);

            consalaconf.setParameter("Bandera", Bandera);
            consalaconf.setParameter("IdRuedaNegocio", IdRuedaNegocio);

            return consalaconf.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdminSalasConfig consulta");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
