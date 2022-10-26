package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CListadoToppingEntity;
import com.cdi.com.Agroapoya2CDI.Services.CListadoToppingService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CListadoToppingServiceImplementacion implements CListadoToppingService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CListadoToppingEntity> ConsultaCListadoTopping(Integer Bandera, Integer Id_Sector, Integer cd_cnctivo) {
        try {
            StoredProcedureQuery lisTopping = repositorio.createNamedStoredProcedureQuery("paC_ListadoTopping");
            lisTopping.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            lisTopping.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            lisTopping.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);

            lisTopping.setParameter("Bandera", Bandera);
            lisTopping.setParameter("Id_Sector", Id_Sector);
            lisTopping.setParameter("cd_cnctivo", cd_cnctivo);

            return lisTopping.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
