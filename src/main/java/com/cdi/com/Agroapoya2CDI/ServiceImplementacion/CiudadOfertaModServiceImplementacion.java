package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CiudadOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CiudadOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CiudadOfertaModServiceImplementacion implements CiudadOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CiudadOfertaMod(CiudadOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery mod = repositorio.createNamedStoredProcedureQuery("paCCiudadOfertaMod");
            mod.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_PAIS", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_DPTO", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_MNCPIO", String.class, ParameterMode.IN);

            mod.setParameter("Bandera", Bandera);
            mod.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            mod.setParameter("CD_PAIS", entidad.getCD_PAIS());
            mod.setParameter("CD_DPTO", entidad.getCD_DPTO());
            mod.setParameter("CD_MNCPIO", entidad.getCD_MNCPIO());

            mod.execute();
            return JSONObject.quote((String) mod.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
