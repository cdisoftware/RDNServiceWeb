package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAplantillaCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAplantillaCorreoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAplantillaCorreoServiceImplementacion implements CAplantillaCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAplantillaCorreoEntity> ConsultaAplantillaCorreo(CAplantillaCorreoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery correoplantll = repositorio.createNamedStoredProcedureQuery("paC_AplantillaCorreo");
            correoplantll.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            correoplantll.registerStoredProcedureParameter("NombrePlantilla", String.class, ParameterMode.IN);
            correoplantll.registerStoredProcedureParameter("idMomentoEnvio", Integer.class, ParameterMode.IN);
            correoplantll.registerStoredProcedureParameter("idTipoPlantilla", Integer.class, ParameterMode.IN);
            correoplantll.registerStoredProcedureParameter("idPlantilla", Integer.class, ParameterMode.IN);

            correoplantll.setParameter("Bandera", Bandera);
            correoplantll.setParameter("NombrePlantilla", entidad.getNombrePlantilla());
            correoplantll.setParameter("idMomentoEnvio", entidad.getIdMomentoEnvio());
            correoplantll.setParameter("idTipoPlantilla", entidad.getIdTipoPlantilla());
            correoplantll.setParameter("idPlantilla", entidad.getIdPlantilla());

            return correoplantll.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
