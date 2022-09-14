/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.DonacionJpaController;
import modelo.Proyecto;
import modelo.ProyectoJpaController;
import modelo.Validaciones;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerProyecto {

    ViewAdministrador vistad;
    ManagerFactory manager;
    ProyectoJpaController modeloProyecto;
    Proyecto proyecto;
    ModeloTablaProyecto modeloTablaProyecto;
    ListSelectionModel listaProyectoModelo;

    public ControllerProyecto(ViewAdministrador vistad, ManagerFactory manager, ProyectoJpaController modeloProyecto) {
        this.vistad = vistad;
        this.manager = manager;
        this.modeloProyecto = modeloProyecto;
        //inicializar la tabla
        this.modeloTablaProyecto = new ModeloTablaProyecto();
        // devuelve la lista de personas
        this.modeloTablaProyecto.setFilas(modeloProyecto.findProyectoEntities());
        this.vistad.getjTableDatosProyectos().setModel(modeloTablaProyecto);
    }

    // Inicniar control producto 
    public void iniciarControlProyecto() {
        this.vistad.getBtnCREARPROYE().addActionListener(l -> guardarProyecto());
        this.vistad.getBtnEDITARPROYE().addActionListener(l -> editarProyecto());
        this.vistad.getBtnELIMINARPROYE().addActionListener(l -> eliminarProyecto());
        this.vistad.getBtnLIMPIARPROYE().addActionListener(l -> limpiar());
        this.vistad.getBtnlimpiarProyeBsqa().addActionListener(l -> limpiarBuscadorProyecto());
        this.vistad.getBtnbuscarProye().addActionListener(l -> buscarProyecto());
        this.vistad.getChekBsqProyes().addActionListener(l -> buscarProyecto());

        // eventos tabla
        this.vistad.getjTableDatosProyectos().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listaProyectoModelo = this.vistad.getjTableDatosProyectos().getSelectionModel();
        listaProyectoModelo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    proyectoSeleccionado();
                }
            }
        });

//        this.vistad.getBtnReporteGeneral().addActionListener(l -> reporteGeneral());
//        this.vistad.getBtnReporteIndividual().addActionListener(l -> reporteIndividual());
        // control de botones inicio
        this.vistad.getBtnEDITARPROYE().setEnabled(false);
        this.vistad.getBtnELIMINARPROYE().setEnabled(false);
    }

    private void proyectoSeleccionado() {
        if (this.vistad.getjTableDatosProyectos().getSelectedRow() != -1) {
            proyecto = modeloTablaProyecto.getFilas().get(this.vistad.getjTableDatosProyectos().getSelectedRow());
            //CARGAR A LA VISTA
            String numproye = String.valueOf(proyecto.getIdproy());
            this.vistad.getTxtNombreProye().setText(proyecto.getNombreproy());
            //this.vistad.fechainicio
            //this.vistad.fechafin
            this.vistad.getTxtLugarProye().setText(proyecto.getLugarproy());

            this.vistad.getBtnEDITARPROYE().setEnabled(true);
            this.vistad.getBtnELIMINARPROYE().setEnabled(true);
            this.vistad.getBtnCREARPROYE().setEnabled(false);

        }
    }

    // Métodos
    public void guardarProyecto() {
        if (validarCampos() != true) {
            Resouces.warning("ATENCIÓN!!!", "Debe llenar todos los campos ¬¬");
        } else {
            proyecto = new Proyecto();
            //de String a BigDecimal
//            String numproye = String.valueOf(proyecto.getIdproy());
//            double idp = Double.parseDouble(this.vistad.getTxtNumProye().getText());
//            BigDecimal idproye = BigDecimal.valueOf(idp);
//            proyecto.setIdproy(idproye);
            proyecto.setNombreproy(this.vistad.getTxtNombreProye().getText());
            //proyecto.setFechainicio
            //proyecto.setFechaFin
            proyecto.setLugarproy(this.vistad.getTxtLugarProye().getText());

            try {
                modeloProyecto.create(proyecto);
            } catch (PreexistingEntityException ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            modeloTablaProyecto.agregar(proyecto);
            Resouces.success(" ATENCIÓN!!!", "Proyecto creado correctamente :>!");
            limpiar();
        }

    }

    public void editarProyecto() {
        if (proyecto != null) {
            proyecto.setNombreproy(this.vistad.getTxtNombreProye().getText());
            //proyecto.setFechainicio
            //proyecto.setFechaFin
            proyecto.setLugarproy(this.vistad.getTxtLugarProye().getText());
            try {
                modeloProyecto.edit(proyecto);
                modeloTablaProyecto.eliminar(proyecto);
                modeloTablaProyecto.actualizar(proyecto);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Proyecto editado correctamente :>!");
            limpiar();
        } else {
            Resouces.error(" ATENCIÓN!!!", "No se pudo editar el proyecto :<!");
            limpiar();
        }
    }

    public void eliminarProyecto() {
        if (proyecto != null) {
            try {
                modeloProyecto.destroy(proyecto.getIdproy());
                modeloTablaProyecto.eliminar(proyecto);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Proyecto elminado correctamente :>!");
            limpiar();
        }
    }

    public void buscarProyecto() {

        if (this.vistad.getChekBsqProyes().isSelected()) {
            modeloTablaProyecto.setFilas(modeloProyecto.findProyectoEntities());
            modeloTablaProyecto.fireTableDataChanged();
        } else {
            if (this.vistad.getTxtBsqProductos().getText().isEmpty()) {
                Resouces.warning("Atención!!!", "Llene el campo de busqueda :P");
                limpiarBuscadorProyecto();
            } else {
                //de String a BigDecimal
                double idp = Double.parseDouble(this.vistad.getTxtBsqProyectos().getText());
                BigDecimal idproye = BigDecimal.valueOf(idp);
                modeloTablaProyecto.setFilas(modeloProyecto.buscarProyecto(idproye));
                modeloTablaProyecto.fireTableDataChanged();
            }
        }

    }

    //limipiar y validar
    public void limpiar() {

        this.vistad.getTxtNombreProye().setText("");
        //this.vistad.fechainicio;
        //this.vistad.fechafin
        this.vistad.getTxtLugarProye().setText("");

        this.vistad.getBtnEDITARPROYE().setEnabled(false);
        this.vistad.getBtnELIMINARPROYE().setEnabled(false);
        this.vistad.getBtnCREARPROYE().setEnabled(true);
    }

    public void limpiarBuscadorProyecto() {
        this.vistad.getTxtBsqProductos().setText("");
        modeloTablaProyecto.setFilas(modeloProyecto.findProyectoEntities());
        modeloTablaProyecto.fireTableDataChanged();
    }

    public boolean validarCampos() {
        Validaciones validar = new Validaciones();
        boolean validado = false;
        if (!this.vistad.getTxtNombreProye().getText().isEmpty()) {
            if (validar.ValidarTextoConEspacio(this.vistad.getTxtNombreProye().getText())) {

                if (!this.vistad.getTxtLugarProye().getText().isEmpty()) {
                    if (validar.ValidarTextoConEspacio(this.vistad.getTxtLugarProye().getText())) {

                        //Segunda valid
                        validado = true;

                    } else {
                        Resouces.warning("AVISO!!!", "LUGAR INCORRECTO");
                    }
                } else {
                    Resouces.warning("AVISO!!!", "CAMPO DE LUGAR VACIO");
                }
            } else {
                Resouces.warning("AVISO!!!", "NOMBRE INCORRECTO");
            }
        } else {
            Resouces.warning("AVISO!!!", "CAMPO DE NOMBRE VACIO");
        }
        return validado;
    }

}
