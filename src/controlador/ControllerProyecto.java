/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Persona;
import modelo.PersonaJpaController;
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
    PersonaJpaController modeloPersona;
    Proyecto proyecto;
    ModeloTablaProyecto modeloTablaProyecto;
    ListSelectionModel listaProyectoModelo;

    public ControllerProyecto(ViewAdministrador vistad, ManagerFactory manager, ProyectoJpaController modeloProyecto) {
        this.vistad = vistad;
        this.manager = manager;
        this.modeloProyecto = modeloProyecto;
        this.vistad.setVisible(true);
        this.modeloTablaProyecto = new ModeloTablaProyecto();
        this.modeloTablaProyecto.setFilas(modeloProyecto.findProyectoEntities());
        this.vistad.getjTableDatosProyectos().setModel(modeloTablaProyecto);

        iniciarControlProyecto();
        cargarComboBoxBeneficiario();
        txtAyuda();
    }

    // Iniciar control producto 
    public void iniciarControlProyecto() {

        this.vistad.getBtnCREARPROYE().addActionListener(l -> guardarProyecto());
        this.vistad.getBtnEDITARPROYE().addActionListener(l -> editarProyecto());
        this.vistad.getBtnELIMINARPROYE().addActionListener(l -> eliminarProyecto());
        this.vistad.getBtnLIMPIARPROYE().addActionListener(l -> limpiar());
        this.vistad.getBtnlimpiarProyeBsqa().addActionListener(l -> limpiarBuscadorProyecto());
        this.vistad.getBtnbuscarProye().addActionListener(l -> buscarProyecto());
        this.vistad.getChekBsqProyes().addActionListener(l -> buscarProyecto());
        this.vistad.getBtnREPORTEGENERALPROYE().addActionListener(l -> reporteGeneral());
        this.vistad.getBtnREPORTEINDIVIDUALPROYE().addActionListener(l -> reporteIndividual());
        // eventos tabla
        this.vistad.getjTableDatosProyectos().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listaProyectoModelo = this.vistad.getjTableDatosProyectos().getSelectionModel();
        this.listaProyectoModelo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    proyectoSeleccionado();
                }
            }
        });
        this.vistad.getBtnEDITARPROYE().setEnabled(false);
        this.vistad.getBtnELIMINARPROYE().setEnabled(false);

    }

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGProyectos.jasper", new HashMap());
    }

    public void reporteIndividual() {
        if (proyecto != null) {
            Map parameters = new HashMap();
            parameters.put("cod", proyecto.getIdproy());
            Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RIProyectos.jasper", parameters);
        } else {
            Resouces.warning("ATENCIÓN!!!", "Debe seleccionar un proyecto :P");
        }
    }

    private void proyectoSeleccionado() {
        if (this.vistad.getjTableDatosProyectos().getSelectedRow() != -1) {
            proyecto = modeloTablaProyecto.getFilas().get(this.vistad.getjTableDatosProyectos().getSelectedRow());
            //CARGAR A LA VISTA
            this.vistad.getTxtNombreProye().setText(proyecto.getNombreproy());
            this.vistad.getJdcFechaInicio().setDate(proyecto.getFechainicioproy());
            this.vistad.getJdcFechaFin().setDate(proyecto.getFechafinproy());
            this.vistad.getTxtLugarProye().setText(proyecto.getLugarproy());
            this.vistad.getjComboBoxBeneficiarioProye().setSelectedItem(proyecto.getIdpersona());

            this.vistad.getBtnEDITARPROYE().setEnabled(true);
            this.vistad.getBtnELIMINARPROYE().setEnabled(true);
            this.vistad.getBtnCREARPROYE().setEnabled(false);

        }
    }

    public void guardarProyecto() {
        if (validarCampos() == false) {
        } else {
            proyecto = new Proyecto();
            //de String a BigDecimal
//            String numproye = String.valueOf(proyecto.getIdproy());
//            double idp = Double.parseDouble(this.vistad.getTxtNumProye().getText());
//            BigDecimal idproye = BigDecimal.valueOf(idp);
//            proyecto.setIdproy(idproye);
            proyecto.setNombreproy(this.vistad.getTxtNombreProye().getText());
            proyecto.setFechainicioproy(this.vistad.getJdcFechaInicio().getDate());
            proyecto.setFechafinproy(this.vistad.getJdcFechaFin().getDate());
            proyecto.setLugarproy(this.vistad.getTxtLugarProye().getText());
            proyecto.setIdpersona((Persona) this.vistad.getjComboBoxBeneficiarioProye().getSelectedItem());

            try {
                modeloProyecto.create(proyecto);
                modeloTablaProyecto.agregar(proyecto);
                Resouces.success(" ATENCIÓN!!!", "Proyecto creado correctamente");
                limpiar();
            } catch (PreexistingEntityException ex) {
                Logger.getLogger(ControllerProyecto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProyecto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void editarProyecto() {
        if (proyecto != null) {
            proyecto.setNombreproy(this.vistad.getTxtNombreProye().getText());
            //proyecto.setFechainicio
            //proyecto.setFechaFin
            proyecto.setLugarproy(this.vistad.getTxtLugarProye().getText());
            proyecto.setIdpersona((Persona) this.vistad.getjComboBoxBeneficiarioProye().getSelectedItem());
            try {
                modeloProyecto.edit(proyecto);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProyecto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Proyecto editado correctamente");
            limpiar();
        } else {
            Resouces.error(" ATENCIÓN!!!", "No se pudo editar el proyecto");
        }
    }

    public void eliminarProyecto() {
        if (proyecto != null) {
            try {
                modeloProyecto.destroy(proyecto.getIdproy());

            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            modeloTablaProyecto.eliminar(proyecto);
            modeloTablaProyecto.actualizar(proyecto);
            Resouces.success(" ATENCIÓN!!!", "Proyecto eliminado correctamente");
            limpiar();
        }
    }

    public void buscarProyecto() {
        if (this.vistad.getChekBsqProyes().isSelected()) {
            modeloTablaProyecto.setFilas(modeloProyecto.findProyectoEntities());
            modeloTablaProyecto.fireTableDataChanged();
        } else {
            if (!this.vistad.getTxtBsqProyectos().getText().equals("")) {
                modeloTablaProyecto.setFilas(modeloProyecto.buscarProyecto(this.vistad.getTxtBsqProyectos().getText().trim()));
                modeloTablaProyecto.fireTableDataChanged();
            } else {
                limpiarBuscadorProyecto();
            }
        }
    }

    public void cargarComboBoxBeneficiario() {
        try {
            Vector v = new Vector();
            v.add(new String("Seleccione un Beneficiario"));
            v.addAll((Collection) modeloProyecto.buscarPersonabene());
            this.vistad.getjComboBoxBeneficiarioProye().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    //limipiar y validar
    public void limpiar() {

        this.vistad.getTxtNombreProye().setText("");
        //this.vistad.fechainicio;
        //this.vistad.fechafin
        this.vistad.getTxtLugarProye().setText("");
        this.vistad.getjComboBoxBeneficiarioProye().setSelectedIndex(0);

        this.vistad.getBtnEDITARPROYE().setEnabled(false);
        this.vistad.getBtnELIMINARPROYE().setEnabled(false);
        this.vistad.getBtnCREARPROYE().setEnabled(true);
    }

    public void limpiarBuscadorProyecto() {
        this.vistad.getTxtBsqProyectos().setText("");
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

    public void txtAyuda() {
        TextPrompt nombreProy = new TextPrompt("Ayudandonos", vistad.getTxtNombreProye());
        TextPrompt lugarProy = new TextPrompt("Parque Central", vistad.getTxtLugarProye());
        TextPrompt busqdProy = new TextPrompt("Solidaridad", vistad.getTxtBsqProyectos());
    }
}
