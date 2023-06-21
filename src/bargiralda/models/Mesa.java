/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bargiralda.models;

/**
 *
 * @author Alvaro Muñoz Adan
 */
public class Mesa {
    
    public static int mesasCreadas = 0;
    
    int idMesa;
    boolean isOcupada;
    String nombreCliente;
    
    /**
     * Constructor de Mesa sin cliente
     * Si se crea la mesa sin asignar nombre de cliente esta se crea con estado isOcupada = false
     */
    public Mesa() {
        this.idMesa = 0;
        this.isOcupada = false;
        this.nombreCliente = "Desconocido";
    }
    
    /**
     * Constructor de Mesa con cliente (Cliente identificado pero sin mesa asignada, estaria en barra)
     * Si se crea mesa asignando nombreCliente la mesa se crea en estado isOcupada = true;
     */
    public Mesa(String nombreCliente) {
        this.idMesa = 0;
        this.isOcupada = true;
        this.nombreCliente = nombreCliente;
    }
    
    /**
     * Constructor de Mesa con cliente y Nº Mesa
     * Si se crear mesa asignando nombreCliente y numeroMesa se crea en estado isOcupada = true
     * @param nombreCliente
     * @param numeroMesa 
     */
    public Mesa(String nombreCliente, int numeroMesa) {
        this.idMesa = numeroMesa;
        this.isOcupada = true;
        this.nombreCliente = nombreCliente;
        mesasCreadas++;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public static int getMesasCreadas() {
        return mesasCreadas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Si el cliente no tenia mesa asignada al asignarla se modifica variable mesasCreadas
     * @param idMesa 
     */
    public void setIdMesa(int idMesa) {
        if(getIdMesa() == 0) {
            mesasCreadas++;
        }
        this.idMesa = idMesa;
    }

    public void setIsOcupada(boolean isOcupada) {
        this.isOcupada = isOcupada;
    }

    public static void setMesasCreadas(int mesasCreadas) {
        Mesa.mesasCreadas = mesasCreadas;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "Mesa: "+idMesa+"\nCliente: "+nombreCliente+"\nOcupada: "+isOcupada;
    }
    
    
   
    
}
