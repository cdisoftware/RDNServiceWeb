package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Services.AOfertasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AOfertasServiceImplementacion implements AOfertasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<AOfertasEntity> ConsultaAOfertas(AOfertasEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto, Integer idProductor) {
        try {
            StoredProcedureQuery cons = repositorio.createNamedStoredProcedureQuery("paA_Ofertas");
            cons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("cnctivoOferta", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("id_prdcto", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("idProductor", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("Productor", String.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("DescripcionProducto", String.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("cd_cndcion", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("cd_tmno", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("ID_EMPAQUE", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("VigenciaDesde", String.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("VigenciaHasta", String.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("IdEstado_Oferta", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("CD_RGION", Integer.class, ParameterMode.IN);
            cons.registerStoredProcedureParameter("CD_MNCPIO", Integer.class, ParameterMode.IN);

            cons.setParameter("Bandera", Bandera);
            cons.setParameter("usucodig", entidad.getUsuCodig());
            cons.setParameter("cnctivoOferta", cnctivoOferta);
            cons.setParameter("id_prdcto", id_prdcto);
            cons.setParameter("Producto", entidad.getProducto());
            cons.setParameter("idProductor", idProductor);
            cons.setParameter("Productor", entidad.getNombreCompletoProductor());
            cons.setParameter("DescripcionProducto", entidad.getDescripcionProducto());
            cons.setParameter("cd_cndcion", entidad.getCd_cndcion());
            cons.setParameter("cd_tmno", entidad.getCd_tmno());
            cons.setParameter("ID_EMPAQUE", entidad.getID_EMPAQUE());
            cons.setParameter("VigenciaDesde", entidad.getVigenciaDesde());
            cons.setParameter("VigenciaHasta", entidad.getVigenciaHasta());
            cons.setParameter("IdEstado_Oferta", entidad.getIdEstado_Oferta());
            cons.setParameter("CD_RGION", entidad.getCD_RGION());
            cons.setParameter("CD_MNCPIO", entidad.getCD_MNCPIO());

            return cons.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
