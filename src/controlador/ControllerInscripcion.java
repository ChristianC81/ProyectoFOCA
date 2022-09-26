/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Inscripcion;
import modelo.InscripcionJpaController;
import modelo.Persona;
import modelo.Proyecto;
import modelo.ProyectoJpaController;
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
        iniciarControlInscripcion();
        cargarComboBoxVoluntario();
        cargarComboBoxProyecto();
        txtAyuda();
    }

    //Inicniar control inscripcion
    public void iniciarControlInscripcion() {
        this.vistad.getBtnCREARINSCRI().addActionListener(l -> guardarInscripcion());
        this.vistad.getBtnEDITARINSCRI().addActionListener(l -> editarInscripcion());
        this.vistad.getBtnELIMINARINSCRI().addActionListener(l -> eliminarInscripcion());
        this.vistad.getBtnLIMPIARINSCRI().addActionListener(l -> limpiar());
        this.vistad.getBtnlimpiarInscriBsqa().addActionListener(l -> limpiarBuscadorInscripcion());
        this.vistad.getBtnbuscarInscri().addActionListener(l -> buscarInscripcionn());
        this.vistad.getChekBsqInscri().addActionListener(l -> buscarInscripcionn());

        //eventos tabla
        this.vistad.getjTableDatosInscripciones().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listaInscripcionModelo = this.vistad.getjTableDatosInscripciones().getSelectionModel();
        this.listaInscripcionModelo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    inscripcionSeleccionado();
                }
            }
        });

        this.vistad.getBtnREPORTEGENERALINSCRI().addActionListener(l -> reporteGeneral());
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
//            this.vistad.getjSpinnerDiasParticipacion().setValue(inscripcion.getNdiasparticipacionins());

            this.vistad.getBtnEDITARINSCRI().setEnabled(true);
            this.vistad.getBtnELIMINARINSCRI().setEnabled(true);
            this.vistad.getBtnCREARINSCRI().setEnabled(false);

        }
    }

    public void guardarInscripcion() {
        inscripcion = new Inscripcion();
        inscripcion.setIdpersona((Persona) this.vistad.getCbxCodigoVoluntario().getSelectedItem());
        inscripcion.setIdproyins((Proyecto) this.vistad.getCbxCodigoProyecto().getSelectedItem());
        inscripcion.setNdiasparticipacionins((Integer) this.vistad.getjSpinnerDiasParticipacion().getValue());
        try {
            modeloInscripcion.create(inscripcion);
            modeloTablaInscripcion.agregar(inscripcion);
            Resouces.success(" ATENCIÓN!!!", "Inscripción creado correctamente");
            limpiar();
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarInscripcion() {
        if (inscripcion != null) {
            inscripcion.setIdpersona((Persona) this.vistad.getCbxCodigoVoluntario().getSelectedItem());
            inscripcion.setIdproyins((Proyecto) this.vistad.getCbxCodigoProyecto().getSelectedItem());
            inscripcion.setNdiasparticipacionins((Integer) this.vistad.getjSpinnerDiasParticipacion().getValue());
            try {
                modeloInscripcion.edit(inscripcion);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Inscripción editado correctamente");
            limpiar();
        } else {
            Resouces.error(" ATENCIÓN!!!", "No se pudo editar la Inscripción");
        }

    }

    public void eliminarInscripcion() {
        int select = JOptionPane.showConfirmDialog(vistad, "¿Estas seguro de eliminar este proyecto?");
        if (select == JOptionPane.YES_OPTION) {
            if (inscripcion != null) {
                try {

                    modeloInscripcion.destroy(inscripcion.getIdins());

                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
                modeloTablaInscripcion.eliminar(inscripcion);
                modeloTablaInscripcion.actualizar(inscripcion);
                Resouces.success(" ATENCIÓN!!!", "Inscripción elminado correctamente");
                limpiar();
            }
        }

    }

    public void buscarInscripcionn() {
        if (this.vistad.getChekBsqInscri().isSelected()) {
            modeloTablaInscripcion.setFilas(modeloInscripcion.findInscripcionEntities());
            modeloTablaInscripcion.fireTableDataChanged();
        } else {
            if (!this.vistad.getTxtBsqInscripiones().getText().isEmpty()) {
                double idp = Double.parseDouble(this.vistad.getTxtBsqProyectos().getText());
                BigDecimal idproye = BigDecimal.valueOf(idp);
                modeloTablaInscripcion.setFilas(modeloInscripcion.buscarInscripcion(idproye));
                modeloTablaInscripcion.fireTableDataChanged();
            } else {
                limpiarBuscadorInscripcion();
            }
        }

    }

    public void cargarComboBoxVoluntario() {
        try {
            Vector v = new Vector();
             v.add(new String("Seleccione un Voluntario"));
            v.addAll((Collection) modeloInscripcion.buscarPersonavolu());
            this.vistad.getCbxCodigoVoluntario().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    public void cargarComboBoxProyecto() {
        try {
            Vector v = new Vector();
             v.add(new String("Seleccione un Proyecto"));
            v.addAll(new ProyectoJpaController(manager.getEmf()).findProyectoEntities());
            this.vistad.getCbxCodigoProyecto().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGInscripciones.jasper", new HashMap());
    }

//    limipiar 
    public void limpiar() {

        this.vistad.getCbxCodigoVoluntario().setSelectedIndex(0);
        this.vistad.getCbxCodigoProyecto().setSelectedIndex(0);
        //this.vistad.getjSpinnerDiasParticipacion().setValue(1);

        this.vistad.getBtnEDITARINSCRI().setEnabled(false);
        this.vistad.getBtnELIMINARINSCRI().setEnabled(false);
        this.vistad.getBtnCREARINSCRI().setEnabled(true);
    }

    public void limpiarBuscadorInscripcion() {
        this.vistad.getTxtBsqInscripiones().setText("");
        modeloTablaInscripcion.setFilas(modeloInscripcion.findInscripcionEntities());
        modeloTablaInscripcion.fireTableDataChanged();
    }

    public void txtAyuda() {
        TextPrompt busqdInsc = new TextPrompt("Solidaridad", vistad.getTxtBsqInscripiones());
    }
}
