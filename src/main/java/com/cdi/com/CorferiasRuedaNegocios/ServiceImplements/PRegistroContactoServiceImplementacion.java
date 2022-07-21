package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroContactoService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PRegistroContactoServiceImplementacion implements PRegistroContactoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaRegistroContacto(Integer Bandera, String Idioma, Integer IdContacto) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paPRegistroContacto");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdContacto", IdContacto);
            List<PRegistroContactoEntity> con = permisos.getResultList();

            String ResFinal;
            String IdCon = null;
            String IdParticipante = null;
            String NombreCompleto = null;
            String Email = null;
            String IdIdentificacion = null;
            String NoIdentificacion = null;
            String Telefono = null;
            String IdGenero = null;
            String IdIdioma = null;
            String Dependencia = null;
            String Contrasena = null;
            String Cargo = null;
            String Firma = null;
            String Emailopc = null;

            String[] terminos = new String[con.size()];
            for (int i = 0; i < con.size(); i++) {
                IdCon = con.get(i).getIdContacto().toString();
                IdParticipante = con.get(i).getIdParticipante().toString();
                NombreCompleto = con.get(i).getNombreCompleto();
                Email = con.get(i).getEmail();
                IdIdentificacion = con.get(i).getIdIdentificacion().toString();
                NoIdentificacion = con.get(i).getNoIdentificacion();
                Telefono = con.get(i).getTelefono();
                IdGenero = con.get(i).getIdGenero().toString();
                IdIdioma = con.get(i).getIdIdioma().toString();
                Dependencia = con.get(i).getDependencia();
                Contrasena = con.get(i).getContrasena();
                Cargo = con.get(i).getCargo();
                Firma = con.get(i).getFirma();
                Emailopc = con.get(i).getEmailopc();
            }

            ResFinal
                    = "[{\"IdContacto\":\"" + IdCon + "\","
                    + "\"IdParticipante\":\"" + IdParticipante + "\","
                    + "\"NombreCompleto\":\"" + NombreCompleto + "\","
                    + "\"Email\":\"" + Email + "\","
                    + "\"IdIdentificacion\":\"" + IdIdentificacion + "\","
                    + "\"NoIdentificacion\":\"" + NoIdentificacion + "\","
                    + "\"Telefono\":\"" + Telefono + "\","
                    + "\"IdGenero\":\"" + IdGenero + "\","
                    + "\"IdIdioma\":\"" + IdIdioma + "\","
                    + "\"Dependencia\":\"" + Dependencia + "\","
                    + "\"Contrasena\":\"" + Contrasena + "\","
                    + "\"Firma\":\"" + Firma + "\","
                    + "\"Emailopc\":\"" + Emailopc + "\","
                    + "\"Cargo\":\"" + Cargo + "\"}]";

            return ResFinal;
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRegistroContacto");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String InsertarRegistroContacto(PRegistroContactoModEntity entidad, Integer Bandera, Integer IdUsuario, Integer IdRuedaNegocio) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRegistroContactoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nombres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdIdentificacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdGenero", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdIdioma", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Cargo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Dependencia", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Contrasena", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Firma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailOpc", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FirmaBit", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);

            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdContacto", entidad.getIdContacto());
            rolconsola.setParameter("Nombres", entidad.getNombreCompleto());
            rolconsola.setParameter("Email", entidad.getEmail());
            rolconsola.setParameter("IdIdentificacion", entidad.getIdIdentificacion());
            rolconsola.setParameter("NoIdentificacion", entidad.getNoIdentificacion());
            rolconsola.setParameter("Telefono", entidad.getTelefono());
            rolconsola.setParameter("IdGenero", entidad.getIdGenero());
            rolconsola.setParameter("IdIdioma", entidad.getIdIdioma());
            rolconsola.setParameter("Cargo", entidad.getCargo());
            rolconsola.setParameter("Dependencia", entidad.getDependencia());
            rolconsola.setParameter("Contrasena", entidad.getContrasena());
            rolconsola.setParameter("Firma", entidad.getFirma());
            rolconsola.setParameter("EmailOpc", entidad.getEmailOpc());
            rolconsola.setParameter("FirmaBit", entidad.getFirmaBit());
            rolconsola.setParameter("IdRuedaNegocio", IdRuedaNegocio);

            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRegistroContactoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRegistroContacto(PRegistroContactoModEntity entidad, Integer Bandera, Integer IdUsuario, Integer IdRuedaNegocio) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRegistroContactoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nombres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdIdentificacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdGenero", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdIdioma", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Cargo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Dependencia", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Contrasena", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Firma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailOpc", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FirmaBit", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);

            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdContacto", entidad.getIdContacto());
            rolconsola.setParameter("Nombres", entidad.getNombreCompleto());
            rolconsola.setParameter("Email", entidad.getEmail());
            rolconsola.setParameter("IdIdentificacion", entidad.getIdIdentificacion());
            rolconsola.setParameter("NoIdentificacion", entidad.getNoIdentificacion());
            rolconsola.setParameter("Telefono", entidad.getTelefono());
            rolconsola.setParameter("IdGenero", entidad.getIdGenero());
            rolconsola.setParameter("IdIdioma", entidad.getIdIdioma());
            rolconsola.setParameter("Cargo", entidad.getCargo());
            rolconsola.setParameter("Dependencia", entidad.getDependencia());
            rolconsola.setParameter("Contrasena", entidad.getContrasena());
            rolconsola.setParameter("Firma", entidad.getFirma());
            rolconsola.setParameter("EmailOpc", entidad.getEmailOpc());
            rolconsola.setParameter("FirmaBit", entidad.getFirmaBit());
            rolconsola.setParameter("IdRuedaNegocio", IdRuedaNegocio);

            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRegistroContactoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
