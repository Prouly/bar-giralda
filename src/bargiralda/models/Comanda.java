/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bargiralda.models;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Alvaro Muñoz Adan
 */
public class Comanda {
    
    private ArrayList<Producto> listaProductos;
    private Mesa mesa;
    private double importeTotal;
    boolean isPagado;
    private static int idComanda = 0;
    
    //Crear Comanda sin asignar mesa
    public Comanda() {
        listaProductos = new ArrayList<>();
        importeTotal = 0;
        this.mesa = new Mesa();
        idComanda++;
        isPagado = false;
    }

    public ArrayList<Producto> getComanda() {
        return listaProductos;
    }

    public static int getIdComanda() {
        return idComanda;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        importeTotal += producto.precioTotal;
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
        importeTotal -= producto.precioTotal;
    }
    
    public Producto getProductoComanda(int indice) {
        return listaProductos.get(indice);
 
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public Mesa getMesa() {
        return mesa;
    }   

    public void setIsPagado(boolean isPagado) {
        this.isPagado = isPagado;      
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    

    
    //Utilizado para imprimir el ticket en formato html
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        sb.append("<html>");
        sb.append("<div align='center'>");
        sb.append("******************************************************<br>");
        sb.append("<strong>BAR GIRALDA</strong><br><br>");
        sb.append("Ciudad de Chivas, 73  <br>");
        sb.append("41019, Sevilla<br>");
        sb.append("Teléfono: 954-079-067  <br>");
        sb.append("Fecha: ").append(obtenerFechaActual()).append("<br>");
        sb.append("<div align='left'>&nbsp;Mesa: ").append(mesa.getIdMesa()).append("</div>");
        sb.append("******************************************************<br>");
        sb.append("</div>");
        sb.append("<table align='left'>");
        sb.append("<tr>");
        sb.append("<th align='left'>NOMBRE</th>");
        sb.append("<th align='left'>CANT.</th>");
        sb.append("<th align='left'>PRECIO</th>");
        sb.append("<th align='left'>TOTAL</th>");
        sb.append("</tr>");

        for (Producto producto : listaProductos) {
            sb.append("<tr>");
            sb.append("<td align='left'>").append(producto.getNombre()).append("</td>");
            sb.append("<td align='left'>").append(producto.getCantidad()).append("</td>");
            sb.append("<td align='left'>").append(producto.getPrecio()).append("</td>");
            sb.append("<td align='left'>").append(producto.getPrecioTotal()).append("</td>");
            sb.append("</tr>");
        }
        
        sb.append("<tr><td colspan='4'>------------------------------------------------------------------</td></tr>");
        sb.append("<tr>");
        sb.append("<td colspan='3' align='left'><strong>TOTAL:</strong></td>");
        sb.append("<td align='right'>").append(df.format(this.getImporteTotal())).append("</td>");
        sb.append("</tr>");

        sb.append("</table>");
        sb.append("<div align='left'>");
        sb.append("******************************************************<br>");
        sb.append("<div align='center'>¡Gracias por su visita!</div>");
        sb.append("******************************************************<br>");
        sb.append("</div>");
        sb.append("</html>");

        return sb.toString();
    }

    
        public String obtenerFechaActual() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();

        // Formatear la fecha en el formato dd/MM/yyyy
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(fechaFormatter);

        // Formatear la hora en el formato hh:mm
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormateada = horaActual.format(horaFormatter);

        // Combinar fecha y hora formateadas
        String fechaHoraFormateada = fechaFormateada + " " + horaFormateada;

        return fechaHoraFormateada;
}
   
}
