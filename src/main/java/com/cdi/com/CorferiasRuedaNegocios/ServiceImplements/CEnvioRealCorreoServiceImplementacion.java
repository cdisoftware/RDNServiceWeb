package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CMasivoEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEnvioRealCorreoService;
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
public class CEnvioRealCorreoServiceImplementacion implements CEnvioRealCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CMasivoEnvioCorreoEntity> ConsultaEnvioRealCorreo(Integer bandera, 
            String Idioma, Integer IdEnvioCorreo) {

        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo");
            consciudadpais.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdEnvioCorreo", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("bandera", bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("IdEnvioCorreo", IdEnvioCorreo);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCEnvioRealCorreo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
