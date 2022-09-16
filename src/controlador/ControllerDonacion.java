/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
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
//import donayectofoca.ManagerFactory;

/**
 * @author miri
 */
public class ControllerDonacion {

    ViewAdministrador vistaDona;
    ManagerFactory manage;
    DonacionJpaController modeloDonacion;
    ModeloTablaDonacion modeloTdona;
    Donacion dona;
    //JDesktopPane panelEscritorio;
    ListSelectionModel listadonacionmodel;
    //Validaciones validacion;

    public ControllerDonacion(ViewAdministrador vistaDona, ManagerFactory manage, DonacionJpaController modeloDonacion) {
        // this.vistaDona = vistaDona;
        this.manage = manage;
        this.modeloDonacion = modeloDonacion;
        this.modeloTdona = new ModeloTablaDonacion();
        this.modeloTdona.setFilas(modeloDonacion.findDonacionEntities());

//        if (ControllerSistema.vista == null) {
//            ControllerSistema.vista = new ViewAdministrador();
//            this.vistaDona = ControllerSistema.vista;
//            this.panelEscritorio.add(this.vistaPro);
            this.vistaDona.getjTableDatosDonacione().setModel(modeloTdona);
//            ControllerSistema.vdona.show();
        controlMetodosDonacion();
        cargarCombobox();

//        } else {
//            ControllerSistema.vista.show();
//        }
    }

    public void controlMetodosDonacion() {
        this.vistaDona.getBtnCREARDONA().addActionListener(c -> crearDonacion());
        this.vistaDona.getBtnEDITARDONA().addActionListener(e -> editarDonacion());
        this.vistaDona.getBtnELIMINARDONA().addActionListener(el -> eliminarDonacion());
        //this.vistaDona.getBtnLIMPIARDONA().addActionListener(lim -> limpiarProductos());
        this.vistaDona.getjTableDatosDonacione().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listadonacionmodel = this.vistaDona.getjTableDatosDonacione().getSelectionModel();
        listadonacionmodel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    donacionSeleccionado();
                }
            }

        });
        this.vistaDona.getBtnbuscarDONA().addActionListener(b -> buscarDonacion());
        this.vistaDona.getChekBsqDONA().addActionListener(bc -> buscarDonacion());
        this.vistaDona.getBtnlimpiarDONABUSQ().addActionListener(lp -> limpiarBusquedaDona());
//        this.vistaDona.getjButtonReportarProGeneral().addActionListener(lr -> reporteGeneral());
//        this.vistaDona.getjButtonReporteIndivPro().addActionListener(lr -> reporteIndividual());
    }

    //M É T O D O S  C R U D 
    //CREAR PERSONA
    public void crearDonacion() {
        if (camposVacios() == false) {
            Resouces.warning("ATENCIÓN!!", "Por favor, llene todos los campos");
        } else {
            if (validarCampos() == true) {
                Resouces.warning("Atención!!", "Por favor, llene todos los campos");
            } else {
                dona = new Donacion();
                dona.setDetalleproductodona(this.vistaDona.getTxaDetalleProdDON().getText());
                dona.setMotivodona(this.vistaDona.getTxaMotivoDON().getText());
                //FALTA FECHA
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
        if (validarCampos() == false) {
            Resouces.warning("Atención!!", "Por favor, llene todos los campos");
        } else {
            if (dona != null) {
                dona.setDetalleproductodona(this.vistaDona.getTxaDetalleProdDON().getText());
                //FALTA FECHA
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
            }
        }
    }

    //ELIMINAR PERSONA
    public void eliminarDonacion() {
        if (dona != null) {
            try {
                int select = JOptionPane.showConfirmDialog(vistaDona, "¿ESTÁS SEGUR@ DE EDITAR LOS DATOS DE ESTA DONACIÓN?");
                if (select == JOptionPane.YES_OPTION) {
                    try {
                        modeloDonacion.destroy(dona.getIddona());
                        modeloTdona.eliminar(dona);
                        modeloTdona.actualizar(dona);
                    } catch (IllegalOrphanException ex) {
                        Logger.getLogger(ControllerDonacion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    limpiarDonaciones();
                    Resouces.success("Atención!!", "Donación Eliminado Exitosamente");
                }
            } catch (NonexistentEntityException e) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void cargarCombobox() {
        try {
            Vector v = new Vector();
            v.addAll(new DonacionJpaController(manage.getEmf()).findDonacionEntities());
            this.vistaDona.getjComboBoxPersonasBenefactDon().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargarCombobox");
        }
    }

//    public void reporteGeneral() {
//        Resouces.imprimirReporte(ManagerFactory.getConnection(manage.getEmf().createEntityManager()), "/reportes/Productos.jasper",new HashMap());
//    }
//    public void reporteIndividual() {
//        if (dona != null) {
//            Map parameters = new HashMap();
//            parameters.put("cod", dona.getIddonaducto());
//            Resouces.imprimirReporte(ManagerFactory.getConnection(manage.getEmf().createEntityManager()), "/reportes/donaIndividual.jasper", parameters);
//
//        } else {
//            Resouces.warning("Atención!!", "Debe seleccionar un donaducto");
//        }
//    }
    public void limpiarDonaciones() {
        vistaDona.getTxaDetalleProdDON().setText("");
        vistaDona.getTxaMotivoDON().setText("");
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

    public void donacionSeleccionado() {
        if (this.vistaDona.getjTableDatosDonacione().getSelectedRow() != -1) {
            dona = modeloTdona.getFilas().get(this.vistaDona.getjTableDatosDonacione().getSelectedRow());
            this.vistaDona.getTxaDetalleProdDON().setText(dona.getDetalleproductodona());
            //CONTROLES DE BOTONES
            this.vistaDona.getBtnEDITARDONA().setEnabled(true);
            this.vistaDona.getBtnELIMINARDONA().setEnabled(true);
            this.vistaDona.getBtnCREARDONA().setEnabled(false);
        }
    }

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

}
