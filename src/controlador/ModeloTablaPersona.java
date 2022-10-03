/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Persona;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 59399
 */
public class ModeloTablaPersona extends AbstractTableModel {

    private String[] columnas = {"CÉDULA", "TIPO", "NOMBRES Y APELLIDOS", "GÉNERO",
        "FECHA NACIMIENTO"};
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
                return personaSelecionado.getNombresper() + " " + personaSelecionado.getApellidosper();
            case 3:
                return personaSelecionado.getGeneroper();
            case 4:
                return personaSelecionado.getFechanacimiento();
           
            default:       
        }
        return null;
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
                return Date.class;
            default:
        }
        return null;
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
