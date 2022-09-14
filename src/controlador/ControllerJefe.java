/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import modelo.PersonaJpaController;
import modelo.ProductoJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerJefe extends ControllerPersona {
    //Objetos que controlara Jefe
ControllerProducto cprod;  
    public ControllerJefe(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnUsuarios().setEnabled(false);
        vistap.getBtnConfiguracion().setEnabled(false);
        cprod=new ControllerProducto(vistap, manager, new ProductoJpaController(manager.getEmf())); 
        //cprod.controldeEventos(vistap);
        controldeEventos(vistap);
    }

    public void controldeEventos(ViewAdministrador vistap) {
//          vistap.getBtnSalir().addActionListener(l ->);
        vistap.getBtnReportes().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(0));
        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(2));

        vistap.getBtnInscripciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));
        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(4));
        vistap.getBtnProductos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(5));
        vistap.getBtnproyectos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));
        vistap.getBtnFormularios().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(7));
      }
}
