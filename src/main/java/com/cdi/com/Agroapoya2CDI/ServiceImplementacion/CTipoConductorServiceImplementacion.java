package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoConductorEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoConductorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoConductorServiceImplementacion implements CTipoConductorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoConductorEntity> ConsultaCTipoConductor(Integer Bandera, Integer UsucodigTrans) {
        try {
            StoredProcedureQuery tipConduct = repositorio.createNamedStoredProcedureQuery("paC_TipoConductor");
            tipConduct.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipConduct.registerStoredProcedureParameter("UsucodigTrans", Integer.class, ParameterMode.IN);
            tipConduct.setParameter("Bandera", Bandera);
            tipConduct.setParameter("UsucodigTrans", UsucodigTrans);
            return tipConduct.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
