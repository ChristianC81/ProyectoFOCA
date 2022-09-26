/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Roles;

/**
 *
 * @author 59399
 */
public class ModeloTablaRoles extends AbstractTableModel {

    private String[] columnas = {"NOMBRE ROL", "DESCRIPCION"};
    public static List<Roles> filas;
    private Roles rolesSeleccionado;
    private int indice;

    public ModeloTablaRoles() {
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
        rolesSeleccionado = filas.get(rowIndex);
        this.indice = rowIndex;
        switch (columnIndex) {
            case 0:
                return rolesSeleccionado.getNombrerol();
            case 1:
                return rolesSeleccionado.getDescripcionrol();
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

    public List<Roles> getFilas() {
        return filas;
    }

    public void setFilas(List<Roles> filas) {
        this.filas = filas;
    }

    public Roles getRolesSelecionado() {
        return rolesSeleccionado;
    }

    public void setRolesSelecionado(Roles rolesSeleccionado) {
        this.rolesSeleccionado = rolesSeleccionado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void actualizar(Roles p) {
        setRolesSelecionado(null);
        if (p != null) {
            filas.add(indice, p);
            fireTableDataChanged();
        }
    }

    public void agregar(Roles p) {
        if (p != null) {
            filas.add(p);
            fireTableDataChanged();
        }
    }

    public void eliminar(Roles p) {
        if (p != null) {
            filas.remove(p);
            fireTableDataChanged();
        }

    }
}
