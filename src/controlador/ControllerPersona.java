/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import modelo.Persona;
import modelo.PersonaJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerPersona {

    ViewAdministrador vistaA;
    ManagerFactory manager;
    PersonaJpaController modeloPersona;
    Persona per;
    ModeloTablaPersona modeloTP;
    ListSelectionModel listapersonamodel;

    public ControllerPersona(ViewAdministrador vistaA, ManagerFactory manager,PersonaJpaController modeloPersona) {
        this.vistaA = vistaA;
        this.manager = manager;
        this.modeloPersona = modeloPersona;
        this.vistaA.setVisible(true);
    }
}
