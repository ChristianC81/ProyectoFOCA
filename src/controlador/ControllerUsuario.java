/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import javax.swing.Icon;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Persona;
import modelo.Roles;
import modelo.Usuario;
import modelo.UsuarioJpaController;
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
    }

    public void cargarDatosUsuarioTbl() {
        this.modeloTabla = new ModeloTablaUsuario();
        this.modeloTabla.setFilas(modeloUsuario.findUsuarioEntities());
        this.vistap.getjTableDatosUsuario().setModel(modeloTabla);
    }

    public void iniciarControlUsu() {
        this.vistap.getBtnCREARUSU().addActionListener(l -> guardarUsuario());
        this.vistap.getBtnEDITARUSU().addActionListener(l -> editarUsuario());
        this.vistap.getBtnELIMINARUSU().addActionListener(l -> eliminarUsuario());
//        this.vistap.getBtnREPORTEINDIVIDUALUSU().addActionListener(l -> reporteIndividual());
//        this.vistap.getBtnREPORTEGENERALUSU().addActionListener(l -> reporteGeneral());
        this.vistap.getBtnLIMPIARUSU().addActionListener(l -> limpiarC());
        this.vistap.getBtnlimpiarUsubsq().addActionListener(l -> limpiarB());
        this.vistap.getBtnCANCELARUSU().addActionListener(l -> cancelar());
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
        this.vistap.getBtnbuscarPer().addActionListener(l -> buscarUsuario());
        this.vistap.getChekBsqPer().addActionListener(l -> mostrarTodos());
    }

    public void usuarioSeleccionada() {
        if (this.vistap.getjTableDatosUsuario().getSelectedRow() != -1) {
            usuario = modeloTabla.getFilas().get(this.vistap.getjTableDatosUsuario().getSelectedRow());
            this.vistap.getTxtNombreUsu().setText(usuario.getNombreusuario());
            this.vistap.getTxtClave().setText(usuario.getClave());
            this.vistap.getCbxIdPersona().setSelectedItem(usuario.getIdpersona());
            this.vistap.getCbxIdRol().setSelectedItem(usuario.getIdrol());

            //Acceso de Botones
            this.vistap.getBtnCREARPER().setEnabled(false);
            this.vistap.getBtnEDITARPER().setEnabled(true);
            this.vistap.getBtnELIMINARPER().setEnabled(true);

        }
    }
//
//    //llamar
////    public void reporteGeneral() {
////        Resouces.imprimirReeporte(ManagerFactory.getConnection(manager.getEntityManagerFactory().createEntityManager()), "/reportes/Usuarios.jasper",new HashMap());
////  }
//// public void reporteIndividual() {
////        if(usuario!=null){
////        Map parametros = new HashMap<>();
////        parametros.put("id",usuario.getIdusuario());
////        Resouces.imprimirReeporte(ManagerFactory.getConnection(manager.getEntityManagerFactory().createEntityManager()), "/reportes/ReporteIndividual.jasper",parametros);
////  }else{
////        Resouces.warning("!Usuario no Seleccionada!", "Seleccione una usuario");
////        }
////    }

    public void guardarUsuario() {
        usuario = new Usuario();
       if (validacionesCamposUsuario() == true) {

        usuario.setNombreusuario(this.vistap.getTxtNombreUsu().getText());
        usuario.setClave(this.vistap.getTxtClave().getText());
        usuario.setIdpersona((Persona) this.vistap.getCbxTipoPer().getSelectedItem());
        usuario.setIdrol((Roles) this.vistap.getCbxTipoPer().getSelectedItem());

        try {
            modeloUsuario.create(usuario);
        } catch (Exception ex) {
            ex.getMessage();
        }
        cargarDatosUsuarioTbl();
        Resouces.success("!Usuario Creada!", " Se ha creado con exito \n Usuario con Nombre: " + usuario.getIdpersona().getNombresper());
        limpiarC();

        } else {
          Resouces.error("Error en el Proceso", " No se creo con exito D:");
         }
    }

    public void editarUsuario() {
//        if (usuario != null) {
        try {
//                if (validacionesCamposUsuario() == true) {
            usuario.setNombreusuario(this.vistap.getTxtClave().getText());
            usuario.setIdpersona((Persona) this.vistap.getCbxTipoPer().getSelectedItem());
            usuario.setIdrol((Roles) this.vistap.getCbxTipoPer().getSelectedItem());

            modeloUsuario.edit(usuario);

            modeloTabla.eliminar(usuario);
            modeloTabla.actualizar(usuario);
            Resouces.success("!Usuario Editada!", " Se ha editado con exito \n Usuario con Nombre: " + usuario.getNombreusuario());
            limpiarC();
//                }
        } catch (Exception ex) {
            Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
//        }

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
        if (this.vistap.getChekBsqPer().isSelected()) {
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
        this.vistap.getCbxIdPersona().setSelectedItem("");
        this.vistap.getCbxIdRol().setSelectedItem("");

        //Acciones de Botones
        this.vistap.getBtnCREARPER().setEnabled(true);
        this.vistap.getBtnELIMINARPER().setEnabled(false);
        this.vistap.getBtnEDITARPER().setEnabled(false);

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
//            if (validar.ValidarTextoConEspacio(this.vistap.getTxtNombres().getText())) {
//
//                if (!this.vistap.getTxtApellidos().getText().isEmpty()) {
//                    if (validar.ValidarTextoConEspacio(this.vistap.getTxtApellidos().getText())) {
//
//                        //segunda  valid
//                        if (!this.vistap.getTxtCedula().getText().isEmpty()) {
//                            if (validar.validarCedula(this.vistap.getTxtCedula().getText())) {
//
//                                //Segunda valid
//                                if (!this.vistap.getTxtCelular().getText().isEmpty()) {
//                                    if (validar.validarCelu(this.vistap.getTxtCelular().getText())) {
//
//                                        //Segunda valid
//                                        if (!this.vistap.getTxtCorreo().getText().isEmpty()) {
//                                            if (validar.validarEmail(this.vistap.getTxtCorreo().getText())) {
//
//                                                //Segunda valid
//                                                if (!this.vistap.getTxtDireccion().getText().isEmpty()) {
//                                                    if (validar.validarDirec(this.vistap.getTxtDireccion().getText())) {
//                                                        //Segunda valid
//                                                        validado = true;
//                                                    } else {
//                                                        this.vistap.getLblDireccionE().setText("* Direccion Invalida");
//                                                    }
//                                                } else {
//                                                    this.vistap.getLblDireccionE().setText("* Campo de Direccion Vacio");
//                                                }
//                                            } else {
//                                                this.vistap.getLblCorreoE().setText("* Correo Electronico Invalida");
//                                            }
//                                        } else {
//                                            this.vistap.getLblCorreoE().setText("* Campo del Correo Electronico Vacio");
//                                        }
//                                    } else {
//                                        this.vistap.getLblCelularE().setText("* Celular Invalida");
//                                    }
//                                } else {
//                                    this.vistap.getLblCelularE().setText("* Campo del Celular Vacio");
//                                }
//                            } else {
//                                this.vistap.getLblCedulaE().setText("* Cedula Invalida");
//
//                            }
//                        } else {
//                            this.vistap.getLblCedulaE().setText("* Campo de la Cedula Vacio");
//                        }
//                    } else {
//                        this.vistap.getLblApellidosE().setText("* Apellido Invalido");
//                    }
//                } else {
//                    this.vistap.getLblApellidosE().setText("* Campo de Apellidos Vacio");
//                }
//            } else {
//                this.vistap.getLblNombresE().setText("* Nombre Invalido");

        } else {
            this.vistap.getLblNombreUsu().setText("*Requrido");
        }
        return validado;
    }

    public void llenarCbxIdPersona() {

        this.vistap.getCbxIdPersona().setSelectedItem(manager);
    }

    public void llenarCbxIdRol() {

    }

}
