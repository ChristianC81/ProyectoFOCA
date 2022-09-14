/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Formulario;
import javax.swing.table.AbstractTableModel;
import modelo.Formulario;

/**
 *
 * @author 59399
 */
public class ModeloTablaFormulario extends AbstractTableModel {

    private String[] columnas = {"DOMICILIOFORM", "INGRESOFORM", "NIVELEDUFORM", "TIPOVIVIENDAFORM", "NHIJOSFORM","ETNIAFORM","DISCAPACIDAFORM","NPROPIEDADES","IEESFORM","INTERNETFORM","NDISPOSITIVOS","SERVBASICOS","NINTEFAMFORM","IDPERSONA"};
    public static List<Formulario> filas;
    private Formulario formularioSelecionado;
    private int indice;

    public ModeloTablaFormulario() {
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
        formularioSelecionado = filas.get(rowIndex);
        this.indice = rowIndex;
        switch (columnIndex) {
            case 0:
                //return formularioSelecionado.getNombrePer();
            case 1:
                //return formularioSelecionado.getApellidoPer();
            case 2:
                //return formularioSelecionado.getCedulaPer();
            case 3:
                //return formularioSelecionado.getCelularPer();
            case 4:
                //return formularioSelecionado.getCorreoPer();
            case 5:
                //return formularioSelecionado.getDireccionPer();
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

    public List<Formulario> getFilas() {
        return filas;
    }

    public void setFilas(List<Formulario> filas) {
        this.filas = filas;
    }

    public Formulario getFormularioSelecionado() {
        return formularioSelecionado;
    }

    public void setFormularioSelecionado(Formulario formularioSelecionado) {
        this.formularioSelecionado = formularioSelecionado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void actualizar(Formulario p) {
        setFormularioSelecionado(null);
        if (p != null) {
            filas.add(indice, p);
            fireTableDataChanged();
        }
    }

    public void agregar(Formulario p) {
        if (p != null) {
            filas.add(p);
            fireTableDataChanged();
        }
    }

    public void eliminar(Formulario p) {
        if (p != null) {
            filas.remove(p);
            fireTableDataChanged();
        }

    }
}
