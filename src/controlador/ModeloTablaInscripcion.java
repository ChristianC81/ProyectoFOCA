/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Inscripcion;

/**
 *
 * @author 59399
 */
public class ModeloTablaInscripcion extends AbstractTableModel {

    private String[] columnas = {"IDINS", "NDIASPARTICIPACIONINS", "IDPROYINS", "IDPERSONA"};
    public static List<Inscripcion> filas;
    private Inscripcion inscripcionSelecionado;
    private int indice;

    public ModeloTablaInscripcion() {
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
        inscripcionSelecionado = filas.get(rowIndex);
        this.indice = rowIndex;
        switch (columnIndex) {
            case 0:
                //return personaSelecionado.getNombrePer();
            case 1:
                //return personaSelecionado.getApellidoPer();
            case 2:
                //return personaSelecionado.getCedulaPer();
            case 3:
                //return personaSelecionado.getCelularPer();
            case 4:
                //return personaSelecionado.getCorreoPer();
            case 5:
                //return personaSelecionado.getDireccionPer();
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

    public List<Inscripcion> getFilas() {
        return filas;
    }

    public void setFilas(List<Inscripcion> filas) {
        this.filas = filas;
    }

    public Inscripcion getInscripcionSelecionado() {
        return inscripcionSelecionado;
    }

    public void setInscripcionSelecionado(Inscripcion inscripcionSelecionado) {
        this.inscripcionSelecionado = inscripcionSelecionado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void actualizar(Inscripcion p) {
        setInscripcionSelecionado(null);
        if (p != null) {
            filas.add(indice, p);
            fireTableDataChanged();
        }
    }

    public void agregar(Inscripcion p) {
        if (p != null) {
            filas.add(p);
            fireTableDataChanged();
        }
    }

    public void eliminar(Inscripcion p) {
        if (p != null) {
            filas.remove(p);
            fireTableDataChanged();
        }

    }
}
