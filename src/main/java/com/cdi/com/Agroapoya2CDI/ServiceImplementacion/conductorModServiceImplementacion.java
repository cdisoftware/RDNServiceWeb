package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.conductorModEntity;
import com.cdi.com.Agroapoya2CDI.Services.conductorModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class conductorModServiceImplementacion implements conductorModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConductorMod(conductorModEntity entidad, Integer bandera, Integer id_carroceria, Integer id_pesoCargaCarro) {
        try {
            StoredProcedureQuery mod = repositorio.createNamedStoredProcedureQuery("paC_conductorMod");
            mod.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ID_CNDCTOR", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("USUCODIG_TRANS", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("NMBRE_CNDCTOR", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("TIPO_DOCUMENTO", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("NUMERO_ID", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("PLCA", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("TEL_CNDCTOR", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_DPTO", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_CDAD", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("DIRECCION", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("COORDENADAS", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("id_carroceria", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("id_pesoCargaCarro", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("observacion", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CorreoConductor", String.class, ParameterMode.IN);
            mod.setParameter("bandera", bandera);
            mod.setParameter("ID_CNDCTOR", entidad.getID_CNDCTOR());
            mod.setParameter("USUCODIG_TRANS", entidad.getUSUCODIG_TRANS());
            mod.setParameter("NMBRE_CNDCTOR", entidad.getNMBRE_CNDCTOR());
            mod.setParameter("TIPO_DOCUMENTO", entidad.getTIPO_DOCUMENTO());
            mod.setParameter("NUMERO_ID", entidad.getNUMERO_ID());
            mod.setParameter("PLCA", entidad.getPLCA());
            mod.setParameter("TEL_CNDCTOR", entidad.getTEL_CNDCTOR());
            mod.setParameter("CD_DPTO", entidad.getCD_DPTO());
            mod.setParameter("CD_CDAD", entidad.getCD_CDAD());
            mod.setParameter("DIRECCION", entidad.getDIRECCION());
            mod.setParameter("COORDENADAS", entidad.getCOORDENADAS());
            mod.setParameter("id_carroceria", id_carroceria);
            mod.setParameter("id_pesoCargaCarro", id_pesoCargaCarro);
            mod.setParameter("observacion", entidad.getObservacion());
            mod.setParameter("CorreoConductor", entidad.getCorreoConductor());
            mod.execute();
            return JSONObject.quote((String) mod.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
