package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_insert_AGRO_CLIENTE_2Entity;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.cdi.com.Agroapoya2CDI.Services.mv_insert_AGRO_CLIENTE_2Service;

@Service
public class mv_insert_AGRO_CLIENTE_2ServiceImplementacion implements mv_insert_AGRO_CLIENTE_2Service {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaAgroClient(mv_insert_AGRO_CLIENTE_2Entity entidad, Integer id_horaRango) {
        try {
            StoredProcedureQuery insertagroclt = repositorio.createNamedStoredProcedureQuery("mv_insert_AGRO_CLIENTE_2");
            insertagroclt.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("CD_UNDAD", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("HRR_RCB", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("HRR_HSTA", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("OBSRVCNES", String.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("USUCODIG", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("VLOR_PGAR", String.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("ID_TRANS", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("Descarga", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("id_horaRango", Integer.class, ParameterMode.IN);
            insertagroclt.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            insertagroclt.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertagroclt.setParameter("CD_UNDAD", entidad.getCD_UNDAD());
            insertagroclt.setParameter("HRR_RCB", entidad.getHRRIO_RCBO_DSDE());
            insertagroclt.setParameter("HRR_HSTA", entidad.getHRRIO_RCBO_HSTA());
            insertagroclt.setParameter("OBSRVCNES", entidad.getOBSRVCNES());
            insertagroclt.setParameter("USUCODIG", entidad.getUSUCODIG());
            insertagroclt.setParameter("VLOR_PGAR", entidad.getVLOR_PGAR());
            insertagroclt.setParameter("ID_TRANS", entidad.getID_TRANSPORTISTA());
            insertagroclt.setParameter("Descarga", entidad.getDESCARGA());
            insertagroclt.setParameter("id_horaRango", id_horaRango);
            insertagroclt.setParameter("IdGrupo", entidad.getIDGRUPO());
            insertagroclt.execute();
            return JSONObject.quote((String) insertagroclt.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
