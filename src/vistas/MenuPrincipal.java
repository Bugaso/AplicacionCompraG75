/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.border.BevelBorder;


/**
 *
 * @author Bugaso
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public MenuPrincipal() {
        initComponents();
        
    }
    public void borrar(){
        escritorio.removeAll();
        escritorio.add(logolabel);
        escritorio.revalidate();
        escritorio.repaint();
    }
    private int x,y;
    private Color selected = new Color(162,70,137);
    private BevelBorder bord = new BevelBorder(BevelBorder.RAISED, null, null, null, Color.LIGHT_GRAY);
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        primalPGround = new javax.swing.JPanel();
        MenusPanel = new javax.swing.JPanel();
        exitpane = new javax.swing.JPanel();
        exitlabel = new javax.swing.JLabel();
        minPane = new javax.swing.JPanel();
        minlabel = new javax.swing.JLabel();
        ProdPane = new javax.swing.JPanel();
        ProdLabel = new javax.swing.JLabel();
        ProvePane = new javax.swing.JPanel();
        ProvLabel = new javax.swing.JLabel();
        escritorio = new javax.swing.JPanel();
        logolabel = new javax.swing.JLabel();
        paneCompras = new javax.swing.JPanel();
        labelCompras = new javax.swing.JLabel();
        VentaLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(928, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        primalPGround.setBackground(new java.awt.Color(105, 70, 137));
        primalPGround.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        primalPGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenusPanel.setBackground(new java.awt.Color(162, 75, 137));
        MenusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        MenusPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenusPanelMouseDragged(evt);
            }
        });
        MenusPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenusPanelMousePressed(evt);
            }
        });
        MenusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitpane.setBackground(new java.awt.Color(91, 75, 137));
        exitpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitpane.setForeground(new java.awt.Color(255, 255, 255));

        exitlabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        exitlabel.setForeground(new java.awt.Color(255, 255, 255));
        exitlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitlabel.setText("X");
        exitlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitpaneLayout = new javax.swing.GroupLayout(exitpane);
        exitpane.setLayout(exitpaneLayout);
        exitpaneLayout.setHorizontalGroup(
            exitpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
        exitpaneLayout.setVerticalGroup(
            exitpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenusPanel.add(exitpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 30));

        minPane.setBackground(new java.awt.Color(91, 75, 137));
        minPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        minlabel.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        minlabel.setForeground(new java.awt.Color(255, 255, 255));
        minlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minlabel.setText("-");
        minlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout minPaneLayout = new javax.swing.GroupLayout(minPane);
        minPane.setLayout(minPaneLayout);
        minPaneLayout.setHorizontalGroup(
            minPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        minPaneLayout.setVerticalGroup(
            minPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minPaneLayout.createSequentialGroup()
                .addComponent(minlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        MenusPanel.add(minPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 30, 30));

        primalPGround.add(MenusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 50));

        ProdPane.setBackground(new java.awt.Color(162, 70, 137));

        ProdLabel.setBackground(new java.awt.Color(162, 70, 137));
        ProdLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProdLabel.setText("Admin Producto");
        ProdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProdPaneLayout = new javax.swing.GroupLayout(ProdPane);
        ProdPane.setLayout(ProdPaneLayout);
        ProdPaneLayout.setHorizontalGroup(
            ProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProdPaneLayout.setVerticalGroup(
            ProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        primalPGround.add(ProdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 50));

        ProvePane.setBackground(new java.awt.Color(162, 70, 137));

        ProvLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProvLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProvLabel.setText("Admin Proveedor");
        ProvLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProvLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProvePaneLayout = new javax.swing.GroupLayout(ProvePane);
        ProvePane.setLayout(ProvePaneLayout);
        ProvePaneLayout.setHorizontalGroup(
            ProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProvePaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProvePaneLayout.setVerticalGroup(
            ProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProvLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        primalPGround.add(ProvePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 50));

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setForeground(new java.awt.Color(204, 204, 204));
        escritorio.setPreferredSize(new java.awt.Dimension(790, 730));

        logolabel.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        logolabel.setMaximumSize(new java.awt.Dimension(790, 730));
        logolabel.setMinimumSize(new java.awt.Dimension(790, 730));
        logolabel.setPreferredSize(new java.awt.Dimension(790, 730));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        primalPGround.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 790, 720));

        paneCompras.setBackground(new java.awt.Color(162, 70, 137));
        paneCompras.setPreferredSize(new java.awt.Dimension(140, 50));

        labelCompras.setForeground(new java.awt.Color(255, 255, 255));
        labelCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCompras.setText("Admin Compras");
        labelCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelComprasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneComprasLayout = new javax.swing.GroupLayout(paneCompras);
        paneCompras.setLayout(paneComprasLayout);
        paneComprasLayout.setHorizontalGroup(
            paneComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneComprasLayout.createSequentialGroup()
                .addComponent(labelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        paneComprasLayout.setVerticalGroup(
            paneComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneComprasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        primalPGround.add(paneCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        VentaLab.setBackground(new java.awt.Color(162, 70, 137));
        VentaLab.setForeground(new java.awt.Color(255, 255, 255));
        VentaLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VentaLab.setText("Admin Ventas");
        VentaLab.setMaximumSize(new java.awt.Dimension(87, 16));
        VentaLab.setMinimumSize(new java.awt.Dimension(87, 16));
        VentaLab.setOpaque(true);
        VentaLab.setPreferredSize(new java.awt.Dimension(140, 50));
        VentaLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentaLabMouseClicked(evt);
            }
        });
        primalPGround.add(VentaLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        getContentPane().add(primalPGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProdLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdLabelMouseClicked
        // TODO add your handling code here:
        ProductoV regProd = new ProductoV();
        regProd.setSize(790, 730);
        ProdPane.setBorder(bord);
        ProvePane.setBorder(null);
        VentaLab.setBorder(null);
        paneCompras.setBorder(null);
        
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(regProd, BorderLayout.CENTER);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_ProdLabelMouseClicked

    private void exitlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitlabelMouseClicked

    private void minlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minlabelMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minlabelMouseClicked

    private void MenusPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenusPanelMouseDragged
        this.setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()- y);
    }//GEN-LAST:event_MenusPanelMouseDragged

    private void MenusPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenusPanelMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_MenusPanelMousePressed

    private void ProvLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvLabelMouseClicked
        ProveedorV provPane = new ProveedorV ();
        Color color = new Color(126,70,137);
        
        provPane.setSize(790,730);
        
        ProdPane.setBorder(null);
        VentaLab.setBorder(null);
        ProvePane.setBorder(bord);
        //ProvePane.setBackground(color);
        paneCompras.setBorder(null);
        
        escritorio.removeAll();
        escritorio.setLocation(0,0);
        escritorio.add(provPane,BorderLayout.CENTER);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_ProvLabelMouseClicked

    private void labelComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelComprasMouseClicked
        ProdPane.setBorder(null);
        ProvePane.setBorder(null);
        VentaLab.setBorder(null);
        paneCompras.setBorder(bord);
        
        ComprasV comprav = new ComprasV();
        comprav.setVisible(true);
        comprav.setSize(790, 730);
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(comprav, BorderLayout.CENTER);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_labelComprasMouseClicked

    private void VentaLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaLabMouseClicked
        ProdPane.setBorder(null);
        ProvePane.setBorder(null);
        paneCompras.setBorder(null);
        VentaLab.setBorder(bord);
        
        VentasV ventav = new VentasV();
        ventav.setVisible(true);
        ventav.setSize(790,730);
        escritorio.removeAll();
        escritorio.setLocation(0,0);
        escritorio.add(ventav,BorderLayout.CENTER);
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_VentaLabMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenusPanel;
    private javax.swing.JLabel ProdLabel;
    private javax.swing.JPanel ProdPane;
    private javax.swing.JLabel ProvLabel;
    private javax.swing.JPanel ProvePane;
    private javax.swing.JLabel VentaLab;
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel exitlabel;
    private javax.swing.JPanel exitpane;
    private javax.swing.JLabel labelCompras;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel minPane;
    private javax.swing.JLabel minlabel;
    private javax.swing.JPanel paneCompras;
    private javax.swing.JPanel primalPGround;
    // End of variables declaration//GEN-END:variables
}
