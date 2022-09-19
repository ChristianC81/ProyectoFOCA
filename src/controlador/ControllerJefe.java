/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import modelo.PersonaJpaController;
import modelo.ProductoJpaController;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerJefe extends ControllerPersona {
    //Objetos que controlara Jefe
    ControllerPersona cper;
    ControllerUsuario cusu;
    ControllerProducto cprod;  
    
    public ControllerJefe(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnUsuarios().setEnabled(false);
//        vistap.getBtnConfiguracion().setEnabled(false);
        cper=new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();
        cusu=new ControllerUsuario(vistap, manager, new UsuarioJpaController(manager.getEmf()));
        cusu.iniciarControlUsu();
        cprod=new ControllerProducto(vistap, manager, new ProductoJpaController(manager.getEmf())); 
        cprod.iniciarControlProd();
        controldeEventos(vistap);
    }

    public void controldeEventos(ViewAdministrador vistap) {
//          vistap.getBtnSalir().addActionListener(l ->);
        vistap.getBtnReportes().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(0));
        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));

        vistap.getBtnInscripciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(4));
        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(5));
        vistap.getBtnProductos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));
        vistap.getBtnproyectos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(7));
//        vistap.getBtnFormularios().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(8));
      }
}
