/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.PersistenceException;
import modelo.Usuario;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerLogin {

    ViewSistema vistaS = new ViewSistema();
    ViewLogin vistaL;
    ManagerFactory manager;
    UsuarioJpaController modelo;
    Usuario usuario;
    ViewAdministrador vistaAdmin = new ViewAdministrador();

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
        try {
            DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            String usuario = vistaL.getTxtusuario().getText();
            String contrasenia = new String(vistaL.getTxtPass().getPassword());
            Usuario user = modelo.buscarUsuario(usuario, contrasenia);
            System.out.println(user.getIdpersona().getNombresper());
            System.out.println(user.getIdrol().getNombrerol());
            if (user != null) {
                if (user.getIdrol().getNombrerol().equals("Administrador")) {
                    ControllerRolesUsuario cjf = new ControllerRolesUsuario();
                    Resouces.success("!BIENVENIDO!", "Administrador: " + user.getIdpersona().getNombresper());
                    cjf.cargarRolAdministrador();
                    vistaS.dispose();
                    vistaL.dispose();
                    
                } else {
                    if (user.getIdrol().getNombrerol().equals("Jefe")) {
                        ControllerRolesUsuario cjf = new ControllerRolesUsuario();
                        Resouces.success("!BIENVENIDO!", "Jefe: " + user.getIdpersona().getNombresper());
                        cjf.cargarRolJefe();
                        vistaS.dispose();
                        vistaL.dispose();
                    } else {
                        if (user.getIdrol().getNombrerol().equals("Asistente")) {
                            ControllerRolesUsuario cjf = new ControllerRolesUsuario();
                            Resouces.success("!BIENVENIDO!", "Asistente: " + user.getIdpersona().getNombresper());
                            cjf.cargarRolAdministrador();
                            vistaS.dispose();
                            vistaL.dispose();
                        }
                    }
                }
            } else {
                Resouces.error("Usuario Incorrecto", "Ingrese correctamente sus credenciales :D");
            }
        } catch (PersistenceException e) {
            Resouces.error("Base de Datos desconectada D:", "Contactese con el Administrador");
            System.out.println(e.getMessage());
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
}
