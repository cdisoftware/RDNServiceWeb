package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtableroEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtableroService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtableroServiceImplementacion implements CtableroService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CtableroEntity> ConsultaCTablero(Integer Bandera, Integer UsucodigTrans, Integer IdConductor, Integer IdPlataforma) {
        try {
            StoredProcedureQuery tablero = repositorio.createNamedStoredProcedureQuery("paC_tablero");
            tablero.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tablero.registerStoredProcedureParameter("UsucodigTrans", Integer.class, ParameterMode.IN);
            tablero.registerStoredProcedureParameter("IdConductor", Integer.class, ParameterMode.IN);
            tablero.registerStoredProcedureParameter("IdPlataforma", Integer.class, ParameterMode.IN);
            tablero.setParameter("Bandera", Bandera);
            tablero.setParameter("UsucodigTrans", UsucodigTrans);
            tablero.setParameter("IdConductor", IdConductor);
            tablero.setParameter("IdPlataforma", IdPlataforma);
            return tablero.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
