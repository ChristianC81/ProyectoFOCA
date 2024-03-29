/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Donacion;
import modelo.DonacionJpaController;
import modelo.Producto;
import modelo.ProductoJpaController;
import modelo.Proyecto;
import modelo.ProyectoJpaController;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerProducto {

    ViewAdministrador vistad;
    ManagerFactory manager;
    ProductoJpaController modelPd;
    Producto producto;
    ModeloTablaProducto modeloTablaProd;
    ListSelectionModel listaProductoModel;

    public ControllerProducto(ViewAdministrador vistad, ManagerFactory manager, ProductoJpaController modelPd) {
        this.vistad = vistad;
        this.manager = manager;
        this.modelPd = modelPd;
        //inicializar la tabla
        this.modeloTablaProd = new ModeloTablaProducto();
        // devuelve la lista de personas
        this.modeloTablaProd.setFilas(modelPd.findProductoEntities());
        this.vistad.getjTableDatosProductos().setModel(modeloTablaProd);
        cargarComboBoxDona();
        cargarComboBoxProy();
        txtAyuda();

    }

    // Inicniar control producto 
    public void iniciarControlProd() {
        this.vistad.getBtnCREARPROD().addActionListener(l -> guardarProducto());
        this.vistad.getBtnEDITARPROD().addActionListener(l -> editarProducto());
        this.vistad.getBtnELIMINARPROD().addActionListener(l -> eliminarProd());
        this.vistad.getBtnLIMPIARPROD().addActionListener(l -> limpiarProd());
        this.vistad.getBtnlimpiarProdbsqd().addActionListener(l -> limpiarBuscadorProd());
        this.vistad.getBtnbuscarProd().addActionListener(l -> buscarProducto());
        this.vistad.getChekBsqProds().addActionListener(l -> buscarProducto());

        // eventos tabla
        this.vistad.getjTableDatosProductos().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listaProductoModel = this.vistad.getjTableDatosProductos().getSelectionModel();
        listaProductoModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    productoSeleccionado();
                }
            }
        });

        this.vistad.getBtnREPORTEGENERALPROD().addActionListener(l -> reporteGeneral());
       this.vistad.getBtnREPORTEINDIVIDUALPROD().addActionListener(l -> reporteIndividual());
        // control de botones inicio
        this.vistad.getBtnEDITARPROD().setEnabled(false);
        this.vistad.getBtnELIMINARPROD().setEnabled(false);
    }

    public void cargarComboBoxDona() {
        try {
            Vector v = new Vector();
             v.add(new String("Seleccione un Detalle de Donación"));
            v.addAll(new DonacionJpaController(manager.getEmf()).findDonacionEntities());
            this.vistad.getCbxIdDonacion().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    public void cargarComboBoxProy() {
        try {
            Vector v = new Vector();
            v.add(new String("Seleccione un Proyecto"));
            v.addAll(new ProyectoJpaController(manager.getEmf()).findProyectoEntities());
            this.vistad.getCbxProyecto().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    private void productoSeleccionado() {
        if (this.vistad.getjTableDatosProductos().getSelectedRow() != -1) {
            producto = modeloTablaProd.getFilas().get(this.vistad.getjTableDatosProductos().getSelectedRow());
            //cargar los datos a la vista
            this.vistad.getTxtTipoProducto().setText(producto.getTipoprod());
            this.vistad.getjSpinnerCantidad().setValue(producto.getCantidadprod());
            this.vistad.getCbxProyecto().setSelectedItem(producto.getIdproyprod());
            this.vistad.getCbxIdDonacion().setSelectedItem(producto.getIddonaprod());
            // control de botones seleccionados
            this.vistad.getBtnEDITARPROD().setEnabled(true);
            this.vistad.getBtnELIMINARPROD().setEnabled(true);
            this.vistad.getBtnCREARPROD().setEnabled(false);

        }
    }

    // Métodos
    public void guardarProducto() {
        if (validarCampos() != true) {
            Resouces.warning("ATENCIÓN!!!", "Debe llenar todos los campos ¬¬");
        } else {
            producto = new Producto();
//            int id = 1;
//            BigDecimal bid = BigDecimal.valueOf(id);
            int num = (int) this.vistad.getjSpinnerCantidad().getValue();
            BigInteger bint = BigInteger.valueOf(num);
            producto.setCantidadprod(bint);
            producto.setTipoprod(this.vistad.getTxtTipoProducto().getText());
            producto.setIddonaprod((Donacion) this.vistad.getCbxIdDonacion().getSelectedItem());
            producto.setIdproyprod((Proyecto) this.vistad.getCbxProyecto().getSelectedItem());
            try {
                modelPd.create(producto);
            } catch (PreexistingEntityException ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            modeloTablaProd.agregar(producto);
            Resouces.success(" ATENCIÓN!!!", "Producto creado correctamente :>!");
            limpiarProd();
        }

    }

    public void editarProducto() {
        if (producto != null) {
            producto.setCantidadprod((BigInteger) this.vistad.getjSpinnerCantidad().getValue());
            producto.setTipoprod(this.vistad.getTxtTipoProducto().getText());
            producto.setIddonaprod((Donacion) this.vistad.getCbxIdDonacion().getSelectedItem());
            producto.setIdproyprod((Proyecto) this.vistad.getCbxProyecto().getSelectedItem());
            try {
                modelPd.edit(producto);
                modeloTablaProd.eliminar(producto);
                modeloTablaProd.actualizar(producto);
            } catch (Exception ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Producto editado correctamente :>!");
            limpiarProd();
        } else {
            Resouces.error(" ATENCIÓN!!!", "No se pudo editar el producto :<!");
            limpiarProd();
        }
    }

    public void eliminarProd() {
        if (producto != null) {
            try {
                modelPd.destroy(producto.getIdprod());
                modeloTablaProd.eliminar(producto);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Resouces.success(" ATENCIÓN!!!", "Producto elminado correctamente :>!");
            limpiarProd();
        }
    }

    public void buscarProducto() {

        if (this.vistad.getChekBsqProds().isSelected()) {
            modeloTablaProd.setFilas(modelPd.findProductoEntities());
            modeloTablaProd.fireTableDataChanged();
        } else {
            if (this.vistad.getTxtBsqProductos().getText().isEmpty()) {
                Resouces.warning("Atención!!!", "Llene el campo de busqueda :P");
                limpiarBuscadorProd();
            } else {
                modeloTablaProd.setFilas(modelPd.buscarProducto(this.vistad.getTxtBsqProductos().getText()));
                modeloTablaProd.fireTableDataChanged();
            }
        }

    }

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGProductos.jasper", new HashMap());
    }

    public void reporteIndividual() {
        if (producto != null) {
            Map parameters = new HashMap();
            parameters.put("cod", producto.getIdprod()); 
            Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RIProductos.jasper", parameters);
        } else {
            Resouces.warning("ATENCIÓN!!!", "Debe seleccionar un producto :P");
        }
    }
    //limipiar y validar
    public void limpiarProd() {
        this.vistad.getTxtTipoProducto().setText("");
        this.vistad.getjSpinnerCantidad().setValue(0);
        this.vistad.getCbxIdDonacion().setSelectedIndex(0);
        this.vistad.getBtnEDITARPROD().setEnabled(false);
        this.vistad.getBtnELIMINARPROD().setEnabled(false);
        this.vistad.getBtnCREARPROD().setEnabled(true);
    }

    public void limpiarBuscadorProd() {
        this.vistad.getTxtBsqProductos().setText("");
        modeloTablaProd.setFilas(modelPd.findProductoEntities());
        modeloTablaProd.fireTableDataChanged();
    }

    public boolean validarCampos() {
        boolean valid = true;

        if (vistad.getTxtTipoProducto().getText().isEmpty()) {
            Resouces.warning("Atención!!!", "El campo tipo esta vacio");
            valid = false;
        }

        return valid;
    }

    public void txtAyuda() {
        TextPrompt tipoProd = new TextPrompt("Jijode fruta", vistad.getTxtTipoProducto());
        TextPrompt busqdProd = new TextPrompt("Pan q si to :0", vistad.getTxtBsqProductos());
    }
}
