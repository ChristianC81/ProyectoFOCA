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
import modelo.ProyectoJpaController;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerJefe extends ControllerPersona {

    //Objetos que controlara Jefe
    ControllerPersona cper;

    ControllerDonacion cdona;
    ControllerProyecto cproy;
    ControllerInscripcion cins;

    //Login
    ControllerLogin clog;

    public ControllerJefe(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnUsuarios().setEnabled(false);
//        vistap.getBtnConfiguracion().setEnabled(false);
        cper = new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();

        cdona = new ControllerDonacion(vistap, manager, new DonacionJpaController(manager.getEmf()));
        cdona.iniciarControlDonacion();
        cproy = new ControllerProyecto(vistap, manager, new ProyectoJpaController(manager.getEmf()));
        cproy.iniciarControlProyecto();
        cins = new ControllerInscripcion(vistap, manager, new InscripcionJpaController(manager.getEmf()));
        cins.iniciarControlInscripcion();

        controldeEventos(vistap);
        listaTipoPer();
    }

    public void controldeEventos(ViewAdministrador vistap) {

        vistap.getBtnReportes().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(0));
        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));

        vistap.getBtnInscripciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(4));
        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(5));
        vistap.getBtnProductos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));
        vistap.getBtnproyectos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(7));

        vistap.getBtnSalir().addActionListener(l -> Regresar());
    }

    public void Regresar() {
        vistap.dispose();
        ViewLogin vl = new ViewLogin();
        clog = new ControllerLogin(vl, manager, new UsuarioJpaController(manager.getEmf()));
    }

    public void listaTipoPer() {
        vistap.getCbxTipoPer().addItem("Asistente");
        vistap.getCbxTipoPer().addItem("Benefactor");
        vistap.getCbxTipoPer().addItem("Beneficiario");
        vistap.getCbxTipoPer().addItem("Voluntario");
    }

}
