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
        cdon.iniciarControDonacion();
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
