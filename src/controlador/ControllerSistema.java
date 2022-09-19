package controlador;

import Vista.InicioSistema;
import Vista.InicioSistema;
import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import modelo.PersonaJpaController;
import modelo.ProductoJpaController;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerSistema {

    public static InicioSistema vista;
    ManagerFactory manager;
    UsuarioJpaController modelo;
    ViewLogin vistaLogin = new ViewLogin();

    public ControllerSistema(ManagerFactory manager, InicioSistema vista, UsuarioJpaController modelo) {
        this.vista = vista;
        this.manager = manager;
        this.modelo = modelo;
        this.vista.setExtendedState(MAXIMIZED_BOTH);
        this.vista.run();
        controlEvento();
    }

    public void controlEvento() {
        vista.getBtnIngresoSistema().addActionListener(p -> cargarVistaLogin());
    }

    public void cargarVistaLogin() {
        new ControllerLogin(vistaLogin, manager, new UsuarioJpaController(manager.getEmf()));
        vista.dispose();
    }
}
