package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCiudadDptoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCiudadDptoService;
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
public class CCiudadDptoServiceImplementacion implements CCiudadDptoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CCiudadDptoEntity> ConsultaCiudadDepto(Integer IdPais, String IdDpto) {
           try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCCiudadDpto");
            consciudadpais.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdDpto", String.class, ParameterMode.IN);
            consciudadpais.setParameter("IdPais", IdPais);
            consciudadpais.setParameter("IdDpto", IdDpto);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCiudadDpto");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
