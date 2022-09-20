package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtipoPlantillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtipoPlantillaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtipoPlantillaServiceImplementacion implements CtipoPlantillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CtipoPlantillaEntity> ConsultaTipoPlantillas(Integer Bandera) {
         try {
            StoredProcedureQuery plnt = repositorio.createNamedStoredProcedureQuery("paC_tipoPlantilla");
            plnt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            plnt.setParameter("Bandera", Bandera);
            return plnt.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}