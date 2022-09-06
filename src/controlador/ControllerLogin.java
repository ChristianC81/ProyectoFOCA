/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.ViewAdministrador;
import Vista.ViewLogin;
import static controlador.ControllerSistema.vistaS;
import javax.persistence.PersistenceException;
import modelo.Usuario;
import modelo.UsuarioJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author chris
 */
public class ControllerLogin {
    private ManagerFactory manager;
    private ViewLogin vistaL;
    private UsuarioJpaController modelo;
    private ViewAdministrador vistaA;
   

    public ControllerLogin(ManagerFactory manager, ViewLogin vistaL, UsuarioJpaController modelo, ViewAdministrador vistaA) {
        this.manager = manager;
        this.vistaL = vistaL;
        this.modelo = modelo;
        this.vistaA = vistaA;
        this.vistaA.setLocationRelativeTo(null);
        this.vistaL.setLocationRelativeTo(null);
        this.vistaL.setVisible(true);
        iniciaControl();
    }
    
    public void iniciaControl(){
        vistaL.getBtnIniciar().addActionListener(le->controlLogin());
        vistaL.getBtnSalir().addActionListener(ls ->salirLogin() );
        //vistaA.getjButtonAtras().addActionListener(lb -> regresar());
    }
    public void controlLogin(){
        String usuario=vistaL.getTxtusuario().getText();
        String clave=new String(vistaL.getTxtPass().getPassword());
        
        try{
            Usuario user = modelo.buscarUsuario(usuario, clave);
        if(user!=null){
            Resouces.success("Usuario Correcto","~ BIENVENID@ ~");
            new ControllerSistema(vistaS, manager);
            limpiarLogin();
            vistaA.setVisible(true);
            vistaL.dispose();
        }else{
            Resouces.error("Atención!!", "Usuario Incorrecto");
        } 
        }catch(PersistenceException e){
            Resouces.error("ERROR!!","Conectese a la Base de Datos");
        }
    }
    public void  salirLogin(){
        //JOptionPane.showMessageDialog(vistaL, "~Saliendo del programa~");
        System.exit(0);
    }
//    public void regresar(){
//        vistaA.dispose();
//        vistaL.setVisible(true);
//    }
    public void limpiarLogin(){
        vistaL.getTxtusuario().setText("");
        vistaL.getTxtPass().setText("");
    }
}
