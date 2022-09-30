package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CUnidadesDisponiblesEntity;
import com.cdi.com.Agroapoya2CDI.Services.CUnidadesDisponiblesService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUnidadesDisponiblesServiceImplementacion implements CUnidadesDisponiblesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CUnidadesDisponiblesEntity> ConsultaCUnidadesDisponibles(Integer Bandera, Integer Usucodig, Integer Cd_csctvo, Integer Id_Sector) {
        try {
            StoredProcedureQuery unidisp = repositorio.createNamedStoredProcedureQuery("paC_UnidadesDisponibles");
            unidisp.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            unidisp.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            unidisp.registerStoredProcedureParameter("Cd_csctvo", Integer.class, ParameterMode.IN);
            unidisp.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);

            unidisp.setParameter("Bandera", Bandera);
            unidisp.setParameter("Usucodig", Usucodig);
            unidisp.setParameter("Cd_csctvo", Cd_csctvo);
            unidisp.setParameter("Id_Sector", Id_Sector);

            return unidisp.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
