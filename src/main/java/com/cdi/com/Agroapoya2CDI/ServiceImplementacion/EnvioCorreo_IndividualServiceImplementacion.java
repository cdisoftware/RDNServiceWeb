package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.DocuEnvioCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreo_IndividualService;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
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
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EnvioCorreo_IndividualServiceImplementacion implements EnvioCorreo_IndividualService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    public TemplateEngine templateEngine;

    Integer codigoproceso;
    String Respuesta;
    String asunto;
    String destinatario;
    String contenido;
    String imagenencabezado;
    String imagenpiepagina;

    @Override
    public String EnvioCorreoIndividual(Integer bandera, Integer IdPlantilla, Integer usucodig, String correoPersona, Integer Cd_cnctvo) {

        Map<String, Object> mapMessage = new HashMap<>();
        try {
            Context context = new Context();
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paC_EnvioCorreo_Individual");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("correoPersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Cd_cnctvo", Integer.class, ParameterMode.IN);

            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPlantilla", IdPlantilla);
            rolconsola.setParameter("usucodig", usucodig);
            rolconsola.setParameter("correoPersona", correoPersona);
            rolconsola.setParameter("Cd_cnctvo", Cd_cnctvo);

            rolconsola.getResultList();
            List<EnvioCorreo_IndividualEntity> cuerpocorreo = rolconsola.getResultList();

            String[] rem = new String[cuerpocorreo.size()];
            for (int i = 0; i < cuerpocorreo.size(); i++) {
                imagenencabezado = rem[i] = cuerpocorreo.get(i).getImagenEnc();
                asunto = rem[i] = cuerpocorreo.get(i).getAsunto();
                destinatario = rem[i] = cuerpocorreo.get(i).getEmail();
                contenido = rem[i] = cuerpocorreo.get(i).getHtml();
                imagenpiepagina = rem[i] = cuerpocorreo.get(i).getImagenPie();

                context.setVariable("imagenencabezado", imagenencabezado);
                context.setVariable("destinatario", destinatario);
                context.setVariable("asunto", asunto);
                context.setVariable("contenido", contenido);
                context.setVariable("imagenpiepagina", imagenpiepagina);

            }
            String content = templateEngine.process("EnvioCorreos", context);
            mapMessage.put("subject", asunto);
            mapMessage.put("content", content);
            sendMessage(mapMessage, bandera, IdPlantilla, usucodig, correoPersona, Cd_cnctvo);
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");

        } catch (Exception e) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia || EnvioCorreoIndividual");
        }
        return Respuesta;
    }

    public void sendMessage(Map<String, Object> mapMessage, Integer bandera, Integer IdPlantilla, Integer usucodig,
            String correoPersona, Integer Cd_cnctvo) throws Exception {
        try {
            String correoremitente = null;
            String servicePath = null;
            String contrasena = null;

            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");
            remitente.getResultList();
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
            Message message = createMixedMail(session, mapMessage, correoremitente, bandera, IdPlantilla, usucodig);
            //enviar correo electrónico 
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();

        } catch (Exception ex) {

        }
    }

    public MimeMessage createMixedMail(Session session, Map<String, Object> mapMessage,
            String correoremitente, Integer bandera, Integer IdPlantilla, Integer usucodig) throws Exception {

        MimeMessage message = new MimeMessage(session);

        try {
            // Establecer la información básica del correo
            message.setFrom(new InternetAddress(correoremitente));
            message.setRecipients(Message.RecipientType.TO, destinatario);
            message.setSubject(mapMessage.get("subject").toString());

            StoredProcedureQuery adjuntos = repositorio.createNamedStoredProcedureQuery("paC_DocuEnvioCorreo");
            adjuntos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            adjuntos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            adjuntos.setParameter("Bandera", bandera);
            adjuntos.setParameter("IdPlantilla", IdPlantilla);
            adjuntos.getResultList();

            List<DocuEnvioCorreoEntity> documentos = adjuntos.getResultList();

            MimeBodyPart text = new MimeBodyPart();
            text.setContent(mapMessage.get("content"), "text/html;charset=UTF-8");
            MimeMultipart mp1 = new MimeMultipart();
            mp1.addBodyPart(text);
            MimeMultipart mp2 = new MimeMultipart();

            String[] rem = new String[documentos.size()];

            for (int h = 0; h < documentos.size(); h++) {
                String path = rem[h] = documentos.get(h).getRutaDocumento();

                InputStream st = new URL(path).openStream();
                URL url = new URL(path);
                File f = new File(URLDecoder.decode(url.getFile(), "UTF-8"));
                Files.copy(st,
                        Paths.get("C:\\SERV_CORREOS_AGROAPOYA2\\temp" + f),
                        StandardCopyOption.REPLACE_EXISTING);

                if (path != null && !"".equals(path)) {
                    String[] imgStrs = path.split(",");
                    for (int i = 0; i < imgStrs.length; i++) {

                        MimeBodyPart attach = new MimeBodyPart();
                        DataHandler dh = new DataHandler(new FileDataSource("C:\\SERV_CORREOS_AGROAPOYA2\\temp" + f));
                        attach.setDataHandler(dh);
                        attach.setFileName(dh.getName());
                        mp1.setSubType("related");
                        mp2.addBodyPart(attach);
                    }
                }
            }
            MimeBodyPart content = new MimeBodyPart();
            content.setContent(mp1);
            mp2.addBodyPart(content);
            mp2.setSubType("mixed");
            message.setContent(mp2);
            message.saveChanges();
        } catch (Exception ex) {

        }
        return message;
    }
}
