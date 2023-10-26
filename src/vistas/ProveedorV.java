/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import vistas.proveedorOp.buscarProveV;
import vistas.proveedorOp.eliminarProveV;
import vistas.proveedorOp.modificarProveV;
import vistas.proveedorOp.registarProveV;

/**
 *
 * @author Bugaso
 */
public class ProveedorV extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarProveedor
     */
    public ProveedorV() {
        initComponents();
    }
    private Color brillo = new Color(202,70,137);
    private Color oscuro = new Color(152,70,137);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuProvPane = new javax.swing.JPanel();
        elimProvePane = new javax.swing.JPanel();
        elimProveLab = new javax.swing.JLabel();
        regisProvePane = new javax.swing.JPanel();
        regisProveLab = new javax.swing.JLabel();
        modProvePane = new javax.swing.JPanel();
        modProveLabe = new javax.swing.JLabel();
        buscarProvePane = new javax.swing.JPanel();
        buscarProveLab = new javax.swing.JLabel();
        elimProvePane1 = new javax.swing.JPanel();
        escritorioProve = new javax.swing.JPanel();
        logolabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(790, 730));
        setMinimumSize(new java.awt.Dimension(790, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuProvPane.setBackground(new java.awt.Color(72, 70, 119));
        menuProvPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuProvPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elimProvePane.setBackground(new java.awt.Color(152, 70, 137));
        elimProvePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elimProveLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        elimProveLab.setForeground(new java.awt.Color(255, 255, 255));
        elimProveLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elimProveLab.setText("Eliminar Proveedor");
        elimProveLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimProveLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elimProveLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elimProveLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout elimProvePaneLayout = new javax.swing.GroupLayout(elimProvePane);
        elimProvePane.setLayout(elimProvePaneLayout);
        elimProvePaneLayout.setHorizontalGroup(
            elimProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(elimProveLab, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        elimProvePaneLayout.setVerticalGroup(
            elimProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(elimProveLab, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(elimProvePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 150, 30));

        regisProvePane.setBackground(new java.awt.Color(152, 70, 137));
        regisProvePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        regisProveLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        regisProveLab.setForeground(new java.awt.Color(255, 255, 255));
        regisProveLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regisProveLab.setText("Registar Proveedor");
        regisProveLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisProveLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regisProveLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regisProveLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout regisProvePaneLayout = new javax.swing.GroupLayout(regisProvePane);
        regisProvePane.setLayout(regisProvePaneLayout);
        regisProvePaneLayout.setHorizontalGroup(
            regisProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regisProveLab, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        regisProvePaneLayout.setVerticalGroup(
            regisProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regisProveLab, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(regisProvePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 30));

        modProvePane.setBackground(new java.awt.Color(152, 70, 137));
        modProvePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modProveLabe.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modProveLabe.setForeground(new java.awt.Color(255, 255, 255));
        modProveLabe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modProveLabe.setText("Modificar Proveedor");
        modProveLabe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modProveLabeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modProveLabeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modProveLabeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modProvePaneLayout = new javax.swing.GroupLayout(modProvePane);
        modProvePane.setLayout(modProvePaneLayout);
        modProvePaneLayout.setHorizontalGroup(
            modProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modProveLabe, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        modProvePaneLayout.setVerticalGroup(
            modProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modProveLabe, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        menuProvPane.add(modProvePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 30));

        buscarProvePane.setBackground(new java.awt.Color(152, 70, 137));
        buscarProvePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buscarProveLab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        buscarProveLab.setForeground(new java.awt.Color(255, 255, 255));
        buscarProveLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarProveLab.setText("Buscar Proveedor");
        buscarProveLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarProveLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarProveLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarProveLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarProvePaneLayout = new javax.swing.GroupLayout(buscarProvePane);
        buscarProvePane.setLayout(buscarProvePaneLayout);
        buscarProvePaneLayout.setHorizontalGroup(
            buscarProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarProveLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        buscarProvePaneLayout.setVerticalGroup(
            buscarProvePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarProvePaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscarProveLab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuProvPane.add(buscarProvePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 170, 30));

        add(menuProvPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        javax.swing.GroupLayout elimProvePane1Layout = new javax.swing.GroupLayout(elimProvePane1);
        elimProvePane1.setLayout(elimProvePane1Layout);
        elimProvePane1Layout.setHorizontalGroup(
            elimProvePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        elimProvePane1Layout.setVerticalGroup(
            elimProvePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(elimProvePane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 30));

        escritorioProve.setBackground(new java.awt.Color(255, 255, 255));
        escritorioProve.setMaximumSize(new java.awt.Dimension(790, 680));
        escritorioProve.setMinimumSize(new java.awt.Dimension(790, 680));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N

        javax.swing.GroupLayout escritorioProveLayout = new javax.swing.GroupLayout(escritorioProve);
        escritorioProve.setLayout(escritorioProveLayout);
        escritorioProveLayout.setHorizontalGroup(
            escritorioProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(escritorioProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioProveLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logolabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        escritorioProveLayout.setVerticalGroup(
            escritorioProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(escritorioProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioProveLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logolabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(escritorioProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void regisProveLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisProveLabMouseClicked
        registarProveV regisV = new registarProveV();
        regisV.setVisible(true);
        regisV.setSize(790, 680);
        escritorioProve.removeAll();
        escritorioProve.setLocation(0, 0);
        escritorioProve.add(regisV,BorderLayout.CENTER);
        escritorioProve.revalidate();
        escritorioProve.repaint();
    }//GEN-LAST:event_regisProveLabMouseClicked

    private void modProveLabeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProveLabeMouseClicked
        modificarProveV modV = new modificarProveV();
        modV.setVisible(true);
        modV.setSize(790, 670);
        escritorioProve.removeAll();
        escritorioProve.setLocation(0,0);
        escritorioProve.add(modV, BorderLayout.CENTER);
        escritorioProve.revalidate();
        escritorioProve.repaint();
    }//GEN-LAST:event_modProveLabeMouseClicked

    private void elimProveLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimProveLabMouseClicked
        eliminarProveV delV = new eliminarProveV();
        delV.setVisible(true);
        delV.setSize(790,670);
        escritorioProve.removeAll();
        escritorioProve.add(delV, BorderLayout.CENTER);
        escritorioProve.revalidate();
        escritorioProve.repaint();
    }//GEN-LAST:event_elimProveLabMouseClicked

    private void buscarProveLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarProveLabMouseClicked
        buscarProveV buscV = new buscarProveV();
        buscV.setVisible(true);
        buscV.setSize(790,670);
        escritorioProve.removeAll();
        escritorioProve.add(buscV, BorderLayout.CENTER);
        escritorioProve.revalidate();
        escritorioProve.repaint();
    }//GEN-LAST:event_buscarProveLabMouseClicked

    private void regisProveLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisProveLabMouseEntered
        regisProvePane.setBackground(brillo);
    }//GEN-LAST:event_regisProveLabMouseEntered

    private void regisProveLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisProveLabMouseExited
        regisProvePane.setBackground(oscuro);
    }//GEN-LAST:event_regisProveLabMouseExited

    private void modProveLabeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProveLabeMouseEntered
        modProvePane.setBackground(brillo);
    }//GEN-LAST:event_modProveLabeMouseEntered

    private void modProveLabeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProveLabeMouseExited
        modProvePane.setBackground(oscuro);
    }//GEN-LAST:event_modProveLabeMouseExited

    private void elimProveLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimProveLabMouseEntered
        elimProvePane.setBackground(brillo);
    }//GEN-LAST:event_elimProveLabMouseEntered

    private void elimProveLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimProveLabMouseExited
        elimProvePane.setBackground(oscuro);
    }//GEN-LAST:event_elimProveLabMouseExited

    private void buscarProveLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarProveLabMouseEntered
        buscarProvePane.setBackground(brillo);
    }//GEN-LAST:event_buscarProveLabMouseEntered

    private void buscarProveLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarProveLabMouseExited
        buscarProvePane.setBackground(oscuro);
    }//GEN-LAST:event_buscarProveLabMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarProveLab;
    private javax.swing.JPanel buscarProvePane;
    private javax.swing.JLabel elimProveLab;
    private javax.swing.JPanel elimProvePane;
    private javax.swing.JPanel elimProvePane1;
    private javax.swing.JPanel escritorioProve;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel menuProvPane;
    private javax.swing.JLabel modProveLabe;
    private javax.swing.JPanel modProvePane;
    private javax.swing.JLabel regisProveLab;
    private javax.swing.JPanel regisProvePane;
    // End of variables declaration//GEN-END:variables
}
