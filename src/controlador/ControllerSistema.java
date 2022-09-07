
package controlador;

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
    public static ViewSistema vista;
    ManagerFactory manager;
    UsuarioJpaController modelo;
    ViewLogin vistaLogin = new ViewLogin();
    
    public ControllerSistema(ManagerFactory manager,ViewSistema vista, UsuarioJpaController modelo) {
        this.vista = vista;
        this.manager = manager;
        this.modelo=modelo;
        this.vista.setLocationRelativeTo(null);
        this.vista.setExtendedState(MAXIMIZED_BOTH);
        this.vista.setVisible(true);
        controlEvento();
    }
    
    public void controlEvento(){
        vista.getjMenuItemAdministrador().addActionListener(p->cargarVistaAdmin());
//        vista.getjMenuItemJefeOperaciones().addActionListener(u->cargarVistaJefe());
//        vista.getjMenuItemAsistente().addActionListener(pro->cargarVistaAsistente());
    }
    public void cargarVistaAdmin(){
        new ControllerLogin(vistaLogin,manager,new UsuarioJpaController(manager.getEmf()));
        System.out.println("");
    }

}
