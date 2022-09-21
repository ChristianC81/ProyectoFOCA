/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import Vista.ViewSistema;
import java.awt.Dimension;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
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
    PersonaJpaController modeloPersona;
    Persona persona;
    ModeloTablaPersona modeloTabla;
    ListSelectionModel listaPersonaModel;
    private JFileChooser jfc;

    public ControllerPersona(ViewAdministrador vistapp, ManagerFactory manager, PersonaJpaController modeloPersona) {
        this.vistap = vistapp;
        this.manager = manager;
        this.modeloPersona = modeloPersona;
        //inicializar la tabla
        this.modeloTabla = new ModeloTablaPersona();
        // devuelve la lista de personas
        this.modeloTabla.setFilas(modeloPersona.findPersonaEntities());
        this.vistap.getjTableDatosPersonas().setModel(modeloTabla);
    }

    public void cargarDatosPersonaTbl() {
        this.modeloTabla = new ModeloTablaPersona();
        this.modeloTabla.setFilas(modeloPersona.findPersonaEntities());
        this.vistap.getjTableDatosPersonas().setModel(modeloTabla);
    }

    public void iniciarControlPer() {
        this.vistap.getBtnCREARPER().addActionListener(l -> guardarPersona());
        this.vistap.getBtnEDITARPER().addActionListener(l -> editarPersona());
        this.vistap.getBtnELIMINARPER().addActionListener(l -> eliminarPersona());
//        this.vistap.getBtnREPORTEINDIVIDUALPER().addActionListener(l -> reporteIndividual());
        this.vistap.getBtnREPORTEGENERALPER().addActionListener(l -> reporteGeneral());
        this.vistap.getBtnLIMPIARPER().addActionListener(l -> limpiarC());
        this.vistap.getBtnExaminarFoto().addActionListener(l -> examinarFoto());
        this.vistap.getBtnlimpiarPerbsq().addActionListener(l -> limpiarB());
        this.vistap.getBtnCANCELARPER().addActionListener(l -> cancelar());
        this.vistap.getjTableDatosPersonas().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPersonaModel = this.vistap.getjTableDatosPersonas().getSelectionModel();
        listaPersonaModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    personaSeleccionada();
                }
            }
        });
        this.vistap.getBtnbuscarPer().addActionListener(l -> buscarPersona());
        this.vistap.getChekBsqPer().addActionListener(l -> mostrarTodos());
    }

    public void personaSeleccionada() {
        if (this.vistap.getjTableDatosPersonas().getSelectedRow() != -1) {
            persona = modeloTabla.getFilas().get(this.vistap.getjTableDatosPersonas().getSelectedRow());
            this.vistap.getTxtcedulaPer().setText(persona.getCedulaper());
            this.vistap.getCbxTipoPer().setSelectedItem(persona.getTipoper());
            this.vistap.getTxtnombrePer().setText(persona.getNombresper());
            this.vistap.getTxtapellidoPer().setText(persona.getApellidosper());
            this.vistap.getTxtdireccionPer().setText(persona.getDireccionper());
            this.vistap.getTxttelefono().setText(persona.getTelefonoper());
            this.vistap.getTxtcorreoPer().setText(persona.getCorreoper());
            if (persona.getGeneroper().equals("Masculino")) {
                this.vistap.getRbtMasculino().setSelected(true);
            }
            if (persona.getGeneroper().equals("Femenino")) {
                this.vistap.getRbtFemenino().setSelected(true);
            }

            //this.vistap.getJdcFechaNacPer().setDate(persona.getFechanacimiento());
            this.vistap.getTxtestadocivil().setText(persona.getEstadocivil());
            this.vistap.getTxtsalario().setText(String.valueOf(persona.getSalariobenefac()));
            this.vistap.getTxtestrato().setText(persona.getEstratosbenefi());
            this.vistap.getTxtTitulo().setText(persona.getTitulo());
            if (persona.getSeguro().equals("Si")) {
                this.vistap.getChkseguroiees().setSelected(true);
            } else {
                this.vistap.getChkseguroiees().setSelected(false);
            }

            this.vistap.getTxthorario().setText(persona.getHorario());
            this.vistap.getTxtperiodo().setText(persona.getPeriodovol());
            this.vistap.getTxtTipoVol().setText(persona.getTipovol());
            this.vistap.getLblFoto().setIcon((Icon) persona.getFoto());
            //Acceso de Botones
            this.vistap.getBtnCREARPER().setEnabled(false);
            this.vistap.getBtnEDITARPER().setEnabled(true);
            this.vistap.getBtnELIMINARPER().setEnabled(true);

        }
    }
//
//    //llamar

    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGPersonas.jasper", new HashMap());
    }
//// public void reporteIndividual() {
////        if(persona!=null){
////        Map parametros = new HashMap<>();
////        parametros.put("id",persona.getIdpersona());
////        Resouces.imprimirReeporte(ManagerFactory.getConnection(manager.getEntityManagerFactory().createEntityManager()), "/reportes/ReporteIndividual.jasper",parametros);
////  }else{
////        Resouces.warning("!Persona no Seleccionada!", "Seleccione una persona");
////        }
////    }

    public void guardarPersona() {
        persona = new Persona();
        //  if (validacionesCamposPersona() == true) {

        persona.setCedulaper(this.vistap.getTxtcedulaPer().getText());
        persona.setTipoper((String) this.vistap.getCbxTipoPer().getSelectedItem());
        persona.setNombresper(this.vistap.getTxtnombrePer().getText());
        persona.setApellidosper(this.vistap.getTxtapellidoPer().getText());
        persona.setDireccionper(this.vistap.getTxtdireccionPer().getText());
        persona.setTelefonoper(this.vistap.getTxttelefono().getText());
        persona.setCorreoper(this.vistap.getTxtcorreoPer().getText());
        String genero = "";
        if (this.vistap.getRbtMasculino().isSelected()) {
            genero = "Masculino";
        }
        if (this.vistap.getRbtFemenino().isSelected()) {
            genero = "Femenino";
        }

        persona.setGeneroper(genero);
        //persona.setFechanacimiento( this.vistap.getJdcFechaNacPer().getDate());
        persona.setEstadocivil(this.vistap.getTxtestadocivil().getText());
        persona.setSalariobenefac(Double.valueOf(this.vistap.getTxtsalario().getText()));
        persona.setEstratosbenefi(this.vistap.getTxtestrato().getText());
        persona.setTitulo(this.vistap.getTxtTitulo().getText());
        String seguro = "";
        if (this.vistap.getChkseguroiees().isSelected()) {
            seguro = "Si";
        } else {
            seguro = "No";
        }
        persona.setSeguro(seguro);

        persona.setHorario(this.vistap.getTxthorario().getText());
        persona.setPeriodovol(this.vistap.getTxtperiodo().getText());
        persona.setTipovol(this.vistap.getTxtTipoVol().getText());

        //Guardar foto
        try {
            FileInputStream img = new FileInputStream(jfc.getSelectedFile());
            persona.setFoto((Serializable) img);
        } catch (IOException ex) {
            Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            modeloPersona.create(persona);
        } catch (Exception ex) {
            ex.getMessage();
        }
        cargarDatosPersonaTbl();
        Resouces.success("!Persona Creada!", " Se ha creado con exito \n Persona con Nombre: " + persona.getNombresper());
//        limpiarC();
//        } else {
//          Resouces.error("Error en el Proceso", " No se creo con exito D:");
//         }
    }

    public void editarPersona() {
        if (persona != null) {
            try {
//                if (validacionesCamposPersona() == true) {
                persona.setCedulaper(this.vistap.getTxtcedulaPer().getText());
                persona.setTipoper((String) this.vistap.getCbxTipoPer().getSelectedItem());
                persona.setNombresper(this.vistap.getTxtnombrePer().getText());
                persona.setApellidosper(this.vistap.getTxtapellidoPer().getText());
                persona.setDireccionper(this.vistap.getTxtdireccionPer().getText());
                persona.setTelefonoper(this.vistap.getTxttelefono().getText());
                persona.setCorreoper(this.vistap.getTxtcorreoPer().getText());
                String genero = "";
                if (this.vistap.getRbtMasculino().isSelected()) {
                    genero = "Masculino";
                }
                if (this.vistap.getRbtFemenino().isSelected()) {
                    genero = "Femenino";
                }

                persona.setGeneroper(genero);
                //persona.setFechanacimiento( this.vistap.getJdcFechaNacPer().getDate());
                persona.setEstadocivil(this.vistap.getTxtestadocivil().getText());
                persona.setSalariobenefac(Double.valueOf(this.vistap.getTxtsalario().getText()));
                persona.setEstratosbenefi(this.vistap.getTxtestrato().getText());
                persona.setTitulo(this.vistap.getTxtTitulo().getText());
                String seguro = "";
                if (this.vistap.getChkseguroiees().isSelected()) {
                    seguro = "Si";
                } else {
                    seguro = "No";
                }
                persona.setSeguro(seguro);

                persona.setHorario(this.vistap.getTxthorario().getText());
                persona.setPeriodovol(this.vistap.getTxtperiodo().getText());
                persona.setTipovol(this.vistap.getTxtTipoVol().getText());

                modeloPersona.edit(persona);
                modeloTabla.eliminar(persona);
                modeloTabla.actualizar(persona);
                Resouces.success("!Persona Editada!", " Se ha editado con exito \n Persona con Nombre: " + persona.getNombresper());
//                    limpiarC();
//                }
            } catch (Exception ex) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//
    }

    public void eliminarPersona() {
        if (persona != null) {
            try {
                modeloPersona.destroy(persona.getIdper());
                modeloTabla.eliminar(persona);
                Resouces.success("!Persona Eliminada!", " Se ha eliminado con exito \n Persona con Nombre: " + persona.getNombresper());
                cargarDatosPersonaTbl();
                limpiarC();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void mostrarTodos() {
        if (this.vistap.getChekBsqPer().isSelected()) {
            cargarDatosPersonaTbl();
        } else {
            buscarPersona();
        }
    }

    public void buscarPersona() {
        if (!this.vistap.getTxtBsqPersonas().getText().isEmpty()) {
            modeloTabla.setFilas(modeloPersona.buscarPersona(this.vistap.getTxtBsqPersonas().getText()));
            modeloTabla.fireTableDataChanged();
        } else {
            limpiarB();
        }
    }

    public void limpiarC() {

        this.vistap.getTxtcedulaPer().setText("");
        this.vistap.getCbxTipoPer().setSelectedItem("");
        this.vistap.getTxtnombrePer().setText("");
        this.vistap.getTxtapellidoPer().setText("");
        this.vistap.getTxtdireccionPer().setText("");
        this.vistap.getTxttelefono().setText("");
        this.vistap.getTxtcorreoPer().setText("");
        //this.vistap.getJdcFechaNacPer().setDate(persona.getFechanacimiento());
        this.vistap.getTxtestadocivil().setText("");
        this.vistap.getTxtestrato().setText("");
        this.vistap.getTxtTitulo().setText("");
        this.vistap.getTxthorario().setText("");
        this.vistap.getTxtperiodo().setText("");
        this.vistap.getTxtTipoVol().setText("");
        this.vistap.getLblFoto().setIcon(null);
        //Acciones de Botones
        this.vistap.getBtnCREARPER().setEnabled(true);
        this.vistap.getBtnELIMINARPER().setEnabled(false);
        this.vistap.getBtnEDITARPER().setEnabled(false);

//Limpiar Seleccion de Tabla
        this.vistap.getjTableDatosPersonas().clearSelection();
    }

    public void limpiarB() {
        this.vistap.getTxtBsqPersonas().setText("");
        modeloTabla.setFilas(modeloPersona.findPersonaEntities());
        modeloTabla.fireTableDataChanged();
    }

    public void cancelar() {
        this.vistap.hide();
    }

//    public boolean validacionesCamposPersona() {
//        Validaciones validar = new Validaciones();
//        boolean validado = false;
//        if (!this.vistap.getTxtNombres().getText().isEmpty()) {
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
//            }
//        } else {
//            this.vistap.getLblNombresE().setText("* Campo de Nombres Vacio");
//        }
//        if (validado == false) {
//            // Resouces.error("Error en el Proceso", " No se edito con exito D:");
//        }
//        return validado;
//    }
    public void examinarFoto() {
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vistap);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(vistap.getLblFoto().getWidth(), vistap.getLblFoto().getHeight(), Image.SCALE_DEFAULT);
                Icon icono = new ImageIcon(imagen);
                vistap.getLblFoto().setIcon(icono);
                vistap.getLblFoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
