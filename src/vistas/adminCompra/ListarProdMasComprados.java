/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.adminCompra;

import accesoADatos.*;
import entidades.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListarProdMasComprados extends javax.swing.JPanel {
    private DefaultTableModel modeloTable = new DefaultTableModel(){
        public boolean isCellEditable (int Row,int Column){
            return false;
            };
        };
    private DetalleCompraData detCompraData = new DetalleCompraData();
    
    public ListarProdMasComprados() {
        initComponents();
        armarCabecera();
    }
    
    private void armarCabecera(){
        
        modeloTable.addColumn("idProducto");
        modeloTable.addColumn("Nombre");
        modeloTable.addColumn("Descripción");
        modeloTable.addColumn("Precio");
        
        jtProductos.setModel(modeloTable);
    }
    
    private void cargarProducto(Producto producto){
        
        modeloTable.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual()});
        
    }
    
    private void limpiarTabla() {

		for (int i = modeloTable.getRowCount() - 1; i >= 0; i--) {
			modeloTable.removeRow(i);
		}
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlFecha1 = new javax.swing.JLabel();
        jdchFecha1 = new com.toedter.calendar.JDateChooser();
        jlFecha2 = new javax.swing.JLabel();
        jdchFecha2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jlMostrarProductos = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Productos Más Comprados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 230, -1));

        jlFecha1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlFecha1.setText("Fecha 1:");
        add(jlFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 60, -1));
        add(jdchFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, -1));

        jlFecha2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlFecha2.setText("Fecha 2:");
        add(jlFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));
        add(jdchFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, -1));

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtProductos);
        if (jtProductos.getColumnModel().getColumnCount() > 0) {
            jtProductos.getColumnModel().getColumn(0).setResizable(false);
            jtProductos.getColumnModel().getColumn(1).setResizable(false);
            jtProductos.getColumnModel().getColumn(2).setResizable(false);
            jtProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 540, 180));

        jlMostrarProductos.setBackground(new java.awt.Color(102, 0, 102));
        jlMostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        jlMostrarProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMostrarProductos.setText("Mostrar Productos");
        jlMostrarProductos.setOpaque(true);
        jlMostrarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMostrarProductosMouseClicked(evt);
            }
        });
        add(jlMostrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 120, 30));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void jlMostrarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMostrarProductosMouseClicked
        
        limpiarTabla();
        
        if(jdchFecha1.getDate() != null && jdchFecha2.getDate() != null){
            LocalDate fecha1 = jdchFecha1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fecha2 = jdchFecha2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ArrayList<Producto> productos = detCompraData.productosMasCompradosEntreDosFechas(fecha1, fecha2);
            
            for(int i=0; i<productos.size(); i++){
                cargarProducto(productos.get(i));
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar las dos fechas");
        }
    }//GEN-LAST:event_jlMostrarProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdchFecha1;
    private com.toedter.calendar.JDateChooser jdchFecha2;
    private javax.swing.JLabel jlFecha1;
    private javax.swing.JLabel jlFecha2;
    private javax.swing.JLabel jlMostrarProductos;
    private javax.swing.JTable jtProductos;
    private javax.swing.JLabel logolabel;
    // End of variables declaration//GEN-END:variables
}
