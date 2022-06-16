package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.MV_MLTLSTAS_RGSTROEntity;
import com.cdi.com.Agroapoya2CDI.Services.MV_MLTLSTAS_RGSTROService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class MV_MLTLSTAS_RGSTROServiceImplementacion implements MV_MLTLSTAS_RGSTROService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<MV_MLTLSTAS_RGSTROEntity> ConsultaMLTLSTASRGTRO(Integer Bandera) {
        try {
            StoredProcedureQuery consmltrgtro = repositorio.createNamedStoredProcedureQuery("MV_MLTLSTAS_RGSTRO");
            consmltrgtro.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consmltrgtro.setParameter("Bandera", Bandera);
            return consmltrgtro.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
