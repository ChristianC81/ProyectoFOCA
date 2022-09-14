/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import static controlador.ControllerSistema.vista;
import java.awt.Dimension;
import java.math.BigInteger;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Donacion;
import modelo.DonacionJpaController;
import modelo.InscripcionJpaController;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.Producto;
import modelo.ProductoJpaController;
import modelo.Proyecto;
import modelo.ProyectoJpaController;
import modelo.UsuarioJpaController;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerPersona {

ViewAdministrador vistap;
    ManagerFactory manager;
    PersonaJpaController modelPer;
    Persona persona;
    ModeloTablaPersona modeloTablaPer;
    ListSelectionModel listaProductoModel;

    public ControllerPersona(ViewAdministrador vistap, ManagerFactory manager, PersonaJpaController modelPer) {
        this.vistap = vistap;
        this.manager = manager;
        this.modelPer = modelPer;
        //inicializar la tabla
        this.modeloTablaPer = new ModeloTablaPersona();
        // devuelve la lista de personas
        this.modeloTablaPer.setFilas(modelPer.findPersonaEntities());
        this.vistap.getjTableDatosPersonas().setModel(modeloTablaPer);
    }

    public void cargarComboBoxDona() {
        try {
            Vector v = new Vector();
            v.addAll(new DonacionJpaController(manager.getEmf()).findDonacionEntities());
            this.vistap.getCbxIdDonacion().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }
//
//    public void cargarComboBoxProy() {
//        try {
//            Vector v = new Vector();
//            v.addAll(new ProyectoJpaController(manager.getEmf()).findProyectoEntities());
//            this.vistad.getCbxProyecto().setModel(new DefaultComboBoxModel(v));
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Capturando errores cargando combobox");
//        }
//    }
//
//    private void productoSeleccionado() {
//        if (this.vistad.getjTableDatosProductos().getSelectedRow() != -1) {
//            persona = modeloTablaPergetFilas().get(this.vistad.getjTableDatosProductos().getSelectedRow());
//            //cargar los datos a la vista
//            this.vistap.getTxtTipoProducto().setText(persona.getTipoprod());
//            this.vistap.getjSpinnerCantidad().setValue(persona.getCantidadprod());
//            this.vistap.getCbxProyecto().setSelectedItem(persona.getIdproyprod().getNombreproy());
//            this.vistap.getCbxIdDonacion().setSelectedItem(persona.getIddonaprod());
//            // control de botones seleccionados
//            this.vistap.getBtnEDITARPROD().setEnabled(true);
//            this.vistap.getBtnELIMINARPROD().setEnabled(true);
//            this.vistap.getBtnCREARPROD().setEnabled(false);
//
//        }
//    }
//
//    // Métodos
//    public void guardarProducto() {
//        if (validarCampos() != true) {
//            Resouces.warning("ATENCIÓN!!!", "Debe llenar todos los campos ¬¬");
//        } else {
//            producto = new Producto();
//            producto.setCantidadprod((BigInteger) this.vistad.getjSpinnerCantidad().getValue());
//            producto.setTipoprod(this.vistad.getTxtTipoProducto().getText());
//            try {
//                modelPd.create(producto);
//            } catch (PreexistingEntityException ex) {
//                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (Exception ex) {
//                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            modeloTablaProd.agregar(producto);
//            Resouces.success(" ATENCIÓN!!!", "Producto creado correctamente :>!");
//            limpiarProd();
//        }
//
//    }
//
//    public void editarProducto() {
//        if (producto != null) {
//            producto.setCantidadprod((BigInteger) this.vistad.getjSpinnerCantidad().getValue());
//            producto.setTipoprod(this.vistad.getTxtTipoProducto().getText());
//            try {
//                modelPd.edit(producto);
//                modeloTablaProd.eliminar(producto);
//                modeloTablaProd.actualizar(producto);
//            } catch (Exception ex) {
//                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Resouces.success(" ATENCIÓN!!!", "Producto editado correctamente :>!");
//            limpiarProd();
//        } else {
//            Resouces.error(" ATENCIÓN!!!", "No se pudo editar el producto :<!");
//            limpiarProd();
//        }
//    }
//
//    public void eliminarProd() {
//        if (producto != null) {
//            try {
//                modelPd.destroy(producto.getIdprod());
//                modeloTablaProd.eliminar(producto);
//            } catch (NonexistentEntityException ex) {
//                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Resouces.success(" ATENCIÓN!!!", "Producto elminado correctamente :>!");
//            limpiarProd();
//        }
//    }
//
//    public void buscarProducto() {
//
//        if (this.vistad.getChekBsqProds().isSelected()) {
//            modeloTablaProd.setFilas(modelPd.findProductoEntities());
//            modeloTablaProd.fireTableDataChanged();
//        } else {
//            if (this.vistad.getTxtBsqProductos().getText().isEmpty()) {
//                Resouces.warning("Atención!!!", "Llene el campo de busqueda :P");
//                limpiarBuscadorProd();
//            } else {
//                modeloTablaProd.setFilas(modelPd.buscarProducto(this.vistad.getTxtBsqProductos().getText()));
//                modeloTablaProd.fireTableDataChanged();
//            }
//        }
//
//    }
//
//    //limipiar y validar
//    public void limpiarProd() {
//        this.vistad.getTxtTipoProducto().setText("");
//        this.vistad.getjSpinnerCantidad().setValue(0);
//        this.vistad.getCbxIdDonacion().setSelectedIndex(0);
//        this.vistad.getBtnEDITARPROD().setEnabled(false);
//        this.vistad.getBtnELIMINARPROD().setEnabled(false);
//        this.vistad.getBtnCREARPROD().setEnabled(true);
//    }
//
//    public void limpiarBuscadorProd() {
//        this.vistad.getTxtBsqProductos().setText("");
//        modeloTablaProd.setFilas(modelPd.findProductoEntities());
//        modeloTablaProd.fireTableDataChanged();
//    }
//
//    public boolean validarCampos() {
//        boolean valid = true;
//
//        if (vistad.getTxtTipoProducto().getText().isEmpty()) {
//            Resouces.warning("Atención!!!", "El campo tipo esta vacio");
//            valid = false;
//        }
//
//        return valid;
//    }
}
