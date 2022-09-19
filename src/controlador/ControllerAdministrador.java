/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import modelo.DonacionJpaController;
import modelo.InscripcionJpaController;
import modelo.PersonaJpaController;
import modelo.ProductoJpaController;
import modelo.ProyectoJpaController;
import modelo.RolesJpaController;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerAdministrador extends ControllerPersona{
    //Objetos que controlara Jefe
    ControllerUsuario cusu;
    ControllerPersona cper;
    ControllerRolesUsuario crol; 
    ControllerDonacion cdon;
    ControllerProducto cprod;
    ControllerProyecto cproy;
    ControllerInscripcion cins;

    public ControllerAdministrador(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modeloPer) {
        super(vistap,manager, modeloPer);
        vistap.setVisible(true);  
        
        //cusu = new ControllerUsuario()
        crol= new ControllerRolesUsuario(vistap, manager, new RolesJpaController(manager.getEmf()));
        crol.iniciarControlRol();
        cper=new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();
        cdon = new ControllerDonacion(vistap, manager, new DonacionJpaController(manager.getEmf()));
        cdon.controlMetodosDonacion();
        cprod=new ControllerProducto(vistap, manager, new ProductoJpaController(manager.getEmf())); 
        cprod.iniciarControlProd();
        cproy= new ControllerProyecto(vistap, manager, new ProyectoJpaController(manager.getEmf()));
        cproy.iniciarControlProyecto();
        cins = new ControllerInscripcion(vistap, manager, new InscripcionJpaController(manager.getEmf()));
        cins.iniciarControlInscripcion();
        controldeEventosAdmin(vistap);
    }
    
    public void controldeEventosAdmin(ViewAdministrador vistap) {
        vistap.getBtnReportes().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(0));
        vistap.getBtnROLES().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(1));
        vistap.getBtnUsuarios().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(2));
        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));
        vistap.getBtnproyectos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(4));
        vistap.getBtnInscripciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(5));
        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));
        vistap.getBtnProductos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(7));
        vistap.getBtnConfiguracion().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(8));
        vistap.getBtnSalir().addActionListener(l -> Regresar());
      }
      public void Regresar(){
          vistap.dispose();
          ViewLogin vl = new ViewLogin();
          vl.setVisible(true);
      }
}
