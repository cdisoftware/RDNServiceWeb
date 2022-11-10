package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TSubMenuEntity;
import com.cdi.com.Agroapoya2CDI.Services.TSubMenuService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TSubMenuServiceImplementacion implements TSubMenuService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TSubMenuEntity> ConsultaTSubMenu(Integer Bandera, Integer IdTipoUsuario, Integer Usucodig) {
        try {
            StoredProcedureQuery subMenu = repositorio.createNamedStoredProcedureQuery("paT_SubMenu");
            subMenu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            subMenu.registerStoredProcedureParameter("IdTipoUsuario", Integer.class, ParameterMode.IN);
            subMenu.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            subMenu.setParameter("Bandera", Bandera);
            subMenu.setParameter("IdTipoUsuario", IdTipoUsuario);
            subMenu.setParameter("Usucodig", Usucodig);

            return subMenu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
