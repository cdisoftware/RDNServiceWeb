package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.MV_INSERT_AGRO_PERSONASVDOSEntity;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.cdi.com.Agroapoya2CDI.Services.MV_INSERT_AGRO_PERSONASVDOSService;

@Service
public class MV_INSERT_AGRO_PERSONASVDOSServiceImplementacion implements MV_INSERT_AGRO_PERSONASVDOSService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertAgroPrsnasvdos(MV_INSERT_AGRO_PERSONASVDOSEntity entidad, Integer bandera, Integer codUsuario) {
        try {
            StoredProcedureQuery insertagropersds = repositorio.createNamedStoredProcedureQuery("paC_personaMod");
            insertagropersds.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("codUsuario", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("tpo_persona", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("nombres", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("apellido", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("tipo_identificacion", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("numero_identificacion", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("direccion", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("dpto", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("ciudad", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("Complemento_direccion", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("CMNTRIO", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("TOKEN", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("NIT", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("COORDENADAS", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("TPO_TRANSPORTE", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("TPO_CLNTEINST", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("RZON_SCIAL", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("frma_pgo", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("tpo_cnta", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("nocuenta", String.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("id_bnco", Integer.class, ParameterMode.IN);
            insertagropersds.registerStoredProcedureParameter("id_tpoprsn", Integer.class, ParameterMode.IN);
            insertagropersds.setParameter("bandera", bandera);
            insertagropersds.setParameter("codUsuario", codUsuario);
            insertagropersds.setParameter("tpo_persona", entidad.getCD_TIPO_PRSNA());
            insertagropersds.setParameter("nombres", entidad.getNOMBRES_PERSONA());
            insertagropersds.setParameter("apellido", entidad.getAPELLIDOS_PERSONA());
            insertagropersds.setParameter("telefono", entidad.getCELULAR_PERSONA());
            insertagropersds.setParameter("correo", entidad.getCORREO_PERSONA());
            insertagropersds.setParameter("tipo_identificacion", entidad.getTIPO_DOCUMENTO());
            insertagropersds.setParameter("numero_identificacion", entidad.getDOCUMENTO_USUARIO());
            insertagropersds.setParameter("direccion", entidad.getDRCCION());
            insertagropersds.setParameter("dpto", entidad.getCD_DPTO());
            insertagropersds.setParameter("ciudad", entidad.getCD_CDAD());
            insertagropersds.setParameter("Complemento_direccion", entidad.getCMPLMNTO_DRRCCION());
            insertagropersds.setParameter("CMNTRIO", entidad.getCMNTRIO());
            insertagropersds.setParameter("TOKEN", entidad.getTOKEN_PERSONA());
            insertagropersds.setParameter("NIT", entidad.getNIT());
            insertagropersds.setParameter("COORDENADAS", entidad.getCOORDENADAS_ENTR());
            insertagropersds.setParameter("TPO_TRANSPORTE", entidad.getTPO_TRANSPORTE());
            insertagropersds.setParameter("TPO_CLNTEINST", entidad.getCD_TIPO_CLIENTE());
            insertagropersds.setParameter("RZON_SCIAL", entidad.getRAZON_SOCIAL());
            insertagropersds.setParameter("frma_pgo", entidad.getID_FRMA_PGO());
            insertagropersds.setParameter("tpo_cnta", entidad.getID_TPO_CUENTA());
            insertagropersds.setParameter("nocuenta", entidad.getNOCUENTA());
            insertagropersds.setParameter("id_bnco", entidad.getID_BNCO());
            insertagropersds.setParameter("id_tpoprsn", entidad.getID_TPO_PRSNA());
            insertagropersds.execute();
            return JSONObject.quote((String) insertagropersds.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
