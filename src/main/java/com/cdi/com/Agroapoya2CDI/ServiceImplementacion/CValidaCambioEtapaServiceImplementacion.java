package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CValidaCambioEtapaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValidaCambioEtapaServiceImplementacion implements CValidaCambioEtapaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCValidaCambioEtapa(Integer Bandera, Integer CD_CNSCTVO, Integer FASE_SIGUIENTE) {
        try {
            StoredProcedureQuery valida = repositorio.createNamedStoredProcedureQuery("paCValidaCambioEtapa");
            valida.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            valida.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            valida.registerStoredProcedureParameter("FASE_SIGUIENTE", Integer.class, ParameterMode.IN);
            valida.setParameter("Bandera", Bandera);
            valida.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            valida.setParameter("FASE_SIGUIENTE", FASE_SIGUIENTE);
            valida.execute();
            return JSONObject.quote((String) valida.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
