package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CFormulaPlantillaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFormulaPlantillaService;
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
public class CFormulaPlantillaServiceImplementacion implements CFormulaPlantillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CFormulaPlantillaEntity> ConsultaFormulaPlantilla(Integer bandera, 
            Integer IdPlantilla, Integer IdFormula, String Idioma) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paCFormulaPlantilla");
            consfiltros.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdFormula", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consfiltros.setParameter("bandera", bandera);
            consfiltros.setParameter("IdPlantilla", IdPlantilla);
            consfiltros.setParameter("IdFormula", IdFormula);
            consfiltros.setParameter("Idioma", Idioma);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCFormulaPlantilla");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
