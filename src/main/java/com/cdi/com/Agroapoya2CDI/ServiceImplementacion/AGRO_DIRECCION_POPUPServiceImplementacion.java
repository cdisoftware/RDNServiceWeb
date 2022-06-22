package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AGRO_DIRECCION_POPUPEntity;
import com.cdi.com.Agroapoya2CDI.Services.AGRO_DIRECCION_POPUPService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AGRO_DIRECCION_POPUPServiceImplementacion implements AGRO_DIRECCION_POPUPService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<AGRO_DIRECCION_POPUPEntity> ConsultaDireccionPopUp(Integer Bandera) {
        try {
            StoredProcedureQuery direccionPopup = repositorio.createNamedStoredProcedureQuery("AGRO_DIRECCION_POPUP");
            direccionPopup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            direccionPopup.setParameter("Bandera", Bandera);
            return direccionPopup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
