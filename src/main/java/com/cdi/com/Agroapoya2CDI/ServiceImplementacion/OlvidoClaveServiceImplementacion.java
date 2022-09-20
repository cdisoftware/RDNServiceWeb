package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.EmailEntity;
import com.cdi.com.Agroapoya2CDI.Services.OlvidoClaveService;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

    private String constructHTMLTemplate() {
        Context context = new Context();
        context.setVariable("sampleText", "My text sample here");
        return templateEngine.process("CorreoVerificacion", context);
    }

    private String sendEmailTool(String email, String subject, String codigo, String fecha) throws Exception {
        try {
            if (!"Usuario no existe".equals(codigo)) {
                MimeMessage message = sender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED, "UTF-8");
                Context context = new Context();
                context.setVariable("codigo", codigo);

                String processedHTMLTemplate = this.constructHTMLTemplate();
                try {

                    helper.setFrom("agroapoya2@cdi.com.co");
                    helper.setTo(email);
                    helper.setSubject(subject);
                    helper.setText(processedHTMLTemplate, true);

                    sender.send(message);
                    return "[{\"codigo\":\"" + codigo + "\",\"fecha\":\"" + fecha + "\"}]";

                } catch (Exception e) {
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
