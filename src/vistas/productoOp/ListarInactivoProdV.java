/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.productoOp;

import accesoADatos.CompraData;
import accesoADatos.DetalleCompraData;
import accesoADatos.ProductoData;
import accesoADatos.ProveedorData;
import entidades.Compra;
import entidades.DetalleCompra;
import entidades.Producto;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author compu
 */
public class ListarInactivoProdV extends javax.swing.JPanel {

    /**
     * Creates new form ListarInactivoProdV
     */
    public ListarInactivoProdV() {
        initComponents();
        cargarTable();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodtable = new javax.swing.JTable();
        altaPane = new javax.swing.JPanel();
        altaLab = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 680));
        setMinimumSize(new java.awt.Dimension(790, 680));
        setPreferredSize(new java.awt.Dimension(790, 680));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Productos Inactivos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        prodtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Nombre", "Descripcion", "Precio Actual", "Stock", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        prodtable.getTableHeader().setResizingAllowed(false);
        prodtable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(prodtable);
        if (prodtable.getColumnModel().getColumnCount() > 0) {
            prodtable.getColumnModel().getColumn(0).setResizable(false);
            prodtable.getColumnModel().getColumn(1).setResizable(false);
            prodtable.getColumnModel().getColumn(2).setResizable(false);
            prodtable.getColumnModel().getColumn(3).setResizable(false);
            prodtable.getColumnModel().getColumn(4).setResizable(false);
            prodtable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 770, 132));

        altaPane.setBackground(new java.awt.Color(0, 102, 102));
        altaPane.setMinimumSize(new java.awt.Dimension(110, 30));
        altaPane.setPreferredSize(new java.awt.Dimension(41, 14));

        altaLab.setForeground(new java.awt.Color(255, 255, 255));
        altaLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        altaLab.setText("Activar");
        altaLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altaLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout altaPaneLayout = new javax.swing.GroupLayout(altaPane);
        altaPane.setLayout(altaPaneLayout);
        altaPaneLayout.setHorizontalGroup(
            altaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(altaLab, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        altaPaneLayout.setVerticalGroup(
            altaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(altaLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(altaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, 30));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
        private DetalleCompraData detaCD = new DetalleCompraData();
    private CompraData compraD = new CompraData();
    private ProveedorData proveD = new ProveedorData();
    private ProductoData proD = new ProductoData(); 
    
    private void vaciarTable(){
        DefaultTableModel modTable = (DefaultTableModel) prodtable.getModel();
            for(int i = modTable.getRowCount()-1; i>=0; i--){
             modTable.removeRow(i);
            }
    }
    
    private void cargarTable(){
        ArrayList<Producto> prod = proD.listarProductosInactivos();
        DefaultTableModel modTable = (DefaultTableModel) prodtable.getModel();
        
        vaciarTable();
        
        for(Producto producto : prod){
            modTable.addRow(new Object[] {producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
        }
    }
    
    private void altaLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altaLabMouseClicked
       if(prodtable.getSelectedRow() > 0 ){
            int[] filasSelec = prodtable.getSelectedRows();
            
            for(int i=0; i<filasSelec.length; i++){
                Producto producto = proD.buscarProducto((int)prodtable.getValueAt(filasSelec[i], 0));
                System.out.println(producto.toString());
                producto.setEstado(true);
                proD.modificarProducto(producto);
            }
            
        }
        cargarTable();
    }//GEN-LAST:event_altaLabMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altaLab;
    private javax.swing.JPanel altaPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JTable prodtable;
    // End of variables declaration//GEN-END:variables
}
