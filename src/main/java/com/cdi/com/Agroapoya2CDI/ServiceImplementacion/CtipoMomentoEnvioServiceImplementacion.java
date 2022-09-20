package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtipoMomentoEnvioEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtipoMomentoEnvioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtipoMomentoEnvioServiceImplementacion implements CtipoMomentoEnvioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CtipoMomentoEnvioEntity> ConsultaTipoMomentoEnvio(Integer Bandera) {
        try {
            StoredProcedureQuery tipo = repositorio.createNamedStoredProcedureQuery("paC_tipoMomentoEnvio");
            tipo.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipo.setParameter("Bandera", Bandera);
            return tipo.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
