/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ViewAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form ViewSistema
     */
    public ViewAdministrador() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public JButton getBtnCANCELARDON() {
        return btnCANCELARDON;
    }

    public void setBtnCANCELARDON(JButton btnCANCELARDON) {
        this.btnCANCELARDON = btnCANCELARDON;
    }

    public JButton getBtnCANCELARINSCRIP() {
        return btnCANCELARINSCRIP;
    }

    public void setBtnCANCELARINSCRIP(JButton btnCANCELARINSCRIP) {
        this.btnCANCELARINSCRIP = btnCANCELARINSCRIP;
    }

    public JButton getBtnCANCELARPER() {
        return btnCANCELARPER;
    }

    public void setBtnCANCELARPER(JButton btnCANCELARPER) {
        this.btnCANCELARPER = btnCANCELARPER;
    }

    public JButton getBtnCANCELARPROD() {
        return btnCANCELARPROD;
    }

    public void setBtnCANCELARPROD(JButton btnCANCELARPROD) {
        this.btnCANCELARPROD = btnCANCELARPROD;
    }

    public JButton getBtnCANCELARPROD3() {
        return btnCANCELARPROD3;
    }

    public void setBtnCANCELARPROD3(JButton btnCANCELARPROD3) {
        this.btnCANCELARPROD3 = btnCANCELARPROD3;
    }

    public JButton getBtnCANCELARPROYE() {
        return btnCANCELARPROYE;
    }

    public void setBtnCANCELARPROYE(JButton btnCANCELARPROYE) {
        this.btnCANCELARPROYE = btnCANCELARPROYE;
    }

    public JButton getBtnCREARDON() {
        return btnCREARDON;
    }

    public void setBtnCREARDON(JButton btnCREARDON) {
        this.btnCREARDON = btnCREARDON;
    }

    public JButton getBtnCREARINSCRIP() {
        return btnCREARINSCRIP;
    }

    public void setBtnCREARINSCRIP(JButton btnCREARINSCRIP) {
        this.btnCREARINSCRIP = btnCREARINSCRIP;
    }

    public JButton getBtnCREARPER() {
        return btnCREARPER;
    }

    public void setBtnCREARPER(JButton btnCREARPER) {
        this.btnCREARPER = btnCREARPER;
    }

    public JButton getBtnCREARPROD() {
        return btnCREARPROD;
    }

    public void setBtnCREARPROD(JButton btnCREARPROD) {
        this.btnCREARPROD = btnCREARPROD;
    }

    public JButton getBtnCREARPROD3() {
        return btnCREARPROD3;
    }

    public void setBtnCREARPROD3(JButton btnCREARPROD3) {
        this.btnCREARPROD3 = btnCREARPROD3;
    }

    public JButton getBtnCREARPROYE() {
        return btnCREARPROYE;
    }

    public void setBtnCREARPROYE(JButton btnCREARPROYE) {
        this.btnCREARPROYE = btnCREARPROYE;
    }

    public JButton getBtnEDITARDON() {
        return btnEDITARDON;
    }

    public void setBtnEDITARDON(JButton btnEDITARDON) {
        this.btnEDITARDON = btnEDITARDON;
    }

    public JButton getBtnEDITARINSCRIP() {
        return btnEDITARINSCRIP;
    }

    public void setBtnEDITARINSCRIP(JButton btnEDITARINSCRIP) {
        this.btnEDITARINSCRIP = btnEDITARINSCRIP;
    }

    public JButton getBtnEDITARPER() {
        return btnEDITARPER;
    }

    public void setBtnEDITARPER(JButton btnEDITARPER) {
        this.btnEDITARPER = btnEDITARPER;
    }

    public JButton getBtnEDITARPROD() {
        return btnEDITARPROD;
    }

    public void setBtnEDITARPROD(JButton btnEDITARPROD) {
        this.btnEDITARPROD = btnEDITARPROD;
    }

    public JButton getBtnEDITARPROD3() {
        return btnEDITARPROD3;
    }

    public void setBtnEDITARPROD3(JButton btnEDITARPROD3) {
        this.btnEDITARPROD3 = btnEDITARPROD3;
    }

    public JButton getBtnEDITARPROYE() {
        return btnEDITARPROYE;
    }

    public void setBtnEDITARPROYE(JButton btnEDITARPROYE) {
        this.btnEDITARPROYE = btnEDITARPROYE;
    }

    public JButton getBtnELIMINARDON() {
        return btnELIMINARDON;
    }

    public void setBtnELIMINARDON(JButton btnELIMINARDON) {
        this.btnELIMINARDON = btnELIMINARDON;
    }

    public JButton getBtnELIMINARINSCRIP() {
        return btnELIMINARINSCRIP;
    }

    public void setBtnELIMINARINSCRIP(JButton btnELIMINARINSCRIP) {
        this.btnELIMINARINSCRIP = btnELIMINARINSCRIP;
    }

    public JButton getBtnELIMINARPER() {
        return btnELIMINARPER;
    }

    public void setBtnELIMINARPER(JButton btnELIMINARPER) {
        this.btnELIMINARPER = btnELIMINARPER;
    }

    public JButton getBtnELIMINARPROD() {
        return btnELIMINARPROD;
    }

    public void setBtnELIMINARPROD(JButton btnELIMINARPROD) {
        this.btnELIMINARPROD = btnELIMINARPROD;
    }

    public JButton getBtnELIMINARPROD3() {
        return btnELIMINARPROD3;
    }

    public void setBtnELIMINARPROD3(JButton btnELIMINARPROD3) {
        this.btnELIMINARPROD3 = btnELIMINARPROD3;
    }

    public JButton getBtnELIMINARPROYE() {
        return btnELIMINARPROYE;
    }

    public void setBtnELIMINARPROYE(JButton btnELIMINARPROYE) {
        this.btnELIMINARPROYE = btnELIMINARPROYE;
    }

    public JButton getBtnExaminarFoto() {
        return btnExaminarFoto;
    }

    public void setBtnExaminarFoto(JButton btnExaminarFoto) {
        this.btnExaminarFoto = btnExaminarFoto;
    }

    public JButton getBtnIMPRIMIRDON() {
        return btnIMPRIMIRDON;
    }

    public void setBtnIMPRIMIRDON(JButton btnIMPRIMIRDON) {
        this.btnIMPRIMIRDON = btnIMPRIMIRDON;
    }

    public JButton getBtnIMPRIMIRINSCRIP() {
        return btnIMPRIMIRINSCRIP;
    }

    public void setBtnIMPRIMIRINSCRIP(JButton btnIMPRIMIRINSCRIP) {
        this.btnIMPRIMIRINSCRIP = btnIMPRIMIRINSCRIP;
    }

    public JButton getBtnIMPRIMIRPER() {
        return btnIMPRIMIRPER;
    }

    public void setBtnIMPRIMIRPER(JButton btnIMPRIMIRPER) {
        this.btnIMPRIMIRPER = btnIMPRIMIRPER;
    }

    public JButton getBtnIMPRIMIRPROD() {
        return btnIMPRIMIRPROD;
    }

    public void setBtnIMPRIMIRPROD(JButton btnIMPRIMIRPROD) {
        this.btnIMPRIMIRPROD = btnIMPRIMIRPROD;
    }

    public JButton getBtnIMPRIMIRPROD3() {
        return btnIMPRIMIRPROD3;
    }

    public void setBtnIMPRIMIRPROD3(JButton btnIMPRIMIRPROD3) {
        this.btnIMPRIMIRPROD3 = btnIMPRIMIRPROD3;
    }

    public JButton getBtnIMPRIMIRPROYE() {
        return btnIMPRIMIRPROYE;
    }

    public void setBtnIMPRIMIRPROYE(JButton btnIMPRIMIRPROYE) {
        this.btnIMPRIMIRPROYE = btnIMPRIMIRPROYE;
    }

    public JButton getBtnLIMPIARDON() {
        return btnLIMPIARDON;
    }

    public void setBtnLIMPIARDON(JButton btnLIMPIARDON) {
        this.btnLIMPIARDON = btnLIMPIARDON;
    }

    public JButton getBtnLIMPIARINSCRIP() {
        return btnLIMPIARINSCRIP;
    }

    public void setBtnLIMPIARINSCRIP(JButton btnLIMPIARINSCRIP) {
        this.btnLIMPIARINSCRIP = btnLIMPIARINSCRIP;
    }

    public JButton getBtnLIMPIARPER() {
        return btnLIMPIARPER;
    }

    public void setBtnLIMPIARPER(JButton btnLIMPIARPER) {
        this.btnLIMPIARPER = btnLIMPIARPER;
    }

    public JButton getBtnLIMPIARPROD() {
        return btnLIMPIARPROD;
    }

    public void setBtnLIMPIARPROD(JButton btnLIMPIARPROD) {
        this.btnLIMPIARPROD = btnLIMPIARPROD;
    }

    public JButton getBtnLIMPIARPROD3() {
        return btnLIMPIARPROD3;
    }

    public void setBtnLIMPIARPROD3(JButton btnLIMPIARPROD3) {
        this.btnLIMPIARPROD3 = btnLIMPIARPROD3;
    }

    public JButton getBtnLIMPIARPROYE() {
        return btnLIMPIARPROYE;
    }

    public void setBtnLIMPIARPROYE(JButton btnLIMPIARPROYE) {
        this.btnLIMPIARPROYE = btnLIMPIARPROYE;
    }

    public JButton getBtnREPORTEGENERALDON() {
        return btnREPORTEGENERALDON;
    }

    public void setBtnREPORTEGENERALDON(JButton btnREPORTEGENERALDON) {
        this.btnREPORTEGENERALDON = btnREPORTEGENERALDON;
    }

    public JButton getBtnREPORTEGENERALINSCRIP() {
        return btnREPORTEGENERALINSCRIP;
    }

    public void setBtnREPORTEGENERALINSCRIP(JButton btnREPORTEGENERALINSCRIP) {
        this.btnREPORTEGENERALINSCRIP = btnREPORTEGENERALINSCRIP;
    }

    public JButton getBtnREPORTEGENERALPER() {
        return btnREPORTEGENERALPER;
    }

    public void setBtnREPORTEGENERALPER(JButton btnREPORTEGENERALPER) {
        this.btnREPORTEGENERALPER = btnREPORTEGENERALPER;
    }

    public JButton getBtnREPORTEGENERALPROD() {
        return btnREPORTEGENERALPROD;
    }

    public void setBtnREPORTEGENERALPROD(JButton btnREPORTEGENERALPROD) {
        this.btnREPORTEGENERALPROD = btnREPORTEGENERALPROD;
    }

    public JButton getBtnREPORTEGENERALPROD3() {
        return btnREPORTEGENERALPROD3;
    }

    public void setBtnREPORTEGENERALPROD3(JButton btnREPORTEGENERALPROD3) {
        this.btnREPORTEGENERALPROD3 = btnREPORTEGENERALPROD3;
    }

    public JButton getBtnREPORTEGENERALPROYE() {
        return btnREPORTEGENERALPROYE;
    }

    public void setBtnREPORTEGENERALPROYE(JButton btnREPORTEGENERALPROYE) {
        this.btnREPORTEGENERALPROYE = btnREPORTEGENERALPROYE;
    }

    public JButton getBtnbuscarDon() {
        return btnbuscarDon;
    }

    public void setBtnbuscarDon(JButton btnbuscarDon) {
        this.btnbuscarDon = btnbuscarDon;
    }

    public JButton getBtnbuscarInscrip() {
        return btnbuscarInscrip;
    }

    public void setBtnbuscarInscrip(JButton btnbuscarInscrip) {
        this.btnbuscarInscrip = btnbuscarInscrip;
    }

    public JButton getBtnbuscarPer() {
        return btnbuscarPer;
    }

    public void setBtnbuscarPer(JButton btnbuscarPer) {
        this.btnbuscarPer = btnbuscarPer;
    }

    public JButton getBtnbuscarProd() {
        return btnbuscarProd;
    }

    public void setBtnbuscarProd(JButton btnbuscarProd) {
        this.btnbuscarProd = btnbuscarProd;
    }

    public JButton getBtnbuscarProd3() {
        return btnbuscarProd3;
    }

    public void setBtnbuscarProd3(JButton btnbuscarProd3) {
        this.btnbuscarProd3 = btnbuscarProd3;
    }

    public JButton getBtnbuscarProyecto() {
        return btnbuscarProyecto;
    }

    public void setBtnbuscarProyecto(JButton btnbuscarProyecto) {
        this.btnbuscarProyecto = btnbuscarProyecto;
    }

    public JButton getBtndonaciones() {
        return btndonaciones;
    }

    public void setBtndonaciones(JButton btndonaciones) {
        this.btndonaciones = btndonaciones;
    }

    public JButton getBtneditarPer4() {
        return btneditarPer4;
    }

    public void setBtneditarPer4(JButton btneditarPer4) {
        this.btneditarPer4 = btneditarPer4;
    }

    public JButton getBtneditarPer5() {
        return btneditarPer5;
    }

    public void setBtneditarPer5(JButton btneditarPer5) {
        this.btneditarPer5 = btneditarPer5;
    }

    public JButton getBtneditarPer6() {
        return btneditarPer6;
    }

    public void setBtneditarPer6(JButton btneditarPer6) {
        this.btneditarPer6 = btneditarPer6;
    }

    public JButton getBtneditarPer7() {
        return btneditarPer7;
    }

    public void setBtneditarPer7(JButton btneditarPer7) {
        this.btneditarPer7 = btneditarPer7;
    }

    public JButton getBtneditarPer8() {
        return btneditarPer8;
    }

    public void setBtneditarPer8(JButton btneditarPer8) {
        this.btneditarPer8 = btneditarPer8;
    }

    public JButton getBtneditarPer9() {
        return btneditarPer9;
    }

    public void setBtneditarPer9(JButton btneditarPer9) {
        this.btneditarPer9 = btneditarPer9;
    }

    public JButton getBtneliminarPer4() {
        return btneliminarPer4;
    }

    public void setBtneliminarPer4(JButton btneliminarPer4) {
        this.btneliminarPer4 = btneliminarPer4;
    }

    public JButton getBtneliminarPer5() {
        return btneliminarPer5;
    }

    public void setBtneliminarPer5(JButton btneliminarPer5) {
        this.btneliminarPer5 = btneliminarPer5;
    }

    public JButton getBtneliminarPer6() {
        return btneliminarPer6;
    }

    public void setBtneliminarPer6(JButton btneliminarPer6) {
        this.btneliminarPer6 = btneliminarPer6;
    }

    public JButton getBtneliminarPer7() {
        return btneliminarPer7;
    }

    public void setBtneliminarPer7(JButton btneliminarPer7) {
        this.btneliminarPer7 = btneliminarPer7;
    }

    public JButton getBtneliminarPer8() {
        return btneliminarPer8;
    }

    public void setBtneliminarPer8(JButton btneliminarPer8) {
        this.btneliminarPer8 = btneliminarPer8;
    }

    public JButton getBtneliminarPer9() {
        return btneliminarPer9;
    }

    public void setBtneliminarPer9(JButton btneliminarPer9) {
        this.btneliminarPer9 = btneliminarPer9;
    }

    public JButton getBtnformularios() {
        return btnformularios;
    }

    public void setBtnformularios(JButton btnformularios) {
        this.btnformularios = btnformularios;
    }

    public JButton getBtnformularios1() {
        return btnformularios1;
    }

    public void setBtnformularios1(JButton btnformularios1) {
        this.btnformularios1 = btnformularios1;
    }

    public JButton getBtnguardarPer4() {
        return btnguardarPer4;
    }

    public void setBtnguardarPer4(JButton btnguardarPer4) {
        this.btnguardarPer4 = btnguardarPer4;
    }

    public JButton getBtnguardarPer5() {
        return btnguardarPer5;
    }

    public void setBtnguardarPer5(JButton btnguardarPer5) {
        this.btnguardarPer5 = btnguardarPer5;
    }

    public JButton getBtnguardarPer6() {
        return btnguardarPer6;
    }

    public void setBtnguardarPer6(JButton btnguardarPer6) {
        this.btnguardarPer6 = btnguardarPer6;
    }

    public JButton getBtnguardarPer7() {
        return btnguardarPer7;
    }

    public void setBtnguardarPer7(JButton btnguardarPer7) {
        this.btnguardarPer7 = btnguardarPer7;
    }

    public JButton getBtnguardarPer8() {
        return btnguardarPer8;
    }

    public void setBtnguardarPer8(JButton btnguardarPer8) {
        this.btnguardarPer8 = btnguardarPer8;
    }

    public JButton getBtnguardarPer9() {
        return btnguardarPer9;
    }

    public void setBtnguardarPer9(JButton btnguardarPer9) {
        this.btnguardarPer9 = btnguardarPer9;
    }

    public JButton getBtnlimpiarDONbsq() {
        return btnlimpiarDONbsq;
    }

    public void setBtnlimpiarDONbsq(JButton btnlimpiarDONbsq) {
        this.btnlimpiarDONbsq = btnlimpiarDONbsq;
    }

    public JButton getBtnlimpiarInscripBsqa() {
        return btnlimpiarInscripBsqa;
    }

    public void setBtnlimpiarInscripBsqa(JButton btnlimpiarInscripBsqa) {
        this.btnlimpiarInscripBsqa = btnlimpiarInscripBsqa;
    }

    public JButton getBtnlimpiarPer4() {
        return btnlimpiarPer4;
    }

    public void setBtnlimpiarPer4(JButton btnlimpiarPer4) {
        this.btnlimpiarPer4 = btnlimpiarPer4;
    }

    public JButton getBtnlimpiarPer5() {
        return btnlimpiarPer5;
    }

    public void setBtnlimpiarPer5(JButton btnlimpiarPer5) {
        this.btnlimpiarPer5 = btnlimpiarPer5;
    }

    public JButton getBtnlimpiarPer6() {
        return btnlimpiarPer6;
    }

    public void setBtnlimpiarPer6(JButton btnlimpiarPer6) {
        this.btnlimpiarPer6 = btnlimpiarPer6;
    }

    public JButton getBtnlimpiarPer7() {
        return btnlimpiarPer7;
    }

    public void setBtnlimpiarPer7(JButton btnlimpiarPer7) {
        this.btnlimpiarPer7 = btnlimpiarPer7;
    }

    public JButton getBtnlimpiarPer8() {
        return btnlimpiarPer8;
    }

    public void setBtnlimpiarPer8(JButton btnlimpiarPer8) {
        this.btnlimpiarPer8 = btnlimpiarPer8;
    }

    public JButton getBtnlimpiarPer9() {
        return btnlimpiarPer9;
    }

    public void setBtnlimpiarPer9(JButton btnlimpiarPer9) {
        this.btnlimpiarPer9 = btnlimpiarPer9;
    }

    public JButton getBtnlimpiarPerbsq() {
        return btnlimpiarPerbsq;
    }

    public void setBtnlimpiarPerbsq(JButton btnlimpiarPerbsq) {
        this.btnlimpiarPerbsq = btnlimpiarPerbsq;
    }

    public JButton getBtnlimpiarProdBsqa() {
        return btnlimpiarProdBsqa;
    }

    public void setBtnlimpiarProdBsqa(JButton btnlimpiarProdBsqa) {
        this.btnlimpiarProdBsqa = btnlimpiarProdBsqa;
    }

    public JButton getBtnlimpiarProdBsqa3() {
        return btnlimpiarProdBsqa3;
    }

    public void setBtnlimpiarProdBsqa3(JButton btnlimpiarProdBsqa3) {
        this.btnlimpiarProdBsqa3 = btnlimpiarProdBsqa3;
    }

    public JButton getBtnlimpiarProyectoBsqa() {
        return btnlimpiarProyectoBsqa;
    }

    public void setBtnlimpiarProyectoBsqa(JButton btnlimpiarProyectoBsqa) {
        this.btnlimpiarProyectoBsqa = btnlimpiarProyectoBsqa;
    }

    public JButton getBtnproductos() {
        return btnproductos;
    }

    public void setBtnproductos(JButton btnproductos) {
        this.btnproductos = btnproductos;
    }

    public JButton getBtnproyectos() {
        return btnproyectos;
    }

    public void setBtnproyectos(JButton btnproyectos) {
        this.btnproyectos = btnproyectos;
    }

    public JButton getBtnroles() {
        return btnroles;
    }

    public void setBtnroles(JButton btnroles) {
        this.btnroles = btnroles;
    }

    public ButtonGroup getButtonGroupGenero() {
        return buttonGroupGenero;
    }

    public void setButtonGroupGenero(ButtonGroup buttonGroupGenero) {
        this.buttonGroupGenero = buttonGroupGenero;
    }

    public JComboBox<String> getCbxCodigoBeneficiario() {
        return cbxCodigoBeneficiario;
    }

    public void setCbxCodigoBeneficiario(JComboBox<String> cbxCodigoBeneficiario) {
        this.cbxCodigoBeneficiario = cbxCodigoBeneficiario;
    }

    public JComboBox<String> getCbxCodigoProyecto() {
        return cbxCodigoProyecto;
    }

    public void setCbxCodigoProyecto(JComboBox<String> cbxCodigoProyecto) {
        this.cbxCodigoProyecto = cbxCodigoProyecto;
    }

    public JComboBox<String> getCbxCodigoVoluntario() {
        return cbxCodigoVoluntario;
    }

    public void setCbxCodigoVoluntario(JComboBox<String> cbxCodigoVoluntario) {
        this.cbxCodigoVoluntario = cbxCodigoVoluntario;
    }

    public JComboBox<String> getCbxIdDonacion() {
        return cbxIdDonacion;
    }

    public void setCbxIdDonacion(JComboBox<String> cbxIdDonacion) {
        this.cbxIdDonacion = cbxIdDonacion;
    }

    public JComboBox<String> getCbxIdDonacion3() {
        return cbxIdDonacion3;
    }

    public void setCbxIdDonacion3(JComboBox<String> cbxIdDonacion3) {
        this.cbxIdDonacion3 = cbxIdDonacion3;
    }

    public JComboBox<String> getCbxTipoPer() {
        return cbxTipoPer;
    }

    public void setCbxTipoPer(JComboBox<String> cbxTipoPer) {
        this.cbxTipoPer = cbxTipoPer;
    }

    public JCheckBox getChekBsqDON() {
        return chekBsqDON;
    }

    public void setChekBsqDON(JCheckBox chekBsqDON) {
        this.chekBsqDON = chekBsqDON;
    }

    public JCheckBox getChekBsqInscrip() {
        return chekBsqInscrip;
    }

    public void setChekBsqInscrip(JCheckBox chekBsqInscrip) {
        this.chekBsqInscrip = chekBsqInscrip;
    }

    public JCheckBox getChekBsqPer() {
        return chekBsqPer;
    }

    public void setChekBsqPer(JCheckBox chekBsqPer) {
        this.chekBsqPer = chekBsqPer;
    }

    public JCheckBox getChekBsqProds() {
        return chekBsqProds;
    }

    public void setChekBsqProds(JCheckBox chekBsqProds) {
        this.chekBsqProds = chekBsqProds;
    }

    public JCheckBox getChekBsqProds3() {
        return chekBsqProds3;
    }

    public void setChekBsqProds3(JCheckBox chekBsqProds3) {
        this.chekBsqProds3 = chekBsqProds3;
    }

    public JCheckBox getChekBsqProyectos() {
        return chekBsqProyectos;
    }

    public void setChekBsqProyectos(JCheckBox chekBsqProyectos) {
        this.chekBsqProyectos = chekBsqProyectos;
    }

    public JCheckBox getChkseguroiees() {
        return chkseguroiees;
    }

    public void setChkseguroiees(JCheckBox chkseguroiees) {
        this.chkseguroiees = chkseguroiees;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JDateChooser getjDateChooserFechaFin() {
        return jDateChooserFechaFin;
    }

    public void setjDateChooserFechaFin(JDateChooser jDateChooserFechaFin) {
        this.jDateChooserFechaFin = jDateChooserFechaFin;
    }

    public JDateChooser getjDateChooserFechaInicio() {
        return jDateChooserFechaInicio;
    }

    public void setjDateChooserFechaInicio(JDateChooser jDateChooserFechaInicio) {
        this.jDateChooserFechaInicio = jDateChooserFechaInicio;
    }

    public JDateChooser getjDateFechaentregaDON() {
        return jDateFechaentregaDON;
    }

    public void setjDateFechaentregaDON(JDateChooser jDateFechaentregaDON) {
        this.jDateFechaentregaDON = jDateFechaentregaDON;
    }

    public JDateChooser getjDatefechanaci() {
        return jDatefechanaci;
    }

    public void setjDatefechanaci(JDateChooser jDatefechanaci) {
        this.jDatefechanaci = jDatefechanaci;
    }

    public JSpinner getjSpinnerCantidad() {
        return jSpinnerCantidad;
    }

    public void setjSpinnerCantidad(JSpinner jSpinnerCantidad) {
        this.jSpinnerCantidad = jSpinnerCantidad;
    }

    public JSpinner getjSpinnerCantidad3() {
        return jSpinnerCantidad3;
    }

    public void setjSpinnerCantidad3(JSpinner jSpinnerCantidad3) {
        this.jSpinnerCantidad3 = jSpinnerCantidad3;
    }

    public JSpinner getjSpinnerDiasParticipacion() {
        return jSpinnerDiasParticipacion;
    }

    public void setjSpinnerDiasParticipacion(JSpinner jSpinnerDiasParticipacion) {
        this.jSpinnerDiasParticipacion = jSpinnerDiasParticipacion;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTable getjTableDatosDonaciones() {
        return jTableDatosDonaciones;
    }

    public void setjTableDatosDonaciones(JTable jTableDatosDonaciones) {
        this.jTableDatosDonaciones = jTableDatosDonaciones;
    }

    public JTable getjTableDatosInscripciones() {
        return jTableDatosInscripciones;
    }

    public void setjTableDatosInscripciones(JTable jTableDatosInscripciones) {
        this.jTableDatosInscripciones = jTableDatosInscripciones;
    }

    public JTable getjTableDatosPersonas() {
        return jTableDatosPersonas;
    }

    public void setjTableDatosPersonas(JTable jTableDatosPersonas) {
        this.jTableDatosPersonas = jTableDatosPersonas;
    }

    public JTable getjTableDatosProductos() {
        return jTableDatosProductos;
    }

    public void setjTableDatosProductos(JTable jTableDatosProductos) {
        this.jTableDatosProductos = jTableDatosProductos;
    }

    public JTable getjTableDatosProductos3() {
        return jTableDatosProductos3;
    }

    public void setjTableDatosProductos3(JTable jTableDatosProductos3) {
        this.jTableDatosProductos3 = jTableDatosProductos3;
    }

    public JTable getjTableDatosProyectos() {
        return jTableDatosProyectos;
    }

    public void setjTableDatosProyectos(JTable jTableDatosProyectos) {
        this.jTableDatosProyectos = jTableDatosProyectos;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JPanel getPn() {
        return pn;
    }

    public void setPn(JPanel pn) {
        this.pn = pn;
    }

    public JPanel getPnPersona() {
        return pnPersona;
    }

    public void setPnPersona(JPanel pnPersona) {
        this.pnPersona = pnPersona;
    }

    public JPanel getPnPrincipal() {
        return pnPrincipal;
    }

    public void setPnPrincipal(JPanel pnPrincipal) {
        this.pnPrincipal = pnPrincipal;
    }

    public JRadioButton getRbtFemenino() {
        return rbtFemenino;
    }

    public void setRbtFemenino(JRadioButton rbtFemenino) {
        this.rbtFemenino = rbtFemenino;
    }

    public JRadioButton getRbtMasculino() {
        return rbtMasculino;
    }

    public void setRbtMasculino(JRadioButton rbtMasculino) {
        this.rbtMasculino = rbtMasculino;
    }

    public JTextArea getTxaDetalleProdDON() {
        return txaDetalleProdDON;
    }

    public void setTxaDetalleProdDON(JTextArea txaDetalleProdDON) {
        this.txaDetalleProdDON = txaDetalleProdDON;
    }

    public JTextArea getTxaMotivoDON() {
        return txaMotivoDON;
    }

    public void setTxaMotivoDON(JTextArea txaMotivoDON) {
        this.txaMotivoDON = txaMotivoDON;
    }

    public JTextField getTxtBsqDonaciones() {
        return txtBsqDonaciones;
    }

    public void setTxtBsqDonaciones(JTextField txtBsqDonaciones) {
        this.txtBsqDonaciones = txtBsqDonaciones;
    }

    public JTextField getTxtBsqInscripciones() {
        return txtBsqInscripciones;
    }

    public void setTxtBsqInscripciones(JTextField txtBsqInscripciones) {
        this.txtBsqInscripciones = txtBsqInscripciones;
    }

    public JTextField getTxtBsqPersonas() {
        return txtBsqPersonas;
    }

    public void setTxtBsqPersonas(JTextField txtBsqPersonas) {
        this.txtBsqPersonas = txtBsqPersonas;
    }

    public JTextField getTxtBsqProductos() {
        return txtBsqProductos;
    }

    public void setTxtBsqProductos(JTextField txtBsqProductos) {
        this.txtBsqProductos = txtBsqProductos;
    }

    public JTextField getTxtBsqProductos3() {
        return txtBsqProductos3;
    }

    public void setTxtBsqProductos3(JTextField txtBsqProductos3) {
        this.txtBsqProductos3 = txtBsqProductos3;
    }

    public JTextField getTxtBsqProyecto() {
        return txtBsqProyecto;
    }

    public void setTxtBsqProyecto(JTextField txtBsqProyecto) {
        this.txtBsqProyecto = txtBsqProyecto;
    }

    public JTextField getTxtCodigoInscripcion() {
        return txtCodigoInscripcion;
    }

    public void setTxtCodigoInscripcion(JTextField txtCodigoInscripcion) {
        this.txtCodigoInscripcion = txtCodigoInscripcion;
    }

    public JTextField getTxtLugar() {
        return txtLugar;
    }

    public void setTxtLugar(JTextField txtLugar) {
        this.txtLugar = txtLugar;
    }

    public JTextField getTxtNombreProyecto() {
        return txtNombreProyecto;
    }

    public void setTxtNombreProyecto(JTextField txtNombreProyecto) {
        this.txtNombreProyecto = txtNombreProyecto;
    }

    public JTextField getTxtNumeroProyecto() {
        return txtNumeroProyecto;
    }

    public void setTxtNumeroProyecto(JTextField txtNumeroProyecto) {
        this.txtNumeroProyecto = txtNumeroProyecto;
    }

    public JTextField getTxtTipoProducto() {
        return txtTipoProducto;
    }

    public void setTxtTipoProducto(JTextField txtTipoProducto) {
        this.txtTipoProducto = txtTipoProducto;
    }

    public JTextField getTxtTipoProducto3() {
        return txtTipoProducto3;
    }

    public void setTxtTipoProducto3(JTextField txtTipoProducto3) {
        this.txtTipoProducto3 = txtTipoProducto3;
    }

    public JTextField getTxtTipoVol() {
        return txtTipoVol;
    }

    public void setTxtTipoVol(JTextField txtTipoVol) {
        this.txtTipoVol = txtTipoVol;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtapellidoPer() {
        return txtapellidoPer;
    }

    public void setTxtapellidoPer(JTextField txtapellidoPer) {
        this.txtapellidoPer = txtapellidoPer;
    }

    public JTextField getTxtcedulaPer() {
        return txtcedulaPer;
    }

    public void setTxtcedulaPer(JTextField txtcedulaPer) {
        this.txtcedulaPer = txtcedulaPer;
    }

    public JTextField getTxtcorreoPer() {
        return txtcorreoPer;
    }

    public void setTxtcorreoPer(JTextField txtcorreoPer) {
        this.txtcorreoPer = txtcorreoPer;
    }

    public JTextField getTxtdireccionPer() {
        return txtdireccionPer;
    }

    public void setTxtdireccionPer(JTextField txtdireccionPer) {
        this.txtdireccionPer = txtdireccionPer;
    }

    public JTextField getTxtestadocivil() {
        return txtestadocivil;
    }

    public void setTxtestadocivil(JTextField txtestadocivil) {
        this.txtestadocivil = txtestadocivil;
    }

    public JTextField getTxtestrato() {
        return txtestrato;
    }

    public void setTxtestrato(JTextField txtestrato) {
        this.txtestrato = txtestrato;
    }

    public JTextField getTxthorario() {
        return txthorario;
    }

    public void setTxthorario(JTextField txthorario) {
        this.txthorario = txthorario;
    }

    public JTextField getTxtnombrePer() {
        return txtnombrePer;
    }

    public void setTxtnombrePer(JTextField txtnombrePer) {
        this.txtnombrePer = txtnombrePer;
    }

    public JTextField getTxtperiodo() {
        return txtperiodo;
    }

    public void setTxtperiodo(JTextField txtperiodo) {
        this.txtperiodo = txtperiodo;
    }

    public JTextField getTxtsalario() {
        return txtsalario;
    }

    public void setTxtsalario(JTextField txtsalario) {
        this.txtsalario = txtsalario;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        pnPrincipal = new javax.swing.JPanel();
        btnformularios = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnPersona = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtcedulaPer = new javax.swing.JTextField();
        txtnombrePer = new javax.swing.JTextField();
        txtapellidoPer = new javax.swing.JTextField();
        txtdireccionPer = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreoPer = new javax.swing.JTextField();
        btnguardarPer4 = new javax.swing.JButton();
        btneditarPer4 = new javax.swing.JButton();
        btneliminarPer4 = new javax.swing.JButton();
        btnlimpiarPer4 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        cbxTipoPer = new javax.swing.JComboBox<>();
        rbtFemenino = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        txtestadocivil = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        txtestrato = new javax.swing.JTextField();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtsalario = new javax.swing.JTextField();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jSeparator48 = new javax.swing.JSeparator();
        jSeparator49 = new javax.swing.JSeparator();
        chkseguroiees = new javax.swing.JCheckBox();
        jLabel56 = new javax.swing.JLabel();
        txthorario = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        txtperiodo = new javax.swing.JTextField();
        jSeparator51 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        txtTipoVol = new javax.swing.JTextField();
        jSeparator80 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        btnExaminarFoto = new javax.swing.JButton();
        jDatefechanaci = new com.toedter.calendar.JDateChooser();
        jSeparator47 = new javax.swing.JSeparator();
        btnLIMPIARPER = new javax.swing.JButton();
        btnCREARPER = new javax.swing.JButton();
        btnEDITARPER = new javax.swing.JButton();
        btnELIMINARPER = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDatosPersonas = new javax.swing.JTable();
        btnCANCELARPER = new javax.swing.JButton();
        btnREPORTEGENERALPER = new javax.swing.JButton();
        btnIMPRIMIRPER = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btnlimpiarPerbsq = new javax.swing.JButton();
        btnbuscarPer = new javax.swing.JButton();
        chekBsqPer = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        txtBsqPersonas = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        pn = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnguardarPer5 = new javax.swing.JButton();
        btneditarPer5 = new javax.swing.JButton();
        btneliminarPer5 = new javax.swing.JButton();
        btnlimpiarPer5 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator52 = new javax.swing.JSeparator();
        jSeparator83 = new javax.swing.JSeparator();
        jSeparator86 = new javax.swing.JSeparator();
        jDateFechaentregaDON = new com.toedter.calendar.JDateChooser();
        btnCREARDON = new javax.swing.JButton();
        btnLIMPIARDON = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMotivoDON = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaDetalleProdDON = new javax.swing.JTextArea();
        btnEDITARDON = new javax.swing.JButton();
        btnELIMINARDON = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnlimpiarDONbsq = new javax.swing.JButton();
        btnbuscarDon = new javax.swing.JButton();
        chekBsqDON = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        txtBsqDonaciones = new javax.swing.JTextField();
        jSeparator79 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDatosDonaciones = new javax.swing.JTable();
        btnCANCELARDON = new javax.swing.JButton();
        btnIMPRIMIRDON = new javax.swing.JButton();
        btnREPORTEGENERALDON = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnguardarPer6 = new javax.swing.JButton();
        btneditarPer6 = new javax.swing.JButton();
        btneliminarPer6 = new javax.swing.JButton();
        btnlimpiarPer6 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator81 = new javax.swing.JSeparator();
        jSeparator84 = new javax.swing.JSeparator();
        jSeparator87 = new javax.swing.JSeparator();
        btnCREARPROD = new javax.swing.JButton();
        btnLIMPIARPROD = new javax.swing.JButton();
        btnEDITARPROD = new javax.swing.JButton();
        btnELIMINARPROD = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        txtTipoProducto = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        cbxIdDonacion = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        btnlimpiarProdBsqa = new javax.swing.JButton();
        btnbuscarProd = new javax.swing.JButton();
        chekBsqProds = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        txtBsqProductos = new javax.swing.JTextField();
        jSeparator82 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableDatosProductos = new javax.swing.JTable();
        btnIMPRIMIRPROD = new javax.swing.JButton();
        btnCANCELARPROD = new javax.swing.JButton();
        btnREPORTEGENERALPROD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnguardarPer7 = new javax.swing.JButton();
        btneditarPer7 = new javax.swing.JButton();
        btneliminarPer7 = new javax.swing.JButton();
        btnlimpiarPer7 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jSeparator85 = new javax.swing.JSeparator();
        jSeparator88 = new javax.swing.JSeparator();
        btnCREARPROYE = new javax.swing.JButton();
        btnLIMPIARPROYE = new javax.swing.JButton();
        btnEDITARPROYE = new javax.swing.JButton();
        btnELIMINARPROYE = new javax.swing.JButton();
        txtLugar = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        cbxCodigoBeneficiario = new javax.swing.JComboBox<>();
        txtNumeroProyecto = new javax.swing.JTextField();
        jSeparator99 = new javax.swing.JSeparator();
        jDateChooserFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel76 = new javax.swing.JLabel();
        jDateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        jSeparator100 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        txtNombreProyecto = new javax.swing.JTextField();
        jSeparator101 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        btnlimpiarProyectoBsqa = new javax.swing.JButton();
        btnbuscarProyecto = new javax.swing.JButton();
        chekBsqProyectos = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        txtBsqProyecto = new javax.swing.JTextField();
        jSeparator90 = new javax.swing.JSeparator();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableDatosProyectos = new javax.swing.JTable();
        btnIMPRIMIRPROYE = new javax.swing.JButton();
        btnCANCELARPROYE = new javax.swing.JButton();
        btnREPORTEGENERALPROYE = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnguardarPer8 = new javax.swing.JButton();
        btneditarPer8 = new javax.swing.JButton();
        btneliminarPer8 = new javax.swing.JButton();
        btnlimpiarPer8 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator91 = new javax.swing.JSeparator();
        jSeparator92 = new javax.swing.JSeparator();
        jSeparator93 = new javax.swing.JSeparator();
        btnCREARINSCRIP = new javax.swing.JButton();
        btnLIMPIARINSCRIP = new javax.swing.JButton();
        btnEDITARINSCRIP = new javax.swing.JButton();
        btnELIMINARINSCRIP = new javax.swing.JButton();
        txtCodigoInscripcion = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        cbxCodigoProyecto = new javax.swing.JComboBox<>();
        cbxCodigoVoluntario = new javax.swing.JComboBox<>();
        jSpinnerDiasParticipacion = new javax.swing.JSpinner();
        jLabel79 = new javax.swing.JLabel();
        jSeparator102 = new javax.swing.JSeparator();
        jPanel23 = new javax.swing.JPanel();
        btnlimpiarInscripBsqa = new javax.swing.JButton();
        btnbuscarInscrip = new javax.swing.JButton();
        chekBsqInscrip = new javax.swing.JCheckBox();
        jLabel71 = new javax.swing.JLabel();
        txtBsqInscripciones = new javax.swing.JTextField();
        jSeparator94 = new javax.swing.JSeparator();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableDatosInscripciones = new javax.swing.JTable();
        btnIMPRIMIRINSCRIP = new javax.swing.JButton();
        btnCANCELARINSCRIP = new javax.swing.JButton();
        btnREPORTEGENERALINSCRIP = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnguardarPer9 = new javax.swing.JButton();
        btneditarPer9 = new javax.swing.JButton();
        btneliminarPer9 = new javax.swing.JButton();
        btnlimpiarPer9 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jSeparator95 = new javax.swing.JSeparator();
        jSeparator96 = new javax.swing.JSeparator();
        jSeparator97 = new javax.swing.JSeparator();
        btnCREARPROD3 = new javax.swing.JButton();
        btnLIMPIARPROD3 = new javax.swing.JButton();
        btnEDITARPROD3 = new javax.swing.JButton();
        btnELIMINARPROD3 = new javax.swing.JButton();
        jSpinnerCantidad3 = new javax.swing.JSpinner();
        txtTipoProducto3 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        cbxIdDonacion3 = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        btnlimpiarProdBsqa3 = new javax.swing.JButton();
        btnbuscarProd3 = new javax.swing.JButton();
        chekBsqProds3 = new javax.swing.JCheckBox();
        jLabel75 = new javax.swing.JLabel();
        txtBsqProductos3 = new javax.swing.JTextField();
        jSeparator98 = new javax.swing.JSeparator();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableDatosProductos3 = new javax.swing.JTable();
        btnIMPRIMIRPROD3 = new javax.swing.JButton();
        btnCANCELARPROD3 = new javax.swing.JButton();
        btnREPORTEGENERALPROD3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btndonaciones = new javax.swing.JButton();
        btnproductos = new javax.swing.JButton();
        btnproyectos = new javax.swing.JButton();
        btnroles = new javax.swing.JButton();
        btnformularios1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(209, 200, 184));
        jPanel3.setLayout(new java.awt.BorderLayout());

        pnPrincipal.setBackground(new java.awt.Color(28, 26, 65));
        pnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnformularios.setBackground(new java.awt.Color(43, 45, 66));
        btnformularios.setForeground(new java.awt.Color(255, 255, 255));
        btnformularios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-48.png"))); // NOI18N
        btnformularios.setText("SALIR");
        btnformularios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnformulariosActionPerformed(evt);
            }
        });
        pnPrincipal.add(btnformularios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 180, 40));

        jButton2.setBackground(new java.awt.Color(43, 45, 66));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empresario.png"))); // NOI18N
        jButton2.setText("JEFE ");
        pnPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 40));

        jButton3.setBackground(new java.awt.Color(43, 45, 66));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assistant.png"))); // NOI18N
        jButton3.setText("ASISTENTE");
        pnPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, 40));

        jButton4.setBackground(new java.awt.Color(43, 45, 66));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jButton4.setText("REPORTES");
        pnPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 40));

        jButton5.setBackground(new java.awt.Color(43, 45, 66));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        jButton5.setText("CONFIGURACIÓN");
        pnPrincipal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, -1));

        pnPersona.setBackground(new java.awt.Color(249, 247, 250));
        pnPersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(249, 247, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Personas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcedulaPer.setBackground(new java.awt.Color(249, 247, 250));
        txtcedulaPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcedulaPer.setBorder(null);
        jPanel5.add(txtcedulaPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        txtnombrePer.setBackground(new java.awt.Color(249, 247, 250));
        txtnombrePer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtnombrePer.setBorder(null);
        jPanel5.add(txtnombrePer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, -1));

        txtapellidoPer.setBackground(new java.awt.Color(249, 247, 250));
        txtapellidoPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtapellidoPer.setBorder(null);
        jPanel5.add(txtapellidoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        txtdireccionPer.setBackground(new java.awt.Color(249, 247, 250));
        txtdireccionPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtdireccionPer.setBorder(null);
        jPanel5.add(txtdireccionPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, -1));

        txttelefono.setBackground(new java.awt.Color(249, 247, 250));
        txttelefono.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txttelefono.setBorder(null);
        jPanel5.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 200, 20));

        txtcorreoPer.setBackground(new java.awt.Color(249, 247, 250));
        txtcorreoPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcorreoPer.setBorder(null);
        jPanel5.add(txtcorreoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 207, -1));

        btnguardarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btnguardarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btneditarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btneliminarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btnlimpiarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel44.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Identificación");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel45.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Nombres:");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel46.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Apellidos:");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel47.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Dirección:");
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel48.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Teléfono:");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel49.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Correo:");
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jSeparator37.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 10));

        jSeparator38.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 10));

        jSeparator39.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 4));

        jSeparator40.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 12));

        jSeparator41.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 207, 10));

        jLabel50.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Tipo:");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel5.add(cbxTipoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 20));

        buttonGroupGenero.add(rbtFemenino);
        rbtFemenino.setText("Femenino");
        rbtFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemeninoActionPerformed(evt);
            }
        });
        jPanel5.add(rbtFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Género:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        buttonGroupGenero.add(rbtMasculino);
        rbtMasculino.setText("Masculino");
        jPanel5.add(rbtMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel51.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Estado Civil:");
        jPanel5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        txtestadocivil.setBackground(new java.awt.Color(249, 247, 250));
        txtestadocivil.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtestadocivil.setBorder(null);
        jPanel5.add(txtestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 180, -1));

        jSeparator43.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 11));

        jLabel52.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Estrato Social:");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 428, -1, -1));

        txtestrato.setBackground(new java.awt.Color(249, 247, 250));
        txtestrato.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtestrato.setBorder(null);
        jPanel5.add(txtestrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 448, 200, -1));

        jSeparator44.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 468, 200, 13));

        jLabel53.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Fecha de Nacimiento:");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 112, -1));

        jLabel54.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("Salario:");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        txtsalario.setBackground(new java.awt.Color(249, 247, 250));
        txtsalario.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtsalario.setBorder(null);
        jPanel5.add(txtsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 180, -1));

        jSeparator45.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 180, 10));

        jSeparator46.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 180, 12));

        jLabel55.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Título:");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        txtTitulo.setBackground(new java.awt.Color(249, 247, 250));
        txtTitulo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtTitulo.setBorder(null);
        jPanel5.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, -1));

        jSeparator48.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 200, 12));

        jSeparator49.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 180, 12));

        chkseguroiees.setText("Seguro IEES");
        jPanel5.add(chkseguroiees, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 180, -1));

        jLabel56.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Horario:");
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        txthorario.setBackground(new java.awt.Color(249, 247, 250));
        txthorario.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txthorario.setBorder(null);
        jPanel5.add(txthorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 200, -1));

        jSeparator50.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 200, 10));

        jLabel57.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Periodo:");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        txtperiodo.setBackground(new java.awt.Color(249, 247, 250));
        txtperiodo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtperiodo.setBorder(null);
        jPanel5.add(txtperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 190, -1));

        jSeparator51.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 190, 10));

        jLabel58.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("Tipo de Voluntario:");
        jPanel5.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        txtTipoVol.setBackground(new java.awt.Color(249, 247, 250));
        txtTipoVol.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtTipoVol.setBorder(null);
        jPanel5.add(txtTipoVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, -1));

        jSeparator80.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator80, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 180, 15));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnExaminarFoto.setText("Examinar");
        jPanel5.add(btnExaminarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 147, 21));
        jPanel5.add(jDatefechanaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 200, 20));

        jSeparator47.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 10));
        jPanel5.add(btnLIMPIARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 40, 30));
        jPanel5.add(btnCREARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 40, 30));
        jPanel5.add(btnEDITARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 40, 30));
        jPanel5.add(btnELIMINARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 40, 30));

        pnPersona.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 580));

        jPanel15.setBackground(new java.awt.Color(249, 247, 250));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosPersonas.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane5.setViewportView(jTableDatosPersonas);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnIMPRIMIRPER, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnREPORTEGENERALPER, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnCANCELARPER, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCANCELARPER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALPER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRPER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pnPersona.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 490, 470));

        jPanel16.setBackground(new java.awt.Color(249, 247, 250));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarPerbsq.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPerbsq.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPerbsq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.add(btnlimpiarPerbsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 40, 30));

        btnbuscarPer.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarPer.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarPer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.add(btnbuscarPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, 30));

        chekBsqPer.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqPer.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqPer.setText("Mostrar Todos");
        chekBsqPer.setBorder(null);
        jPanel16.add(chekBsqPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 110, 30));

        jLabel40.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Criterio");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqPersonas.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqPersonas.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqPersonas.setBorder(null);
        jPanel16.add(txtBsqPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator42.setForeground(new java.awt.Color(204, 204, 204));
        jPanel16.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        pnPersona.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 490, 110));

        jTabbedPane1.addTab("Personas", pnPersona);

        pn.setBackground(new java.awt.Color(249, 247, 250));

        jPanel6.setBackground(new java.awt.Color(249, 247, 250));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer5.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(btnguardarPer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer5.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(btneditarPer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer5.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(btneliminarPer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer5.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(btnlimpiarPer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel59.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Detalle de Producto: ");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel61.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Fecha de Entrega:");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel62.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Motivo de Donación:");
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jSeparator52.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, 10));

        jSeparator83.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jSeparator83, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 12));

        jSeparator86.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jSeparator86, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 220, 13));
        jPanel6.add(jDateFechaentregaDON, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 220, 30));
        jPanel6.add(btnCREARDON, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel6.add(btnLIMPIARDON, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 40, 30));

        txaMotivoDON.setBackground(new java.awt.Color(249, 247, 250));
        txaMotivoDON.setColumns(20);
        txaMotivoDON.setRows(5);
        txaMotivoDON.setBorder(null);
        jScrollPane2.setViewportView(txaMotivoDON);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 80));

        txaDetalleProdDON.setBackground(new java.awt.Color(249, 247, 250));
        txaDetalleProdDON.setColumns(20);
        txaDetalleProdDON.setRows(5);
        txaDetalleProdDON.setBorder(null);
        jScrollPane4.setViewportView(txaDetalleProdDON);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 80));
        jPanel6.add(btnEDITARDON, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 40, 30));
        jPanel6.add(btnELIMINARDON, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 30));

        jPanel17.setBackground(new java.awt.Color(249, 247, 250));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarDONbsq.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarDONbsq.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarDONbsq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(btnlimpiarDONbsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, 30));

        btnbuscarDon.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarDon.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(btnbuscarDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 60, 30));

        chekBsqDON.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqDON.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqDON.setText("Mostrar Todos");
        chekBsqDON.setBorder(null);
        jPanel17.add(chekBsqDON, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 110, 30));

        jLabel41.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Criterio");
        jPanel17.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqDonaciones.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqDonaciones.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqDonaciones.setBorder(null);
        jPanel17.add(txtBsqDonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator79.setForeground(new java.awt.Color(204, 204, 204));
        jPanel17.add(jSeparator79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        jPanel18.setBackground(new java.awt.Color(249, 247, 250));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosDonaciones.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosDonaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(jTableDatosDonaciones);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnIMPRIMIRDON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnREPORTEGENERALDON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCANCELARDON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCANCELARDON, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRDON, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALDON, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230))
        );

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(899, Short.MAX_VALUE))
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Donaciones", pn);

        jPanel12.setBackground(new java.awt.Color(249, 247, 250));

        jPanel7.setBackground(new java.awt.Color(249, 247, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Producto ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer6.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(btnguardarPer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer6.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(btneditarPer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer6.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(btneliminarPer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer6.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(btnlimpiarPer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel60.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Tipo de Producto:");
        jPanel7.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel64.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("ID Donación:");
        jPanel7.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jSeparator81.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jSeparator81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, 10));

        jSeparator84.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jSeparator84, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 12));

        jSeparator87.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jSeparator87, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 333, 220, 10));
        jPanel7.add(btnCREARPROD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel7.add(btnLIMPIARPROD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 40, 30));
        jPanel7.add(btnEDITARPROD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 40, 30));
        jPanel7.add(btnELIMINARPROD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 30));

        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerCantidad.setBorder(null);
        jPanel7.add(jSpinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));
        jPanel7.add(txtTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, 30));

        jLabel65.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Cantidad:");
        jPanel7.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 20));

        jPanel7.add(cbxIdDonacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 30));

        jPanel19.setBackground(new java.awt.Color(249, 247, 250));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarProdBsqa.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarProdBsqa.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarProdBsqa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(btnlimpiarProdBsqa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, 30));

        btnbuscarProd.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarProd.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(btnbuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 30));

        chekBsqProds.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqProds.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqProds.setText("Mostrar Todos");
        chekBsqProds.setBorder(null);
        jPanel19.add(chekBsqProds, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 30));

        jLabel42.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Criterio");
        jPanel19.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqProductos.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqProductos.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqProductos.setBorder(null);
        jPanel19.add(txtBsqProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator82.setForeground(new java.awt.Color(204, 204, 204));
        jPanel19.add(jSeparator82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        jPanel20.setBackground(new java.awt.Color(249, 247, 250));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosProductos.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane8.setViewportView(jTableDatosProductos);

        btnIMPRIMIRPROD.setBackground(new java.awt.Color(249, 247, 250));
        btnIMPRIMIRPROD.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIMPRIMIRPROD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCANCELARPROD.setBackground(new java.awt.Color(249, 247, 250));
        btnCANCELARPROD.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCANCELARPROD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnREPORTEGENERALPROD.setBackground(new java.awt.Color(249, 247, 250));
        btnREPORTEGENERALPROD.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnREPORTEGENERALPROD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIMPRIMIRPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnREPORTEGENERALPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnCANCELARPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIMPRIMIRPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCANCELARPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(662, 662, 662))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Productos", jPanel12);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(988, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(780, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reportes", jPanel2);

        jPanel13.setBackground(new java.awt.Color(249, 247, 250));

        jPanel8.setBackground(new java.awt.Color(249, 247, 250));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer7.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(btnguardarPer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer7.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(btneditarPer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer7.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(btneliminarPer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer7.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(btnlimpiarPer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel63.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Número de Proyecto");
        jPanel8.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel66.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 102));
        jLabel66.setText("Código de Beneficiario");
        jPanel8.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jSeparator85.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.add(jSeparator85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 10));

        jSeparator88.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.add(jSeparator88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 12));
        jPanel8.add(btnCREARPROYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel8.add(btnLIMPIARPROYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 40, 30));
        jPanel8.add(btnEDITARPROYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 40, 30));
        jPanel8.add(btnELIMINARPROYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 40, 30));

        txtLugar.setBackground(new java.awt.Color(249, 247, 250));
        txtLugar.setBorder(null);
        jPanel8.add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 20));

        jLabel67.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("Nombre:");
        jPanel8.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jPanel8.add(cbxCodigoBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

        txtNumeroProyecto.setBackground(new java.awt.Color(249, 247, 250));
        txtNumeroProyecto.setBorder(null);
        jPanel8.add(txtNumeroProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        jSeparator99.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.add(jSeparator99, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 10));
        jPanel8.add(jDateChooserFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jLabel76.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setText("Fecha Inicio");
        jPanel8.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel8.add(jDateChooserFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        jSeparator100.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.add(jSeparator100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 10));

        jLabel77.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 102, 102));
        jLabel77.setText("Fecha Fin");
        jPanel8.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtNombreProyecto.setBackground(new java.awt.Color(249, 247, 250));
        txtNombreProyecto.setBorder(null);
        jPanel8.add(txtNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 20));

        jSeparator101.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.add(jSeparator101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 10));

        jLabel78.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 102, 102));
        jLabel78.setText("Lugar");
        jPanel8.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jPanel21.setBackground(new java.awt.Color(249, 247, 250));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Proyecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel21.setForeground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarProyectoBsqa.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarProyectoBsqa.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarProyectoBsqa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel21.add(btnlimpiarProyectoBsqa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, 30));

        btnbuscarProyecto.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarProyecto.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarProyecto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel21.add(btnbuscarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 30));

        chekBsqProyectos.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqProyectos.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqProyectos.setText("Mostrar Todos");
        chekBsqProyectos.setBorder(null);
        jPanel21.add(chekBsqProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 30));

        jLabel43.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Criterio");
        jPanel21.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqProyecto.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqProyecto.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqProyecto.setBorder(null);
        jPanel21.add(txtBsqProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator90.setForeground(new java.awt.Color(204, 204, 204));
        jPanel21.add(jSeparator90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        jPanel22.setBackground(new java.awt.Color(249, 247, 250));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosProyectos.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane9.setViewportView(jTableDatosProyectos);

        btnIMPRIMIRPROYE.setBackground(new java.awt.Color(249, 247, 250));
        btnIMPRIMIRPROYE.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIMPRIMIRPROYE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCANCELARPROYE.setBackground(new java.awt.Color(249, 247, 250));
        btnCANCELARPROYE.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCANCELARPROYE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnREPORTEGENERALPROYE.setBackground(new java.awt.Color(249, 247, 250));
        btnREPORTEGENERALPROYE.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnREPORTEGENERALPROYE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIMPRIMIRPROYE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnREPORTEGENERALPROYE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCANCELARPROYE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIMPRIMIRPROYE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALPROYE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCANCELARPROYE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(807, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proyectos", jPanel13);

        jPanel14.setBackground(new java.awt.Color(249, 247, 250));

        jPanel9.setBackground(new java.awt.Color(249, 247, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Inscripciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer8.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(btnguardarPer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer8.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(btneditarPer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer8.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(btneliminarPer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer8.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(btnlimpiarPer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel68.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 102, 102));
        jLabel68.setText("Código de Voluntario");
        jPanel9.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel69.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("Número de días de Participación");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jSeparator91.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 10));

        jSeparator92.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 12));

        jSeparator93.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator93, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 10));
        jPanel9.add(btnCREARINSCRIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 40, 30));
        jPanel9.add(btnLIMPIARINSCRIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 40, 30));
        jPanel9.add(btnEDITARINSCRIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 40, 30));
        jPanel9.add(btnELIMINARINSCRIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 40, 30));

        txtCodigoInscripcion.setBackground(new java.awt.Color(249, 247, 250));
        txtCodigoInscripcion.setBorder(null);
        jPanel9.add(txtCodigoInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 20));

        jLabel70.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 102, 102));
        jLabel70.setText("Código");
        jPanel9.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jPanel9.add(cbxCodigoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 30));

        jPanel9.add(cbxCodigoVoluntario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 30));

        jSpinnerDiasParticipacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerDiasParticipacion.setBorder(null);
        jPanel9.add(jSpinnerDiasParticipacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 30));

        jLabel79.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 102, 102));
        jLabel79.setText("Código de Proyecto");
        jPanel9.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jSeparator102.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.add(jSeparator102, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 12));

        jPanel23.setBackground(new java.awt.Color(249, 247, 250));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Inscripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel23.setForeground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarInscripBsqa.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarInscripBsqa.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarInscripBsqa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel23.add(btnlimpiarInscripBsqa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, 30));

        btnbuscarInscrip.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarInscrip.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarInscrip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel23.add(btnbuscarInscrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 30));

        chekBsqInscrip.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqInscrip.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqInscrip.setText("Mostrar Todos");
        chekBsqInscrip.setBorder(null);
        jPanel23.add(chekBsqInscrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 30));

        jLabel71.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 102, 102));
        jLabel71.setText("Criterio");
        jPanel23.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqInscripciones.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqInscripciones.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqInscripciones.setBorder(null);
        jPanel23.add(txtBsqInscripciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator94.setForeground(new java.awt.Color(204, 204, 204));
        jPanel23.add(jSeparator94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        jPanel24.setBackground(new java.awt.Color(249, 247, 250));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Inscripciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosInscripciones.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosInscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTableDatosInscripciones);

        btnIMPRIMIRINSCRIP.setBackground(new java.awt.Color(249, 247, 250));
        btnIMPRIMIRINSCRIP.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIMPRIMIRINSCRIP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCANCELARINSCRIP.setBackground(new java.awt.Color(249, 247, 250));
        btnCANCELARINSCRIP.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCANCELARINSCRIP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnREPORTEGENERALINSCRIP.setBackground(new java.awt.Color(249, 247, 250));
        btnREPORTEGENERALINSCRIP.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnREPORTEGENERALINSCRIP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(btnIMPRIMIRINSCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnREPORTEGENERALINSCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnCANCELARINSCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCANCELARINSCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRINSCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALINSCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(938, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(645, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inscripciones", jPanel14);

        jPanel25.setBackground(new java.awt.Color(249, 247, 250));

        jPanel11.setBackground(new java.awt.Color(249, 247, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Personas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer9.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.add(btnguardarPer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer9.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.add(btneditarPer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer9.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.add(btneliminarPer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer9.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.add(btnlimpiarPer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel72.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(102, 102, 102));
        jLabel72.setText("Tipo de Producto:");
        jPanel11.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel73.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("ID Donación:");
        jPanel11.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jSeparator95.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator95, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, 10));

        jSeparator96.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator96, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 12));

        jSeparator97.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator97, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 333, 220, 10));
        jPanel11.add(btnCREARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel11.add(btnLIMPIARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 40, 30));
        jPanel11.add(btnEDITARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 40, 30));
        jPanel11.add(btnELIMINARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 30));

        jSpinnerCantidad3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerCantidad3.setBorder(null);
        jPanel11.add(jSpinnerCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));
        jPanel11.add(txtTipoProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, 30));

        jLabel74.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 102, 102));
        jLabel74.setText("Cantidad:");
        jPanel11.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 20));

        jPanel11.add(cbxIdDonacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 30));

        jPanel26.setBackground(new java.awt.Color(249, 247, 250));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel26.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarProdBsqa3.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarProdBsqa3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarProdBsqa3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.add(btnlimpiarProdBsqa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, 30));

        btnbuscarProd3.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarProd3.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarProd3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.add(btnbuscarProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 30));

        chekBsqProds3.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqProds3.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqProds3.setText("Mostrar Todos");
        chekBsqProds3.setBorder(null);
        jPanel26.add(chekBsqProds3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 30));

        jLabel75.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setText("Criterio");
        jPanel26.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqProductos3.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqProductos3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqProductos3.setBorder(null);
        jPanel26.add(txtBsqProductos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator98.setForeground(new java.awt.Color(204, 204, 204));
        jPanel26.add(jSeparator98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        jPanel27.setBackground(new java.awt.Color(249, 247, 250));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel27.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosProductos3.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosProductos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane11.setViewportView(jTableDatosProductos3);

        btnIMPRIMIRPROD3.setBackground(new java.awt.Color(249, 247, 250));
        btnIMPRIMIRPROD3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIMPRIMIRPROD3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCANCELARPROD3.setBackground(new java.awt.Color(249, 247, 250));
        btnCANCELARPROD3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCANCELARPROD3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnREPORTEGENERALPROD3.setBackground(new java.awt.Color(249, 247, 250));
        btnREPORTEGENERALPROD3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnREPORTEGENERALPROD3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIMPRIMIRPROD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnREPORTEGENERALPROD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnCANCELARPROD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIMPRIMIRPROD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCANCELARPROD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALPROD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(662, 662, 662))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("noseq mas", jPanel25);

        pnPrincipal.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel2.setBackground(new java.awt.Color(209, 200, 184));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enca1.png"))); // NOI18N
        jLabel2.setToolTipText("");
        pnPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1370, -1));

        jButton6.setBackground(new java.awt.Color(43, 45, 66));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        jButton6.setText("USUARIOS");
        pnPrincipal.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 40));

        btndonaciones.setBackground(new java.awt.Color(43, 45, 66));
        btndonaciones.setForeground(new java.awt.Color(255, 255, 255));
        btndonaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-donation-30.png"))); // NOI18N
        btndonaciones.setText("DONACIONES");
        pnPrincipal.add(btndonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 180, 40));

        btnproductos.setBackground(new java.awt.Color(43, 45, 66));
        btnproductos.setForeground(new java.awt.Color(255, 255, 255));
        btnproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-products-30.png"))); // NOI18N
        btnproductos.setText("PRODUCTOS");
        btnproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductosActionPerformed(evt);
            }
        });
        pnPrincipal.add(btnproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 180, 40));

        btnproyectos.setBackground(new java.awt.Color(43, 45, 66));
        btnproyectos.setForeground(new java.awt.Color(255, 255, 255));
        btnproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-projects-30.png"))); // NOI18N
        btnproyectos.setText("PROYECTOS");
        pnPrincipal.add(btnproyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 180, 40));

        btnroles.setBackground(new java.awt.Color(43, 45, 66));
        btnroles.setForeground(new java.awt.Color(255, 255, 255));
        btnroles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-people-30.png"))); // NOI18N
        btnroles.setText("ROLES");
        pnPrincipal.add(btnroles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 180, 40));

        btnformularios1.setBackground(new java.awt.Color(43, 45, 66));
        btnformularios1.setForeground(new java.awt.Color(255, 255, 255));
        btnformularios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-form-30.png"))); // NOI18N
        btnformularios1.setText("FORMULARIOS");
        pnPrincipal.add(btnformularios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 180, 40));

        jPanel3.add(pnPrincipal, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFemeninoActionPerformed

    private void btnformulariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnformulariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnformulariosActionPerformed

    private void btnproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnproductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCANCELARDON;
    private javax.swing.JButton btnCANCELARINSCRIP;
    private javax.swing.JButton btnCANCELARPER;
    private javax.swing.JButton btnCANCELARPROD;
    private javax.swing.JButton btnCANCELARPROD3;
    private javax.swing.JButton btnCANCELARPROYE;
    private javax.swing.JButton btnCREARDON;
    private javax.swing.JButton btnCREARINSCRIP;
    private javax.swing.JButton btnCREARPER;
    private javax.swing.JButton btnCREARPROD;
    private javax.swing.JButton btnCREARPROD3;
    private javax.swing.JButton btnCREARPROYE;
    private javax.swing.JButton btnEDITARDON;
    private javax.swing.JButton btnEDITARINSCRIP;
    private javax.swing.JButton btnEDITARPER;
    private javax.swing.JButton btnEDITARPROD;
    private javax.swing.JButton btnEDITARPROD3;
    private javax.swing.JButton btnEDITARPROYE;
    private javax.swing.JButton btnELIMINARDON;
    private javax.swing.JButton btnELIMINARINSCRIP;
    private javax.swing.JButton btnELIMINARPER;
    private javax.swing.JButton btnELIMINARPROD;
    private javax.swing.JButton btnELIMINARPROD3;
    private javax.swing.JButton btnELIMINARPROYE;
    private javax.swing.JButton btnExaminarFoto;
    private javax.swing.JButton btnIMPRIMIRDON;
    private javax.swing.JButton btnIMPRIMIRINSCRIP;
    private javax.swing.JButton btnIMPRIMIRPER;
    private javax.swing.JButton btnIMPRIMIRPROD;
    private javax.swing.JButton btnIMPRIMIRPROD3;
    private javax.swing.JButton btnIMPRIMIRPROYE;
    private javax.swing.JButton btnLIMPIARDON;
    private javax.swing.JButton btnLIMPIARINSCRIP;
    private javax.swing.JButton btnLIMPIARPER;
    private javax.swing.JButton btnLIMPIARPROD;
    private javax.swing.JButton btnLIMPIARPROD3;
    private javax.swing.JButton btnLIMPIARPROYE;
    private javax.swing.JButton btnREPORTEGENERALDON;
    private javax.swing.JButton btnREPORTEGENERALINSCRIP;
    private javax.swing.JButton btnREPORTEGENERALPER;
    private javax.swing.JButton btnREPORTEGENERALPROD;
    private javax.swing.JButton btnREPORTEGENERALPROD3;
    private javax.swing.JButton btnREPORTEGENERALPROYE;
    private javax.swing.JButton btnbuscarDon;
    private javax.swing.JButton btnbuscarInscrip;
    private javax.swing.JButton btnbuscarPer;
    private javax.swing.JButton btnbuscarProd;
    private javax.swing.JButton btnbuscarProd3;
    private javax.swing.JButton btnbuscarProyecto;
    private javax.swing.JButton btndonaciones;
    private javax.swing.JButton btneditarPer4;
    private javax.swing.JButton btneditarPer5;
    private javax.swing.JButton btneditarPer6;
    private javax.swing.JButton btneditarPer7;
    private javax.swing.JButton btneditarPer8;
    private javax.swing.JButton btneditarPer9;
    private javax.swing.JButton btneliminarPer4;
    private javax.swing.JButton btneliminarPer5;
    private javax.swing.JButton btneliminarPer6;
    private javax.swing.JButton btneliminarPer7;
    private javax.swing.JButton btneliminarPer8;
    private javax.swing.JButton btneliminarPer9;
    private javax.swing.JButton btnformularios;
    private javax.swing.JButton btnformularios1;
    private javax.swing.JButton btnguardarPer4;
    private javax.swing.JButton btnguardarPer5;
    private javax.swing.JButton btnguardarPer6;
    private javax.swing.JButton btnguardarPer7;
    private javax.swing.JButton btnguardarPer8;
    private javax.swing.JButton btnguardarPer9;
    private javax.swing.JButton btnlimpiarDONbsq;
    private javax.swing.JButton btnlimpiarInscripBsqa;
    private javax.swing.JButton btnlimpiarPer4;
    private javax.swing.JButton btnlimpiarPer5;
    private javax.swing.JButton btnlimpiarPer6;
    private javax.swing.JButton btnlimpiarPer7;
    private javax.swing.JButton btnlimpiarPer8;
    private javax.swing.JButton btnlimpiarPer9;
    private javax.swing.JButton btnlimpiarPerbsq;
    private javax.swing.JButton btnlimpiarProdBsqa;
    private javax.swing.JButton btnlimpiarProdBsqa3;
    private javax.swing.JButton btnlimpiarProyectoBsqa;
    private javax.swing.JButton btnproductos;
    private javax.swing.JButton btnproyectos;
    private javax.swing.JButton btnroles;
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JComboBox<String> cbxCodigoBeneficiario;
    private javax.swing.JComboBox<String> cbxCodigoProyecto;
    private javax.swing.JComboBox<String> cbxCodigoVoluntario;
    private javax.swing.JComboBox<String> cbxIdDonacion;
    private javax.swing.JComboBox<String> cbxIdDonacion3;
    private javax.swing.JComboBox<String> cbxTipoPer;
    private javax.swing.JCheckBox chekBsqDON;
    private javax.swing.JCheckBox chekBsqInscrip;
    private javax.swing.JCheckBox chekBsqPer;
    private javax.swing.JCheckBox chekBsqProds;
    private javax.swing.JCheckBox chekBsqProds3;
    private javax.swing.JCheckBox chekBsqProyectos;
    private javax.swing.JCheckBox chkseguroiees;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooserFechaFin;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private com.toedter.calendar.JDateChooser jDateFechaentregaDON;
    private com.toedter.calendar.JDateChooser jDatefechanaci;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator100;
    private javax.swing.JSeparator jSeparator101;
    private javax.swing.JSeparator jSeparator102;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator79;
    private javax.swing.JSeparator jSeparator80;
    private javax.swing.JSeparator jSeparator81;
    private javax.swing.JSeparator jSeparator82;
    private javax.swing.JSeparator jSeparator83;
    private javax.swing.JSeparator jSeparator84;
    private javax.swing.JSeparator jSeparator85;
    private javax.swing.JSeparator jSeparator86;
    private javax.swing.JSeparator jSeparator87;
    private javax.swing.JSeparator jSeparator88;
    private javax.swing.JSeparator jSeparator90;
    private javax.swing.JSeparator jSeparator91;
    private javax.swing.JSeparator jSeparator92;
    private javax.swing.JSeparator jSeparator93;
    private javax.swing.JSeparator jSeparator94;
    private javax.swing.JSeparator jSeparator95;
    private javax.swing.JSeparator jSeparator96;
    private javax.swing.JSeparator jSeparator97;
    private javax.swing.JSeparator jSeparator98;
    private javax.swing.JSeparator jSeparator99;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JSpinner jSpinnerCantidad3;
    private javax.swing.JSpinner jSpinnerDiasParticipacion;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDatosDonaciones;
    private javax.swing.JTable jTableDatosInscripciones;
    private javax.swing.JTable jTableDatosPersonas;
    private javax.swing.JTable jTableDatosProductos;
    private javax.swing.JTable jTableDatosProductos3;
    private javax.swing.JTable jTableDatosProyectos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnPersona;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextArea txaDetalleProdDON;
    private javax.swing.JTextArea txaMotivoDON;
    private javax.swing.JTextField txtBsqDonaciones;
    private javax.swing.JTextField txtBsqInscripciones;
    private javax.swing.JTextField txtBsqPersonas;
    private javax.swing.JTextField txtBsqProductos;
    private javax.swing.JTextField txtBsqProductos3;
    private javax.swing.JTextField txtBsqProyecto;
    private javax.swing.JTextField txtCodigoInscripcion;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtNumeroProyecto;
    private javax.swing.JTextField txtTipoProducto;
    private javax.swing.JTextField txtTipoProducto3;
    private javax.swing.JTextField txtTipoVol;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtapellidoPer;
    private javax.swing.JTextField txtcedulaPer;
    private javax.swing.JTextField txtcorreoPer;
    private javax.swing.JTextField txtdireccionPer;
    private javax.swing.JTextField txtestadocivil;
    private javax.swing.JTextField txtestrato;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txtnombrePer;
    private javax.swing.JTextField txtperiodo;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
