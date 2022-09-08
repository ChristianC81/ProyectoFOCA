/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.Usuario;
import proyectofoca.ManagerFactory;

/**
 *
 * @author Laptop
 */
public class ControllerRolesUsuario {
    ViewAdministrador vistaL = new ViewAdministrador();
    ManagerFactory manager;
    PersonaJpaController modeloAdministrador;
    PersonaJpaController modeloJefe;
    PersonaJpaController modeloAsistente;
 
     public void cargarRolAdministrador() {
         ControllerPersona ca = new ControllerPersona();
         ca.ControllerPersonaAdministrador(vistaL);
    }
    public void cargarRolJefe() {
         ControllerPersona ca = new ControllerPersona();
         ca.ControllerPersonaJefe(vistaL);
    }
     public void cargarVistaAsistente() {
       ControllerPersona ca = new ControllerPersona();
         ca.ControllerPersonaAsistente(vistaL);
    }
  }

