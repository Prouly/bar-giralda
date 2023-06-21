/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bargiralda.models;

/**
 *
 * @author Alvaro Muñoz Adan
 */
public class Producto {
    
    String nombre;
    String categoria;
    int cantidad;
    double precio;
    double precioTotal;
    
    public Producto (String nombre, String categoria, int cantidad, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precioTotal = precio * cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %-8s %-8s %-8s", getNombre(), getCantidad(), getPrecio(), getPrecioTotal()));
        //Descomentar para ver los productos que se agregan en consola
        //System.out.println(sb.toString());
        return sb.toString();
    }
    
 
    public String toHTMLString() {
        StringBuilder sb = new StringBuilder();

        sb.append("<tr>");
        sb.append("<td>").append(nombre).append("</td>");
        sb.append("<td>").append(cantidad).append("</td>");
        sb.append("<td>").append(precio).append("</td>");
        sb.append("<td>").append(precioTotal).append("</td>");
        sb.append("</tr>");

        return sb.toString();
    }

}