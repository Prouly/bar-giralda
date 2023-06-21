/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bargiralda.models;

/**
 *
 * @author Alvaro Muñoz Adan
 */
import javax.swing.table.AbstractTableModel;

public class ComandaTableModel extends AbstractTableModel {
    private Comanda comanda;
    private String[] columnNames = {"Artículo", "Unidades", "Precio", "Total"};

    public ComandaTableModel(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public int getRowCount() {
        return comanda.getComanda().size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = comanda.getComanda().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return producto.getNombre();
            case 1:
                return producto.getCantidad();               
            case 2:
                return producto.getPrecio();              
            case 3:
                return producto.getPrecioTotal();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Comanda getComanda() {
        return comanda;
    }
    
    public void borrarComandaCompleta() {
        // Limpia la lista de productos de la comanda
        comanda.getComanda().clear(); 
        // Notifica al modelo de tabla que los datos han cambiado
        fireTableDataChanged(); 
    }
    
}

