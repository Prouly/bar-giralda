/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bargiralda.controllers;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Alvaro Muñoz Adán
 */

// Clase para poder crear fondos en un JFrame o JDialog usando como atributo la ruta del archivo 
public class CrearFondo extends JPanel{
        
    String rutaArchivo;
    private Image image;
    
    public CrearFondo(String ruta) {
        this.rutaArchivo = ruta;
        this.image = null;
      
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }
    
   
    @Override
    public void paint(Graphics g) {
    image = new ImageIcon(getClass().getResource(getRutaArchivo())).getImage();
    g.drawImage(image,0,0,getWidth(), getHeight(), this);
    setOpaque(false);
    super.paint(g);
    }
}
