package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoTransporEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoTransporService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoTransporServiceImplementacion implements CTipoTransporService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoTransporEntity> ConsultaCTipoTranspor(Integer Bandera) {
        try {
            StoredProcedureQuery tipTrans = repositorio.createNamedStoredProcedureQuery("paC_TipoTranspor");
            tipTrans.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipTrans.setParameter("Bandera", Bandera);
            return tipTrans.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
