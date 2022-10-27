package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteVentasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CReporteVentasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CReporteVentasServiceImplementacion implements CReporteVentasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CReporteVentasEntity> ConsultaCReporteVentas(CReporteVentasEntity entidad, Integer Bandera, Integer ID_CNDCTOR, Integer id_Sector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ReporteVentas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_CNDCTOR", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_Sector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdTpoPago", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdTpoCompra", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdTpoUsuCompra", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdEstdEntrega", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdEstadoPago", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("ID_CNDCTOR", ID_CNDCTOR);
            tpoDoc.setParameter("id_Sector", id_Sector);
            tpoDoc.setParameter("cd_cnctivo", entidad.getCD_CNSCTVO());
            tpoDoc.setParameter("NombrePersona", entidad.getNOMBRES_PERSONA());
            tpoDoc.setParameter("Usucodig", entidad.getUsucodigCliente());
            tpoDoc.setParameter("IdTpoPago", entidad.getTipoPago());
            tpoDoc.setParameter("IdTpoCompra", entidad.getTipo_compra());
            tpoDoc.setParameter("IdTpoUsuCompra", entidad.getTipo_usuarioCompra());
            tpoDoc.setParameter("IdEstdEntrega", entidad.getESTDO());
            tpoDoc.setParameter("IdEstadoPago", entidad.getIdEstdPago());
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
