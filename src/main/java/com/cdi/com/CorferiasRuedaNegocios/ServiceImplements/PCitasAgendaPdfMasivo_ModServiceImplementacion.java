package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PCitasAgendaPdfMasivo_ModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCitasAgendaPdfMasivo_ModService;
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
public class PCitasAgendaPdfMasivo_ModServiceImplementacion implements PCitasAgendaPdfMasivo_ModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaPCitasAgdaPDFMasivo(Integer Bandera, Integer IdRuedaNegocio, Integer IdPerfil) {
        try {
            StoredProcedureQuery insertCitaspdf = repositorio.createNamedStoredProcedureQuery("paPCitasAgendaPdfMasivo_Mod");
            insertCitaspdf.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertCitaspdf.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            insertCitaspdf.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            insertCitaspdf.setParameter("Bandera", Bandera);
            insertCitaspdf.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            insertCitaspdf.setParameter("IdPerfil", IdPerfil);
            insertCitaspdf.execute();
            return JSONObject.quote((String) insertCitaspdf.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPCitasAgendaPdfMasivo_Mod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
