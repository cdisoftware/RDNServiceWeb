
package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CConfiguraTipoPerfilEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CConfiguraTipoPerfilService;
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
public class CConfiguraTipoPerfilServiceImplementacion implements CConfiguraTipoPerfilService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CConfiguraTipoPerfilEntity> ConsultaTipoPerfil(Integer bandera, Integer IdRdn, Integer IdTipoPerfil, String Descripcion, String Idioma) {
            try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paCConfiguraTipoPerfil");
            consfiltros.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdTipoPerfil", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consfiltros.setParameter("bandera", bandera);
            consfiltros.setParameter("IdRdn", IdRdn);
            consfiltros.setParameter("IdTipoPerfil", IdTipoPerfil);
            consfiltros.setParameter("Descripcion", Descripcion);
            consfiltros.setParameter("Idioma", Idioma);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCConfiguraTipoPerfil");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
