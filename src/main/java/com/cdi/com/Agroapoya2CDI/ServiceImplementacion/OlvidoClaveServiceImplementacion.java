package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.EmailEntity;
import com.cdi.com.Agroapoya2CDI.Services.OlvidoClaveService;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class OlvidoClaveServiceImplementacion implements OlvidoClaveService {

    @Autowired
    private JavaMailSender sender;

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private TemplateEngine templateEngine;

    @Override
    public String sendEmail(EmailEntity emailentity) {
        try {
            StoredProcedureQuery clave = repositorio.createNamedStoredProcedureQuery("paC_OlvidoClave");
            clave.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            clave.setParameter("Correo", emailentity.getEmail());
            clave.execute();
            String codigo = (String) clave.getOutputParameterValue("Respuesta");
            String fecha = (String) clave.getOutputParameterValue("FechaModificacion");
            String subject = "Codigo Agroapoya2";
            return sendEmailTool(emailentity.getEmail(), subject, codigo, fecha);
        } catch (Exception ex) {

            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    private String sendEmailTool(String email, String subject, String codigo, String fecha) {
        try {
            if (!"Usuario no existe".equals(codigo)) {
                MimeMessage message = sender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message);
                Context context = new Context();
                context.setVariable("codigo", codigo);
                String emailContent = templateEngine.process("CorreoVerificacion", context);
                try {
                    //System.out.print("entro al try");
                    //configuracion corferias
                    //helper.setFrom("notificacionesapp@corferias.com");
                    helper.setTo(email);
                    helper.setText(emailContent, true);
                    helper.setSubject(subject);
                    sender.send(message);
                    return "[{\"codigo\":\"" + codigo + "\",\"fecha\":\"" + fecha + "\"}]";

                } catch (MessagingException | MailException e) {
                    return ("Error en la Ejecucion, " + e);
                }
            } else {
                return "[{\"resultado\":\"Usuario no existe\"}]";
            }
        } catch (Exception ex) {

            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
