package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CParticipanteService;
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
public class CParticipanteServiceImplementacion implements CParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CParticipanteEntity> ConsultaCParticipante(CParticipanteEntity entidad, 
            Integer Bandera, Integer IdRueda, String NombreRueda, String NoIdentificacion, 
            Integer TipoPerfil, Integer Estado, String Participante,Integer IdPais, String Departamento, String Ciudad, String NombreContacto) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCParticipante");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreRueda", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Participante", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaRegistro", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Departamento", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Ciudad", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreContacto", String.class, ParameterMode.IN);
            
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("NombreRueda", NombreRueda);
            permisos.setParameter("NoIdentificacion", NoIdentificacion);
            permisos.setParameter("TipoPerfil", TipoPerfil);
            permisos.setParameter("Estado", Estado);
            permisos.setParameter("Participante", Participante);
            permisos.setParameter("FechaRegistro", entidad.getFechaRegistro());
            permisos.setParameter("IdPais", IdPais);
            permisos.setParameter("Departamento", Departamento);
            permisos.setParameter("Ciudad", Ciudad);
            permisos.setParameter("NombreContacto", NombreContacto);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
