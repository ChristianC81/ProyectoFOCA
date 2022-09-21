/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.DonacionJpaController;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.Producto;
import modelo.ProductoJpaController;
import modelo.ProyectoJpaController;
import modelo.Roles;
import modelo.RolesJpaController;
import modelo.Usuario;
import modelo.Validaciones;
import modelo.exceptions.IllegalOrphanException;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;
import proyectofoca.ManagerFactory;

/**
 *
 * @author Laptop
 */
public class ControllerRolesUsuario {

    ViewAdministrador vista;
    ManagerFactory manager;
    RolesJpaController modeloRoles;
    ModeloTablaRoles modeloTroles;
    Roles rol;
    //JDesktopPane panelEscritorio;
    ListSelectionModel listarolmodel;
    Validaciones validacion;

    public ControllerRolesUsuario(ViewAdministrador vista, ManagerFactory manager) {
        this.vista = vista;
        this.manager = manager;
        this.vista.setExtendedState(MAXIMIZED_BOTH);
        this.vista.setVisible(true);
    }

    public ControllerRolesUsuario(ViewAdministrador vista, ManagerFactory manager, RolesJpaController modeloRoles) {
        this.vista = vista;
        this.manager = manager;
        this.modeloRoles = modeloRoles;
        this.modeloTroles = new ModeloTablaRoles();
        this.modeloTroles.setFilas(modeloRoles.findRolesEntities());

    }

    public void iniciarControlRol() {
        this.vista.getBtnCREARROL().addActionListener(l -> guardarRol());
        this.vista.getBtnEDITARROL().addActionListener(l -> editarRol());
        this.vista.getBtnELIMINARROL().addActionListener(l -> eliminarRol());
        this.vista.getBtnLIMPIARROL().addActionListener(l -> limpiarRol());
        this.vista.getBtnlimpiarBUSQUEDAROL().addActionListener(l -> limpiarBuscadorRol());
        this.vista.getBtnbuscaRROL().addActionListener(l -> buscarRol());
        this.vista.getChekBsqROL().addActionListener(l -> buscarRol());

        // eventos tabla
        this.vista.getjTableDatosROLES().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listarolmodel = this.vista.getjTableDatosROLES().getSelectionModel();
        listarolmodel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    rolSeleccionado();
                }
            }
        });

        this.vista.getBtnREPORTEGENERALROL().addActionListener(l -> reporteGeneral());
//        this.vista.getBtnREPORTEINDIVIDUALROL().addActionListener(l -> reporteIndividual());
        // control de botones inicio
        this.vista.getBtnEDITARROL().setEnabled(false);
        this.vista.getBtnELIMINARROL().setEnabled(false);
    }

    private void rolSeleccionado() {
        if (this.vista.getjTableDatosROLES().getSelectedRow() != -1) {
            rol = modeloTroles.getFilas().get(this.vista.getjTableDatosROLES().getSelectedRow());
            //cargar los datos a la vista
            this.vista.getjTextFieldNOMBREROL().setText(rol.getNombrerol());
            this.vista.getTxaDescripcionROL().setText(rol.getDescripcionrol());
            // control de botones seleccionados
            this.vista.getBtnEDITARROL().setEnabled(true);
            this.vista.getBtnELIMINARROL().setEnabled(true);
            this.vista.getBtnCREARROL().setEnabled(false);

        }
    }

    // Métodos
    public void guardarRol() {
        if (camposVacios() == false) {
            Resouces.warning("ATENCIÓN!!", "Por favor, llene todos los campos");
        } else {
            if (validarCampos() == true) {
                Resouces.warning("Atención!!", "Por favor, llene todos los campos");
            } else {
                rol = new Roles();
                rol.setNombrerol(this.vista.getjTextFieldNOMBREROL().getText());
                rol.setDescripcionrol(this.vista.getTxaDescripcionROL().getText());
                try {
                    modeloRoles.create(rol);
                } catch (PreexistingEntityException ex) {
                    Logger.getLogger(ControllerRolesUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ControllerRolesUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
                modeloTroles.agregar(rol);
                Resouces.success(" ATENCIÓN!!!", "Rol creado correctamente");
                limpiarRol();
            }
        }
    }

    public void editarRol() {
        if (validarCampos() == false) {
            Resouces.warning("Atención!!", "Por favor, llene todos los campos");
        } else {
            if (rol != null) {
                rol.setNombrerol(this.vista.getjTextFieldNOMBREROL().getText());
                rol.setDescripcionrol(this.vista.getTxaDescripcionROL().getText());
                try {
                    modeloRoles.edit(rol);
                    modeloTroles.eliminar(rol);
                    modeloTroles.actualizar(rol);
                } catch (Exception ex) {
                    Logger.getLogger(ControllerRolesUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resouces.success(" ATENCIÓN!!!", "Rol editado correctamente");
                limpiarRol();
            } else {
                Resouces.error(" ATENCIÓN!!!", "No se pudo editar el rol");
                limpiarRol();
            }
        }
    }

    public void eliminarRol() {
        if (rol != null) {
            try {
                int select = JOptionPane.showConfirmDialog(vista, "¿ESTÁS SEGUR@ DE EDITAR LOS DATOS DE ESTA DONACIÓN?");
                if (select == JOptionPane.YES_OPTION) {
                    modeloRoles.destroy(rol.getIdrol());
                    modeloTroles.eliminar(rol);

                    Resouces.success(" ATENCIÓN!!!", "Rol elminado correctamente");
                    limpiarRol();
                }
            } catch (NonexistentEntityException e) {
                Logger.getLogger(ControllerRolesUsuario.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void buscarRol() {

        if (this.vista.getChekBsqROL().isSelected()) {
            modeloTroles.setFilas(modeloRoles.findRolesEntities());
            modeloTroles.fireTableDataChanged();
        } else {
            if (this.vista.getTxtBsqCRITERIOROL().getText().isEmpty()) {
                Resouces.warning("Atención!!!", "Llene el campo de busqueda");
                limpiarBuscadorRol();
            } else {
                modeloTroles.setFilas(modeloRoles.buscarRoles(this.vista.getTxtBsqCRITERIOROL().getText()));
                modeloTroles.fireTableDataChanged();
            }
        }
    }

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGRoles.jasper", new HashMap());
    }

    //limipiar y validar
    public void limpiarRol() {
        this.vista.getjTextFieldNOMBREROL().setText("");
        this.vista.getTxaDescripcionROL().setText("");
        //CONTROL DE BOTONES
        this.vista.getBtnEDITARROL().setEnabled(false);
        this.vista.getBtnELIMINARROL().setEnabled(false);
        this.vista.getBtnCREARROL().setEnabled(true);
        this.vista.getjTableDatosROLES().getSelectionModel().clearSelection();
    }

    public void limpiarBuscadorRol() {
        this.vista.getTxtBsqCRITERIOROL().setText("");
        modeloTroles.setFilas(modeloRoles.findRolesEntities());
        modeloTroles.fireTableDataChanged();
    }

    public boolean camposVacios() {
        boolean validar = true;
        if (this.vista.getjTextFieldNOMBREROL().getText().isEmpty()) {
            validar = false;
        }
        if (this.vista.getTxaDescripcionROL().getText().isEmpty()) {
            validar = false;
        }
        return validar;
    }

    public boolean validarCampos() {
        Validaciones validar = new Validaciones();
        boolean validado = false;

        if (validar.validarTextoSinEspacio(this.vista.getjTextFieldNOMBREROL().getText())) {
            if (validar.validarCadena(this.vista.getTxaDescripcionROL().getText())) {
                validado = true;
            } else {
                Resouces.warning("Atención", "Incorrecto");
            }
        } else {
            Resouces.warning("Atención", "Incorrecto");
        }
        return validado;
    }

    // NO SE QUEJESTO XD
    public void cargarRolAdministrador() {

    }

    public void cargarRolJefe() {
        new ControllerJefe(vista, manager, new PersonaJpaController(manager.getEmf()));
    }

    public void cargarVistaAsistente() {
        new ControllerAsistente(vista, manager, new PersonaJpaController(manager.getEmf()));
    }
}
