/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bargiralda.views.usuario;

import bargiralda.controllers.CrearFondo;
import java.awt.Color;
import java.awt.GridLayout;

/**
 *
 * @author Alvaro Muñoz Adan
 */
public class CartaView extends javax.swing.JDialog {
    
    private static final String RUTA_FONDO_MAIN = "/resources/fondo-barGiralda.png";
    //Se crea un objeto Crear Fondo para cada JFrame al que se le asigna la ruta de la imagen
    CrearFondo fondoMain = new CrearFondo(RUTA_FONDO_MAIN);
  
    
    /**
     * Creates new form CartaView
     */
    public CartaView(java.awt.Frame parent, boolean modal) {
        this.setContentPane(fondoMain);  
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelCarta = new javax.swing.JPanel();
        cartaJLabel1 = new javax.swing.JLabel();
        titleCartaJLabel = new javax.swing.JLabel();
        cartaJLabel2 = new javax.swing.JLabel();
        BackjLabelAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1125, 1125));
        setMinimumSize(new java.awt.Dimension(1125, 1125));
        setPreferredSize(new java.awt.Dimension(1125, 1125));
        setSize(new java.awt.Dimension(1125, 1125));

        jPanelCarta.setLayout(new GridLayout(2, 2, 10, 10));
        jPanelCarta.setBackground(new Color(255, 255, 255, 220));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jPanelCarta.setLayout(new GridLayout(2, 2, 10, 10));
        jPanelCarta.setBackground(new Color(255, 255, 255, 220));
        jPanelCarta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));

        cartaJLabel1.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        cartaJLabel1.setForeground(new java.awt.Color(0, 204, 204));
        cartaJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/carta1.jpg"))); // NOI18N

        titleCartaJLabel.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        titleCartaJLabel.setForeground(new java.awt.Color(0, 204, 204));
        titleCartaJLabel.setText("Nuestra Carta");

        cartaJLabel2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        cartaJLabel2.setForeground(new java.awt.Color(0, 204, 204));
        cartaJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/carta2.jpg"))); // NOI18N
        cartaJLabel2.setText("Cambiar contraseña");

        javax.swing.GroupLayout jPanelCartaLayout = new javax.swing.GroupLayout(jPanelCarta);
        jPanelCarta.setLayout(jPanelCartaLayout);
        jPanelCartaLayout.setHorizontalGroup(
            jPanelCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCartaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCartaLayout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(titleCartaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cartaJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCartaLayout.setVerticalGroup(
            jPanelCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCartaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleCartaJLabel)
                .addGap(18, 18, 18)
                .addComponent(cartaJLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaJLabel2)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanelCarta);

        BackjLabelAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BackLogo.png"))); // NOI18N
        BackjLabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackjLabelAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackjLabelAdmin)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(BackjLabelAdmin)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackjLabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackjLabelAdminMouseClicked
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BackjLabelAdminMouseClicked

        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CartaView dialog = new CartaView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackjLabelAdmin;
    private javax.swing.JLabel cartaJLabel1;
    private javax.swing.JLabel cartaJLabel2;
    private javax.swing.JPanel jPanelCarta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleCartaJLabel;
    // End of variables declaration//GEN-END:variables
}