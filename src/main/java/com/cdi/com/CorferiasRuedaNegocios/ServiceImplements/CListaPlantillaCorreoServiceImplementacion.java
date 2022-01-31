package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaPlantillaCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaPlantillaCorreoService;
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
public class CListaPlantillaCorreoServiceImplementacion implements CListaPlantillaCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CListaPlantillaCorreoEntity> ConsultaListaPlantillaCorreo(Integer bandera, Integer IdPlantilla, String NombrePlantilla) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCListaPlantillaCorreo");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombrePlantilla", String.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("IdPlantilla", IdPlantilla);
            permisos.setParameter("NombrePlantilla", NombrePlantilla);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCListaPlantillaCorreo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
