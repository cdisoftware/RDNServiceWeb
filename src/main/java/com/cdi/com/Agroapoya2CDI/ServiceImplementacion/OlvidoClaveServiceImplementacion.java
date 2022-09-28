package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.EmailEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.OlvidoClaveService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
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
        Map<String, Object> mapMessage = new HashMap<>();
        try {
            StoredProcedureQuery clave = repositorio.createNamedStoredProcedureQuery("paC_OlvidoClave");
            clave.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            clave.setParameter("Correo", emailentity.getEmail());
            clave.execute();
            String codigo = (String) clave.getOutputParameterValue("Respuesta");
            String fecha = (String) clave.getOutputParameterValue("FechaModificacion");
            String subject = "Codigo Agroapoya2";
            sendMessage(mapMessage, emailentity, subject, codigo, fecha);
        } catch (Exception ex) {

            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
        return null;
    }

    public void sendMessage(Map<String, Object> mapMessage, EmailEntity emailentity, String subject, String codigo, String fecha) throws Exception {
        try {
            String correoremitente = null;
            String servicePath = null;
            String contrasena = null;

            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");

            List<RemitenteCorreoEntity> remite = remitente.getResultList();
            String[] rem = new String[remite.size()];
            for (int i = 0; i < remite.size(); i++) {
                correoremitente = rem[i] = remite.get(i).getCorreoRemitente();
                servicePath = rem[i] = remite.get(i).getServicePath();
                contrasena = rem[i] = clsEncriptacion.Desencriptar(remite.get(i).getClave());
            }
            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp"); // usa el protocolo pop3
            props.setProperty("mail.host", servicePath); // servidor pop3
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            // Crear objeto de instancia de sesión
            Session session = Session.getInstance(props);
            session.setDebug(true);
            Transport ts = session.getTransport();
            ts.connect(servicePath, correoremitente, contrasena);
            // Crear correo electrónico
            Message message = sendEmailTool(session, mapMessage, correoremitente, emailentity.getEmail(), subject, codigo, fecha);
            //enviar correo electrónico 
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();

        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public MimeMessage sendEmailTool(Session session, Map<String, Object> mapMessage, String correoremitente,
            String email, String subject, String codigo, String fecha) throws Exception {
        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(correoremitente));
            message.setRecipients(Message.RecipientType.TO, email);
            message.setSubject(subject.toString());

            MimeBodyPart text = new MimeBodyPart();
            text.setContent(mapMessage.get("content"), "text/html;charset=UTF-8");
            MimeMultipart mp1 = new MimeMultipart();
            mp1.addBodyPart(text);
            MimeMultipart mp2 = new MimeMultipart();

            MimeBodyPart content = new MimeBodyPart();
            content.setContent(mp1);
            mp2.addBodyPart(content);
            mp2.setSubType("mixed");
            message.setContent(mp2);
            message.saveChanges();
//            if (!"Usuario no existe".equals(codigo)) {
//
//                MimeMessageHelper helper = new MimeMessageHelper(message);
//                Context context = new Context();
//                context.setVariable("codigo", codigo);
//                String emailContent = templateEngine.process("CorreoVerificacion", context);
//                try {
//
//                    helper.setTo(email);
//                    helper.setText(emailContent, true);
//                    helper.setSubject(subject);
//                    System.out.print("ENTRA 1");
//                    return "[{\"codigo\":\"" + codigo + "\",\"fecha\":\"" + fecha + "\"}]";
//
//                } catch (Exception e) {
//                    System.out.print("ENTRA 3");
//                }
//            } else {
//                return "[{\"resultado\":\"Usuario no existe\"}]";
//            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return message;

    }

}
