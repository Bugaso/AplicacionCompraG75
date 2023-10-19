/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import accesoADatos.ProveedorData;
import entidades.Proveedor;

/**
 *
 * @author Bugaso
 */
public class DetalleCompraV extends javax.swing.JPanel {

    /**
     * Creates new form DetalleCompra
     */
    public DetalleCompraV() {
        initComponents();
        MostrarProveedor();
    }
    public void MostrarProveedor(){
        ProveedorData provD = new ProveedorData();
        Proveedor prov;
        prov = provD.buscarProveedorPorcuit(55555555555L);
        MostrarNoRLabel.setText(prov.getRazonSocial());
        mostrarDLabel.setText(prov.getDomicilio());
        mostarTelLabel.setText(prov.getTelefono());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Datos_Proveedor = new javax.swing.JLabel();
        NombreRazonLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MostrarNoRLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        mostrarDLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        mostarTelLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        proveedorBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalleCompraTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(800, 730));
        setPreferredSize(new java.awt.Dimension(800, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(153, 153, 153));
        background.setMinimumSize(new java.awt.Dimension(800, 730));
        background.setPreferredSize(new java.awt.Dimension(800, 730));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Datos_Proveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Datos_Proveedor.setForeground(new java.awt.Color(102, 102, 102));
        Datos_Proveedor.setText("Datos de Proveedor");
        background.add(Datos_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        NombreRazonLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        NombreRazonLabel.setForeground(new java.awt.Color(102, 102, 102));
        NombreRazonLabel.setText("Nombre o razón social:");
        background.add(NombreRazonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 80, 180, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 180, 260, 10));

        MostrarNoRLabel.setForeground(new java.awt.Color(102, 102, 102));
        MostrarNoRLabel.setText("La Pandurata SRL");
        background.add(MostrarNoRLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 168, -1));

        direccionLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        direccionLabel.setForeground(new java.awt.Color(102, 102, 102));
        direccionLabel.setText("Direccion:");
        background.add(direccionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, 20));

        mostrarDLabel.setForeground(new java.awt.Color(102, 102, 102));
        mostrarDLabel.setText("Calle 123,Caba Argentina");
        background.add(mostrarDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 160, 10));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Telefono:");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        mostarTelLabel.setForeground(new java.awt.Color(102, 102, 102));
        mostarTelLabel.setText("11-9999-8888");
        background.add(mostarTelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 166, -1, 10));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 260, 10));

        proveedorBackground.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout proveedorBackgroundLayout = new javax.swing.GroupLayout(proveedorBackground);
        proveedorBackground.setLayout(proveedorBackgroundLayout);
        proveedorBackgroundLayout.setHorizontalGroup(
            proveedorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        proveedorBackgroundLayout.setVerticalGroup(
            proveedorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        background.add(proveedorBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 390, 190));

        detalleCompraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "iD", "Nombre", "Descripcion", "precioActual", "Stock", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detalleCompraTable.getTableHeader().setResizingAllowed(false);
        detalleCompraTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(detalleCompraTable);
        if (detalleCompraTable.getColumnModel().getColumnCount() > 0) {
            detalleCompraTable.getColumnModel().getColumn(0).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(1).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(2).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(3).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(4).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(5).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(6).setResizable(false);
        }

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 700, 110));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DetalleCompraV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleCompraV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleCompraV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleCompraV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleCompraV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datos_Proveedor;
    private javax.swing.JLabel MostrarNoRLabel;
    private javax.swing.JLabel NombreRazonLabel;
    private javax.swing.JPanel background;
    private javax.swing.JTable detalleCompraTable;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mostarTelLabel;
    private javax.swing.JLabel mostrarDLabel;
    private javax.swing.JPanel proveedorBackground;
    // End of variables declaration//GEN-END:variables
}
