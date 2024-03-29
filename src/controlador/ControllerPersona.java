/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.Validaciones;
import modelo.exceptions.NonexistentEntityException;
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
        txtAyuda();
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
        this.vistap.getBtnREPORTEINDIVIDUALPER().addActionListener(l -> reporteIndividual());
        this.vistap.getBtnREPORTEGENERALPER().addActionListener(l -> reporteGeneral());
        this.vistap.getBtnLIMPIARPER().addActionListener(l -> limpiarC());
        this.vistap.getBtnExaminarFoto().addActionListener(l -> examinarFoto());
        this.vistap.getBtnlimpiarPerbsq().addActionListener(l -> limpiarB());
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

            this.vistap.getJdcFechaNacPer().setDate(persona.getFechanacimiento());
            this.vistap.getTxtestadocivil().setText(persona.getEstadocivil());
            this.vistap.getTxtsalario().setText(String.valueOf(persona.getSalariobenefac()));
            this.vistap.getTxtestrato().setText(persona.getEstratosbenefi());
            this.vistap.getTxtTitulo().setText(persona.getTitulo());

            this.vistap.getTxthorario().setText(persona.getHorario());
            this.vistap.getTxtperiodo().setText(persona.getPeriodovol());
            this.vistap.getTxtTipoVol().setText(persona.getTipovol());
            try {
                if (persona.getFoto() == null) {
                    this.vistap.getLblFoto().setIcon(null);
                } else {
                    Image foto;
                    ImageIcon icono;
                    foto = persona.getFoto().getScaledInstance(vistap.getLblFoto().getWidth(), vistap.getLblFoto().getHeight(), Image.SCALE_DEFAULT);
                    icono = new ImageIcon(foto);
                    this.vistap.getLblFoto().setIcon(icono);
                }
            } catch (Exception e) {
                System.out.println("Persona seleccionada sin foto D:");
            }

            //Acceso de Botones
            this.vistap.getBtnCREARPER().setEnabled(false);
            this.vistap.getBtnEDITARPER().setEnabled(true);
            this.vistap.getBtnELIMINARPER().setEnabled(true);
            this.vistap.getBtnLIMPIARPER().setEnabled(true);
        }
    }

    //llamar
    public void reporteGeneral() {
        Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RGPersonas.jasper", new HashMap());
    }

    public void reporteIndividual() {
        System.out.println(persona.getIdper());
   
            // validar si existe un registro seleccionado 
            if (persona != null) {
                //contruir los parametros de encio al reporte
                Map parameters = new HashMap(); //  los hash maps son clave valor 
                // Asignar parametros al 
                parameters.put("cod", persona.getIdper()); // clave seria el id // valor seria el persona.getIdpersona
                // llamamos al metodo del reporte
                Resouces.imprimirReporte(ManagerFactory.getConnection(manager.getEmf().createEntityManager()), "/reportes/RIPersonas.jasper", parameters);
            } else {
                Resouces.warning("ATENCIÓN!!!", "Debe seleccionar una persona :P");
            }
   
    }

    public void guardarPersona() {
        persona = new Persona();
        if (validacionesCamposPersona() == true) {
            double salario = 0.0;
            this.vistap.getTxtsalario().setText("0.0");
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
            persona.setFechanacimiento(this.vistap.getJdcFechaNacPer().getDate());
            persona.setEstadocivil(this.vistap.getTxtestadocivil().getText());
            salario = Double.valueOf(this.vistap.getTxtsalario().getText());
            persona.setSalariobenefac(salario);
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
            if (jfc.getSelectedFile() == null) {
                persona.setFoto(null);
            } else {
                persona.setFoto(jfc.getSelectedFile());
            }

            try {
                modeloPersona.create(persona);
            } catch (Exception ex) {
                ex.getMessage();
            }

            Resouces.success("!Persona Creada!", " Se ha creado con exito \n Persona con Nombre: " + persona.getNombresper());
            limpiarC();
        }
    }

    public void editarPersona() {
        if (persona != null) {
            try {
                if (validacionesCamposPersona() == true) {
                    double salario = 0.0;
                    this.vistap.getTxtsalario().setText("0.0");

                    persona.setCedulaper(this.vistap.getTxtcedulaPer().getText());
                    persona.setTipoper(this.vistap.getCbxTipoPer().getSelectedItem().toString());
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
                    persona.setFechanacimiento(this.vistap.getJdcFechaNacPer().getDate());
                    persona.setEstadocivil(this.vistap.getTxtestadocivil().getText());
                    salario = Double.valueOf(this.vistap.getTxtsalario().getText());
                    persona.setSalariobenefac(salario);
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
                    try {
                        if (jfc.getSelectedFile() == null) {

                            persona.setFoto(null);
                        } else {
                            persona.setFoto(jfc.getSelectedFile());
                        }
                    } catch (NullPointerException e) {
                        System.out.println("No esta seleccionada la foto :c");
                    }
                    modeloPersona.edit(persona);
                    modeloTabla.eliminar(persona);
                    modeloTabla.actualizar(persona);
                    Resouces.success("!Persona Editada!", " Se ha editado con exito \n Persona con Nombre: " + persona.getNombresper());
                    limpiarC();
                }
            } catch (Exception ex) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        this.vistap.getCbxTipoPer().setSelectedIndex(0);
        this.vistap.getTxtnombrePer().setText("");
        this.vistap.getTxtapellidoPer().setText("");
        this.vistap.getTxtdireccionPer().setText("");
        this.vistap.getTxttelefono().setText("");
        this.vistap.getTxtcorreoPer().setText("");
        this.vistap.getJdcFechaNacPer().setDate(null);
        this.vistap.getTxtestadocivil().setText("");
        this.vistap.getTxtsalario().setText("");
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

    public boolean validacionesCamposPersona() {
        Validaciones validar = new Validaciones();
        boolean validado = false;
        if (!this.vistap.getTxtcedulaPer().getText().isEmpty()) {
            if (validar.validarCedula(this.vistap.getTxtcedulaPer().getText())) {

                if (this.vistap.getCbxTipoPer().getSelectedIndex() != 0) {

                    //segunda  valid
                    if (!this.vistap.getTxtnombrePer().getText().isEmpty()) {
                        if (validar.ValidarTextoConEspacio(this.vistap.getTxtnombrePer().getText())) {

                            //Segunda valid
                            if (!this.vistap.getTxtapellidoPer().getText().isEmpty()) {
                                if (validar.ValidarTextoConEspacio(this.vistap.getTxtapellidoPer().getText())) {

                                    //Segunda valid
                                    if (!this.vistap.getTxtdireccionPer().getText().isEmpty()) {
                                        if (validar.validarDirec(this.vistap.getTxtdireccionPer().getText())) {

                                            //Segunda valid
                                            if (!this.vistap.getTxttelefono().getText().isEmpty()) {
                                                if (validar.validarTelefono(this.vistap.getTxttelefono().getText())) {

                                                    //Segunda valid
                                                    if (!this.vistap.getTxttelefono().getText().isEmpty()) {
                                                        if (validar.validarTelefono(this.vistap.getTxttelefono().getText())) {

                                                            //Segunda valid
                                                            if (!this.vistap.getTxtcorreoPer().getText().isEmpty()) {
                                                                if (validar.validar_email(this.vistap.getTxtcorreoPer().getText())) {

                                                                    //Segunda valid
                                                                    if (this.vistap.getButtonGroupGenero().getButtonCount() != 0) {
                                                                        validado = true;
                                                                    } else {
                                                                        Resouces.warning("ADVERTENCIA!", "Genero no seleccionado");
                                                                    }

                                                                } else {
                                                                    Resouces.warning("ADVERTENCIA!", "Correo Electronico Incorrecto");
                                                                }
                                                            } else {
                                                                Resouces.warning("ADVERTENCIA!", "Correo Electronico Vacio");
                                                            }
                                                        } else {
                                                            Resouces.warning("ADVERTENCIA!", "Numero de Telefono Incorrecto");
                                                        }
                                                    } else {
                                                        Resouces.warning("ADVERTENCIA!", "Numero de Telefono Vacio");
                                                    }
                                                } else {
                                                    Resouces.warning("ADVERTENCIA!", "Numero de Telefono Incorrecto");
                                                }
                                            } else {
                                                Resouces.warning("ADVERTENCIA!", "Numero de Telefono Vacio");
                                            }
                                        } else {
                                            Resouces.warning("ADVERTENCIA!", "Dirección Incorrecta");
                                        }
                                    } else {
                                        Resouces.warning("ADVERTENCIA!", "Dirección vacia");
                                    }
                                } else {
                                    Resouces.warning("ADVERTENCIA!", "Apellido Incorrecto");
                                }
                            } else {
                                Resouces.warning("ADVERTENCIA!", "Campo de apellidos vacio");
                            }
                        } else {
                            Resouces.warning("ADVERTENCIA!", "Nombre Incorrecto");
                        }
                    } else {
                        Resouces.warning("ADVERTENCIA!", "Campo de Nombres vacio");
                    }
                } else {
                    Resouces.warning("ADVERTENCIA!", "Debe seleccionar un tipo de persona");
                }

            } else {
                Resouces.warning("ADVERTENCIA!", "Numero de Cedula Incorrecto");
            }
        } else {
            Resouces.warning("ADVERTENCIA!", "Numero de Cedula Vacio");
        }

        return validado;
    }

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

    public void txtAyuda() {
        TextPrompt nombrePer = new TextPrompt("0102324312", this.vistap.getTxtcedulaPer());
        TextPrompt NomPer = new TextPrompt("Ana Carmen", this.vistap.getTxtnombrePer());
        TextPrompt ApePer = new TextPrompt("Castro Idrovo", this.vistap.getTxtapellidoPer());
        TextPrompt direPer = new TextPrompt("Parque Central", this.vistap.getTxtdireccionPer());
        TextPrompt telefPer = new TextPrompt("0982732723", this.vistap.getTxttelefono());
        TextPrompt corrPer = new TextPrompt("anacatro@gmail.com", this.vistap.getTxtcorreoPer());
        TextPrompt estacivPer = new TextPrompt("Casado", this.vistap.getTxtestadocivil());
        TextPrompt salarioPer = new TextPrompt("200.0", this.vistap.getTxtsalario());
        TextPrompt estratoPer = new TextPrompt("Alto", this.vistap.getTxtestrato());
        TextPrompt tituloPer = new TextPrompt("Bachiller", this.vistap.getTxtTitulo());
        TextPrompt horarioPer = new TextPrompt("12h00 a 16h00", this.vistap.getTxthorario());
        TextPrompt periodoPer = new TextPrompt("2 Semana - 1 Meses - 15 Dias", this.vistap.getTxtperiodo());
        TextPrompt tipovolPer = new TextPrompt("Ayudante", this.vistap.getTxtTipoVol());

        TextPrompt critPer = new TextPrompt("0102324312", this.vistap.getTxtBsqPersonas());
    }
}
