/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.adminVenta;

import vistas.productoOp.*;
import accesoADatos.CompraData;
import accesoADatos.DetalleCompraData;
import accesoADatos.ProductoData;
import accesoADatos.ProveedorData;
import entidades.Compra;
import entidades.DetalleCompra;
import entidades.Producto;
import entidades.Proveedor;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import vistas.proveedorOp.DocumentSizeFilter;



/**
 *
 * @author balta
 */
public class ListarProdProvV extends javax.swing.JPanel {

    /**
     * Creates new form ListarProdV
     */
    public ListarProdProvV() {
        initComponents();
        cargarP();
        cargarProv();
        ((AbstractDocument) idtext.getDocument()).setDocumentFilter(new DocumentSizeFilter(11));
    }
    
    private DetalleCompraData detaCD = new DetalleCompraData();
    private ProveedorData proveD = new ProveedorData();
    private ProductoData proD = new ProductoData();
    private CompraData compraD = new CompraData();
    
    public void realizarCompra(){
            int stock;
            int cant;
                Compra compra = new Compra();
                DetalleCompra detaC = new DetalleCompra();
                ArrayList<Producto> prod = new ArrayList();
                int aux = 0;
                try{
                    for (int i = prodtable.getRowCount()-1; i>=0 ;i--){
                        System.out.println("Valor de la fila: " + i);
                        cant = (int) prodtable.getValueAt(i, 5);
                        System.out.println("cantidad: " + cant);
                        stock = (int) prodtable.getValueAt(i, 4);
                        System.out.println("stock: " + stock);
                        if(cant > 0){
                                compra.setProveedor(proveD.buscarProveedorPorcuit(Long.valueOf(idtext.getText())));
                                compra.setFecha(LocalDate.now());
                                compraD.guardarCompra(compra);
                                detaC.setCantidad(stock);
                                detaC.setCompra(compra);
                                detaC.setPrecioCosto((double)prodtable.getValueAt(i, 3));
                                prod.add(proD.buscarProducto((int) prodtable.getValueAt(i, 0)));
                                detaC.setProducto(prod.get(aux));
                                detaCD.guardarDetalleCompra(detaC);
                                prod.get(aux).setStock(stock+cant);               
                                proD.modificarProducto(prod.get(aux++)); 
                                System.out.println("compra: " + compra.toString());
                                System.out.println("compraD: " + compraD.toString());
                                System.out.println("detaC: " + detaC.toString()); 
                            }else{               
                        }
                    }
                }catch(NumberFormatException e){
                System.out.println("Esta mal");
            }
        cargarP();
    }
    
    public void realizarModificacion(){
        int stock;
        int cant;
        Compra compra = new Compra();
        DetalleCompra detaC = new DetalleCompra();
        ArrayList<Producto> prod = new ArrayList();
        int aux = 0;
            try{
                for (int i = prodtable.getRowCount()-1; i>=0 ;i--){
                    System.out.println("Valor de la fila: " + i);
                    cant = (int) prodtable.getValueAt(i, 5);
                    System.out.println("cantidad: " + cant);
                    stock = (int) prodtable.getValueAt(i, 4);
                    System.out.println("stock: " + stock);
                    if(cant > 0){
                        compra.setProveedor(proveD.buscarProveedorPorcuit(Long.valueOf(idtext.getText())));
                        compra.setFecha(LocalDate.now());
                        compraD.guardarCompra(compra);
                        detaC.setCantidad(stock);
                        detaC.setCompra(compra);
                        detaC.setPrecioCosto((double)prodtable.getValueAt(i, 3));
                        prod.add(proD.buscarProducto((int) prodtable.getValueAt(i, 0)));
                        detaC.setProducto(prod.get(aux));
                        detaCD.guardarDetalleCompra(detaC);
                        prod.get(aux).setStock(stock+cant);               
                        proD.modificarProducto(prod.get(aux));
                        aux++;
                        }
                    }                
        }catch(NumberFormatException e){
            System.out.println("Esta mal");
        }        
    }
    
    public void cargarProv(){
        ArrayList<Proveedor> proveedores = proveD.listarProveedor();
        for(Proveedor prov : proveedores){
            provbox.addItem(prov.getCuit()+ " / "+prov.getRazonSocial());
        }
    }
    public void cargarP(){
        ArrayList<Producto> prod = proD.listarProductos();
        
        DefaultTableModel def = (DefaultTableModel) prodtable.getModel();
        
        for(int i = def.getRowCount()-1;i>=0; i--){
            def.removeRow(i);
        } 
        for(Producto producto : prod){
            def.addRow(new Object[] {producto.getIdProducto(),producto.getNombreProducto(),producto.getDescripcion(), producto.getPrecioActual(),producto.getStock(),0});
        }
        
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
        prodtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buscarpane = new javax.swing.JPanel();
        buscarlabel = new javax.swing.JLabel();
        refrescarpane = new javax.swing.JPanel();
        refrescarlabel = new javax.swing.JLabel();
        ventapane = new javax.swing.JPanel();
        ventalabel = new javax.swing.JLabel();
        provbox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 680));
        setMinimumSize(new java.awt.Dimension(790, 680));
        setPreferredSize(new java.awt.Dimension(790, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                false, true, true, true, true, true
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

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Productos para Vender");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Buscar Proveedor:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        idtext.setForeground(java.awt.Color.lightGray);
        idtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idtext.setText("Ingrese cuit de Proveedor");
        idtext.setBorder(null);
        idtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idtextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idtextFocusLost(evt);
            }
        });
        add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 10));

        buscarpane.setBackground(new java.awt.Color(51, 51, 51));

        buscarlabel.setBackground(new java.awt.Color(102, 102, 102));
        buscarlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscarlabel.setForeground(new java.awt.Color(255, 255, 255));
        buscarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarlabel.setText("Buscar");
        buscarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buscarpaneLayout = new javax.swing.GroupLayout(buscarpane);
        buscarpane.setLayout(buscarpaneLayout);
        buscarpaneLayout.setHorizontalGroup(
            buscarpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        buscarpaneLayout.setVerticalGroup(
            buscarpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(buscarpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 80, 30));

        refrescarpane.setBackground(new java.awt.Color(0, 0, 102));
        refrescarpane.setPreferredSize(new java.awt.Dimension(110, 30));

        refrescarlabel.setForeground(new java.awt.Color(255, 255, 255));
        refrescarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refrescarlabel.setText("Refrescar");

        javax.swing.GroupLayout refrescarpaneLayout = new javax.swing.GroupLayout(refrescarpane);
        refrescarpane.setLayout(refrescarpaneLayout);
        refrescarpaneLayout.setHorizontalGroup(
            refrescarpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, refrescarpaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refrescarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        refrescarpaneLayout.setVerticalGroup(
            refrescarpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, refrescarpaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refrescarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(refrescarpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        ventapane.setBackground(new java.awt.Color(0, 102, 102));
        ventapane.setPreferredSize(new java.awt.Dimension(110, 30));

        ventalabel.setForeground(new java.awt.Color(255, 255, 255));
        ventalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventalabel.setText("Vender");
        ventalabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventalabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventapaneLayout = new javax.swing.GroupLayout(ventapane);
        ventapane.setLayout(ventapaneLayout);
        ventapaneLayout.setHorizontalGroup(
            ventapaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventapaneLayout.createSequentialGroup()
                .addComponent(ventalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventapaneLayout.setVerticalGroup(
            ventapaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventapaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ventalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(ventapane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        provbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuit / Razon social" }));
        provbox.setBorder(null);
        provbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provboxActionPerformed(evt);
            }
        });
        add(provbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void idtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextFocusGained
        if(idtext.getText().equals("Ingrese cuit de Proveedor")){
            idtext.setText("");
            idtext.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_idtextFocusGained

    private void idtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextFocusLost
        if(idtext.getText().equals("")){
            idtext.setText("Ingrese cuit de Proveedor");
            idtext.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_idtextFocusLost

    private void buscarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarlabelMouseClicked
        Proveedor prov ; 
        try{
            if(!idtext.getText().equals("")){
                prov = proveD.buscarProveedorPorcuit(Long.parseLong(idtext.getText()));
                provbox.setSelectedItem(prov.getCuit()+ " / "+prov.getRazonSocial());
            }
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_buscarlabelMouseClicked

    private void provboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provboxActionPerformed
        String cuit = "";
        try{
            for(int i= 0;i<11;i++){
                cuit+= provbox.getSelectedItem().toString().charAt(i);
            }
            idtext.setText(cuit);
            idtext.setForeground(Color.BLACK);
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_provboxActionPerformed

    private void ventalabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventalabelMouseClicked
        realizarCompra();
    }//GEN-LAST:event_ventalabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarlabel;
    private javax.swing.JPanel buscarpane;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JTable prodtable;
    private javax.swing.JComboBox<String> provbox;
    private javax.swing.JLabel refrescarlabel;
    private javax.swing.JPanel refrescarpane;
    private javax.swing.JLabel ventalabel;
    private javax.swing.JPanel ventapane;
    // End of variables declaration//GEN-END:variables
}
