package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COfertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Services.COfertasNuevasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COfertasNuevasServiceImplementacion implements COfertasNuevasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<COfertasNuevasEntity> ConsultaOfertasNuevas(COfertasNuevasEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_OfertasNuevas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cnctivoOferta", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_prdcto", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("DescripcionProducto", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cndcion", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_tmno", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_EMPAQUE", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_RGION", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_MNCPIO", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("usucodig", entidad.getUsuCodig());
            tpoDoc.setParameter("cnctivoOferta", cnctivoOferta);
            tpoDoc.setParameter("id_prdcto", id_prdcto);
            tpoDoc.setParameter("Producto", entidad.getProducto());
            tpoDoc.setParameter("DescripcionProducto", entidad.getDescripcionProducto());
            tpoDoc.setParameter("cd_cndcion", entidad.getCd_cndcion());
            tpoDoc.setParameter("cd_tmno", entidad.getCd_tmno());
            tpoDoc.setParameter("ID_EMPAQUE", entidad.getID_EMPAQUE());
            tpoDoc.setParameter("CD_RGION", entidad.getCD_RGION());
            tpoDoc.setParameter("CD_MNCPIO", entidad.getCD_MNCPIO());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
