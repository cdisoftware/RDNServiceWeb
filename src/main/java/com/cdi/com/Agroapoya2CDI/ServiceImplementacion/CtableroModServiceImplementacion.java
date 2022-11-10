package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtableroModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtableroModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtableroModServiceImplementacion implements CtableroModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCTablero(CtableroModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modTablero = repositorio.createNamedStoredProcedureQuery("paC_tableroMod");
            modTablero.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modTablero.registerStoredProcedureParameter("UsucodigTrans", Integer.class, ParameterMode.IN);
            modTablero.registerStoredProcedureParameter("IdConductor", Integer.class, ParameterMode.IN);
            modTablero.registerStoredProcedureParameter("IdPlataforma", Integer.class, ParameterMode.IN);

            modTablero.setParameter("Bandera", Bandera);
            modTablero.setParameter("UsucodigTrans", entidad.getUsucodigTrans());
            modTablero.setParameter("IdConductor", entidad.getIdConductor());
            modTablero.setParameter("IdPlataforma", entidad.getIdPlataforma());

            modTablero.execute();
            return JSONObject.quote((String) modTablero.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
