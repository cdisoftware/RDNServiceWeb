package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CVisualizaParticipanteService;
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
public class CVisualizaParticipanteServiceImplementacion implements CVisualizaParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List ConsultaVisualizaParticipante(Integer Bandera,
            Integer IdRueda, Integer Vigencia, String Participante, Integer IdPais,
            String Departamento, String Ciudad, Integer TipoPerfil, Integer Estado,
            Integer Sector, Integer Categoria, Integer Subcategoria, String Nit) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCVisualizaParticipante");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Vigencia", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Participante", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Departamento", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Ciudad", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Sector", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Categoria", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Subcategoria", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("Vigencia", Vigencia);
            permisos.setParameter("Participante", Participante);
            permisos.setParameter("IdPais", IdPais);
            permisos.setParameter("Departamento", Departamento);
            permisos.setParameter("Ciudad", Ciudad);
            permisos.setParameter("TipoPerfil", TipoPerfil);
            permisos.setParameter("Estado", Estado);
            permisos.setParameter("Sector", Sector);
            permisos.setParameter("Categoria", Categoria);
            permisos.setParameter("Subcategoria", Subcategoria);
            permisos.setParameter("Nit", Nit);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCVisualizaParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
