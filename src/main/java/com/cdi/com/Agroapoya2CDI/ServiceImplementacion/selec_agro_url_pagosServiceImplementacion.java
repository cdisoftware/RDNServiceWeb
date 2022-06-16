package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.selec_agro_url_pagosEntity;
import com.cdi.com.Agroapoya2CDI.Services.selec_agro_url_pagosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class selec_agro_url_pagosServiceImplementacion implements selec_agro_url_pagosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<selec_agro_url_pagosEntity> ConsultaAgroURL() {
        try {
            StoredProcedureQuery consurl = repositorio.createNamedStoredProcedureQuery("selec_agro_url_pagos");
            return consurl.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
