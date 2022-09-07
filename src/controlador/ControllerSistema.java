
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
    PersonaJpaController modelo;
    public static ViewLogin vistaLogin;
    ViewAdministrador vistaAdmin = new ViewAdministrador();
    
    public ControllerSistema(ManagerFactory manager,ViewSistema vista, PersonaJpaController modelo) {
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
        new ControllerPersona(vistaAdmin,manager,new PersonaJpaController(manager.getEmf()));
        System.out.println("");
    }
//    public void cargarVistaJefe(){
//        new ControllerPersona(vp,manager,new PersonaJpaController(manager.getEmf()),vistaS.getjDesktopPane1());
//        System.out.println("");
//    }
//    public void cargarVistaAsistente(){
//       new ControllerPersona(vp,manager,new PersonaJpaController(manager.getEmf()),vistaS.getjDesktopPane1());
//        System.out.println("");
//    }
}
