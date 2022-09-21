/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.InicioSistema;
import Vista.InicioSistema;
import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    InicioSistema vistaS = new InicioSistema();
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
        //vistaA.getjButtonAtras().addActionListener(lb -> regresar());
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
                        vistaS.dispose();
                        vistaL.dispose();

                    } else {
                        if (user.getIdrol().getNombrerol().equals("Jefe")) {
                            new ControllerJefe(vista, manager, new PersonaJpaController(manager.getEmf()));
                            Resouces.success("!BIENVENIDO!", "Jefe: " + user.getIdpersona().getNombresper());
                            vistaS.dispose();
                            vistaL.dispose();
                        } else {
                            if (user.getIdrol().getNombrerol().equals("Asistente")) {
                                new ControllerAsistente(vista, manager, new PersonaJpaController(manager.getEmf()));
                                Resouces.success("!BIENVENIDO!", "Asistente: " + user.getIdpersona().getNombresper());
                                vistaS.dispose();
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
        //JOptionPane.showMessageDialog(vistaL, "~Saliendo del programa~");
        System.exit(0);
    }

    public void regresar() {
        vistaL.dispose();
        vistaL.setVisible(true);
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
}
