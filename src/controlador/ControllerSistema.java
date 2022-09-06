
package controlador;

import Vista.ViewAdministrador;
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
    public static ViewSistema vistaS;
    ManagerFactory manager;
    public static ViewAdministrador vp;

    
    public ControllerSistema(ViewSistema vistaS, ManagerFactory manager) {
        this.vistaS = vistaS;
        this.manager = manager;
        this.vistaS.setExtendedState(MAXIMIZED_BOTH);

        controlEvento();
    }
    
    public void controlEvento(){
        vistaS.getjMenuItemAdministrador().addActionListener(p->cargarVistaAdmin());
        vistaS.getjMenuItemJefeOperaciones().addActionListener(u->cargarVistaJefe());
        vistaS.getjMenuItemAsistente().addActionListener(pro->cargarVistaAsistente());
    }
    public void cargarVistaAdmin(){
        new ControllerPersona(vp,manager,new PersonaJpaController(manager.getEmf()),vistaS.getjDesktopPane1());
        System.out.println("");
    }
    public void cargarVistaJefe(){
        new ControllerPersona(vp,manager,new PersonaJpaController(manager.getEmf()),vistaS.getjDesktopPane1());
        System.out.println("");
    }
    public void cargarVistaAsistente(){
       new ControllerPersona(vp,manager,new PersonaJpaController(manager.getEmf()),vistaS.getjDesktopPane1());
        System.out.println("");
    }
}
