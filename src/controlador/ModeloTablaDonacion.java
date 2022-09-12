/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 59399
 */
public class ModeloTablaDonacion extends AbstractTableModel {

    private String[] columnas = {"PERSONA", "DETALLE DE PRODUCTO", "FECHA DE ENTREGA", "MOTIVO DE DONACIÓN"};
    public static List<Donacion> filas;
    private Donacion donacionSelecionado;
    private int indice;

    public ModeloTablaDonacion() {
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
        donacionSelecionado = filas.get(rowIndex);
        this.indice = rowIndex;
        switch (columnIndex) {
            case 0:
                return donacionSelecionado.getIdpersona();
            case 1:
                return donacionSelecionado.getDetalleproductodona();
            case 2:
                return donacionSelecionado.getFechaentregadona();
            case 3:
                return donacionSelecionado.getMotivodona();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
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

    public List<Donacion> getFilas() {
        return filas;
    }

    public void setFilas(List<Donacion> filas) {
        this.filas = filas;
    }

    public Donacion getDonacionSelecionado() {
        return donacionSelecionado;
    }

    public void setDonacionSelecionado(Donacion donacionSelecionado) {
        this.donacionSelecionado = donacionSelecionado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void actualizar(Donacion d) {
        setDonacionSelecionado(null);
        if (d != null) {
            filas.add(indice, d);
            fireTableDataChanged();
        }
    }

    public void agregar(Donacion d) {
        if (d != null) {
            filas.add(d);
            fireTableDataChanged();
        }
    }

    public void eliminar(Donacion d) {
        if (d != null) {
            filas.remove(d);
            fireTableDataChanged();
        }

    }
}
