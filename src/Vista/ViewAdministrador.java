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
        pnMenu = new javax.swing.JTabbedPane();
        pnPersona = new javax.swing.JPanel();
        pnAdministrar = new javax.swing.JPanel();
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
        pnPersona2 = new javax.swing.JPanel();
        pnAdministrar1 = new javax.swing.JPanel();
        txtcedulaPer2 = new javax.swing.JTextField();
        txtnombrePer2 = new javax.swing.JTextField();
        txtapellidoPer1 = new javax.swing.JTextField();
        txtdireccionPer1 = new javax.swing.JTextField();
        txttelefono1 = new javax.swing.JTextField();
        txtcorreoPer1 = new javax.swing.JTextField();
        btnguardarPer11 = new javax.swing.JButton();
        btneditarPer11 = new javax.swing.JButton();
        btneliminarPer11 = new javax.swing.JButton();
        btnlimpiarPer11 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jSeparator53 = new javax.swing.JSeparator();
        jSeparator56 = new javax.swing.JSeparator();
        jSeparator57 = new javax.swing.JSeparator();
        jSeparator59 = new javax.swing.JSeparator();
        jSeparator60 = new javax.swing.JSeparator();
        jLabel94 = new javax.swing.JLabel();
        cbxTipoPer8 = new javax.swing.JComboBox<>();
        rbtFemenino1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        rbtMasculino1 = new javax.swing.JRadioButton();
        jLabel95 = new javax.swing.JLabel();
        txtestadocivil1 = new javax.swing.JTextField();
        jSeparator61 = new javax.swing.JSeparator();
        jLabel96 = new javax.swing.JLabel();
        txtestrato1 = new javax.swing.JTextField();
        jSeparator62 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        txtsalario1 = new javax.swing.JTextField();
        jSeparator63 = new javax.swing.JSeparator();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel104 = new javax.swing.JLabel();
        txtTitulo1 = new javax.swing.JTextField();
        jSeparator65 = new javax.swing.JSeparator();
        jSeparator66 = new javax.swing.JSeparator();
        chkseguroiees1 = new javax.swing.JCheckBox();
        jLabel105 = new javax.swing.JLabel();
        txthorario1 = new javax.swing.JTextField();
        jSeparator68 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        txtperiodo2 = new javax.swing.JTextField();
        jSeparator76 = new javax.swing.JSeparator();
        jLabel107 = new javax.swing.JLabel();
        txtTipoVol1 = new javax.swing.JTextField();
        jSeparator89 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        lblFoto1 = new javax.swing.JLabel();
        btnExaminarFoto1 = new javax.swing.JButton();
        jDatefechanaci1 = new com.toedter.calendar.JDateChooser();
        jSeparator77 = new javax.swing.JSeparator();
        btnLIMPIARPER2 = new javax.swing.JButton();
        btnCREARPER2 = new javax.swing.JButton();
        btnEDITARPER2 = new javax.swing.JButton();
        btnELIMINARPER2 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableDatosPersonas2 = new javax.swing.JTable();
        btnCANCELARPER2 = new javax.swing.JButton();
        btnREPORTEGENERALPER2 = new javax.swing.JButton();
        btnIMPRIMIRPER2 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        btnlimpiarPerbsq2 = new javax.swing.JButton();
        btnbuscarPer2 = new javax.swing.JButton();
        chekBsqPer2 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        txtBsqPersonas2 = new javax.swing.JTextField();
        jSeparator78 = new javax.swing.JSeparator();
        pnDonaciones = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        btnguardarPer13 = new javax.swing.JButton();
        btneditarPer13 = new javax.swing.JButton();
        btneliminarPer13 = new javax.swing.JButton();
        btnlimpiarPer13 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jSeparator115 = new javax.swing.JSeparator();
        jSeparator116 = new javax.swing.JSeparator();
        jSeparator117 = new javax.swing.JSeparator();
        jDateFechaentregaDON1 = new com.toedter.calendar.JDateChooser();
        btnCREARDON1 = new javax.swing.JButton();
        btnLIMPIARDON1 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txaMotivoDON1 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txaDetalleProdDON1 = new javax.swing.JTextArea();
        btnEDITARDON1 = new javax.swing.JButton();
        btnELIMINARDON1 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTableDatosDonaciones1 = new javax.swing.JTable();
        btnCANCELARDON1 = new javax.swing.JButton();
        btnIMPRIMIRDON1 = new javax.swing.JButton();
        btnREPORTEGENERALDON1 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        btnlimpiarProdBsqa2 = new javax.swing.JButton();
        btnbuscarProd2 = new javax.swing.JButton();
        chekBsqProds2 = new javax.swing.JCheckBox();
        jLabel62 = new javax.swing.JLabel();
        txtBsqProductos2 = new javax.swing.JTextField();
        jSeparator106 = new javax.swing.JSeparator();
        pnProductos = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btnguardarPer12 = new javax.swing.JButton();
        btneditarPer12 = new javax.swing.JButton();
        btneliminarPer12 = new javax.swing.JButton();
        btnlimpiarPer12 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jSeparator83 = new javax.swing.JSeparator();
        jSeparator86 = new javax.swing.JSeparator();
        jSeparator96 = new javax.swing.JSeparator();
        btnCREARPROD1 = new javax.swing.JButton();
        btnLIMPIARPROD1 = new javax.swing.JButton();
        btnEDITARPROD1 = new javax.swing.JButton();
        btnELIMINARPROD1 = new javax.swing.JButton();
        jSpinnerCantidad1 = new javax.swing.JSpinner();
        txtTipoProducto1 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        cbxIdDonacion1 = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        btnlimpiarProdBsqa1 = new javax.swing.JButton();
        btnbuscarProd1 = new javax.swing.JButton();
        chekBsqProds1 = new javax.swing.JCheckBox();
        jLabel59 = new javax.swing.JLabel();
        txtBsqProductos1 = new javax.swing.JTextField();
        jSeparator105 = new javax.swing.JSeparator();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTableDatosDonaciones3 = new javax.swing.JTable();
        btnCANCELARDON3 = new javax.swing.JButton();
        btnIMPRIMIRDON3 = new javax.swing.JButton();
        btnREPORTEGENERALDON3 = new javax.swing.JButton();
        pnProyectos = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        btnguardarPer15 = new javax.swing.JButton();
        btneditarPer15 = new javax.swing.JButton();
        btneliminarPer15 = new javax.swing.JButton();
        btnlimpiarPer15 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jSeparator87 = new javax.swing.JSeparator();
        jSeparator111 = new javax.swing.JSeparator();
        btnCREARPROYE1 = new javax.swing.JButton();
        btnLIMPIARPROYE1 = new javax.swing.JButton();
        btnEDITARPROYE1 = new javax.swing.JButton();
        btnELIMINARPROYE1 = new javax.swing.JButton();
        txtLugar1 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        cbxCodigoBeneficiario1 = new javax.swing.JComboBox<>();
        txtNumeroProyecto1 = new javax.swing.JTextField();
        jSeparator112 = new javax.swing.JSeparator();
        jDateChooserFechaFin1 = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jDateChooserFechaInicio1 = new com.toedter.calendar.JDateChooser();
        jSeparator113 = new javax.swing.JSeparator();
        jLabel118 = new javax.swing.JLabel();
        txtNombreProyecto1 = new javax.swing.JTextField();
        jSeparator114 = new javax.swing.JSeparator();
        jLabel119 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        btnlimpiarProdBsqa5 = new javax.swing.JButton();
        btnbuscarProd5 = new javax.swing.JButton();
        chekBsqProds5 = new javax.swing.JCheckBox();
        jLabel60 = new javax.swing.JLabel();
        txtBsqProductos5 = new javax.swing.JTextField();
        jSeparator118 = new javax.swing.JSeparator();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTableDatosDonaciones4 = new javax.swing.JTable();
        btnCANCELARDON4 = new javax.swing.JButton();
        btnIMPRIMIRDON4 = new javax.swing.JButton();
        btnREPORTEGENERALDON4 = new javax.swing.JButton();
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
        jSeparator97 = new javax.swing.JSeparator();
        btnCREARPROD3 = new javax.swing.JButton();
        btnLIMPIARPROD3 = new javax.swing.JButton();
        btnEDITARPROD3 = new javax.swing.JButton();
        btnELIMINARPROD3 = new javax.swing.JButton();
        txtTipoProducto3 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        cbxIdDonacion3 = new javax.swing.JComboBox<>();
        txtTipoProducto4 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jSeparator103 = new javax.swing.JSeparator();
        jLabel82 = new javax.swing.JLabel();
        jSeparator104 = new javax.swing.JSeparator();
        cbxIdDonacion4 = new javax.swing.JComboBox<>();
        cbxIdDonacion5 = new javax.swing.JComboBox<>();
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
        pnPersona1 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        txtcedulaPer1 = new javax.swing.JTextField();
        txtnombrePer1 = new javax.swing.JTextField();
        btnguardarPer10 = new javax.swing.JButton();
        btneditarPer10 = new javax.swing.JButton();
        btneliminarPer10 = new javax.swing.JButton();
        btnlimpiarPer10 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jSeparator54 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel88 = new javax.swing.JLabel();
        cbxTipoPer1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator58 = new javax.swing.JSeparator();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtperiodo1 = new javax.swing.JTextField();
        btnLIMPIARPER1 = new javax.swing.JButton();
        btnCREARPER1 = new javax.swing.JButton();
        btnEDITARPER1 = new javax.swing.JButton();
        btnELIMINARPER1 = new javax.swing.JButton();
        cbxTipoPer2 = new javax.swing.JComboBox<>();
        cbxTipoPer3 = new javax.swing.JComboBox<>();
        jSeparator69 = new javax.swing.JSeparator();
        cbxTipoPer4 = new javax.swing.JComboBox<>();
        jSeparator70 = new javax.swing.JSeparator();
        jLabel98 = new javax.swing.JLabel();
        cbxTipoPer5 = new javax.swing.JComboBox<>();
        jSeparator71 = new javax.swing.JSeparator();
        chkseguroiees2 = new javax.swing.JCheckBox();
        cbxTipoPer6 = new javax.swing.JComboBox<>();
        jSeparator72 = new javax.swing.JSeparator();
        jLabel99 = new javax.swing.JLabel();
        cbxTipoPer7 = new javax.swing.JComboBox<>();
        jSeparator73 = new javax.swing.JSeparator();
        jLabel100 = new javax.swing.JLabel();
        jSeparator74 = new javax.swing.JSeparator();
        cbxTipoPer9 = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        cbxTipoPer10 = new javax.swing.JComboBox<>();
        jSeparator75 = new javax.swing.JSeparator();
        chkseguroiees3 = new javax.swing.JCheckBox();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableDatosPersonas1 = new javax.swing.JTable();
        btnCANCELARPER1 = new javax.swing.JButton();
        btnREPORTEGENERALPER1 = new javax.swing.JButton();
        btnIMPRIMIRPER1 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        btnlimpiarPerbsq1 = new javax.swing.JButton();
        btnbuscarPer1 = new javax.swing.JButton();
        chekBsqPer1 = new javax.swing.JCheckBox();
        jLabel97 = new javax.swing.JLabel();
        txtBsqPersonas1 = new javax.swing.JTextField();
        jSeparator67 = new javax.swing.JSeparator();
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

        pnAdministrar.setBackground(new java.awt.Color(249, 247, 250));
        pnAdministrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Personas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        pnAdministrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcedulaPer.setBackground(new java.awt.Color(249, 247, 250));
        txtcedulaPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcedulaPer.setBorder(null);
        pnAdministrar.add(txtcedulaPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        txtnombrePer.setBackground(new java.awt.Color(249, 247, 250));
        txtnombrePer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtnombrePer.setBorder(null);
        pnAdministrar.add(txtnombrePer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, -1));

        txtapellidoPer.setBackground(new java.awt.Color(249, 247, 250));
        txtapellidoPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtapellidoPer.setBorder(null);
        pnAdministrar.add(txtapellidoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        txtdireccionPer.setBackground(new java.awt.Color(249, 247, 250));
        txtdireccionPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtdireccionPer.setBorder(null);
        pnAdministrar.add(txtdireccionPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, -1));

        txttelefono.setBackground(new java.awt.Color(249, 247, 250));
        txttelefono.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txttelefono.setBorder(null);
        pnAdministrar.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 200, 20));

        txtcorreoPer.setBackground(new java.awt.Color(249, 247, 250));
        txtcorreoPer.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcorreoPer.setBorder(null);
        pnAdministrar.add(txtcorreoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 207, -1));

        btnguardarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar.add(btnguardarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar.add(btneditarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar.add(btneliminarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer4.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar.add(btnlimpiarPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel44.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Identificación");
        pnAdministrar.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel45.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Nombres:");
        pnAdministrar.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel46.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Apellidos:");
        pnAdministrar.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel47.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Dirección:");
        pnAdministrar.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel48.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Teléfono:");
        pnAdministrar.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel49.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Correo:");
        pnAdministrar.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jSeparator37.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 10));

        jSeparator38.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 10));

        jSeparator39.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 4));

        jSeparator40.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 12));

        jSeparator41.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 207, 10));

        jLabel50.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Tipo:");
        pnAdministrar.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        pnAdministrar.add(cbxTipoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 20));

        buttonGroupGenero.add(rbtFemenino);
        rbtFemenino.setText("Femenino");
        rbtFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemeninoActionPerformed(evt);
            }
        });
        pnAdministrar.add(rbtFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Género:");
        pnAdministrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        buttonGroupGenero.add(rbtMasculino);
        rbtMasculino.setText("Masculino");
        pnAdministrar.add(rbtMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel51.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Estado Civil:");
        pnAdministrar.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        txtestadocivil.setBackground(new java.awt.Color(249, 247, 250));
        txtestadocivil.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtestadocivil.setBorder(null);
        pnAdministrar.add(txtestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 180, -1));

        jSeparator43.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 11));

        jLabel52.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Estrato Social:");
        pnAdministrar.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 428, -1, -1));

        txtestrato.setBackground(new java.awt.Color(249, 247, 250));
        txtestrato.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtestrato.setBorder(null);
        pnAdministrar.add(txtestrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 448, 200, -1));

        jSeparator44.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 468, 200, 13));

        jLabel53.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Fecha de Nacimiento:");
        pnAdministrar.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 112, -1));

        jLabel54.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("Salario:");
        pnAdministrar.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        txtsalario.setBackground(new java.awt.Color(249, 247, 250));
        txtsalario.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtsalario.setBorder(null);
        pnAdministrar.add(txtsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 180, -1));

        jSeparator45.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 180, 10));

        jSeparator46.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 180, 12));

        jLabel55.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Título:");
        pnAdministrar.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        txtTitulo.setBackground(new java.awt.Color(249, 247, 250));
        txtTitulo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtTitulo.setBorder(null);
        pnAdministrar.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, -1));

        jSeparator48.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 200, 12));

        jSeparator49.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 180, 12));

        chkseguroiees.setText("Seguro IEES");
        pnAdministrar.add(chkseguroiees, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 180, -1));

        jLabel56.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Horario:");
        pnAdministrar.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        txthorario.setBackground(new java.awt.Color(249, 247, 250));
        txthorario.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txthorario.setBorder(null);
        pnAdministrar.add(txthorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 200, -1));

        jSeparator50.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 200, 10));

        jLabel57.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Periodo:");
        pnAdministrar.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        txtperiodo.setBackground(new java.awt.Color(249, 247, 250));
        txtperiodo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtperiodo.setBorder(null);
        pnAdministrar.add(txtperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 190, -1));

        jSeparator51.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 190, 10));

        jLabel58.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("Tipo de Voluntario:");
        pnAdministrar.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        txtTipoVol.setBackground(new java.awt.Color(249, 247, 250));
        txtTipoVol.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtTipoVol.setBorder(null);
        pnAdministrar.add(txtTipoVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, -1));

        jSeparator80.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator80, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 180, 15));

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

        pnAdministrar.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnExaminarFoto.setText("Examinar");
        pnAdministrar.add(btnExaminarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 147, 21));
        pnAdministrar.add(jDatefechanaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 200, 20));

        jSeparator47.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 10));
        pnAdministrar.add(btnLIMPIARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 40, 30));
        pnAdministrar.add(btnCREARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 40, 30));
        pnAdministrar.add(btnEDITARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 40, 30));
        pnAdministrar.add(btnELIMINARPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 40, 30));

        pnPersona.add(pnAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 580));

        jPanel15.setBackground(new java.awt.Color(249, 247, 250));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
                .addContainerGap(14, Short.MAX_VALUE))
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
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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

        pnPersona2.setBackground(new java.awt.Color(249, 247, 250));
        pnPersona2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAdministrar1.setBackground(new java.awt.Color(249, 247, 250));
        pnAdministrar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Personas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        pnAdministrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcedulaPer2.setBackground(new java.awt.Color(249, 247, 250));
        txtcedulaPer2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcedulaPer2.setBorder(null);
        pnAdministrar1.add(txtcedulaPer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        txtnombrePer2.setBackground(new java.awt.Color(249, 247, 250));
        txtnombrePer2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtnombrePer2.setBorder(null);
        pnAdministrar1.add(txtnombrePer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, -1));

        txtapellidoPer1.setBackground(new java.awt.Color(249, 247, 250));
        txtapellidoPer1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtapellidoPer1.setBorder(null);
        pnAdministrar1.add(txtapellidoPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        txtdireccionPer1.setBackground(new java.awt.Color(249, 247, 250));
        txtdireccionPer1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtdireccionPer1.setBorder(null);
        pnAdministrar1.add(txtdireccionPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, -1));

        txttelefono1.setBackground(new java.awt.Color(249, 247, 250));
        txttelefono1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txttelefono1.setBorder(null);
        pnAdministrar1.add(txttelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 200, 20));

        txtcorreoPer1.setBackground(new java.awt.Color(249, 247, 250));
        txtcorreoPer1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcorreoPer1.setBorder(null);
        pnAdministrar1.add(txtcorreoPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 207, -1));

        btnguardarPer11.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar1.add(btnguardarPer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer11.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar1.add(btneditarPer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer11.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar1.add(btneliminarPer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer11.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnAdministrar1.add(btnlimpiarPer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel85.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("Identificación");
        pnAdministrar1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel86.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(102, 102, 102));
        jLabel86.setText("Nombres:");
        pnAdministrar1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel87.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(102, 102, 102));
        jLabel87.setText("Apellidos:");
        pnAdministrar1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel89.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 102, 102));
        jLabel89.setText("Dirección:");
        pnAdministrar1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel92.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(102, 102, 102));
        jLabel92.setText("Teléfono:");
        pnAdministrar1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel93.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setText("Correo:");
        pnAdministrar1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jSeparator53.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 10));

        jSeparator56.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 10));

        jSeparator57.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 4));

        jSeparator59.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 12));

        jSeparator60.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 207, 10));

        jLabel94.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 102, 102));
        jLabel94.setText("Tipo:");
        pnAdministrar1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        pnAdministrar1.add(cbxTipoPer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 20));

        buttonGroupGenero.add(rbtFemenino1);
        rbtFemenino1.setText("Femenino");
        rbtFemenino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemenino1ActionPerformed(evt);
            }
        });
        pnAdministrar1.add(rbtFemenino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Género:");
        pnAdministrar1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        buttonGroupGenero.add(rbtMasculino1);
        rbtMasculino1.setText("Masculino");
        pnAdministrar1.add(rbtMasculino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel95.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(102, 102, 102));
        jLabel95.setText("Estado Civil:");
        pnAdministrar1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        txtestadocivil1.setBackground(new java.awt.Color(249, 247, 250));
        txtestadocivil1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtestadocivil1.setBorder(null);
        pnAdministrar1.add(txtestadocivil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 180, -1));

        jSeparator61.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 11));

        jLabel96.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(102, 102, 102));
        jLabel96.setText("Estrato Social:");
        pnAdministrar1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 428, -1, -1));

        txtestrato1.setBackground(new java.awt.Color(249, 247, 250));
        txtestrato1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtestrato1.setBorder(null);
        pnAdministrar1.add(txtestrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 448, 200, -1));

        jSeparator62.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator62, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 468, 200, 13));

        jLabel102.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(102, 102, 102));
        jLabel102.setText("Fecha de Nacimiento:");
        pnAdministrar1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 112, -1));

        jLabel103.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 102, 102));
        jLabel103.setText("Salario:");
        pnAdministrar1.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        txtsalario1.setBackground(new java.awt.Color(249, 247, 250));
        txtsalario1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtsalario1.setBorder(null);
        pnAdministrar1.add(txtsalario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 180, -1));

        jSeparator63.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 180, 10));

        jSeparator64.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 180, 12));

        jLabel104.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(102, 102, 102));
        jLabel104.setText("Título:");
        pnAdministrar1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        txtTitulo1.setBackground(new java.awt.Color(249, 247, 250));
        txtTitulo1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtTitulo1.setBorder(null);
        pnAdministrar1.add(txtTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, -1));

        jSeparator65.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator65, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 200, 12));

        jSeparator66.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator66, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 180, 12));

        chkseguroiees1.setText("Seguro IEES");
        pnAdministrar1.add(chkseguroiees1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 180, -1));

        jLabel105.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 102, 102));
        jLabel105.setText("Horario:");
        pnAdministrar1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        txthorario1.setBackground(new java.awt.Color(249, 247, 250));
        txthorario1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txthorario1.setBorder(null);
        pnAdministrar1.add(txthorario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 200, -1));

        jSeparator68.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator68, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 200, 10));

        jLabel106.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(102, 102, 102));
        jLabel106.setText("Periodo:");
        pnAdministrar1.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        txtperiodo2.setBackground(new java.awt.Color(249, 247, 250));
        txtperiodo2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtperiodo2.setBorder(null);
        pnAdministrar1.add(txtperiodo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 190, -1));

        jSeparator76.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator76, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 190, 10));

        jLabel107.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(102, 102, 102));
        jLabel107.setText("Tipo de Voluntario:");
        pnAdministrar1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        txtTipoVol1.setBackground(new java.awt.Color(249, 247, 250));
        txtTipoVol1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtTipoVol1.setBorder(null);
        pnAdministrar1.add(txtTipoVol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, -1));

        jSeparator89.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator89, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 180, 15));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnAdministrar1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnExaminarFoto1.setText("Examinar");
        pnAdministrar1.add(btnExaminarFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 147, 21));
        pnAdministrar1.add(jDatefechanaci1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 200, 20));

        jSeparator77.setForeground(new java.awt.Color(204, 204, 204));
        pnAdministrar1.add(jSeparator77, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 10));
        pnAdministrar1.add(btnLIMPIARPER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 40, 30));
        pnAdministrar1.add(btnCREARPER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 40, 30));
        pnAdministrar1.add(btnEDITARPER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 40, 30));
        pnAdministrar1.add(btnELIMINARPER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 40, 30));

        pnPersona2.add(pnAdministrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 580));

        jPanel29.setBackground(new java.awt.Color(249, 247, 250));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel29.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosPersonas2.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosPersonas2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTableDatosPersonas2);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnIMPRIMIRPER2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnREPORTEGENERALPER2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnCANCELARPER2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCANCELARPER2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALPER2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRPER2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pnPersona2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 490, 470));

        jPanel32.setBackground(new java.awt.Color(249, 247, 250));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel32.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarPerbsq2.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPerbsq2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPerbsq2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel32.add(btnlimpiarPerbsq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 40, 30));

        btnbuscarPer2.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarPer2.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarPer2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel32.add(btnbuscarPer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, 30));

        chekBsqPer2.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqPer2.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqPer2.setText("Mostrar Todos");
        chekBsqPer2.setBorder(null);
        jPanel32.add(chekBsqPer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 110, 30));

        jLabel108.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(102, 102, 102));
        jLabel108.setText("Criterio");
        jPanel32.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        txtBsqPersonas2.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqPersonas2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqPersonas2.setBorder(null);
        jPanel32.add(txtBsqPersonas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jSeparator78.setForeground(new java.awt.Color(204, 204, 204));
        jPanel32.add(jSeparator78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        pnPersona2.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 490, 110));

        pnPersona.add(pnPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnMenu.addTab("Personas", pnPersona);

        pnDonaciones.setBackground(new java.awt.Color(249, 247, 250));
        pnDonaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBackground(new java.awt.Color(249, 247, 250));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel36.setMinimumSize(new java.awt.Dimension(640, 811));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer13.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel36.add(btnguardarPer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer13.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel36.add(btneditarPer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer13.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel36.add(btneliminarPer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer13.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel36.add(btnlimpiarPer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel120.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(102, 102, 102));
        jLabel120.setText("Detalle de Producto: ");
        jPanel36.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel121.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(102, 102, 102));
        jLabel121.setText("Fecha de Entrega:");
        jPanel36.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel122.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(102, 102, 102));
        jLabel122.setText("Motivo de Donación:");
        jPanel36.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jSeparator115.setForeground(new java.awt.Color(204, 204, 204));
        jPanel36.add(jSeparator115, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, 10));

        jSeparator116.setForeground(new java.awt.Color(204, 204, 204));
        jPanel36.add(jSeparator116, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 12));

        jSeparator117.setForeground(new java.awt.Color(204, 204, 204));
        jPanel36.add(jSeparator117, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 220, 13));
        jPanel36.add(jDateFechaentregaDON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 220, 30));
        jPanel36.add(btnCREARDON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel36.add(btnLIMPIARDON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 40, 30));

        txaMotivoDON1.setBackground(new java.awt.Color(249, 247, 250));
        txaMotivoDON1.setColumns(20);
        txaMotivoDON1.setRows(5);
        txaMotivoDON1.setBorder(null);
        jScrollPane13.setViewportView(txaMotivoDON1);

        jPanel36.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 80));

        txaDetalleProdDON1.setBackground(new java.awt.Color(249, 247, 250));
        txaDetalleProdDON1.setColumns(20);
        txaDetalleProdDON1.setRows(5);
        txaDetalleProdDON1.setBorder(null);
        jScrollPane14.setViewportView(txaDetalleProdDON1);

        jPanel36.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 80));
        jPanel36.add(btnEDITARDON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 40, 30));
        jPanel36.add(btnELIMINARDON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 30));

        pnDonaciones.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 580));

        jPanel38.setBackground(new java.awt.Color(249, 247, 250));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel38.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosDonaciones1.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosDonaciones1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Producto", "Fecha Entrega", "Motivo"
            }
        ));
        jTableDatosDonaciones1.setToolTipText("");
        jScrollPane15.setViewportView(jTableDatosDonaciones1);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(btnIMPRIMIRDON1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnREPORTEGENERALDON1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCANCELARDON1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCANCELARDON1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRDON1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALDON1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230))
        );

        pnDonaciones.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 680, 470));

        jPanel34.setBackground(new java.awt.Color(249, 247, 250));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarProdBsqa2.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarProdBsqa2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarProdBsqa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel34.add(btnlimpiarProdBsqa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 40, 30));

        btnbuscarProd2.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarProd2.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarProd2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel34.add(btnbuscarProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 50, 30));

        chekBsqProds2.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqProds2.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqProds2.setText("Mostrar Todos");
        chekBsqProds2.setBorder(null);
        jPanel34.add(chekBsqProds2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 140, 30));

        jLabel62.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Criterio");
        jPanel34.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, 20));

        txtBsqProductos2.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqProductos2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqProductos2.setBorder(null);
        jPanel34.add(txtBsqProductos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, -1));

        jSeparator106.setForeground(new java.awt.Color(204, 204, 204));
        jPanel34.add(jSeparator106, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 210, 10));

        pnDonaciones.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 680, 110));

        pnMenu.addTab("Donaciones", pnDonaciones);

        pnProductos.setBackground(new java.awt.Color(249, 247, 250));
        pnProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(249, 247, 250));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Producto ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel17.setPreferredSize(new java.awt.Dimension(640, 811));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer12.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(btnguardarPer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer12.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(btneditarPer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer12.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(btneliminarPer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer12.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.add(btnlimpiarPer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel61.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Tipo de Producto:");
        jPanel17.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel109.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(102, 102, 102));
        jLabel109.setText("ID Donación:");
        jPanel17.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jSeparator83.setForeground(new java.awt.Color(204, 204, 204));
        jPanel17.add(jSeparator83, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, 10));

        jSeparator86.setForeground(new java.awt.Color(204, 204, 204));
        jPanel17.add(jSeparator86, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 12));

        jSeparator96.setForeground(new java.awt.Color(204, 204, 204));
        jPanel17.add(jSeparator96, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 333, 220, 10));
        jPanel17.add(btnCREARPROD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel17.add(btnLIMPIARPROD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 40, 30));
        jPanel17.add(btnEDITARPROD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 40, 30));
        jPanel17.add(btnELIMINARPROD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 30));

        jSpinnerCantidad1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerCantidad1.setBorder(null);
        jPanel17.add(jSpinnerCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));
        jPanel17.add(txtTipoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, 30));

        jLabel110.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(102, 102, 102));
        jLabel110.setText("Cantidad:");
        jPanel17.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 20));

        jPanel17.add(cbxIdDonacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 30));

        pnProductos.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 580));

        jPanel33.setBackground(new java.awt.Color(249, 247, 250));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarProdBsqa1.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarProdBsqa1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarProdBsqa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel33.add(btnlimpiarProdBsqa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 40, 30));

        btnbuscarProd1.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarProd1.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarProd1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel33.add(btnbuscarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 50, 30));

        chekBsqProds1.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqProds1.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqProds1.setText("Mostrar Todos");
        chekBsqProds1.setBorder(null);
        jPanel33.add(chekBsqProds1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 140, 30));

        jLabel59.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Criterio");
        jPanel33.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, 20));

        txtBsqProductos1.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqProductos1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqProductos1.setBorder(null);
        jPanel33.add(txtBsqProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, -1));

        jSeparator105.setForeground(new java.awt.Color(204, 204, 204));
        jPanel33.add(jSeparator105, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 210, 10));

        pnProductos.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 750, 110));

        jPanel40.setBackground(new java.awt.Color(249, 247, 250));
        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Donaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel40.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosDonaciones3.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosDonaciones3.setModel(new javax.swing.table.DefaultTableModel(
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
                "Cantidad", "Tipo de Producto", "Donación"
            }
        ));
        jTableDatosDonaciones3.setToolTipText("");
        jScrollPane17.setViewportView(jTableDatosDonaciones3);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(btnIMPRIMIRDON3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnREPORTEGENERALDON3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCANCELARDON3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCANCELARDON3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRDON3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALDON3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pnProductos.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 750, 470));

        pnMenu.addTab("Producto", pnProductos);

        pnProyectos.setBackground(new java.awt.Color(249, 247, 250));
        pnProyectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(249, 247, 250));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarPer15.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer15.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(btnguardarPer15, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer15.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer15.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(btneditarPer15, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer15.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer15.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(btneliminarPer15, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer15.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer15.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(btnlimpiarPer15, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel64.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("Número de Proyecto");
        jPanel19.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel115.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(102, 102, 102));
        jLabel115.setText("Código de Beneficiario");
        jPanel19.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jSeparator87.setForeground(new java.awt.Color(204, 204, 204));
        jPanel19.add(jSeparator87, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 10));

        jSeparator111.setForeground(new java.awt.Color(204, 204, 204));
        jPanel19.add(jSeparator111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 12));
        jPanel19.add(btnCREARPROYE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 30));
        jPanel19.add(btnLIMPIARPROYE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 40, 30));
        jPanel19.add(btnEDITARPROYE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 40, 30));
        jPanel19.add(btnELIMINARPROYE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 40, 30));

        txtLugar1.setBackground(new java.awt.Color(249, 247, 250));
        txtLugar1.setBorder(null);
        jPanel19.add(txtLugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 20));

        jLabel116.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(102, 102, 102));
        jLabel116.setText("Nombre:");
        jPanel19.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jPanel19.add(cbxCodigoBeneficiario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

        txtNumeroProyecto1.setBackground(new java.awt.Color(249, 247, 250));
        txtNumeroProyecto1.setBorder(null);
        jPanel19.add(txtNumeroProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        jSeparator112.setForeground(new java.awt.Color(204, 204, 204));
        jPanel19.add(jSeparator112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 10));
        jPanel19.add(jDateChooserFechaFin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jLabel117.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(102, 102, 102));
        jLabel117.setText("Fecha Inicio");
        jPanel19.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel19.add(jDateChooserFechaInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        jSeparator113.setForeground(new java.awt.Color(204, 204, 204));
        jPanel19.add(jSeparator113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 10));

        jLabel118.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(102, 102, 102));
        jLabel118.setText("Fecha Fin");
        jPanel19.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtNombreProyecto1.setBackground(new java.awt.Color(249, 247, 250));
        txtNombreProyecto1.setBorder(null);
        jPanel19.add(txtNombreProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 20));

        jSeparator114.setForeground(new java.awt.Color(204, 204, 204));
        jPanel19.add(jSeparator114, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 10));

        jLabel119.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(102, 102, 102));
        jLabel119.setText("Lugar");
        jPanel19.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        pnProyectos.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 580));

        jPanel37.setBackground(new java.awt.Color(249, 247, 250));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Proyecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarProdBsqa5.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarProdBsqa5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarProdBsqa5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel37.add(btnlimpiarProdBsqa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 40, 30));

        btnbuscarProd5.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarProd5.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarProd5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel37.add(btnbuscarProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 50, 30));

        chekBsqProds5.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqProds5.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqProds5.setText("Mostrar Todos");
        chekBsqProds5.setBorder(null);
        jPanel37.add(chekBsqProds5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 140, 30));

        jLabel60.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Criterio");
        jPanel37.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, 20));

        txtBsqProductos5.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqProductos5.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqProductos5.setBorder(null);
        jPanel37.add(txtBsqProductos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, -1));

        jSeparator118.setForeground(new java.awt.Color(204, 204, 204));
        jPanel37.add(jSeparator118, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 210, 10));

        pnProyectos.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 750, 110));

        jPanel41.setBackground(new java.awt.Color(249, 247, 250));
        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel41.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosDonaciones4.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosDonaciones4.setModel(new javax.swing.table.DefaultTableModel(
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
                "N°de Proyecto", "Nombre", "Inicio", "Fin", "Lugar", "N° de Voluntarios"
            }
        ));
        jTableDatosDonaciones4.setToolTipText("");
        jScrollPane18.setViewportView(jTableDatosDonaciones4);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addComponent(btnIMPRIMIRDON4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnREPORTEGENERALDON4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCANCELARDON4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCANCELARDON4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRDON4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALDON4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pnProyectos.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 750, 470));

        pnMenu.addTab("Proyecto", pnProyectos);

        jPanel13.setBackground(new java.awt.Color(249, 247, 250));

        jPanel8.setBackground(new java.awt.Color(249, 247, 250));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Proyecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
                .addContainerGap(59, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnMenu.addTab("Proyectos", jPanel13);

        jPanel14.setBackground(new java.awt.Color(249, 247, 250));

        jPanel9.setBackground(new java.awt.Color(249, 247, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Inscripciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Inscripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Inscripciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
                .addContainerGap(180, Short.MAX_VALUE))
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
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pnMenu.addTab("Inscripciones", jPanel14);

        jPanel25.setBackground(new java.awt.Color(249, 247, 250));

        jPanel11.setBackground(new java.awt.Color(249, 247, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Formularios ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
        jLabel72.setText("Domicilio:");
        jPanel11.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel73.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("Ingreso Mensual:");
        jPanel11.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jSeparator95.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 10));

        jSeparator97.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 10));
        jPanel11.add(btnCREARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 40, 30));
        jPanel11.add(btnLIMPIARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 40, 30));
        jPanel11.add(btnEDITARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 40, 30));
        jPanel11.add(btnELIMINARPROD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 40, 30));
        jPanel11.add(txtTipoProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 30));

        jLabel74.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 102, 102));
        jLabel74.setText("N°:");
        jPanel11.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jPanel11.add(cbxIdDonacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));
        jPanel11.add(txtTipoProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        jLabel81.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 102, 102));
        jLabel81.setText("Nivel Eduación:");
        jPanel11.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jSeparator103.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 10));

        jLabel82.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 102, 102));
        jLabel82.setText("Tipo de Vivienda:");
        jPanel11.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jSeparator104.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jSeparator104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 10));

        jPanel11.add(cbxIdDonacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        jPanel11.add(cbxIdDonacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 30));

        jPanel26.setBackground(new java.awt.Color(249, 247, 250));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de Formularios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Formularios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
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
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(662, 662, 662))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMenu.addTab("Formularios", jPanel25);

        pnPersona1.setBackground(new java.awt.Color(249, 247, 250));
        pnPersona1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(249, 247, 250));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Formularios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcedulaPer1.setBackground(new java.awt.Color(249, 247, 250));
        txtcedulaPer1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtcedulaPer1.setBorder(null);
        jPanel28.add(txtcedulaPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        txtnombrePer1.setBackground(new java.awt.Color(249, 247, 250));
        txtnombrePer1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtnombrePer1.setBorder(null);
        jPanel28.add(txtnombrePer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, -1));

        btnguardarPer10.setBackground(new java.awt.Color(249, 247, 250));
        btnguardarPer10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnguardarPer10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.add(btnguardarPer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 781, 40, 30));

        btneditarPer10.setBackground(new java.awt.Color(249, 247, 250));
        btneditarPer10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneditarPer10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.add(btneditarPer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 781, 40, 30));

        btneliminarPer10.setBackground(new java.awt.Color(249, 247, 250));
        btneliminarPer10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminarPer10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.add(btneliminarPer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 767, 40, 30));

        btnlimpiarPer10.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPer10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPer10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.add(btnlimpiarPer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 781, 40, 30));

        jLabel80.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 102, 102));
        jLabel80.setText("N°:");
        jPanel28.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel83.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 102, 102));
        jLabel83.setText("Domicilio:");
        jPanel28.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel84.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("Nivel de Educación:");
        jPanel28.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jSeparator54.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 10));

        jSeparator55.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 4));

        jLabel88.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(102, 102, 102));
        jLabel88.setText("Ingreso Mensual:");
        jPanel28.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel28.add(cbxTipoPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 20));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Tipo de VIvienda:");
        jPanel28.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jSeparator58.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 11));

        jLabel90.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 102, 102));
        jLabel90.setText("N° de Propiedades:");
        jPanel28.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel91.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(102, 102, 102));
        jLabel91.setText("Numero de Hijos:");
        jPanel28.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 112, -1));

        txtperiodo1.setBackground(new java.awt.Color(249, 247, 250));
        txtperiodo1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtperiodo1.setBorder(null);
        jPanel28.add(txtperiodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 190, -1));
        jPanel28.add(btnLIMPIARPER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 40, 30));
        jPanel28.add(btnCREARPER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 40, 30));
        jPanel28.add(btnEDITARPER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 40, 30));
        jPanel28.add(btnELIMINARPER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 40, 30));

        jPanel28.add(cbxTipoPer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 20));

        jPanel28.add(cbxTipoPer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 20));

        jSeparator69.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 10));

        jPanel28.add(cbxTipoPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, 20));

        jSeparator70.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 10));

        jLabel98.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));
        jLabel98.setText("Etnia:");
        jPanel28.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 112, -1));

        jPanel28.add(cbxTipoPer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 20));

        jSeparator71.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 200, 10));

        chkseguroiees2.setText("Discapacidad");
        jPanel28.add(chkseguroiees2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, -1));

        jPanel28.add(cbxTipoPer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 20));

        jSeparator72.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 10));

        jLabel99.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(102, 102, 102));
        jLabel99.setText("N° de Dispositivos Electronicos:");
        jPanel28.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jPanel28.add(cbxTipoPer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 200, 20));

        jSeparator73.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator73, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, 10));

        jLabel100.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 102, 102));
        jLabel100.setText("Servicios Basicos:");
        jPanel28.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jSeparator74.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator74, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 10));

        jPanel28.add(cbxTipoPer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 200, 20));

        jLabel101.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(102, 102, 102));
        jLabel101.setText("N° de Integrantes en la familia:");
        jPanel28.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jPanel28.add(cbxTipoPer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 20));

        jSeparator75.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.add(jSeparator75, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, 10));

        chkseguroiees3.setText("Acceso a Internet");
        jPanel28.add(chkseguroiees3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 180, -1));

        pnPersona1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 580));

        jPanel30.setBackground(new java.awt.Color(249, 247, 250));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel30.setForeground(new java.awt.Color(255, 255, 255));

        jTableDatosPersonas1.setBackground(new java.awt.Color(249, 247, 222));
        jTableDatosPersonas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Nombre y Apellido", "Domicilio", "Ingreso Mensual", "Nivel de Educación", "Tipo de Vivienda", "Numero de Hijos", "Etnia", "Discapacidad", "Acceso a Internet"
            }
        ));
        jScrollPane6.setViewportView(jTableDatosPersonas1);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIMPRIMIRPER1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnREPORTEGENERALPER1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnCANCELARPER1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 144, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCANCELARPER1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnREPORTEGENERALPER1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIMPRIMIRPER1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pnPersona1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 650, 470));

        jPanel31.setBackground(new java.awt.Color(249, 247, 250));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel31.setForeground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlimpiarPerbsq1.setBackground(new java.awt.Color(249, 247, 250));
        btnlimpiarPerbsq1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiarPerbsq1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel31.add(btnlimpiarPerbsq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 40, 30));

        btnbuscarPer1.setBackground(new java.awt.Color(249, 247, 250));
        btnbuscarPer1.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        btnbuscarPer1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel31.add(btnbuscarPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 40, 30));

        chekBsqPer1.setBackground(new java.awt.Color(249, 247, 250));
        chekBsqPer1.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        chekBsqPer1.setText("Mostrar Todos");
        chekBsqPer1.setBorder(null);
        jPanel31.add(chekBsqPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 110, 30));

        jLabel97.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(102, 102, 102));
        jLabel97.setText("Criterio");
        jPanel31.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, 20));

        txtBsqPersonas1.setBackground(new java.awt.Color(249, 247, 250));
        txtBsqPersonas1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txtBsqPersonas1.setBorder(null);
        jPanel31.add(txtBsqPersonas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, -1));

        jSeparator67.setForeground(new java.awt.Color(204, 204, 204));
        jPanel31.add(jSeparator67, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 200, 10));

        pnPersona1.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 650, 110));

        pnMenu.addTab("Formularios", pnPersona1);

        pnPrincipal.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 1150, 620));

        jLabel2.setBackground(new java.awt.Color(209, 200, 184));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enca1.png"))); // NOI18N
        jLabel2.setToolTipText("");
        pnPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1150, -1));

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

    private void btnformulariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnformulariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnformulariosActionPerformed

    private void btnproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnproductosActionPerformed

    private void rbtFemenino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemenino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFemenino1ActionPerformed

    private void rbtFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFemeninoActionPerformed

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
    private javax.swing.JButton btnCANCELARDON1;
    private javax.swing.JButton btnCANCELARDON3;
    private javax.swing.JButton btnCANCELARDON4;
    private javax.swing.JButton btnCANCELARINSCRIP;
    private javax.swing.JButton btnCANCELARPER;
    private javax.swing.JButton btnCANCELARPER1;
    private javax.swing.JButton btnCANCELARPER2;
    private javax.swing.JButton btnCANCELARPROD3;
    private javax.swing.JButton btnCANCELARPROYE;
    private javax.swing.JButton btnCREARDON1;
    private javax.swing.JButton btnCREARINSCRIP;
    private javax.swing.JButton btnCREARPER;
    private javax.swing.JButton btnCREARPER1;
    private javax.swing.JButton btnCREARPER2;
    private javax.swing.JButton btnCREARPROD1;
    private javax.swing.JButton btnCREARPROD3;
    private javax.swing.JButton btnCREARPROYE;
    private javax.swing.JButton btnCREARPROYE1;
    private javax.swing.JButton btnEDITARDON1;
    private javax.swing.JButton btnEDITARINSCRIP;
    private javax.swing.JButton btnEDITARPER;
    private javax.swing.JButton btnEDITARPER1;
    private javax.swing.JButton btnEDITARPER2;
    private javax.swing.JButton btnEDITARPROD1;
    private javax.swing.JButton btnEDITARPROD3;
    private javax.swing.JButton btnEDITARPROYE;
    private javax.swing.JButton btnEDITARPROYE1;
    private javax.swing.JButton btnELIMINARDON1;
    private javax.swing.JButton btnELIMINARINSCRIP;
    private javax.swing.JButton btnELIMINARPER;
    private javax.swing.JButton btnELIMINARPER1;
    private javax.swing.JButton btnELIMINARPER2;
    private javax.swing.JButton btnELIMINARPROD1;
    private javax.swing.JButton btnELIMINARPROD3;
    private javax.swing.JButton btnELIMINARPROYE;
    private javax.swing.JButton btnELIMINARPROYE1;
    private javax.swing.JButton btnExaminarFoto;
    private javax.swing.JButton btnExaminarFoto1;
    private javax.swing.JButton btnIMPRIMIRDON1;
    private javax.swing.JButton btnIMPRIMIRDON3;
    private javax.swing.JButton btnIMPRIMIRDON4;
    private javax.swing.JButton btnIMPRIMIRINSCRIP;
    private javax.swing.JButton btnIMPRIMIRPER;
    private javax.swing.JButton btnIMPRIMIRPER1;
    private javax.swing.JButton btnIMPRIMIRPER2;
    private javax.swing.JButton btnIMPRIMIRPROD3;
    private javax.swing.JButton btnIMPRIMIRPROYE;
    private javax.swing.JButton btnLIMPIARDON1;
    private javax.swing.JButton btnLIMPIARINSCRIP;
    private javax.swing.JButton btnLIMPIARPER;
    private javax.swing.JButton btnLIMPIARPER1;
    private javax.swing.JButton btnLIMPIARPER2;
    private javax.swing.JButton btnLIMPIARPROD1;
    private javax.swing.JButton btnLIMPIARPROD3;
    private javax.swing.JButton btnLIMPIARPROYE;
    private javax.swing.JButton btnLIMPIARPROYE1;
    private javax.swing.JButton btnREPORTEGENERALDON1;
    private javax.swing.JButton btnREPORTEGENERALDON3;
    private javax.swing.JButton btnREPORTEGENERALDON4;
    private javax.swing.JButton btnREPORTEGENERALINSCRIP;
    private javax.swing.JButton btnREPORTEGENERALPER;
    private javax.swing.JButton btnREPORTEGENERALPER1;
    private javax.swing.JButton btnREPORTEGENERALPER2;
    private javax.swing.JButton btnREPORTEGENERALPROD3;
    private javax.swing.JButton btnREPORTEGENERALPROYE;
    private javax.swing.JButton btnbuscarInscrip;
    private javax.swing.JButton btnbuscarPer;
    private javax.swing.JButton btnbuscarPer1;
    private javax.swing.JButton btnbuscarPer2;
    private javax.swing.JButton btnbuscarProd1;
    private javax.swing.JButton btnbuscarProd2;
    private javax.swing.JButton btnbuscarProd3;
    private javax.swing.JButton btnbuscarProd5;
    private javax.swing.JButton btnbuscarProyecto;
    private javax.swing.JButton btndonaciones;
    private javax.swing.JButton btneditarPer10;
    private javax.swing.JButton btneditarPer11;
    private javax.swing.JButton btneditarPer12;
    private javax.swing.JButton btneditarPer13;
    private javax.swing.JButton btneditarPer15;
    private javax.swing.JButton btneditarPer4;
    private javax.swing.JButton btneditarPer7;
    private javax.swing.JButton btneditarPer8;
    private javax.swing.JButton btneditarPer9;
    private javax.swing.JButton btneliminarPer10;
    private javax.swing.JButton btneliminarPer11;
    private javax.swing.JButton btneliminarPer12;
    private javax.swing.JButton btneliminarPer13;
    private javax.swing.JButton btneliminarPer15;
    private javax.swing.JButton btneliminarPer4;
    private javax.swing.JButton btneliminarPer7;
    private javax.swing.JButton btneliminarPer8;
    private javax.swing.JButton btneliminarPer9;
    private javax.swing.JButton btnformularios;
    private javax.swing.JButton btnformularios1;
    private javax.swing.JButton btnguardarPer10;
    private javax.swing.JButton btnguardarPer11;
    private javax.swing.JButton btnguardarPer12;
    private javax.swing.JButton btnguardarPer13;
    private javax.swing.JButton btnguardarPer15;
    private javax.swing.JButton btnguardarPer4;
    private javax.swing.JButton btnguardarPer7;
    private javax.swing.JButton btnguardarPer8;
    private javax.swing.JButton btnguardarPer9;
    private javax.swing.JButton btnlimpiarInscripBsqa;
    private javax.swing.JButton btnlimpiarPer10;
    private javax.swing.JButton btnlimpiarPer11;
    private javax.swing.JButton btnlimpiarPer12;
    private javax.swing.JButton btnlimpiarPer13;
    private javax.swing.JButton btnlimpiarPer15;
    private javax.swing.JButton btnlimpiarPer4;
    private javax.swing.JButton btnlimpiarPer7;
    private javax.swing.JButton btnlimpiarPer8;
    private javax.swing.JButton btnlimpiarPer9;
    private javax.swing.JButton btnlimpiarPerbsq;
    private javax.swing.JButton btnlimpiarPerbsq1;
    private javax.swing.JButton btnlimpiarPerbsq2;
    private javax.swing.JButton btnlimpiarProdBsqa1;
    private javax.swing.JButton btnlimpiarProdBsqa2;
    private javax.swing.JButton btnlimpiarProdBsqa3;
    private javax.swing.JButton btnlimpiarProdBsqa5;
    private javax.swing.JButton btnlimpiarProyectoBsqa;
    private javax.swing.JButton btnproductos;
    private javax.swing.JButton btnproyectos;
    private javax.swing.JButton btnroles;
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JComboBox<String> cbxCodigoBeneficiario;
    private javax.swing.JComboBox<String> cbxCodigoBeneficiario1;
    private javax.swing.JComboBox<String> cbxCodigoProyecto;
    private javax.swing.JComboBox<String> cbxCodigoVoluntario;
    private javax.swing.JComboBox<String> cbxIdDonacion1;
    private javax.swing.JComboBox<String> cbxIdDonacion3;
    private javax.swing.JComboBox<String> cbxIdDonacion4;
    private javax.swing.JComboBox<String> cbxIdDonacion5;
    private javax.swing.JComboBox<String> cbxTipoPer;
    private javax.swing.JComboBox<String> cbxTipoPer1;
    private javax.swing.JComboBox<String> cbxTipoPer10;
    private javax.swing.JComboBox<String> cbxTipoPer2;
    private javax.swing.JComboBox<String> cbxTipoPer3;
    private javax.swing.JComboBox<String> cbxTipoPer4;
    private javax.swing.JComboBox<String> cbxTipoPer5;
    private javax.swing.JComboBox<String> cbxTipoPer6;
    private javax.swing.JComboBox<String> cbxTipoPer7;
    private javax.swing.JComboBox<String> cbxTipoPer8;
    private javax.swing.JComboBox<String> cbxTipoPer9;
    private javax.swing.JCheckBox chekBsqInscrip;
    private javax.swing.JCheckBox chekBsqPer;
    private javax.swing.JCheckBox chekBsqPer1;
    private javax.swing.JCheckBox chekBsqPer2;
    private javax.swing.JCheckBox chekBsqProds1;
    private javax.swing.JCheckBox chekBsqProds2;
    private javax.swing.JCheckBox chekBsqProds3;
    private javax.swing.JCheckBox chekBsqProds5;
    private javax.swing.JCheckBox chekBsqProyectos;
    private javax.swing.JCheckBox chkseguroiees;
    private javax.swing.JCheckBox chkseguroiees1;
    private javax.swing.JCheckBox chkseguroiees2;
    private javax.swing.JCheckBox chkseguroiees3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooserFechaFin;
    private com.toedter.calendar.JDateChooser jDateChooserFechaFin1;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio1;
    private com.toedter.calendar.JDateChooser jDateFechaentregaDON1;
    private com.toedter.calendar.JDateChooser jDatefechanaci;
    private com.toedter.calendar.JDateChooser jDatefechanaci1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel40;
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
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator100;
    private javax.swing.JSeparator jSeparator101;
    private javax.swing.JSeparator jSeparator102;
    private javax.swing.JSeparator jSeparator103;
    private javax.swing.JSeparator jSeparator104;
    private javax.swing.JSeparator jSeparator105;
    private javax.swing.JSeparator jSeparator106;
    private javax.swing.JSeparator jSeparator111;
    private javax.swing.JSeparator jSeparator112;
    private javax.swing.JSeparator jSeparator113;
    private javax.swing.JSeparator jSeparator114;
    private javax.swing.JSeparator jSeparator115;
    private javax.swing.JSeparator jSeparator116;
    private javax.swing.JSeparator jSeparator117;
    private javax.swing.JSeparator jSeparator118;
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
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JSeparator jSeparator72;
    private javax.swing.JSeparator jSeparator73;
    private javax.swing.JSeparator jSeparator74;
    private javax.swing.JSeparator jSeparator75;
    private javax.swing.JSeparator jSeparator76;
    private javax.swing.JSeparator jSeparator77;
    private javax.swing.JSeparator jSeparator78;
    private javax.swing.JSeparator jSeparator80;
    private javax.swing.JSeparator jSeparator83;
    private javax.swing.JSeparator jSeparator85;
    private javax.swing.JSeparator jSeparator86;
    private javax.swing.JSeparator jSeparator87;
    private javax.swing.JSeparator jSeparator88;
    private javax.swing.JSeparator jSeparator89;
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
    private javax.swing.JSpinner jSpinnerCantidad1;
    private javax.swing.JSpinner jSpinnerDiasParticipacion;
    private javax.swing.JTable jTableDatosDonaciones1;
    private javax.swing.JTable jTableDatosDonaciones3;
    private javax.swing.JTable jTableDatosDonaciones4;
    private javax.swing.JTable jTableDatosInscripciones;
    private javax.swing.JTable jTableDatosPersonas;
    private javax.swing.JTable jTableDatosPersonas1;
    private javax.swing.JTable jTableDatosPersonas2;
    private javax.swing.JTable jTableDatosProductos3;
    private javax.swing.JTable jTableDatosProyectos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JPanel pnAdministrar;
    private javax.swing.JPanel pnAdministrar1;
    private javax.swing.JPanel pnDonaciones;
    private javax.swing.JTabbedPane pnMenu;
    private javax.swing.JPanel pnPersona;
    private javax.swing.JPanel pnPersona1;
    private javax.swing.JPanel pnPersona2;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnProductos;
    private javax.swing.JPanel pnProyectos;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtFemenino1;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JRadioButton rbtMasculino1;
    private javax.swing.JTextArea txaDetalleProdDON1;
    private javax.swing.JTextArea txaMotivoDON1;
    private javax.swing.JTextField txtBsqInscripciones;
    private javax.swing.JTextField txtBsqPersonas;
    private javax.swing.JTextField txtBsqPersonas1;
    private javax.swing.JTextField txtBsqPersonas2;
    private javax.swing.JTextField txtBsqProductos1;
    private javax.swing.JTextField txtBsqProductos2;
    private javax.swing.JTextField txtBsqProductos3;
    private javax.swing.JTextField txtBsqProductos5;
    private javax.swing.JTextField txtBsqProyecto;
    private javax.swing.JTextField txtCodigoInscripcion;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtLugar1;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtNombreProyecto1;
    private javax.swing.JTextField txtNumeroProyecto;
    private javax.swing.JTextField txtNumeroProyecto1;
    private javax.swing.JTextField txtTipoProducto1;
    private javax.swing.JTextField txtTipoProducto3;
    private javax.swing.JTextField txtTipoProducto4;
    private javax.swing.JTextField txtTipoVol;
    private javax.swing.JTextField txtTipoVol1;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTitulo1;
    private javax.swing.JTextField txtapellidoPer;
    private javax.swing.JTextField txtapellidoPer1;
    private javax.swing.JTextField txtcedulaPer;
    private javax.swing.JTextField txtcedulaPer1;
    private javax.swing.JTextField txtcedulaPer2;
    private javax.swing.JTextField txtcorreoPer;
    private javax.swing.JTextField txtcorreoPer1;
    private javax.swing.JTextField txtdireccionPer;
    private javax.swing.JTextField txtdireccionPer1;
    private javax.swing.JTextField txtestadocivil;
    private javax.swing.JTextField txtestadocivil1;
    private javax.swing.JTextField txtestrato;
    private javax.swing.JTextField txtestrato1;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txthorario1;
    private javax.swing.JTextField txtnombrePer;
    private javax.swing.JTextField txtnombrePer1;
    private javax.swing.JTextField txtnombrePer2;
    private javax.swing.JTextField txtperiodo;
    private javax.swing.JTextField txtperiodo1;
    private javax.swing.JTextField txtperiodo2;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txtsalario1;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefono1;
    // End of variables declaration//GEN-END:variables
}
