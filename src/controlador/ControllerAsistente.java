/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import javax.swing.ListSelectionModel;
import modelo.Persona;
import modelo.PersonaJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerAsistente extends ControllerPersona{

    public ControllerAsistente(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnUsuarios().setEnabled(false);
        vistap.getBtnConfiguracion().setEnabled(false);
        vistap.getBtnInscripciones().setEnabled(false);
        vistap.getBtnDonaciones().setEnabled(false);
        vistap.getBtnproyectos().setEnabled(false);
        System.out.println("Ingreso Admin");
    }
}
