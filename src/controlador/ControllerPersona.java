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
    JDesktopPane panelEscritorio;
    ModeloTablaPersona modeloTP;
    ListSelectionModel listapersonamodel;

    public ControllerPersona(ViewAdministrador vistaA, ManagerFactory manager, PersonaJpaController modeloPersona, /*Persona per,*/ JDesktopPane panelEscritorio) {
        
        this.manager = manager;
        this.modeloPersona = modeloPersona;
        this.panelEscritorio = panelEscritorio;
        this.modeloTP = new ModeloTablaPersona();
        this.modeloTP.setFilas(modeloPersona.findPersonaEntities());

        if (ControllerSistema.vp == null) {
            ControllerSistema.vp = new ViewAdministrador();
            this.vistaA = ControllerSistema.vp;
            this.panelEscritorio.add(this.vistaA);
        //    this.vistaA.getjTableDatosPersonas().setModel(modeloTP);
            ControllerSistema.vp.show();
            //controlMetodosPersona();

        } else {
            ControllerSistema.vp.show();
        }
    }

}
