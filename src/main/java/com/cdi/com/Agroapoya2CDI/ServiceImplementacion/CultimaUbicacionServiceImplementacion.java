package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CultimaUbicacionEntity;
import com.cdi.com.Agroapoya2CDI.Services.CultimaUbicacionService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CultimaUbicacionServiceImplementacion implements CultimaUbicacionService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CultimaUbicacionEntity> ConsultaUltimaUbicacion(Integer bandera,
            Integer cd_cnscutivo, Integer idConductor, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ultimaUbicacion");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnscutivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idConductor", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("cd_cnscutivo", cd_cnscutivo);
            tpoDoc.setParameter("idConductor", idConductor);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
