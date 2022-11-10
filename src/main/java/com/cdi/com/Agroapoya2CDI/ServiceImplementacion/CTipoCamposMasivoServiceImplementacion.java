package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoCamposMasivoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCamposMasivoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoCamposMasivoServiceImplementacion implements CTipoCamposMasivoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoCamposMasivoEntity> ConsultaTipoCamposMasivos(Integer Bandera) {
        try {
            StoredProcedureQuery campMasivo = repositorio.createNamedStoredProcedureQuery("paC_TipoCamposMasivo");
            campMasivo.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            campMasivo.setParameter("Bandera", Bandera);
            return campMasivo.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
