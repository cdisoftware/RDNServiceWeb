package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepRespuestasGeneralEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRepRespuestasGeneralService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRepRespuestasGeneralServiceImplementacion implements CRepRespuestasGeneralService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRepRespuestasGeneralEntity> ConsultaRepRespuestasGen(Integer Bandera, Integer IdEvaluacion, Integer IdContacto, 
            Integer IdRuedaNegocio, String NombreRdn, Integer TipoEva, String Nombreempresa, String Nit, Integer IdTipoPerfil) {
        try {
            StoredProcedureQuery consrespuestagen = repositorio.createNamedStoredProcedureQuery("paCRepRespuestasGeneral");
            consrespuestagen.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("NombreRdn", String.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("TipoEva", Integer.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("Nombreempresa", String.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            consrespuestagen.registerStoredProcedureParameter("IdTipoPerfil", Integer.class, ParameterMode.IN);
            consrespuestagen.setParameter("Bandera", Bandera);
            consrespuestagen.setParameter("IdEvaluacion", IdEvaluacion);
            consrespuestagen.setParameter("IdContacto", IdContacto);
            consrespuestagen.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            consrespuestagen.setParameter("NombreRdn", NombreRdn);
            consrespuestagen.setParameter("TipoEva", TipoEva);
            consrespuestagen.setParameter("Nombreempresa", Nombreempresa);
            consrespuestagen.setParameter("Nit", Nit);
            consrespuestagen.setParameter("IdTipoPerfil", IdTipoPerfil);
            return consrespuestagen.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRepRespuestasGeneral");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
