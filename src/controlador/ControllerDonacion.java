/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ViewAdministrador;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import modelo.Donacion;
import modelo.DonacionJpaController;
import proyectofoca.ManagerFactory;

/**
 *
 * @author miri
 */
public class ControllerDonacion {
    ViewAdministrador vistaG;
    ManagerFactory manage;
    DonacionJpaController modeloProducto;
    ModeloTablaDonacion modeloTDona;
    Donacion dona;
    JDesktopPane panelEscritorio;
    ListSelectionModel listaproductomodel;
    //Validaciones validacion;
}
