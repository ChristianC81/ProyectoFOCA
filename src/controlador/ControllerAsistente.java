/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import modelo.DonacionJpaController;
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

    ControllerDonacion cdona;

    //Login
    ControllerLogin clog;

    public ControllerAsistente(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        super(vistap, manager, modelPer);
        vistap.setVisible(true);
        vistap.getBtnROLES().setEnabled(false);
        vistap.getBtnUsuarios().setEnabled(false);
        vistap.getBtnInscripciones().setEnabled(false);
        vistap.getBtnProductos().setEnabled(false);
        vistap.getBtnproyectos().setEnabled(false);

        //Crear y Modificar Benefactores, Beneficiarios y Voluntarios
        cper = new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();

        cdona = new ControllerDonacion(vistap, manager, new DonacionJpaController(manager.getEmf()));
        cdona.iniciarControlDonacion();

        controldeEventos(vistap);
        listaTipoPer();
    }

    public void controldeEventos(ViewAdministrador vistap) {

        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));

        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));

        vistap.getBtnAyuda().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(8));

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

    public void txtComp() {

        vistap.getTxtcedulaPer().setEnabled(true);
        vistap.getTxtnombrePer().setEnabled(true);
        vistap.getTxtapellidoPer().setEnabled(true);
        vistap.getTxttelefono().setEnabled(true);
        vistap.getChkseguroiees().setEnabled(true);
        vistap.getTxtdireccionPer().setEnabled(true);
        vistap.getTxtTitulo().setEnabled(true);
        vistap.getTxtestadocivil().setEnabled(true);
        vistap.getTxtcorreoPer().setEnabled(true);
        vistap.getTxthorario().setEnabled(true);
        vistap.getTxtsalario().setEnabled(true);
        vistap.getTxtestrato().setEnabled(true);
        vistap.getTxtperiodo().setEnabled(true);
        vistap.getTxtTipoVol().setEnabled(true);

    }

    public void cargarOpcRol() {

        if (this.vistap.getCbxTipoPer().getSelectedIndex() == 1) {
            txtComp();
            vistap.getTxtestrato().setEnabled(false);
            vistap.getTxtperiodo().setEnabled(false);
            vistap.getTxthorario().setEnabled(false);
            vistap.getTxtTipoVol().setEnabled(false);
            vistap.getChkseguroiees().setEnabled(false);
        } else {
            if (this.vistap.getCbxTipoPer().getSelectedIndex() == 2) {
                txtComp();
                vistap.getTxtsalario().setEnabled(false);
                vistap.getTxtperiodo().setEnabled(false);
                vistap.getTxthorario().setEnabled(false);
                vistap.getTxtTipoVol().setEnabled(false);
                vistap.getChkseguroiees().setEnabled(false);
            } else {
                if (this.vistap.getCbxTipoPer().getSelectedIndex() == 3) {
                    txtComp();
                    vistap.getChkseguroiees().setEnabled(false);
                    vistap.getTxtsalario().setEnabled(false);
                }
            }
        }
    }
}
