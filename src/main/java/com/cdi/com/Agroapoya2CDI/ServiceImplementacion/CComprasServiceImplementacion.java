package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CComprasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CComprasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CComprasServiceImplementacion implements CComprasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CComprasEntity> ConsultaCCompras(Integer Bandera, Integer Usucodig, Integer Cd_cnsctivo, Integer Id_cliente) {
        try {
            StoredProcedureQuery compras = repositorio.createNamedStoredProcedureQuery("paC_Compras");
            compras.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            compras.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            compras.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            compras.registerStoredProcedureParameter("Id_cliente", Integer.class, ParameterMode.IN);

            compras.setParameter("Bandera", Bandera);
            compras.setParameter("Usucodig", Usucodig);
            compras.setParameter("Cd_cnsctivo", Cd_cnsctivo);
            compras.setParameter("Id_cliente", Id_cliente);

            return compras.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
