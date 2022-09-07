/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.PersistenceException;
import javax.swing.ListSelectionModel;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.Usuario;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author Laptop
 */
public class ControllerRolesUsuario {
    ControllerPersona cp= new ControllerPersona();
    ViewAdministrador vistaL;
    ManagerFactory manager;
    PersonaJpaController modeloAdministrador;
    PersonaJpaController modeloJefe;
    PersonaJpaController modeloAsistente;
    Persona persona;
    Usuario u;
    ViewAdministrador vistaAdmin = new ViewAdministrador();

    public ControllerRolesUsuario(Usuario u) {
        this.u= u;
        System.out.println("AQUI");
        }
  public void controlLogin(){
         if (u.getIdrol().getNombrerol()=="Jefe") {
             System.out.println("AQUI");
                Resouces.success("!BIENVENIDO!", " Inicio de Sesión exitoso \n Fecha de Inicio: \n Usuario: "+u.getNombreusuario());
                cp.ControllerPersonaAdmin(vistaL, manager,modeloAdministrador);
         } 
  }
}
