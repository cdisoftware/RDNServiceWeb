package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CPagosTransTotalesService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPagosTransTotalesServiceImplementacion implements CPagosTransTotalesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCPagosTransTotales(Integer Bandera, Integer Cd_csnctivo, Integer IdSector, Integer idConductor) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_PagosTransTotales");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Cd_csnctivo", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("idConductor", Integer.class, ParameterMode.IN);

            respu.setParameter("Bandera", Bandera);
            respu.setParameter("Cd_csnctivo", Cd_csnctivo);
            respu.setParameter("IdSector", IdSector);
            respu.setParameter("idConductor", idConductor);

            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
