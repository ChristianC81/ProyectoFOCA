/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import modelo.DonacionJpaController;
import modelo.PersonaJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerAsistente extends ControllerPersona {

    //Objetos que controlara Asistente
    ControllerPersona cper;
    ControllerDonacion cdona;

    public ControllerAsistente(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnUsuarios().setEnabled(false);
        vistap.getBtnConfiguracion().setEnabled(false);
        vistap.getBtnInscripciones().setEnabled(false);
        //vistap.getBtnDonaciones().setEnabled(false);
        vistap.getBtnproyectos().setEnabled(false);
        vistap.getBtnConfiguracion().setEnabled(false);
        System.out.println("Ingreso Asistente");
        cper = new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();
        cdona = new ControllerDonacion(vistap, manager, new DonacionJpaController(manager.getEmf()));
        cdona.controlMetodosDonacion();
        controldeEventos(vistap);
    }

    public void controldeEventos(ViewAdministrador vistap) {
        vistap.getBtnUsuarios().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(2));
        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));
        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));
        vistap.getBtnSalir().addActionListener(l -> Regresar());
    }

    public void Regresar() {
        vistap.dispose();
        ViewLogin vl = new ViewLogin();
        vl.setVisible(true);
    }
}
