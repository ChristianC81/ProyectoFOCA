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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.*;
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
    Validaciones validacion;

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
//            this.vistaDona.getjTableDatosProductos().setModel(modeloTdona);
//            ControllerSistema.vdona.show();
            controlMetodosDonacion();

//        } else {
//            ControllerSistema.vista.show();
//        }
    }
        

    public void controlMetodosDonacion() {
        //this.vistaDona.getBtnCREARDONA().addActionListener(c -> crearDonacion());
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
//    public void crearDonacion() {
//        if (validarCampos() == false) {
//            Resouces.warning("Atención!!", "Por favor, llene todos los campos");
//        } else {
//            dona = new Donacion();
//            dona.setNombrePro(this.vistaDona.getjTextFieldNombrePro().getText());
//            dona.setPrecioPro(Double.parseDouble(this.vistaPro.getjTextFieldPrecioPro().getText()));
//            dona.setCantidadPro(Integer.parseInt(this.vistaPro.getjSpinnerCantidad().getValue().toString()));
//
//            modeloDonacion.create(dona);
//            modeloTdona.agregar(dona);
//            limpiarProductos();
//            Resouces.success("Atención!!", "Donación Creada Exitosamente");
//        }
//    }

    //EDITAR PERSONA
    public void editarDonacion() {
        if (validarCampos() == false) {
            Resouces.warning("Atención!!", "Por favor, llene todos los campos");
        } else {
            if (dona != null) {
//                dona.setNombrePro(this.vistaDona.getjTextFieldNombrePro().getText());
//                dona.setPrecioPro(Double.parseDouble(this.vistaDona.getjTextFieldPrecioPro().getText()));
//                dona.setCantidadPro(Integer.parseInt(this.vistaDona.getjSpinnerCantidad().getValue().toString()));
                try {
                    int select = JOptionPane.showConfirmDialog(vistaDona, "¿ESTÁS SEGUR@ DE EDITAR LOS DATOS DE ESTE PRODUCTO?");
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
//            try {
//                int select = JOptionPane.showConfirmDialog(vistaDona, "¿ESTÁS SEGUR@ DE EDITAR LOS DATOS DE ESTA DONACIÓN?");
//                if (select == JOptionPane.YES_OPTION) {
//                    //modeloDonacion.destroy(dona.getIddona());
//                    modeloTdona.eliminar(dona);
//                    //modeloTPro.actualizar(dona);
//                    limpiarDonaciones();
//                    Resouces.success("Atención!!", "Donación Eliminado Exitosamente");
//                }
//            } catch (NonexistentEntityException e) {
//                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, e);
//            }
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

    public boolean validarCampos() {
        boolean validar = true;
        if (this.vistaDona.getTxaDetalleProdDON().getText().isEmpty()) {
            validar = false;
        }
        if (this.vistaDona.getTxaMotivoDON().getText().isEmpty()) {
            validar = false;
        } 
        return validar;
    }

}
