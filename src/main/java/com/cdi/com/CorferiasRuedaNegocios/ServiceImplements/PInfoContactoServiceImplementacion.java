package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Comun.clsEncriptacion;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PInfoContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PInfoContactoService;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PInfoContactoServiceImplementacion implements PInfoContactoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaInfoContacto(PInfoContactoEntity entidad) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("PaPInfoContacto");
            permisos.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Acceso", String.class, ParameterMode.IN);
            permisos.setParameter("Email", entidad.getEmail());
            permisos.setParameter("Acceso", clsEncriptacion.Encriptar(entidad.getContrasena()));
            List<PInfoContactoEntity> con = permisos.getResultList();

            String ResFinal;
            String NoIdentificacion = null;
            String IdIdentificacion = null;
            String NombreCompleto = null;
            String Email = null;
            String Contrasena = null;
            String IdContacto = null;
            String IdParticipante = null;

            String[] terminos = new String[con.size()];
            for (int i = 0; i < con.size(); i++) {
                NoIdentificacion = con.get(i).getNoIdentificacion().toString();
                IdIdentificacion = con.get(i).getIdIdentificacion().toString();
                NombreCompleto = con.get(i).getNombreCompleto();
                Email = con.get(i).getEmail();
                Contrasena = clsEncriptacion.Desencriptar(con.get(i).getContrasena());
                IdContacto = con.get(i).getIdContacto().toString();
                IdParticipante = con.get(i).getIdParticipante().toString();
            }
            ResFinal
                    = "[{\"NoIdentificacion\":\"" + NoIdentificacion + "\","
                    + "\"IdIdentificacion\":\"" + IdIdentificacion + "\","
                    + "\"NombreCompleto\":\"" + NombreCompleto + "\","
                    + "\"Email\":\"" + Email + "\","
                    + "\"IdContacto\":\"" + IdContacto + "\","
                    + "\"IdParticipante\":\"" + IdParticipante + "\","
                    + "\"Contrasena\":\"" + Contrasena + "\"}]";
            return ResFinal;

        } catch (BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio PaPInfoContacto");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
