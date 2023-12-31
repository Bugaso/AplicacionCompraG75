/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import vistas.productoOp.ListarInactivoProdV;
import vistas.productoOp.ListarProdV;
import vistas.productoOp.registrarProdV;

/**
 *
 * @author Bugaso
 */
public class ProductoV extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarProducto
     */
    public ProductoV() {
        initComponents();
    }
    private Color brillo = new Color(202,70,137);
    private Color oscuro = new Color(152,70,137);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuProvPane = new javax.swing.JPanel();
        prodInaPane = new javax.swing.JPanel();
        prodInaclab = new javax.swing.JLabel();
        regisProdPane = new javax.swing.JPanel();
        regisProdLab = new javax.swing.JLabel();
        modProdPane = new javax.swing.JPanel();
        modProdLab = new javax.swing.JLabel();
        escritorio = new javax.swing.JPanel();
        logolabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 730));
        setMinimumSize(new java.awt.Dimension(790, 730));
        setPreferredSize(new java.awt.Dimension(790, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuProvPane.setBackground(new java.awt.Color(72, 70, 119));
        menuProvPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuProvPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prodInaPane.setBackground(new java.awt.Color(152, 70, 137));
        prodInaPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        prodInaclab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        prodInaclab.setForeground(new java.awt.Color(255, 255, 255));
        prodInaclab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prodInaclab.setText("Listar Productos Inactivos");
        prodInaclab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodInaclabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prodInaclabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prodInaclabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout prodInaPaneLayout = new javax.swing.GroupLayout(prodInaPane);
        prodInaPane.setLayout(prodInaPaneLayout);
        prodInaPaneLayout.setHorizontalGroup(
            prodInaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prodInaclab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        prodInaPaneLayout.setVerticalGroup(
            prodInaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prodInaclab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(prodInaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, 30));

        regisProdPane.setBackground(new java.awt.Color(152, 70, 137));
        regisProdPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        regisProdLab.setBackground(new java.awt.Color(255, 255, 255));
        regisProdLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        regisProdLab.setForeground(new java.awt.Color(255, 255, 255));
        regisProdLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regisProdLab.setText("Registrar Producto");
        regisProdLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisProdLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regisProdLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regisProdLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout regisProdPaneLayout = new javax.swing.GroupLayout(regisProdPane);
        regisProdPane.setLayout(regisProdPaneLayout);
        regisProdPaneLayout.setHorizontalGroup(
            regisProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regisProdLab, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        regisProdPaneLayout.setVerticalGroup(
            regisProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regisProdLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(regisProdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 30));

        modProdPane.setBackground(new java.awt.Color(152, 70, 137));
        modProdPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modProdLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modProdLab.setForeground(new java.awt.Color(255, 255, 255));
        modProdLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modProdLab.setText("Listar Productos Activos");
        modProdLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modProdLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modProdLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modProdLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modProdPaneLayout = new javax.swing.GroupLayout(modProdPane);
        modProdPane.setLayout(modProdPaneLayout);
        modProdPaneLayout.setHorizontalGroup(
            modProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modProdLab, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        modProdPaneLayout.setVerticalGroup(
            modProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modProdLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(modProdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, 30));

        add(menuProvPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setMaximumSize(new java.awt.Dimension(790, 680));
        escritorio.setMinimumSize(new java.awt.Dimension(790, 680));
        escritorio.setPreferredSize(new java.awt.Dimension(790, 680));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(logolabel))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(logolabel))
        );

        add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void prodInaclabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodInaclabMouseClicked
        ListarInactivoProdV inacP = new ListarInactivoProdV();
        inacP.setVisible(true);
        inacP.setSize(790,670 );
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        
        escritorio.add(inacP);
        escritorio.repaint();
        escritorio.revalidate();
    }//GEN-LAST:event_prodInaclabMouseClicked

    private void regisProdLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisProdLabMouseClicked
        registrarProdV regP = new registrarProdV();
        regP.setVisible(true);
        regP.setSize(790, 670);
        
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(regP,BorderLayout.CENTER);
        
        escritorio.repaint();
        escritorio.revalidate();
        
    }//GEN-LAST:event_regisProdLabMouseClicked

    private void modProdLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProdLabMouseClicked
        ListarProdV listP = new ListarProdV();
        listP.setVisible(true);
        listP.setSize(790,670);
        
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(listP,BorderLayout.CENTER);
        escritorio.repaint();
        escritorio.revalidate();
    }//GEN-LAST:event_modProdLabMouseClicked

    private void regisProdLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisProdLabMouseEntered
        regisProdPane.setBackground(brillo);
    }//GEN-LAST:event_regisProdLabMouseEntered

    private void regisProdLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisProdLabMouseExited
        regisProdPane.setBackground(oscuro);
    }//GEN-LAST:event_regisProdLabMouseExited

    private void modProdLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProdLabMouseEntered
        modProdPane.setBackground(brillo);
    }//GEN-LAST:event_modProdLabMouseEntered

    private void modProdLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProdLabMouseExited
        modProdPane.setBackground(oscuro);
    }//GEN-LAST:event_modProdLabMouseExited

    private void prodInaclabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodInaclabMouseEntered
        prodInaPane.setBackground(brillo);
    }//GEN-LAST:event_prodInaclabMouseEntered

    private void prodInaclabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodInaclabMouseExited
       prodInaPane.setBackground(oscuro);
    }//GEN-LAST:event_prodInaclabMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel menuProvPane;
    private javax.swing.JLabel modProdLab;
    private javax.swing.JPanel modProdPane;
    private javax.swing.JPanel prodInaPane;
    private javax.swing.JLabel prodInaclab;
    private javax.swing.JLabel regisProdLab;
    private javax.swing.JPanel regisProdPane;
    // End of variables declaration//GEN-END:variables
}
