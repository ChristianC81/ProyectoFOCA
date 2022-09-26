/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
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
import modelo.Roles;
import modelo.RolesJpaController;
import modelo.Usuario;
import modelo.UsuarioJpaController;
import modelo.Validaciones;
import modelo.exceptions.NonexistentEntityException;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerUsuario {

    ViewAdministrador vistap;
    ManagerFactory manager;
    UsuarioJpaController modeloUsuario;
    Usuario usuario;
    Persona persona;
    ModeloTablaUsuario modeloTabla;
    ListSelectionModel listaUsuarioModel;

    public ControllerUsuario(ViewAdministrador vistapp, ManagerFactory manager, UsuarioJpaController modeloUsuario) {
        this.vistap = vistapp;
        this.manager = manager;
        this.modeloUsuario = modeloUsuario;

        //inicializar la tabla
        this.modeloTabla = new ModeloTablaUsuario();

        // devuelve la lista de usuarios
        this.modeloTabla.setFilas(modeloUsuario.findUsuarioEntities());
        this.vistap.getjTableDatosUsuario().setModel(modeloTabla);

        //Metodos para cargar el combobox
        cargarComboBoxIdPersona();
        cargarComboBoxIdRol();
    }

    public void cargarDatosUsuarioTbl() {
        this.modeloTabla = new ModeloTablaUsuario();
        this.modeloTabla.setFilas(modeloUsuario.findUsuarioEntities());
        this.vistap.getjTableDatosUsuario().setModel(modeloTabla);
    }

    public void iniciarControlUsu() {
        //Opciones CRUD
        this.vistap.getBtnCREARUSU().addActionListener(l -> guardarUsuario());
        this.vistap.getBtnEDITARUSU().addActionListener(l -> editarUsuario());
        this.vistap.getBtnELIMINARUSU().addActionListener(l -> eliminarUsuario());
        this.vistap.getBtnLIMPIARUSU().addActionListener(l -> limpiarC());

        //Opciones Reportes
       this.vistap.getBtnREPORTEINDIVIDUALUSU().addActionListener(l -> reporteIndividual());
        this.vistap.getBtnREPORTEGENERALUSU().addActionListener(l -> reporteGeneral());

        //Opciones de Busqueda
        this.vistap.getBtnbuscarUsu().addActionListener(l -> buscarUsuario());
        this.vistap.getChekBsqUsu().addActionListener(l -> mostrarTodos());
        this.vistap.getBtnlimpiarUsubsq().addActionListener(l -> limpiarB());
        this.vistap.getBtnCANCELARUSU().addActionListener(l -> cancelar());

        //Tabla de datos
        this.vistap.getjTableDatosUsuario().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaUsuarioModel = this.vistap.getjTableDatosUsuario().getSelectionModel();
        listaUsuarioModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    usuarioSeleccionada();
                }
            }
        });
        txtAyuda();
    }

    public void usuarioSeleccionada() {
        if (this.vistap.getjTableDatosUsuario().getSelectedRow() != -1) {
            usuario = modeloTabla.getFilas().get(this.vistap.getjTableDatosUsuario().getSelectedRow());
            this.vistap.getTxtNombreUsu().setText(usuario.getNombreusuario());
            this.vistap.getTxtClave().setText(usuario.getClave());
            this.vistap.getCbxIdPersona().setSelectedItem(usuario.getIdpersona());
            this.vistap.getCbxIdRol().setSelectedItem(usuario.getIdrol());

            //Acceso de Botones
            this.vistap.getBtnCREARUSU().setEnabled(false);
            this.vistap.getBtnEDITARUSU().setEnabled(true);
            this.vistap.getBtnELIMINARUSU().setEnabled(true);

        }
    }

    public void cargarComboBoxIdPersona() {
        try {
            this.vistap.getCbxIdPersona().addItem("");
            Vector v = new Vector();
            v.add(new String("Seleccione una Persona"));
            v.addAll(new PersonaJpaController(manager.getEmf()).findPersonaEntities());
            this.vistap.getCbxIdPersona().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    public void cargarComboBoxIdRol() {
        try {
            Vector v = new Vector();
            v.add(new String("Seleccione un Rol"));
            v.addAll(new RolesJpaController(manager.getEmf()).findRolesEntities());
            this.vistap.getCbxIdRol().setModel(new DefaultComboBoxModel(v));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturando errores cargando combobox");
        }
    }

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGUsuarios.jasper", new HashMap());
    }
    
public void reporteIndividual() {
        if (usuario != null) {
            Map parameters = new HashMap();
            parameters.put("cod", usuario.getIdusuario()); 
            Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RIUsuarios.jasper", parameters);
        } else {
            Resouces.warning("ATENCIÓN!!!", "Debe seleccionar un Usuario :P");
        }
    }

    public void guardarUsuario() {
        usuario = new Usuario();

//        if (validacionesCamposUsuario() == true) {
        usuario.setNombreusuario(this.vistap.getTxtNombreUsu().getText());
        usuario.setClave(this.vistap.getTxtClave().getText());
        usuario.setIdpersona((Persona) this.vistap.getCbxIdPersona().getSelectedItem());
        usuario.setIdrol((Roles) this.vistap.getCbxIdRol().getSelectedItem());

        try {
            modeloUsuario.create(usuario);
        } catch (IllegalArgumentException e) {
            Resouces.error("Error en el Proceso", " El usuario ya existe D:");
        } catch (Exception ex) {
            ex.getMessage();
        }
        cargarDatosUsuarioTbl();
        Resouces.success("!Usuario Creado!", " Se ha creado con exito \n Usuario con Nombre: " + usuario.getIdpersona().getNombresper());
        limpiarC();

//        } else {
//            Resouces.error("Error en el Proceso", " No se creo con exito D:");
//        }
    }

    public void editarUsuario() {
        if (usuario != null) {
            try {
//                if (validacionesCamposUsuario() == true) {

                usuario.setNombreusuario(this.vistap.getTxtNombreUsu().getText());
                usuario.setClave(this.vistap.getTxtClave().getText());
                usuario.setIdpersona((Persona) this.vistap.getCbxIdPersona().getSelectedItem());
                usuario.setIdrol((Roles) this.vistap.getCbxIdRol().getSelectedItem());

                modeloUsuario.edit(usuario);

                modeloTabla.eliminar(usuario);
                modeloTabla.actualizar(usuario);
                Resouces.success("!Usuario Editada!", " Se ha editado con exito \n Usuario con Nombre: " + usuario.getNombreusuario());
                limpiarC();
//                }
            } catch (Exception ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void eliminarUsuario() {
        if (usuario != null) {
            try {
                modeloUsuario.destroy(usuario.getIdusuario());
                modeloTabla.eliminar(usuario);
                Resouces.success("!Usuario Eliminada!", " Se ha eliminado con exito \n Usuario con Nombre: " + usuario.getNombreusuario());
                cargarDatosUsuarioTbl();
                limpiarC();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void mostrarTodos() {
        if (this.vistap.getChekBsqUsu().isSelected()) {
            cargarDatosUsuarioTbl();
        } else {
            buscarUsuario();
        }
    }

    public void buscarUsuario() {
        if (!this.vistap.getTxtBsqUsuarios().getText().isEmpty()) {
            modeloTabla.setFilas(modeloUsuario.buscarUsuario(this.vistap.getTxtBsqUsuarios().getText()));
            modeloTabla.fireTableDataChanged();
        } else {
            limpiarB();
        }
    }

    public void limpiarC() {

        this.vistap.getTxtNombreUsu().setText("");
        this.vistap.getTxtClave().setText("");
        this.vistap.getCbxIdPersona().setSelectedIndex(0);
        this.vistap.getCbxIdRol().setSelectedIndex(0);

        //Acciones de Botones
        this.vistap.getBtnCREARUSU().setEnabled(true);
        this.vistap.getBtnELIMINARUSU().setEnabled(false);
        this.vistap.getBtnEDITARUSU().setEnabled(false);

//Limpiar Seleccion de Tabla
        this.vistap.getjTableDatosUsuario().clearSelection();

    }

    public void limpiarB() {
        this.vistap.getTxtBsqUsuarios().setText("");
        modeloTabla.setFilas(modeloUsuario.findUsuarioEntities());
        modeloTabla.fireTableDataChanged();
    }

    public void cancelar() {
        this.vistap.hide();
    }

    public boolean validacionesCamposUsuario() {
        Validaciones validar = new Validaciones();
        boolean validado = false;
        
        if (!this.vistap.getTxtNombreUsu().getText().isEmpty()) {
            if (validar.validarUsuario(this.vistap.getTxtNombreUsu().getText())) {
                if (!this.vistap.getTxtClave().getText().isEmpty()) {
                    if (this.vistap.getCbxIdPersona().getSelectedIndex() != 0) {
                        if (this.vistap.getCbxIdRol().getSelectedIndex() != 0) {

                        } else {
                            Resouces.warning("ADVERTENCIA!", " Seleccione un rol para el usuario");
                        }
                    } else {
                        Resouces.warning("ADVERTENCIA!", " Seleccione una persona");
                    }
                } else {
                    Resouces.warning("ADVERTENCIA!", " Campo de Contraseña Vacio");
                }
            } else {
                Resouces.warning("ADVERTENCIA!", "Nombre de Usuario Incorrecto");
            }
        } else {
            Resouces.warning("ADVERTENCIA!", "Nombre de Usuario vacio");
        }
        return validado;
    }

    public void txtAyuda() {
        TextPrompt nombreUsu = new TextPrompt("robertoSar3", vistap.getTxtNombreUsu());
        TextPrompt claveUsu = new TextPrompt("*********", vistap.getTxtClave());
        TextPrompt busqUsu = new TextPrompt("carlosU12", vistap.getTxtBsqUsuarios());
    }
}
