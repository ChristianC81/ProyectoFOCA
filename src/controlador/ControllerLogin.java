/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.persistence.PersistenceException;
import modelo.PersonaJpaController;
import modelo.Usuario;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerLogin {

    ViewLogin vistaL;
    ManagerFactory manager;
    UsuarioJpaController modelo;
    Usuario usuario;
    ViewAdministrador vista = new ViewAdministrador();

    public ControllerLogin(ViewLogin vistaL, ManagerFactory manager, UsuarioJpaController modelo) {
        this.vistaL = vistaL;
        this.manager = manager;
        this.modelo = modelo;
        this.vistaL.setLocationRelativeTo(null);
        this.vistaL.setVisible(true);
        iniciaControl();
    }

    public void iniciaControl() {
        vistaL.getBtnIniciar().addActionListener(le -> controlLogin());
        vistaL.getBtnSalir().addActionListener(ls -> salirLogin());
        txtAyuda();
        verPass();
    }

    public void controlLogin() {
        if (validarCampos() == true) {
            try {
                DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
                String usuario = vistaL.getTxtusuario().getText();
                String contrasenia = new String(vistaL.getTxtPass().getPassword());
                System.out.println(usuario + "" + contrasenia);
                Usuario user = modelo.buscarUsuario(usuario, contrasenia);

                System.out.println(user.getIdrol().getNombrerol());
                if (user != null) {
                    if (user.getIdrol().getNombrerol().equals("Administrador")) {
                        new ControllerAdministrador(vista, manager, new PersonaJpaController(manager.getEmf()));
                        Resouces.success("!BIENVENIDO!", "Administrador: " + user.getIdpersona().getNombresper());
                       sendCorreo(user.getIdrol().getNombrerol(), user.getIdpersona().getNombresper().concat(" " + user.getIdpersona().getApellidosper()), user.getIdpersona().getCorreoper());
                        vistaL.dispose();
                    } else {
                        if (user.getIdrol().getNombrerol().equals("Jefe")) {
                            new ControllerJefe(vista, manager, new PersonaJpaController(manager.getEmf()));
                            Resouces.success("!BIENVENIDO!", "Jefe: " + user.getIdpersona().getNombresper());
                            sendCorreo(user.getIdrol().getNombrerol(), user.getIdpersona().getNombresper().concat(" " + user.getIdpersona().getApellidosper()), user.getIdpersona().getCorreoper());
                            vistaL.dispose();
                        } else {
                            if (user.getIdrol().getNombrerol().equals("Asistente")) {
                                new ControllerAsistente(vista, manager, new PersonaJpaController(manager.getEmf()));
                                Resouces.success("!BIENVENIDO!", "Asistente: " + user.getIdpersona().getNombresper());
                                    sendCorreo(user.getIdrol().getNombrerol(), user.getIdpersona().getNombresper().concat(" " + user.getIdpersona().getApellidosper()), user.getIdpersona().getCorreoper());
                                vistaL.dispose();
                            }
                        }
                    }
                } else {
                    Resouces.error("Usuario Incorrecto", "Ingrese correctamente sus credenciales :D");
                }

            } catch (NullPointerException ex) {
                Resouces.error("Usuario Incorrecto", "Ingrese correctamente sus credenciales :D");
            } catch (PersistenceException e) {
                Resouces.error("Base de Datos desconectada D:", "Contactese con el Administrador");
                System.out.println(e.getMessage());
            }
        }
    }

    public void salirLogin() {
        System.exit(0);
    }
    
    public void limpiarLogin() {
        vistaL.getTxtusuario().setText("");
        vistaL.getTxtPass().setText("");
    }

    public boolean validarCampos() {
        if (!vistaL.getTxtusuario().getText().isEmpty()) {
            if (!vistaL.getTxtPass().getText().isEmpty()) {
                return true;
            } else {
                Resouces.warning("Campos Vacios", "Es necesario llenar la contraseña");
                return false;
            }
        } else {
            Resouces.warning("Campos Vacios", "Es necesario llenar el nombre de usuario");
            return false;
        }
    }

    private void verPass() {

        MouseListener lmouse = new MouseListener() {
            char i;

            @Override
            public void mouseClicked(MouseEvent e) {
                vistaL.getTxtPass().setEchoChar(i);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                i = vistaL.getTxtPass().getEchoChar();
                vistaL.getTxtPass().setEchoChar((char) 0);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        vistaL.getLblVerClave().addMouseListener(lmouse);
    }

    public void txtAyuda() {
        TextPrompt nombreUsu = new TextPrompt("admin", vistaL.getTxtusuario());
        TextPrompt claveUsu = new TextPrompt("*********", vistaL.getTxtPass());
    }

    private void sendCorreo(String rol, String nom_ape, String correo_recp) {
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        try {
            Properties prop = new Properties();
            prop.setProperty("mail.smtp.host", "smtp.gmail.com");
            prop.setProperty("mail.smtp.starttls.enable", "true");
            prop.setProperty("mail.smtp.port", "587");
            prop.setProperty("mail.smtp.auth", "true");
            // 1, crea una sesión
            Session session = Session.getInstance(prop);
            // Habilite el modo de depuración de la sesión, para que pueda verificar el estado de ejecución del programa que envía el correo electrónico
            session.setDebug(true);
            String correo_emisor = "oacorg3@gmail.com";
            String clave = "woehkfcovpwwigrl";

            String asunto = "Notificacion de Ingreso";
            String mensaje = "Hola! " + nom_ape + "\nNuevo Ingreso al Sistema de Gestion OAC como " + rol + " \n"
                    + "Fecha de Acceso: " + dtf4.format(LocalDateTime.now());
            String mensajehtml = "Hola! " + nom_ape + "<br>Nuevo Ingreso al Sistema de Gestion OAC como " + rol + " <br> Fecha de Acceso: " + dtf4.format(LocalDateTime.now())
                    + "<br>"
                    + "<img src=\"C:/Users/chris/Documents/NetBeansProjects/ProyectoFOCA/src/images/Logo.png\" >"
                    + "<br>"
                    + "<i>Prueba de Mensaje </i>";
            BodyPart texto = new MimeBodyPart();
            texto.setContent(mensajehtml, "text/html");

            BodyPart imagen = new MimeBodyPart();
            imagen.setDataHandler(new DataHandler(new FileDataSource("C:\\Users\\chris\\Documents\\NetBeansProjects\\ProyectoFOCA\\src\\images\\Logo.png")));
            imagen.setFileName("Logo.png");
            MimeMultipart partes = new MimeMultipart();
            partes.addBodyPart(texto);
            partes.addBodyPart(imagen);

            // Crear correo
            MimeMessage message = new MimeMessage(session);
            // Establecer información básica de correo electrónico
            // remitente
            message.setFrom(new InternetAddress(correo_emisor));
            // Destinatario
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo_recp));
            // Encabezado de correo
            message.setSubject(asunto);
            message.setContent(partes);

            // 2, obtener el objeto de transporte a través de la sesión
            Transport ts = session.getTransport("smtp");
            // 3. Conéctese al servidor de correo, y el remitente debe proporcionar el nombre de usuario y la contraseña del buzón para la verificación
            ts.connect(correo_emisor, clave);
            // 4. enviar correo
            ts.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            ts.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
