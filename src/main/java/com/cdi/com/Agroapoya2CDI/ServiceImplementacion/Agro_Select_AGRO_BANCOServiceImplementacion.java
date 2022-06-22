package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Agro_Select_AGRO_BANCOEntity;
import com.cdi.com.Agroapoya2CDI.Services.Agro_Select_AGRO_BANCOService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Agro_Select_AGRO_BANCOServiceImplementacion implements Agro_Select_AGRO_BANCOService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Agro_Select_AGRO_BANCOEntity> ConsBanco(Integer Bandera) {
        try {
            StoredProcedureQuery banco = repositorio.createNamedStoredProcedureQuery("Agro_Select_AGRO_BANCO");
            banco.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            banco.setParameter("Bandera", Bandera);
            return banco.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
