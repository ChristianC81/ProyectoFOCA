/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import modelo.Proyecto;

/**
 *
 * @author 59399
 */
public class ModeloTablaProyecto extends AbstractTableModel {

    private String[] columnas = {"NOMBRE", "FECHA INICIO", "FECHA FIN", "LUGAR"};
    public static List<Proyecto> filas;
    private Proyecto proyectoSeleccionado;
    private int indice;

    public ModeloTablaProyecto() {
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
        proyectoSeleccionado = filas.get(rowIndex);
        this.indice = rowIndex;
        switch (columnIndex) {
            case 0:
                return proyectoSeleccionado.getNombreproy();
            case 1:
                return proyectoSeleccionado.getFechainicioproy();
            case 2:
                return proyectoSeleccionado.getFechafinproy();
            case 3:
                return proyectoSeleccionado.getLugarproy();
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
                return Date.class;
            case 2:
                return Date.class;
            case 3:
                return String.class;
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

    public List<Proyecto> getFilas() {
        return filas;
    }

    public void setFilas(List<Proyecto> filas) {
        this.filas = filas;
    }

    public Proyecto getProyectoSelecionado() {
        return proyectoSeleccionado;
    }

    public void setProyectoSelecionado(Proyecto personaSelecionado) {
        this.proyectoSeleccionado = proyectoSeleccionado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void actualizar(Proyecto p) {
        setProyectoSelecionado(null);
        if (p != null) {
            filas.add(indice, p);
            fireTableDataChanged();
        }
    }

    public void agregar(Proyecto p) {
        if (p != null) {
            filas.add(p);
            fireTableDataChanged();
        }
    }

    public void eliminar(Proyecto p) {
        if (p != null) {
            filas.remove(p);
            fireTableDataChanged();
        }

    }
}
