/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.DonacionJpaController;
import modelo.InscripcionJpaController;
import modelo.PersonaJpaController;
import modelo.ProductoJpaController;
import modelo.ProyectoJpaController;
import modelo.RolesJpaController;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerAdministrador extends ControllerPersona {

    //Objetos que controlara Administrador
    ControllerRolesUsuario crol;
    ControllerUsuario cusu;
    ControllerPersona cper;

    ControllerProyecto cproy;
    ControllerInscripcion cins;
    ControllerDonacion cdon;
    ControllerProducto cprod;

    //Login
    ControllerLogin clog;

    public ControllerAdministrador(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modeloPer) {
        super(vistap, manager, modeloPer);
        vistap.setVisible(true);

        crol = new ControllerRolesUsuario(vistap, manager, new RolesJpaController(manager.getEmf()));
        crol.iniciarControlRol();
        cusu = new ControllerUsuario(vistap, manager, new UsuarioJpaController(manager.getEmf()));
        cusu.iniciarControlUsu();
        cper = new ControllerPersona(vistap, manager, new PersonaJpaController(manager.getEmf()));
        cper.iniciarControlPer();

        cproy = new ControllerProyecto(vistap, manager, new ProyectoJpaController(manager.getEmf()));
        cproy.iniciarControlProyecto();
        cins = new ControllerInscripcion(vistap, manager, new InscripcionJpaController(manager.getEmf()));
        cins.iniciarControlInscripcion();
        cdon = new ControllerDonacion(vistap, manager, new DonacionJpaController(manager.getEmf()));
        cdon.iniciarControlDonacion();
        cprod = new ControllerProducto(vistap, manager, new ProductoJpaController(manager.getEmf()));
        cprod.iniciarControlProd();

        controldeEventosAdmin(vistap);
        listaTipoPer();
        verPass();
    }

    public void controldeEventosAdmin(ViewAdministrador vistap) {
        
        vistap.getBtnReportes().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(0));
        vistap.getBtnROLES().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(1));
        vistap.getBtnUsuarios().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(2));
        vistap.getBtnPersona().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(3));
        vistap.getBtnproyectos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(4));
        vistap.getBtnInscripciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(5));
        vistap.getBtnDonaciones().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(6));
        vistap.getBtnProductos().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(7));
        vistap.getBtnAyuda().addActionListener(l -> vistap.getPnMenu().setSelectedIndex(8));
        vistap.getBtnSalir().addActionListener(l -> Regresar());
        vistap.getCbxTipoPer().addActionListener(l -> cargarOpcRol());
    }

    public void Regresar() {
        vistap.dispose();
        ViewLogin vl = new ViewLogin();
        clog = new ControllerLogin(vl, manager, new UsuarioJpaController(manager.getEmf()));
    }

    public void listaTipoPer() {
        vistap.getCbxTipoPer().addItem("Administrador");
        vistap.getCbxTipoPer().addItem("Jefe");
        vistap.getCbxTipoPer().addItem("Asistente");
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
            vistap.getTxtsalario().setEnabled(false);
            vistap.getTxtTipoVol().setEnabled(false);
        } else {
            if (this.vistap.getCbxTipoPer().getSelectedIndex() == 2) {
                txtComp();
                vistap.getTxtestrato().setEnabled(false);
                vistap.getTxtperiodo().setEnabled(false);
                vistap.getTxthorario().setEnabled(false);
                vistap.getTxtsalario().setEnabled(false);
                vistap.getTxtTipoVol().setEnabled(false);
            } else {
                if (this.vistap.getCbxTipoPer().getSelectedIndex() == 3) {
                    txtComp();
                    vistap.getTxtestrato().setEnabled(false);
                    vistap.getTxtperiodo().setEnabled(false);
                    vistap.getTxthorario().setEnabled(false);
                    vistap.getTxtsalario().setEnabled(false);
                    vistap.getTxtTipoVol().setEnabled(false);
                } else {
                    if (this.vistap.getCbxTipoPer().getSelectedIndex() == 4) {
                        txtComp();
                        vistap.getTxtestrato().setEnabled(false);
                        vistap.getTxtperiodo().setEnabled(false);
                        vistap.getTxthorario().setEnabled(false);
                        vistap.getTxtTipoVol().setEnabled(false);
                        vistap.getChkseguroiees().setEnabled(false);
                    } else {
                        if (this.vistap.getCbxTipoPer().getSelectedIndex() == 5) {
                            txtComp();
                            vistap.getTxtsalario().setEnabled(false);
                            vistap.getTxtperiodo().setEnabled(false);
                            vistap.getTxthorario().setEnabled(false);
                            vistap.getTxtTipoVol().setEnabled(false);
                            vistap.getChkseguroiees().setEnabled(false);
                        } else {
                            if (this.vistap.getCbxTipoPer().getSelectedIndex() == 6) {
                                txtComp();
                                vistap.getChkseguroiees().setEnabled(false);
                                vistap.getTxtsalario().setEnabled(false);
                            }
                        }
                    }
                }
            }
        }
    }

    private void verPass() {

        MouseListener lmouse = new MouseListener() {
            char i;

            @Override
            public void mouseClicked(MouseEvent e) {
                vistap.getTxtClave().setEchoChar(i);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                i = vistap.getTxtClave().getEchoChar();
                vistap.getTxtClave().setEchoChar((char) 0);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        vistap.getLblVerClave().addMouseListener(lmouse);
    }
}
