/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Inscripcion;
import modelo.InscripcionJpaController;
import modelo.Persona;
import modelo.Proyecto;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerInscripcion {

    ViewAdministrador vistad;
    ManagerFactory manager;
    InscripcionJpaController modeloInscripcion;
    Inscripcion inscripcion;
    ModeloTablaInscripcion modeloTablaInscripcion;
    ListSelectionModel listaInscripcionModelo;

    public ControllerInscripcion(ViewAdministrador vistad, ManagerFactory manager, InscripcionJpaController modeloInscripcion) {
        this.vistad = vistad;
        this.manager = manager;
        this.modeloInscripcion = modeloInscripcion;
        this.modeloTablaInscripcion = new ModeloTablaInscripcion();
        this.modeloTablaInscripcion.setFilas(modeloInscripcion.findInscripcionEntities());
        this.vistad.getjTableDatosInscripciones().setModel(modeloTablaInscripcion);
    }

    //Inicniar control inscripcion
    public void iniciarControlInscripcion() {
//        this.vistad.getBtnCREARINSCRI().addActionListener(l -> guardarInscripcion());
//        this.vistad.getBtnEDITARINSCRI().addActionListener(l -> editarInscripcion());
//        this.vistad.getBtnELIMINARINSCRI().addActionListener(l -> eliminarInscripcion());
//        this.vistad.getBtnLIMPIARINSCRI().addActionListener(l -> limpiar());
//        this.vistad.getBtnlimpiarInscriBsqa().addActionListener(l -> limpiarBuscadorInscripcion());
//        this.vistad.getBtnbuscarInscri().addActionListener(l -> buscarInscripcionn());
//        this.vistad.getChekBsqInscri().addActionListener(l -> buscarInscripcionn());

        //eventos tabla
        this.vistad.getjTableDatosInscripciones().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listaInscripcionModelo = this.vistad.getjTableDatosInscripciones().getSelectionModel();
        listaInscripcionModelo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    inscripcionSeleccionado();
                }
            }
        });

//        this.vistad.getBtnReporteGeneral().addActionListener(l -> reporteGeneral());
//        this.vistad.getBtnReporteIndividual().addActionListener(l -> reporteIndividual());
//         control de botones inicio
        this.vistad.getBtnEDITARINSCRI().setEnabled(false);
        this.vistad.getBtnELIMINARINSCRI().setEnabled(false);
    }

    private void inscripcionSeleccionado() {
        if (this.vistad.getjTableDatosInscripciones().getSelectedRow() != -1) {
            inscripcion = modeloTablaInscripcion.getFilas().get(this.vistad.getjTableDatosInscripciones().getSelectedRow());
//            CARGAR A LA VISTA
            this.vistad.getCbxCodigoVoluntario().setSelectedItem(inscripcion.getIdpersona());
            this.vistad.getCbxCodigoProyecto().setSelectedItem(inscripcion.getIdproyins());
            this.vistad.getjSpinnerDiasParticipacion().setValue(inscripcion.getNdiasparticipacionins());

            this.vistad.getBtnEDITARPROYE().setEnabled(true);
            this.vistad.getBtnELIMINARPROYE().setEnabled(true);
            this.vistad.getBtnCREARPROYE().setEnabled(false);

        }
    }

    //Métodos
//    public void guardarInscripcion() {
//        inscripcion = new Inscripcion();
//        inscripcion.setIdpersona((Persona) this.vistad.getCbxCodigoVoluntario().getSelectedItem());
//        inscripcion.setIdproyins((Proyecto) this.vistad.getCbxCodigoProyecto().getSelectedItem());
//        inscripcion.setNdiasparticipacionins((BigInteger) this.vistad.getjSpinnerDiasParticipacion().getValue());
//        try {
//            modeloInscripcion.create(inscripcion);
//            modeloTablaInscripcion.agregar(inscripcion);
//        } catch (PreexistingEntityException ex) {
//            Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        Resouces.success(" ATENCIÓN!!!", "Inscripción creado correctamente :>!");
//        limpiar();
//    }
//
//    public void editarInscripcion() {
//        if (inscripcion != null) {
//            inscripcion.setIdpersona((Persona) this.vistad.getCbxCodigoVoluntario().getSelectedItem());
//            inscripcion.setIdproyins((Proyecto) this.vistad.getCbxCodigoProyecto().getSelectedItem());
//            inscripcion.setNdiasparticipacionins((BigInteger) this.vistad.getjSpinnerDiasParticipacion().getValue());
//            try {
//                modeloInscripcion.edit(inscripcion);
//                modeloTablaInscripcion.eliminar(inscripcion);
//                modeloTablaInscripcion.actualizar(inscripcion);
//            } catch (Exception ex) {
//                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Resouces.success(" ATENCIÓN!!!", "Inscripción editado correctamente :>!");
//            limpiar();
//        } else {
//            Resouces.error(" ATENCIÓN!!!", "No se pudo editar la Inscripción :<!");
//            limpiar();
//        }
//    }

    public void eliminarInscripcion() {
        if (inscripcion != null) {
            try {
                modeloInscripcion.destroy(inscripcion.getIdins());
                modeloTablaInscripcion.eliminar(inscripcion);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Inscripción elminado correctamente :>!");
            limpiar();
        }
    }

    public void buscarInscripcionn() {

        if (this.vistad.getChekBsqInscri().isSelected()) {
            modeloTablaInscripcion.setFilas(modeloInscripcion.findInscripcionEntities());
            modeloTablaInscripcion.fireTableDataChanged();
        } else {
            if (this.vistad.getTxtBsqInscripiones().getText().isEmpty()) {
                Resouces.warning("Atención!!!", "Llene el campo de busqueda :P");
                limpiarBuscadorInscripcion();
            } else {

                double idp = Double.parseDouble(this.vistad.getTxtBsqProyectos().getText());
                BigDecimal idproye = BigDecimal.valueOf(idp);
                modeloTablaInscripcion.setFilas(modeloInscripcion.buscarInscripcion(idproye));
                modeloTablaInscripcion.fireTableDataChanged();
            }
        }

    }

//    limipiar 
    public void limpiar() {

        this.vistad.getCbxCodigoVoluntario().setSelectedIndex(0);
        this.vistad.getCbxCodigoProyecto().setSelectedIndex(0);

        this.vistad.getBtnEDITARINSCRI().setEnabled(false);
        this.vistad.getBtnELIMINARINSCRI().setEnabled(false);
        this.vistad.getBtnCREARINSCRI().setEnabled(true);
    }

    public void limpiarBuscadorInscripcion() {
        this.vistad.getTxtBsqInscripiones().setText("");
        modeloTablaInscripcion.setFilas(modeloInscripcion.findInscripcionEntities());
        modeloTablaInscripcion.fireTableDataChanged();
    }

}
