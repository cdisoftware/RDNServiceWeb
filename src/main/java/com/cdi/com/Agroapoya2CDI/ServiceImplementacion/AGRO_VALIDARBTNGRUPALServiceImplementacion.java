package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.AGRO_VALIDARBTNGRUPALService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AGRO_VALIDARBTNGRUPALServiceImplementacion implements AGRO_VALIDARBTNGRUPALService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaAgroValidGrupal(String cd_cnsctivo) {
        try {
            StoredProcedureQuery consagroval = repositorio.createNamedStoredProcedureQuery("AGRO_VALIDARBTNGRUPAL");
            consagroval.registerStoredProcedureParameter("cd_cnsctivo", String.class, ParameterMode.IN);
            consagroval.setParameter("cd_cnsctivo", cd_cnsctivo);
            consagroval.execute();
            return null;
        } catch (Exception ex) {

            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
