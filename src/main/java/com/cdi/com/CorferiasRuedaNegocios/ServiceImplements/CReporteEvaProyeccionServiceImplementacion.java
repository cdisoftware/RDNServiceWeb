package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteEvaProyeccionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteEvaProyeccionService;
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
public class CReporteEvaProyeccionServiceImplementacion implements CReporteEvaProyeccionService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CReporteEvaProyeccionEntity> ConsultaCReporteEvaProyeccion(Integer Bandera, Integer IdRuedaNegocio, String Nombreempresa, String Nit) {
        try {
            StoredProcedureQuery evaProyecccion = repositorio.createNamedStoredProcedureQuery("paCReporteEvaProyeccion");
            evaProyecccion.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            evaProyecccion.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            evaProyecccion.registerStoredProcedureParameter("Nombreempresa", String.class, ParameterMode.IN);
            evaProyecccion.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);

            evaProyecccion.setParameter("Bandera", Bandera);
            evaProyecccion.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            evaProyecccion.setParameter("Nombreempresa", Nombreempresa);
            evaProyecccion.setParameter("Nit", Nit);

            return evaProyecccion.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReporteEvaProyeccion");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
