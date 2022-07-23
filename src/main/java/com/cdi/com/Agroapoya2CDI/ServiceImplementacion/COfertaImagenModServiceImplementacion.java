package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COfertaImagenModEntity;
import com.cdi.com.Agroapoya2CDI.Services.COfertaImagenModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COfertaImagenModServiceImplementacion implements COfertaImagenModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaCOfertaImagenMod(COfertaImagenModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery cofert = repositorio.createNamedStoredProcedureQuery("paCOfertaImagenMod");
            cofert.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("ID_IMAGEN1", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("IMAGEN1", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("ID_IMAGEN2", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("IMAGEN2", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("ID_IMAGEN3", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("IMAGEN3", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("ID_IMAGEN4", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("IMAGEN4", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("ID_IMAGEN5", String.class, ParameterMode.IN);
            cofert.registerStoredProcedureParameter("IMAGEN5", String.class, ParameterMode.IN);

            cofert.setParameter("bandera", bandera);
            cofert.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            cofert.setParameter("ID_IMAGEN1", entidad.getID_IMAGEN1());
            cofert.setParameter("IMAGEN1", entidad.getIMAGEN1());
            cofert.setParameter("ID_IMAGEN2", entidad.getID_IMAGEN2());
            cofert.setParameter("IMAGEN2", entidad.getIMAGEN2());
            cofert.setParameter("ID_IMAGEN3", entidad.getID_IMAGEN3());
            cofert.setParameter("IMAGEN3", entidad.getIMAGEN3());
            cofert.setParameter("ID_IMAGEN4", entidad.getID_IMAGEN4());
            cofert.setParameter("IMAGEN4", entidad.getIMAGEN4());
            cofert.setParameter("ID_IMAGEN5", entidad.getID_IMAGEN5());
            cofert.setParameter("IMAGEN5", entidad.getIMAGEN5());
            cofert.execute();
            return JSONObject.quote((String) cofert.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
