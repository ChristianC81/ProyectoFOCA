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

    ManagerFactory manager;
    PersonaJpaController modeloPersona;
    Persona per;
    ModeloTablaPersona modeloTP;
    ListSelectionModel listapersonamodel;

    public void ControllerPersonaAdministrador(ViewAdministrador vista) {
        vista.setVisible(true);

        System.out.println("eres un administrador");
    }

    public void ControllerPersonaJefe(ViewAdministrador vista) {
        vista.setVisible(true);
        
        System.out.println("eres un jefe");
    }

    public void ControllerPersonaAsistente(ViewAdministrador vista) {
        vista.setVisible(true);

        System.out.println("eres un asistente");
    }
}
