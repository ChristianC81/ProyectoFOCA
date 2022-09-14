/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import static java.awt.Frame.MAXIMIZED_BOTH;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.Usuario;
import proyectofoca.ManagerFactory;

/**
 *
 * @author Laptop
 */
public class ControllerRolesUsuario {

    ViewAdministrador vista;
    ManagerFactory manager;

    public ControllerRolesUsuario(ViewAdministrador vista, ManagerFactory manager) {
        this.vista = vista;
        this.manager = manager;
        this.vista.setExtendedState(MAXIMIZED_BOTH);
        this.vista.setVisible(true);
    }

    public void cargarRolAdministrador() {
        
    }

    public void cargarRolJefe() {
        new ControllerJefe(vista, manager, new PersonaJpaController(manager.getEmf()));
    }

    public void cargarVistaAsistente() {
    new ControllerAsistente(vista, manager, new PersonaJpaController(manager.getEmf()));
    }
}
