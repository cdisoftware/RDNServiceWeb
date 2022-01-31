package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PCategoriaSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCategoriaSectorService;
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
public class PCategoriaSectorServiceImplemetacion implements PCategoriaSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PCategoriaSectorEntity> ConsultaCategoriaSector(Integer Bandera, Integer IdSector, String Idioma) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paPCategoriaSector");
            roles.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.setParameter("Bandera", Bandera);
            roles.setParameter("IdSector", IdSector);
            roles.setParameter("Idioma", Idioma);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPCategoriaSector");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
