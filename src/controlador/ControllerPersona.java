/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import static controlador.ControllerSistema.vista;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.UsuarioJpaController;
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
    
    //Vista Login 
    ManagerFactory managerLog;
    ViewLogin vistaLogin = new ViewLogin();

    public void ControllerPersonaAdministrador(ViewAdministrador vista) {
        vista.setVisible(true);
        IniciarEventoAdministrador(vista);
        System.out.println("eres un administrador");
    }

    public void ControllerPersonaJefe(ViewAdministrador vista) {
        vista.setVisible(true);
        IniciarEventoJefe(vista);
        vista.getBtnUsuarios().setEnabled(false);
        vista.getBtnConfiguracion().setEnabled(false);

        System.out.println("eres un jefe");
    }

    public void ControllerPersonaAsistente(ViewAdministrador vista) {
        vista.setVisible(true);
        IniciarEventoAsistente(vista);
        vista.getBtnUsuarios().setEnabled(false);
        vista.getBtnConfiguracion().setEnabled(false);
        vista.getBtnInscripciones().setEnabled(false);
        vista.getBtnDonaciones().setEnabled(false);
        vista.getBtnproyectos().setEnabled(false);
        vista.getBtnConfiguracion().setEnabled(false);
        System.out.println("eres un asistente");
    }

    //Eventos asignados a Cada rol
    public void IniciarEventoAdministrador(ViewAdministrador vista) {
        vista.getBtnSalir().addActionListener(l ->salirVistaGeneral(vista));
        vista.getBtnReportes().addActionListener(l -> vista.getPnMenu().setSelectedIndex(0));
        vista.getBtnUsuarios().addActionListener(l -> vista.getPnMenu().setSelectedIndex(1));
        vista.getBtnPersona().addActionListener(l -> vista.getPnMenu().setSelectedIndex(2));

        vista.getBtnInscripciones().addActionListener(l -> vista.getPnMenu().setSelectedIndex(3));
        vista.getBtnDonaciones().addActionListener(l -> vista.getPnMenu().setSelectedIndex(4));
        vista.getBtnProductos().addActionListener(l -> vista.getPnMenu().setSelectedIndex(5));
        vista.getBtnproyectos().addActionListener(l -> vista.getPnMenu().setSelectedIndex(6));
        vista.getBtnFormularios().addActionListener(l -> vista.getPnMenu().setSelectedIndex(7));
        vista.getBtnConfiguracion().addActionListener(l -> vista.getPnMenu().setSelectedIndex(8));
    }

    public void IniciarEventoJefe(ViewAdministrador vista) {
        vista.getBtnSalir().addActionListener(l -> salirVistaGeneral(vista));
        vista.getBtnReportes().addActionListener(l -> vista.getPnMenu().setSelectedIndex(0));
        vista.getBtnPersona().addActionListener(l -> vista.getPnMenu().setSelectedIndex(2));

        vista.getBtnInscripciones().addActionListener(l -> vista.getPnMenu().setSelectedIndex(3));
        vista.getBtnDonaciones().addActionListener(l -> vista.getPnMenu().setSelectedIndex(4));
        vista.getBtnProductos().addActionListener(l -> vista.getPnMenu().setSelectedIndex(5));
        vista.getBtnproyectos().addActionListener(l -> vista.getPnMenu().setSelectedIndex(6));
        vista.getBtnFormularios().addActionListener(l -> vista.getPnMenu().setSelectedIndex(7));
    }

    public void IniciarEventoAsistente(ViewAdministrador vista) {
        vista.getBtnSalir().addActionListener(l -> salirVistaGeneral(vista));
        vista.getBtnPersona().addActionListener(l -> vista.getPnMenu().setSelectedIndex(2));
        vista.getBtnProductos().addActionListener(l -> vista.getPnMenu().setSelectedIndex(5));
        vista.getBtnFormularios().addActionListener(l -> vista.getPnMenu().setSelectedIndex(7));
    }

    //Metodos
    public void salirVistaGeneral(ViewAdministrador v){
        v.dispose();
        new ControllerLogin(vistaLogin,managerLog,new UsuarioJpaController(managerLog.getEmf()));
    }
    public void CrearBenefactor() {

    }
    
    
}
