package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_CiudadesActivasEntity;
import com.cdi.com.Agroapoya2CDI.Services.mv_CiudadesActivasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mv_CiudadesActivasServiceImplementacion implements mv_CiudadesActivasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mv_CiudadesActivasEntity> ConsultaCiudadesActivs(Integer bandera) {
        try {
            StoredProcedureQuery consciudact = repositorio.createNamedStoredProcedureQuery("paT_Geografica");
            consciudact.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consciudact.setParameter("bandera", bandera);
            return consciudact.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
