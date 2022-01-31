package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoSeleccionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoSeleccionPaisEntity;
import com.cdi.com.CorferiasRuedaNegocios.Repository.TtTipoSeleccionPaisRepository;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtTipoSeleccionPaisService;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TtTipoSeleccionPaisServiceImplementacion implements TtTipoSeleccionPaisService {

    @Autowired
    private TtTipoSeleccionPaisRepository repository;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<TtTipoSeleccionPaisEntity> listar() {
        try {
            return repository.findAll();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio TtTipoSeleccionPais");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;

        }
    }

}
