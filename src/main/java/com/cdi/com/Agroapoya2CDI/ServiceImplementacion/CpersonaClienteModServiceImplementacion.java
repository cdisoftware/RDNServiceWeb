package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CpersonaClienteModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaClienteModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CpersonaClienteModServiceImplementacion implements CpersonaClienteModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCPersonaCliente(CpersonaClienteModEntity entidad, Integer bandera, Integer banderaDos) {
        try {
            StoredProcedureQuery modperson = repositorio.createNamedStoredProcedureQuery("paC_personaClienteMod");
            modperson.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("banderaDos", Integer.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("codUsuario", Integer.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("nombres", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("apellido", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("tipo_identificacion", Integer.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("numero_identificacion", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("direccion", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("CMNTRIO", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("TOKEN", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("dpto", Integer.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("ciudad", Integer.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("Complemento_direccion", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("RZON_SCIAL", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("NIT", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("COORDENADAS", String.class, ParameterMode.IN);
            modperson.registerStoredProcedureParameter("TPO_CLNTEINST", Integer.class, ParameterMode.IN);

            modperson.setParameter("bandera", bandera);
            modperson.setParameter("banderaDos", banderaDos);
            modperson.setParameter("codUsuario", entidad.getCodUsuario());
            modperson.setParameter("nombres", entidad.getNombres());
            modperson.setParameter("apellido", entidad.getApellido());
            modperson.setParameter("telefono", entidad.getTelefono());
            modperson.setParameter("correo", entidad.getCorreo());
            modperson.setParameter("tipo_identificacion", entidad.getTipo_identificacion());
            modperson.setParameter("numero_identificacion", entidad.getNumero_identificacion());
            modperson.setParameter("direccion", entidad.getDireccion());
            modperson.setParameter("CMNTRIO", entidad.getCMNTRIO());
            modperson.setParameter("TOKEN", entidad.getTOKEN());
            modperson.setParameter("dpto", entidad.getDpto());
            modperson.setParameter("ciudad", entidad.getCiudad());
            modperson.setParameter("Complemento_direccion", entidad.getComplemento_direccion());
            modperson.setParameter("RZON_SCIAL", entidad.getRZON_SCIAL());
            modperson.setParameter("NIT", entidad.getNIT());
            modperson.setParameter("COORDENADAS", entidad.getCOORDENADAS());
            modperson.setParameter("TPO_CLNTEINST", entidad.getTPO_CLNTEINST());
            modperson.execute();
            return JSONObject.quote((String) modperson.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
