/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.proveedorOp;

/**
 *
 * @author compu
 */
public class productoProveV extends javax.swing.JPanel {

    /**
     * Creates new form productoProveV
     */
    public productoProveV() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleCompraTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        logolabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLGuardar = new javax.swing.JLabel();
        jLCancelar = new javax.swing.JLabel();
        jLModificar = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Productos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 112, 193, 33));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Fecha:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 25, 208, -1));

        detalleCompraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "PrecioUnitario", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane2.setViewportView(detalleCompraTable);
        if (detalleCompraTable.getColumnModel().getColumnCount() > 0) {
            detalleCompraTable.getColumnModel().getColumn(0).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(2).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(3).setResizable(false);
            detalleCompraTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 209, 705, 110));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Nº cliente:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 51, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 53, 208, -1));

        logolabel.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        logolabel.setMaximumSize(new java.awt.Dimension(790, 730));
        logolabel.setMinimumSize(new java.awt.Dimension(790, 730));
        logolabel.setPreferredSize(new java.awt.Dimension(790, 730));
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 23, 194, 93));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Total:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 324, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 326, 130, -1));

        jLGuardar.setBackground(new java.awt.Color(0, 102, 102));
        jLGuardar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGuardar.setText("Guardar");
        jLGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLGuardarMouseClicked(evt);
            }
        });
        add(jLGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 423, 81, 27));

        jLCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCancelar.setText("Cancelar");
        add(jLCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 423, 83, 27));

        jLModificar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("Modificar");
        add(jLModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 425, 80, 23));
    }// </editor-fold>//GEN-END:initComponents

    private void jLGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLGuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable detalleCompraTable;
    private javax.swing.JLabel jLCancelar;
    private javax.swing.JLabel jLGuardar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel logolabel;
    // End of variables declaration//GEN-END:variables
}
