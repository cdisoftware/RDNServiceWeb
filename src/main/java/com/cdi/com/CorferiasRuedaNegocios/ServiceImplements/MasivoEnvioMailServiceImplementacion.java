package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Comun.clsEncriptacion;
import com.cdi.com.CorferiasRuedaNegocios.Services.EnvioMailService;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CMasivoEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelDocEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CusuariosEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import java.io.File;
import java.io.IOException;
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
import javax.mail.MessagingException;
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
public class MasivoEnvioMailServiceImplementacion implements EnvioMailService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private LogConsolaService service;

    Integer codigoproceso;
    String Respuesta;
    String asunto;
    String destinatario;
    String contenido;
    String imagenencabezado;
    String imagenpiepagina;
    Integer IdPlantilla;

    @Override
    public String EnviarCorreo(Integer bandera, String Idioma, Integer IdEnvioCorreo) {

        Map<String, Object> mapMessage = new HashMap<>();
        try {
            Context context = new Context();
            StoredProcedureQuery cuerpo = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo_Consulta");
            cuerpo.registerStoredProcedureParameter("CodigoProceso", Integer.class, ParameterMode.IN);
            codigoproceso = IdEnvioCorreo;
            cuerpo.setParameter("CodigoProceso", IdEnvioCorreo);
            cuerpo.getResultList();
            List<CMasivoEnvioCorreoEntity> cuerpocorreo = cuerpo.getResultList();
            
            String[] rem = new String[cuerpocorreo.size()];
            for (int i = 0; i < cuerpocorreo.size(); i++) {
                IdPlantilla = cuerpocorreo.get(i).getIdPlantilla();
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
                
                String content = templateEngine.process("EnvioCorreos", context);
                mapMessage.put("subject", asunto);
                mapMessage.put("content", content);
                sendMessage(mapMessage, bandera, Idioma, IdPlantilla);
            }
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");
        } catch (Exception e) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(e.hashCode()));
            entidadLog.setMensaje(e.getMessage());
            entidadLog.setServicio("Servicio paCEnvioRealCorreo_Consulta");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");

        }
        return Respuesta;
    }

    public void sendMessage(Map<String, Object> mapMessage, Integer bandera, String Idioma, Integer IdPlantilla) throws Exception {

        String correoremitente = null;
        String servicePath = null;
        String contrasena = null;

        try {
            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paCRemitenteCorreo");
            remitente.getResultList();
            List<CusuariosEnvioCorreoEntity> remite = remitente.getResultList();
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
            Message message = createMixedMail(session, mapMessage, correoremitente, bandera, Idioma, IdPlantilla);
            //enviar correo electrónico 
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();
        } catch (Exception e) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(e.hashCode()));
            entidadLog.setMensaje(e.getMessage());
            entidadLog.setServicio("Error Metodo de Propiedades de Correo paCRemitenteCorreo");
            entidadLog.setTipo(4);
            service.InsertaLog(entidadLog);

        }

    }

    public MimeMessage createMixedMail(Session session, Map<String, Object> mapMessage, String correoremitente,
            Integer bandera, String Idioma, Integer IdPlantilla) throws Exception {

        MimeMessage message = new MimeMessage(session);

        try {

            // Establecer la información básica del correo
            message.setFrom(new InternetAddress(correoremitente));

            StoredProcedureQuery cuerpo = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo_Consulta");
            cuerpo.registerStoredProcedureParameter("CodigoProceso", Integer.class, ParameterMode.IN);
            cuerpo.setParameter("CodigoProceso", codigoproceso);
            cuerpo.getResultList();
            List<CMasivoEnvioCorreoEntity> cuerpocorreo = cuerpo.getResultList();

            String[] r = new String[cuerpocorreo.size()];
            String[] ArregloDestinatarios = new String[cuerpocorreo.size()];

            for (int i = 0; i < cuerpocorreo.size(); i++) {
                destinatario = r[i] = cuerpocorreo.get(i).getEmail();
                ArregloDestinatarios[i] = destinatario;
            }

            Address[] tos = new InternetAddress[ArregloDestinatarios.length];
            if (ArregloDestinatarios != null && ArregloDestinatarios.length > 0) {
                for (int j = 0; j < ArregloDestinatarios.length; j++) {
                    tos[j] = new InternetAddress(ArregloDestinatarios[j]);
                }
                message.setRecipients(Message.RecipientType.TO, tos);
            } else {
                tos[0] = new InternetAddress(destinatario);
            }

            Integer idplantilla = cuerpocorreo.get(0).getIdPlantilla();
            message.setSubject(mapMessage.get("subject").toString());

            StoredProcedureQuery adjuntos = repositorio.createNamedStoredProcedureQuery("paCRelDocEnvioCorreo");
            adjuntos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            adjuntos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            adjuntos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            adjuntos.setParameter("Bandera", bandera);
            adjuntos.setParameter("IdPlantilla", IdPlantilla);
            adjuntos.setParameter("Idioma", Idioma);
            adjuntos.getResultList();

            List<CRelDocEnvioCorreoEntity> documentos = adjuntos.getResultList();

            MimeBodyPart text = new MimeBodyPart();
            text.setContent(mapMessage.get("content"), "text/html;charset=UTF-8");
            MimeMultipart mp1 = new MimeMultipart();
            mp1.addBodyPart(text);
            MimeMultipart mp2 = new MimeMultipart();

            String[] rem = new String[documentos.size()];
            for (int h = 0; h < documentos.size(); h++) {
                String path = rem[h] = documentos.get(h).getPath();

                InputStream st = new URL(path).openStream();
                URL url = new URL(path);
                File f = new File(URLDecoder.decode(url.getFile(), "UTF-8"));
                Files.copy(st,
                        Paths.get("C:\\SERVICIOSCORFERIASDEV\\temp" + f),
                        //Paths.get("D:/ImagenesCorferias" + f),
                        StandardCopyOption.REPLACE_EXISTING);

                if (path != null && !"".equals(path)) {
                    String[] imgStrs = path.split(",");
                    for (int i = 0; i < imgStrs.length; i++) {

                        MimeBodyPart attach = new MimeBodyPart();
                        DataHandler dh = new DataHandler(new FileDataSource("C:\\SERVICIOSCORFERIASDEV\\temp" + f));
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

        } catch (IOException | MessagingException ex) {

            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Error en metodo de envio de adjuntos");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
        }
        return message;

    }
}
