package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CEnvioCodigoCorreoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CEnvioRealCorreoServiceImplementacion implements CEnvioCodigoCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaEnvioMailCorreo(Integer bandera, Integer IdPlantilla, Integer IdTipoUsuario, Integer cd_cnctvo) {
        try {
            StoredProcedureQuery insertCD = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo");
            insertCD.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertCD.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            insertCD.registerStoredProcedureParameter("IdTipoUsuario", Integer.class, ParameterMode.IN);
            insertCD.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);

            insertCD.setParameter("bandera", bandera);
            insertCD.setParameter("IdPlantilla", IdPlantilla);
            insertCD.setParameter("IdTipoUsuario", IdTipoUsuario);
            insertCD.setParameter("cd_cnctvo", cd_cnctvo);

            insertCD.execute();
            return JSONObject.quote((String) insertCD.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
