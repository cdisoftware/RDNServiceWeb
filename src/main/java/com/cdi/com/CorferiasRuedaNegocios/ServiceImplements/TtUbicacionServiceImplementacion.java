package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.TtUbicacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Repository.TtTipoParticipanteRepository;
import com.cdi.com.CorferiasRuedaNegocios.Repository.TtUbicacionRepository;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.TtUbicacionService;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TtUbicacionServiceImplementacion implements TtUbicacionService {

    @Autowired
    private TtUbicacionRepository repository;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<TtUbicacionEntity> listar() {
        try {
            return repository.findAll();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio TtUbicacion");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;

        }
    }

}
