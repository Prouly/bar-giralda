/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bargiralda.controllers;

/**
 *
 * @author Alvaro Muñoz Adan
 */
import bargiralda.models.Comanda;
import bargiralda.models.ComandaTableModel;
import bargiralda.models.Producto;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableModel;

public class TPVController {
    private JTable table;
    private JButton jButtonArriba;
    private JButton jButtonAbajo;
    private JButton jButtonBorrar;

    public TPVController(JTable table, JButton jButtonArriba, JButton jButtonAbajo, JButton jButtonBorrar) {
        this.table = table;
        this.jButtonArriba = jButtonArriba;
        this.jButtonAbajo = jButtonAbajo;
        this.jButtonBorrar = jButtonBorrar;

        jButtonArriba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seleccionarRegistroArriba();
            }
        });

        jButtonAbajo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seleccionarRegistroAbajo();
            }
        });

        jButtonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                borrarRegistroSeleccionado();
            }
        });
    }

    public void seleccionarRegistroArriba() {
        int selectedRow = table.getSelectedRow();
        int rowCount = table.getRowCount();
        int previousRow = (selectedRow - 1 + rowCount) % rowCount;
        table.setRowSelectionInterval(previousRow, previousRow);
    }

    public void seleccionarRegistroAbajo() {
        int selectedRow = table.getSelectedRow();
        int rowCount = table.getRowCount();
        int nextRow = (selectedRow + 1) % rowCount;
        table.setRowSelectionInterval(nextRow, nextRow);
    }


    public void borrarRegistroSeleccionado() {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) {
            ComandaTableModel modeloTabla = (ComandaTableModel) table.getModel();
            Comanda comanda = modeloTabla.getComanda();
            
            Producto producto = comanda.getProductoComanda(filaSeleccionada);
            comanda.eliminarProducto(producto);
            modeloTabla.fireTableRowsDeleted(filaSeleccionada, filaSeleccionada);
        }
    }

}


