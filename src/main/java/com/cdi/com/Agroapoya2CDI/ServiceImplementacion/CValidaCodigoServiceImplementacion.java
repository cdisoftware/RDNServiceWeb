package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValidaCodigoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValidaCodigoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValidaCodigoServiceImplementacion implements CValidaCodigoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCValidaCodigo(CValidaCodigoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery conscode = repositorio.createNamedStoredProcedureQuery("paC_ValidaCodigo");
            conscode.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            conscode.registerStoredProcedureParameter("CODIGODOS", String.class, ParameterMode.IN);
            conscode.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            conscode.registerStoredProcedureParameter("id_sector", Integer.class, ParameterMode.IN);

            conscode.setParameter("Bandera", Bandera);
            conscode.setParameter("CODIGODOS", entidad.getCODIGODOS());
            conscode.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            conscode.setParameter("id_sector", entidad.getId_sector());

            conscode.execute();
            return JSONObject.quote((String) conscode.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
