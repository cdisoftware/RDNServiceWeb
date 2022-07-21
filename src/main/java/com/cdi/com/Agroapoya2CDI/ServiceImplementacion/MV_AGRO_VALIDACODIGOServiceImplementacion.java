package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.MV_AGRO_VALIDACODIGOEntity;
import com.cdi.com.Agroapoya2CDI.Services.MV_AGRO_VALIDACODIGOService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class MV_AGRO_VALIDACODIGOServiceImplementacion implements MV_AGRO_VALIDACODIGOService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<MV_AGRO_VALIDACODIGOEntity> ConsultaAgroValidaCod(Integer BANDERA, Integer CODIGO, String CODIGODOS, Integer UNIDADES) {
        try {
            StoredProcedureQuery valcodig = repositorio.createNamedStoredProcedureQuery("MV_AGRO_VALIDACODIGO");
            valcodig.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            valcodig.registerStoredProcedureParameter("CODIGO", Integer.class, ParameterMode.IN);
            valcodig.registerStoredProcedureParameter("CODIGODOS", String.class, ParameterMode.IN);
            valcodig.registerStoredProcedureParameter("UNIDADES", Integer.class, ParameterMode.IN);
            valcodig.setParameter("BANDERA", BANDERA);
            valcodig.setParameter("CODIGO", CODIGO);
            valcodig.setParameter("CODIGODOS", CODIGODOS);
            valcodig.setParameter("UNIDADES", UNIDADES);
            return valcodig.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
