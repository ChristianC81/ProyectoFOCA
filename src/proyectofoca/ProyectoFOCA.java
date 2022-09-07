/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofoca;

import Vista.InicioSistema;
import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import controlador.ControllerSistema;
import modelo.PersonaJpaController;
import modelo.UsuarioJpaController;

/**
 *
 * @author chris
 */
public class ProyectoFOCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    ViewSistema vista = new ViewSistema();
    ManagerFactory manager= new ManagerFactory();
    ViewSistema vistaSis = new ViewSistema();
    PersonaJpaController modelo=new PersonaJpaController(manager.getEmf());
    
    
      ControllerSistema cs= new ControllerSistema(manager, vistaSis,modelo);
    
        
    }
}
