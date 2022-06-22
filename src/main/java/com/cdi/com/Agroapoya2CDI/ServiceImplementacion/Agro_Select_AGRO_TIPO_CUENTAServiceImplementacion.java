package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Agro_Select_AGRO_TIPO_CUENTAEntity;
import com.cdi.com.Agroapoya2CDI.Services.Agro_Select_AGRO_TIPO_CUENTAService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Agro_Select_AGRO_TIPO_CUENTAServiceImplementacion implements Agro_Select_AGRO_TIPO_CUENTAService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Agro_Select_AGRO_TIPO_CUENTAEntity> ConsTipoCuenta(Integer Bandera) {
        try {
            StoredProcedureQuery tpoCuenta = repositorio.createNamedStoredProcedureQuery("Agro_Select_AGRO_TIPO_CUENTA");
            tpoCuenta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoCuenta.setParameter("Bandera", Bandera);
            return tpoCuenta.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
