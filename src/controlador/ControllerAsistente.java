/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import modelo.PersonaJpaController;
import modelo.ProductoJpaController;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerAsistente extends ControllerPersona {

    //Objetos que controlara Asistente
    //Benefactores, Beneficiarios y Voluntarios
    ControllerPersona cper;

    ControllerProducto cprod;

    //Login
    ControllerLogin clog;

    public ControllerAsistente(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnReportes().setEnabled(false);
        vistap.getBtnROLES().setEnabled(false);
        vistap.getBtnUsuarios().setEnabled(false);
        vistap.getBtnConfiguracion().setEnabled(false);
        vistap.getBtnInscripciones().setEnabled(false);
        vistap.getBtnDonaciones().setEnabled(false);
        vistap.getBtnproyectos().setEnabled(false);

        cper = new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();

        cprod = new ControllerProducto(vistap, manager, new ProductoJpaController(manager.getEmf()));
        cprod.iniciarControlProd();
        
        controldeEventos(vistap);
        listaTipoPer();
    }

    public void controldeEventos(ViewAdministrador vistap) {

        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));

        vistap.getBtnProductos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));

        vistap.getBtnSalir().addActionListener(l -> Regresar());
    }

    public void Regresar() {
        vistap.dispose();
        ViewLogin vl = new ViewLogin();
        clog = new ControllerLogin(vl, manager, new UsuarioJpaController(manager.getEmf()));
    }

    public void listaTipoPer() {
        vistap.getCbxTipoPer().addItem("Benefactor");
        vistap.getCbxTipoPer().addItem("Beneficiario");
        vistap.getCbxTipoPer().addItem("Voluntario");
    }

}
