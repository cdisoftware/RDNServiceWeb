package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDocumentoCorreoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDocumentoCorreoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDocumentoCorreoModServiceImplementacion implements CDocumentoCorreoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCDocumentoCorreo(CDocumentoCorreoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery moddoc = repositorio.createNamedStoredProcedureQuery("paC_DocumentoCorreoMod");
            moddoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            moddoc.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            moddoc.registerStoredProcedureParameter("IdDocumento", Integer.class, ParameterMode.IN);
            moddoc.registerStoredProcedureParameter("NombreDocumento", String.class, ParameterMode.IN);
            moddoc.registerStoredProcedureParameter("rutaDocumento", String.class, ParameterMode.IN);
            moddoc.setParameter("Bandera", Bandera);
            moddoc.setParameter("IdPlantilla", entidad.getIdPlantilla());
            moddoc.setParameter("IdDocumento", entidad.getIdDocumento());
            moddoc.setParameter("NombreDocumento", entidad.getNombreDocumento());
            moddoc.setParameter("rutaDocumento", entidad.getRutaDocumento());
            moddoc.execute();
            return JSONObject.quote((String) moddoc.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
