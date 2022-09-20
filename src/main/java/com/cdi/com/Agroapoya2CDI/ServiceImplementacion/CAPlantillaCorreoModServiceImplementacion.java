package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAPlantillaCorreoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAPlantillaCorreoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAPlantillaCorreoModServiceImplementacion implements CAPlantillaCorreoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCAPlantillaCorreo(CAPlantillaCorreoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modplnll = repositorio.createNamedStoredProcedureQuery("paC_APlantillaCorreoMod");
            modplnll.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("UsucodigAdmin", Integer.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("idplantilla", Integer.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("NombrePlantilla", String.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("idTipoPlantilla", Integer.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("idMomentoEnvio", Integer.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("Asunto", String.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("idEstado", Integer.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("descripcion", String.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("html", String.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("imgEncabezado", String.class, ParameterMode.IN);
            modplnll.registerStoredProcedureParameter("imgPiePagina", String.class, ParameterMode.IN);

            modplnll.setParameter("Bandera", Bandera);
            modplnll.setParameter("UsucodigAdmin", entidad.getUsucodigAdmin());
            modplnll.setParameter("idplantilla", entidad.getIdplantilla());
            modplnll.setParameter("NombrePlantilla", entidad.getNombrePlantilla());
            modplnll.setParameter("idTipoPlantilla", entidad.getIdTipoPlantilla());
            modplnll.setParameter("idMomentoEnvio", entidad.getIdMomentoEnvio());
            modplnll.setParameter("Asunto", entidad.getAsunto());
            modplnll.setParameter("idEstado", entidad.getIdEstado());
            modplnll.setParameter("descripcion", entidad.getDescripcion());
            modplnll.setParameter("html", entidad.getHtml());
            modplnll.setParameter("imgEncabezado", entidad.getImgEncabezado());
            modplnll.setParameter("imgPiePagina", entidad.getImgPiePagina());

            modplnll.execute();
            return JSONObject.quote((String) modplnll.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
