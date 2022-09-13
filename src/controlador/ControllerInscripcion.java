/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import modelo.Inscripcion;
import modelo.InscripcionJpaController;
import modelo.Producto;
import modelo.ProductoJpaController;
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
    InscripcionJpaController modelInp;
    Inscripcion inscripcion;
    ModeloTablaProducto modeloTablaProd;
    ListSelectionModel listaProductoModel;
//
//    public void guardarInscripcion() throws PreexistingEntityException, Exception {
//        if (validarCampos() != true) {
//            Resouces.warning("ATENCIÓN!!!", "Debe llenar todos los campos ¬¬");
//        } else {
//            inscripcion = new Inscripcion();
//            inscripcion.setIdpersona( this.vistad);
//            inscripcion.setTipoprod(this.vistad.getTxtTipoProducto().getText());
//            modelPd.create(inscripcion);
//            modeloTablaProd.agregar(inscripcion);
//            Resouces.success(" ATENCIÓN!!!", "Producto creado correctamente :>!");
//            limpiarProd();
//        }
//
//    }
//
//    public void editarProducto() {
//        if (inscripcion != null) {
//            inscripcion.setCantidadprod((BigInteger) this.vistad.getjSpinnerCantidad().getValue());
//            inscripcion.setTipoprod(this.vistad.getTxtTipoProducto().getText());
//            try {
//                modelPd.edit(inscripcion);
//                modeloTablaProd.eliminar(inscripcion);
//                modeloTablaProd.actualizar(inscripcion);
//            } catch (Exception ex) {
//                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Resouces.success(" ATENCIÓN!!!", "Producto editado correctamente :>!");
//            limpiarProd();
//        } else {
//            Resouces.error(" ATENCIÓN!!!", "No se pudo editar el inscripcion :<!");
//            limpiarProd();
//        }
//    }
//
//    public void eliminarProd() {
//        if (inscripcion != null) {
//            try {
//                modelPd.destroy(inscripcion.getIdprod());
//                modeloTablaProd.eliminar(inscripcion);
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
//    
//    limipiar y validar
//    public void limpiarProd() {
//        this.vistad.getTxtTipoProducto().setText("");
//        this.vistad.getjSpinnerCantidad().setValue(0);
//        this.vistad.getCbxIdDonacion().setSelectedItem(0);
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
