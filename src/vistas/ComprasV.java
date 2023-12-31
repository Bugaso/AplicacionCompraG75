/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import vistas.adminCompra.ListaComprasProv;
import vistas.adminCompra.ListaComprasV;
import vistas.adminCompra.ListarProdMasComprados;
import vistas.productoOp.ListarInactivoProdV;
import vistas.productoOp.ListarProdV;
import vistas.productoOp.registrarProdV;

/**
 *
 * @author Bugaso
 */
public class ComprasV extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarProducto
     */
    public ComprasV() {
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
        ListaComprasPane = new javax.swing.JPanel();
        ListaComprasLab = new javax.swing.JLabel();
        modProdPane = new javax.swing.JPanel();
        modProdLab = new javax.swing.JLabel();
        listaCFPane = new javax.swing.JPanel();
        listaCFLab = new javax.swing.JLabel();
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

        ListaComprasPane.setBackground(new java.awt.Color(152, 70, 137));
        ListaComprasPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ListaComprasLab.setBackground(new java.awt.Color(255, 255, 255));
        ListaComprasLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ListaComprasLab.setForeground(new java.awt.Color(255, 255, 255));
        ListaComprasLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaComprasLab.setText("Lista de Compras");
        ListaComprasLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaComprasLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaComprasLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListaComprasLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListaComprasPaneLayout = new javax.swing.GroupLayout(ListaComprasPane);
        ListaComprasPane.setLayout(ListaComprasPaneLayout);
        ListaComprasPaneLayout.setHorizontalGroup(
            ListaComprasPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListaComprasLab, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        ListaComprasPaneLayout.setVerticalGroup(
            ListaComprasPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListaComprasLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(ListaComprasPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 30));

        modProdPane.setBackground(new java.awt.Color(152, 70, 137));
        modProdPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modProdLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modProdLab.setForeground(new java.awt.Color(255, 255, 255));
        modProdLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modProdLab.setText("Lista de Compras a Proveedor");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modProdPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modProdLab, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        modProdPaneLayout.setVerticalGroup(
            modProdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modProdPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modProdLab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuProvPane.add(modProdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 230, 30));

        listaCFPane.setBackground(new java.awt.Color(152, 70, 137));
        listaCFPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listaCFLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        listaCFLab.setForeground(new java.awt.Color(255, 255, 255));
        listaCFLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listaCFLab.setText("Lista de Compras entre fecha");
        listaCFLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCFLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaCFLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaCFLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listaCFPaneLayout = new javax.swing.GroupLayout(listaCFPane);
        listaCFPane.setLayout(listaCFPaneLayout);
        listaCFPaneLayout.setHorizontalGroup(
            listaCFPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaCFPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listaCFLab, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        listaCFPaneLayout.setVerticalGroup(
            listaCFPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaCFPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listaCFLab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuProvPane.add(listaCFPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

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
                .addComponent(logolabel)
                .addGap(261, 261, 261))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(logolabel))
        );

        add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void ListaComprasLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaComprasLabMouseClicked
        ListaComprasV listC = new ListaComprasV();
        listC.setVisible(true);
        listC.setSize(790,670);
        
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(listC,BorderLayout.CENTER);
        escritorio.repaint();
        escritorio.revalidate();
        
    }//GEN-LAST:event_ListaComprasLabMouseClicked

    private void modProdLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProdLabMouseClicked
        ListaComprasProv listCP = new ListaComprasProv();
        listCP.setVisible(true);
        listCP.setSize(790,670);
        
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(listCP,BorderLayout.CENTER);
        escritorio.repaint();
        escritorio.revalidate();
    }//GEN-LAST:event_modProdLabMouseClicked

    private void ListaComprasLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaComprasLabMouseEntered
        ListaComprasPane.setBackground(brillo);
    }//GEN-LAST:event_ListaComprasLabMouseEntered

    private void ListaComprasLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaComprasLabMouseExited
        ListaComprasPane.setBackground(oscuro);
    }//GEN-LAST:event_ListaComprasLabMouseExited

    private void modProdLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProdLabMouseEntered
        modProdPane.setBackground(brillo);
    }//GEN-LAST:event_modProdLabMouseEntered

    private void modProdLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProdLabMouseExited
        modProdPane.setBackground(oscuro);
    }//GEN-LAST:event_modProdLabMouseExited

    private void listaCFLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCFLabMouseEntered
        listaCFPane.setBackground(brillo);
    }//GEN-LAST:event_listaCFLabMouseEntered

    private void listaCFLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCFLabMouseExited
        listaCFPane.setBackground(oscuro);
    }//GEN-LAST:event_listaCFLabMouseExited

    private void listaCFLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCFLabMouseClicked
        ListarProdMasComprados listCP = new ListarProdMasComprados();
        listCP.setVisible(true);
        listCP.setSize(790,670);
        
        escritorio.removeAll();
        escritorio.setLocation(0, 0);
        escritorio.add(listCP,BorderLayout.CENTER);
        escritorio.repaint();
        escritorio.revalidate();
    }//GEN-LAST:event_listaCFLabMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaComprasLab;
    private javax.swing.JPanel ListaComprasPane;
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel listaCFLab;
    private javax.swing.JPanel listaCFPane;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel menuProvPane;
    private javax.swing.JLabel modProdLab;
    private javax.swing.JPanel modProdPane;
    // End of variables declaration//GEN-END:variables
}
