package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionGrupoClienteEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionGrupoClienteService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionGrupoClienteServiceImplementacion implements CRelacionGrupoClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaCRelacGrupoClient(CRelacionGrupoClienteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertcrelagclient = repositorio.createNamedStoredProcedureQuery("paCRelacionGrupoCliente");
            insertcrelagclient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("Cantidad", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("CD_UNDAD", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("HRR_RCB", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("HRR_HSTA", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("OBSRVCNES", String.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("VLOR_PGAR", String.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("ID_TRANS", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("Descarga", Integer.class, ParameterMode.IN);
            insertcrelagclient.registerStoredProcedureParameter("id_horaRango", Integer.class, ParameterMode.IN);
            insertcrelagclient.setParameter("Bandera", Bandera);
            insertcrelagclient.setParameter("IdGrupo", entidad.getIdGrupo());
            insertcrelagclient.setParameter("Usucodig", entidad.getUsucodig());
            insertcrelagclient.setParameter("Estado", entidad.getEstado());
            insertcrelagclient.setParameter("Cantidad", entidad.getCantidad());
            insertcrelagclient.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertcrelagclient.setParameter("CD_UNDAD", entidad.getCD_UNDAD());
            insertcrelagclient.setParameter("HRR_RCB", entidad.getHRRIO_RCBO_DSDE());
            insertcrelagclient.setParameter("HRR_HSTA", entidad.getHRRIO_RCBO_HSTA());
            insertcrelagclient.setParameter("OBSRVCNES", entidad.getOBSRVCNES());
            insertcrelagclient.setParameter("VLOR_PGAR", entidad.getVLOR_PGAR());
            insertcrelagclient.setParameter("ID_TRANS", entidad.getID_TRNSPORTISTA());
            insertcrelagclient.setParameter("Descarga", entidad.getDESCARGA());
            insertcrelagclient.setParameter("id_horaRango", entidad.getRANGO_ENTREGA());
            insertcrelagclient.execute();
            return JSONObject.quote((String) insertcrelagclient.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String EliminaCRelacGrupoClient(CRelacionGrupoClienteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery deletcrelagclient = repositorio.createNamedStoredProcedureQuery("paCRelacionGrupoCliente");
            deletcrelagclient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("Cantidad", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("CD_UNDAD", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("HRR_RCB", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("HRR_HSTA", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("OBSRVCNES", String.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("VLOR_PGAR", String.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("ID_TRANS", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("Descarga", Integer.class, ParameterMode.IN);
            deletcrelagclient.registerStoredProcedureParameter("id_horaRango", Integer.class, ParameterMode.IN);
            deletcrelagclient.setParameter("Bandera", Bandera);
            deletcrelagclient.setParameter("IdGrupo", entidad.getIdGrupo());
            deletcrelagclient.setParameter("Usucodig", entidad.getUsucodig());
            deletcrelagclient.setParameter("Estado", entidad.getEstado());
            deletcrelagclient.setParameter("Cantidad", entidad.getCantidad());
            deletcrelagclient.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            deletcrelagclient.setParameter("CD_UNDAD", entidad.getCD_UNDAD());
            deletcrelagclient.setParameter("HRR_RCB", entidad.getHRRIO_RCBO_DSDE());
            deletcrelagclient.setParameter("HRR_HSTA", entidad.getHRRIO_RCBO_HSTA());
            deletcrelagclient.setParameter("OBSRVCNES", entidad.getOBSRVCNES());
            deletcrelagclient.setParameter("VLOR_PGAR", entidad.getVLOR_PGAR());
            deletcrelagclient.setParameter("ID_TRANS", entidad.getID_TRNSPORTISTA());
            deletcrelagclient.setParameter("Descarga", entidad.getDESCARGA());
            deletcrelagclient.setParameter("id_horaRango", entidad.getRANGO_ENTREGA());
            deletcrelagclient.execute();
            return JSONObject.quote((String) deletcrelagclient.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
