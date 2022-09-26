/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelo.Persona;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author 59399
 */
public class ModeloTablaPersona extends AbstractTableModel {

    private String[] columnas = {"CÉDULA", "TIPO", "NOMBRES Y APELLIDOS", "GÉNERO",
        "FECHA NACIMIENTO","FOTO"};
    public static List<Persona> filas;
    private Persona personaSelecionado;
    private int indice;

    public ModeloTablaPersona() {
        filas = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        personaSelecionado = filas.get(rowIndex);
        this.indice = rowIndex;
        switch (columnIndex) {

            case 0:
                return personaSelecionado.getCedulaper();
            case 1:
                return personaSelecionado.getTipoper();
            case 2:
                return personaSelecionado.getNombresper()+""+personaSelecionado.getApellidosper();
            case 3:
                return  personaSelecionado.getGeneroper();
            case 4:
                return personaSelecionado.getFechanacimiento();
            case 6:
                return personaSelecionado.getFoto();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            case 7:
                return String.class;
            case 8:
                return Date.class;
            case 9:
                return String.class;
            case 10:
                return Double.class;
            case 11:
                return String.class;
            case 12:
                return String.class;
            case 13:
                return String.class;
            case 14:
                return String.class;
            case 15:
                return String.class;
            case 16:
                return String.class;
            case 17:
                return Image.class;
            default:
                return Object.class;
        }
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public List<Persona> getFilas() {
        return filas;
    }

    public void setFilas(List<Persona> filas) {
        this.filas = filas;
    }

    public Persona getPersonaSelecionado() {
        return personaSelecionado;
    }

    public void setPersonaSelecionado(Persona personaSelecionado) {
        this.personaSelecionado = personaSelecionado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void actualizar(Persona p) {
        setPersonaSelecionado(null);
        if (p != null) {
            filas.add(indice, p);
            fireTableDataChanged();
        }
    }

    public void agregar(Persona p) {
        if (p != null) {
            filas.add(p);
            fireTableDataChanged();
        }
    }

    public void eliminar(Persona p) {
        if (p != null) {
            filas.remove(p);
            fireTableDataChanged();
        }

    }
}
