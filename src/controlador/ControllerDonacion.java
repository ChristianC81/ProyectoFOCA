/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.*;
import modelo.exceptions.IllegalOrphanException;
import modelo.exceptions.NonexistentEntityException;
import proyectofoca.ManagerFactory;

/**
 * @author miri
 */
public class ControllerDonacion {

    ViewAdministrador vistaDona;
    ManagerFactory manager;
    DonacionJpaController modeloDonacion;
    ModeloTablaDonacion modeloTdona;
    Donacion dona;
    ListSelectionModel listadonacionmodel;
    Validaciones validacion;

    public ControllerDonacion(ViewAdministrador vistaDona, ManagerFactory manager, DonacionJpaController modeloDonacion) {
        this.vistaDona = vistaDona;
        this.manager = manager;
        this.modeloDonacion = modeloDonacion;
        this.modeloTdona = new ModeloTablaDonacion();
        this.modeloTdona.setFilas(modeloDonacion.findDonacionEntities());
        this.vistaDona.getjTableDatosDonacione().setModel(modeloTdona);

        cargarComboBoxBenefaDONA();
        txtAyuda();
    }

    public void iniciarControlDonacion() {
        this.vistaDona.getBtnCREARDONA().addActionListener(c -> crearDonacion());
        this.vistaDona.getBtnEDITARDONA().addActionListener(e -> editarDonacion());
        this.vistaDona.getBtnELIMINARDONA().addActionListener(el -> eliminarDonacion());
        this.vistaDona.getBtnLIMPIARDONA().addActionListener(lim -> limpiarDonaciones());
        this.vistaDona.getBtnlimpiarDONABUSQ().addActionListener(lp -> limpiarBusquedaDona());
        this.vistaDona.getBtnbuscarDONA().addActionListener(b -> buscarDonacion());
        this.vistaDona.getChekBsqDONA().addActionListener(bc -> buscarDonacion());

        //eventos tabla
        this.vistaDona.getjTableDatosDonacione().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listadonacionmodel = this.vistaDona.getjTableDatosDonacione().getSelectionModel();
        this.listadonacionmodel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    donacionSeleccionado();
                }
            }

        });
        this.vistaDona.getBtnREPORTEGENERALDON().addActionListener(lr -> reporteGeneral());
//        this.vistaDona.getjButtonReporteIndivPro().addActionListener(lr -> reporteIndividual());
        // control de botones inicio
        this.vistaDona.getBtnEDITARDONA().setEnabled(false);
        this.vistaDona.getBtnELIMINARDONA().setEnabled(false);
    }

    public void cargarComboBoxBenefaDONA() {
        try {
            Vector v = new Vector();
            v.add(new String("Seleccione un Benefactor"));
            v.addAll(new PersonaJpaController(manager.getEmf()).findPersonaEntities());
            this.vistaDona.getjComboBoxPersonasBenefactDon().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    public void donacionSeleccionado() {
        if (this.vistaDona.getjTableDatosDonacione().getSelectedRow() != -1) {
            dona = modeloTdona.getFilas().get(this.vistaDona.getjTableDatosDonacione().getSelectedRow());
            //cargar los datos a la vista
            this.vistaDona.getTxaDetalleProdDON().setText(dona.getDetalleproductodona());
            this.vistaDona.getTxaMotivoDON().setText(dona.getMotivodona());
            //this.vistaDona.getjDateChooserFechaEntrega.setDate(dona.getFechaentregadona());
            this.vistaDona.getjComboBoxPersonasBenefactDon().setSelectedItem(dona.getIdpersona());
            //CONTROLES DE BOTONES
            this.vistaDona.getBtnEDITARDONA().setEnabled(true);
            this.vistaDona.getBtnELIMINARDONA().setEnabled(true);
            this.vistaDona.getBtnCREARDONA().setEnabled(false);
        }
    }

    //M É T O D O S  C R U D 
    //CREAR PERSONA
    public void crearDonacion() {
        if (camposVacios() == false) {
            Resouces.warning("ATENCIÓN!!", "Por favor, llene todos los campos");
        } else {
            if (validarCampos() == false) {
                Resouces.warning("Atención!!", "Por favor, llene todos los campos");
            } else {
                dona = new Donacion();
                dona.setDetalleproductodona(this.vistaDona.getTxaDetalleProdDON().getText());
                //dona.setFechaentregadona(this.vistaDona.getjDateChooserFechaEntrega().getDate());
                dona.setMotivodona(this.vistaDona.getTxaMotivoDON().getText());
                dona.setIdpersona((Persona) this.vistaDona.getjComboBoxPersonasBenefactDon().getSelectedItem());

                try {
                    modeloDonacion.create(dona);
                    modeloTdona.agregar(dona);
                    limpiarDonaciones();
                } catch (Exception ex) {
                    Logger.getLogger(ControllerDonacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpiarDonaciones();
                Resouces.success("Atención!!", "Donación Creada Exitosamente");
            }
        }
    }
    //EDITAR PERSONA

    public void editarDonacion() {
        if (camposVacios() == false) {
            Resouces.warning("ATENCIÓN!!", "Por favor, llene todos los campos");
        } else {
            if (validarCampos() == false) {
                Resouces.warning("Atención!!", "Por favor, llene todos los campos");
            } else {
                if (dona != null) {
                    dona.setDetalleproductodona(this.vistaDona.getTxaDetalleProdDON().getText());
                    //dona.setFechaentregadona(this.vistaDona.getjDateChooserFechaEntrega().getDate());
                    dona.setMotivodona(this.vistaDona.getTxaMotivoDON().getText());
                    dona.setIdpersona((Persona) this.vistaDona.getjComboBoxPersonasBenefactDon().getSelectedItem());
                    try {
                        int select = JOptionPane.showConfirmDialog(vistaDona, "¿ESTÁS SEGUR@ DE EDITAR LOS DATOS DE ESTA DONACIÓN?");
                        if (select == JOptionPane.YES_OPTION) {
                            modeloDonacion.edit(dona);
                            modeloTdona.eliminar(dona);
                            modeloTdona.actualizar(dona);
                            Resouces.success("Atención!!", "Producto Editado Exitosamente");
                        }
                    } catch (Exception e) {
                        Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, e);
                    }
                    limpiarDonaciones();
                } else {
                    Resouces.error(" ATENCIÓN!!!", "No se pudo editar el producto :<!");
                    limpiarDonaciones();
                }
            }
        }
    }

    //ELIMINAR PERSONA
    public void eliminarDonacion() {
        if (dona != null) {
            try {
                int select = JOptionPane.showConfirmDialog(vistaDona, "¿ESTÁS SEGUR@ DE EDITAR LOS DATOS DE ESTA DONACIÓN?");
                if (select == JOptionPane.YES_OPTION) {
                    modeloDonacion.destroy(dona.getIddona());
                    modeloTdona.eliminar(dona);
                    //modeloTdona.actualizar(dona);
                    limpiarDonaciones();
                    Resouces.success("Atención!!", "Donación Eliminado Exitosamente");
                }
            } catch (NonexistentEntityException e) {
                Logger.getLogger(ControllerDonacion.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGDonaciones.jasper", new HashMap());
    }
//    public void reporteIndividual() {
//        if (dona != null) {
//            Map parameters = new HashMap();
//            parameters.put("cod", dona.getIddonaducto());
//            Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/donaIndividual.jasper", parameters);
//
//        } else {
//            Resouces.warning("Atención!!", "Debe seleccionar un donaducto");
//        }
//    }

    public void buscarDonacion() {
        if (this.vistaDona.getChekBsqDONA().isSelected()) {
            modeloTdona.setFilas(modeloDonacion.findDonacionEntities());
            modeloTdona.fireTableDataChanged();
        } else {
            if (!this.vistaDona.getTxtBsqDonacionesCriterio().getText().equals("")) {
                modeloTdona.setFilas(modeloDonacion.buscarDonacion(this.vistaDona.getTxtBsqDonacionesCriterio().getText()));
                modeloTdona.fireTableDataChanged();
            } else {
                limpiarBusquedaDona();
            }
        }
    }

    public void limpiarDonaciones() {
        vistaDona.getTxaDetalleProdDON().setText("");
        vistaDona.getTxaMotivoDON().setText("");
        //vistaDona.getjDateChooserFechaEntrega.setdate(null);
        vistaDona.getjComboBoxPersonasBenefactDon().setSelectedIndex(0);
        dona = null;
        //CONTROL DE BOTONES
        this.vistaDona.getBtnEDITARDONA().setEnabled(false);
        this.vistaDona.getBtnELIMINARDONA().setEnabled(false);
        this.vistaDona.getBtnCREARDONA().setEnabled(true);
        this.vistaDona.getjTableDatosProductos().getSelectionModel().clearSelection();
    }

    public void limpiarBusquedaDona() {
        vistaDona.getTxtBsqDonacionesCriterio().setText("");
        modeloTdona.setFilas(modeloDonacion.findDonacionEntities());
        modeloTdona.fireTableDataChanged();
    }

    public boolean camposVacios() {
        boolean validar = true;
        if (this.vistaDona.getTxaDetalleProdDON().getText().isEmpty()) {
            validar = false;
        }
        if (this.vistaDona.getTxaMotivoDON().getText().isEmpty()) {
            validar = false;
        }
        return validar;
    }

    public boolean validarCampos() {
        Validaciones validar = new Validaciones();
        boolean validado = false;

        if (validar.validarCadenaSinCaracteres(this.vistaDona.getTxaDetalleProdDON().getText())) {
            if (validar.validarCadena(this.vistaDona.getTxaMotivoDON().getText())) {
                validado = true;
            } else {
                Resouces.warning("Atención", "Incorrecto");
            }
        } else {
            Resouces.warning("Atención", "Incorrecto");
        }
        return validado;
    }

    public void txtAyuda() {
        TextPrompt detalleDona = new TextPrompt("Caja de Uvas", vistaDona.getTxaDetalleProdDON());
        TextPrompt motivoDona = new TextPrompt("Motivo: Causa Solidaria ", vistaDona.getTxaMotivoDON());
        TextPrompt busqdDona = new TextPrompt("Benefactor: Juan", vistaDona.getTxtBsqDonacionesCriterio());
    }

}
