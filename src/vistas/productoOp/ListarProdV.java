/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.productoOp;

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
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableColumnModel;
import javax.swing.text.AbstractDocument;
import vistas.proveedorOp.DocumentSizeFilter;



/**
 *
 * @author balta
 */
public class ListarProdV extends javax.swing.JPanel {

    /**
     * Creates new form ListarProdV
     */
    public ListarProdV() {
        initComponents();
        cargarP();
        cargarProv();
        ((AbstractDocument) idtext.getDocument()).setDocumentFilter(new DocumentSizeFilter(11));
    }
    
    private DetalleCompraData detaCD = new DetalleCompraData();
    private ProveedorData proveD = new ProveedorData();
    private ProductoData proD = new ProductoData();
    private CompraData compraD = new CompraData();
    
    //Colores brillosos
    private Color buscarB = new Color(0,101,101);
    private Color comprarB = new Color(0,50,152);
    private Color modB = new Color(101,0,101);
    private Color eliminarB = new Color(152,0,0);
    
    //Colores por defecto
    private Color buscarD = new Color(0,51,51);
    private Color comprarD = new Color(0,0,102);
    private Color modD = new Color(51,0,51);
    private Color eliminarD = new Color(102,0,0);
    
    private void realizarCompraAngelo(){
        
        if(prodtable.getSelectedRow() > -1){
            try {
                boolean banderaCompra = false;
                Compra compra = new Compra();
                compra.setProveedor(proveD.buscarProveedorPorcuit(Long.valueOf(idtext.getText())));
                compra.setFecha(LocalDate.now());
            
                int[] filasSelec = new int[prodtable.getSelectedRowCount()];
            
                for(int i=0; i<filasSelec.length; i++){
                    int stock = (int)prodtable.getValueAt(filasSelec[i], 4);
                    int cant = (int)prodtable.getValueAt(filasSelec[i], 5);

                    if(cant > 0){
                        banderaCompra = true;
                        DetalleCompra detCompra = new DetalleCompra();
                        Producto producto = proD.buscarProducto((int)prodtable.getValueAt(filasSelec[i], 0));
                        detCompra.setCompra(compra);
                        detCompra.setProducto(producto);
                        detCompra.setPrecioCosto((double)prodtable.getValueAt(filasSelec[i], 3));
                        detCompra.setCantidad(cant);
                        detaCD.guardarDetalleCompra(detCompra);
                        producto.setStock(stock + cant);
                        proD.modificarProducto(producto);
                    }
                }
                
                if(banderaCompra){
                 compraD.guardarCompra(compra);
                    cargarP();
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "En la columna Cantidad solo debe colocar números positivos sin punto ni coma");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un producto para comprar");
        }
    }
    
//    public void realizarCompra(){
//            int stock;
//            int cant;
//                Compra compra = new Compra();
//                DetalleCompra detaC = new DetalleCompra();
//                ArrayList<Producto> prod = new ArrayList();
//                int aux = 0;
//                try{
//                    for (int i = prodtable.getRowCount()-1; i>=0 ;i--){
//                        System.out.println("Valor de la fila: " + i);
//                        cant = (int) prodtable.getValueAt(i, 5);
//                        System.out.println("cantidad: " + cant);
//                        stock = (int) prodtable.getValueAt(i, 4);
//                        System.out.println("stock: " + stock);
//                        if(cant > 0){
//                                compra.setProveedor(proveD.buscarProveedorPorcuit(Long.valueOf(idtext.getText())));
//                                compra.setFecha(LocalDate.now());
//                                compraD.guardarCompra(compra);
//                                detaC.setCantidad(stock);
//                                detaC.setCompra(compra);
//                                detaC.setPrecioCosto((double)prodtable.getValueAt(i, 3));
//                                prod.add(proD.buscarProducto((int) prodtable.getValueAt(i, 0)));
//                                detaC.setProducto(prod.get(aux));
//                                detaCD.guardarDetalleCompra(detaC);
//                                prod.get(aux).setStock(stock+cant);               
//                                proD.modificarProducto(prod.get(aux++)); 
//                                System.out.println("compra: " + compra.toString());
//                                System.out.println("compraD: " + compraD.toString());
//                                System.out.println("detaC: " + detaC.toString()); 
//                            }else{
//                            JOptionPane.showMessageDialog(null, "Ingrese una cantidad a comprar!!!");
//                        }
//                    }
//                }catch(NumberFormatException e){
//                System.out.println("Esta mal");
//                }
//        cargarP();
//    }
    
    public void realizarModificacion(){
        
        ArrayList<Producto> prod = new ArrayList();
        int aux = 0;
            try{
                for (int i = prodtable.getRowCount()-1; i>=0 ;i--){
                    
                    prod.add(proD.buscarProducto((int) prodtable.getValueAt(i, 0)));
                    prod.get(aux).setNombreProducto((String)prodtable.getValueAt(i,1));
                    prod.get(aux).setDescripcion((String)prodtable.getValueAt(i,2));
                    prod.get(aux).setPrecioActual((Double)prodtable.getValueAt(i,3));
                    proD.modificarProducto(prod.get(aux));
                    aux++;
                    
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
        modpane = new javax.swing.JPanel();
        modificarlabel = new javax.swing.JLabel();
        elimpane = new javax.swing.JPanel();
        eliminarlabel = new javax.swing.JLabel();
        comprarPane = new javax.swing.JPanel();
        compraLab = new javax.swing.JLabel();
        provbox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 680));
        setMinimumSize(new java.awt.Dimension(790, 680));
        setPreferredSize(new java.awt.Dimension(790, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prodtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idProducto", "Nombre", "Descripcion", "Precio Actual", "Stock", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        prodtable.getTableHeader().setResizingAllowed(false);
        prodtable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(prodtable);
        if (prodtable.getColumnModel().getColumnCount() > 0) {
            prodtable.getColumnModel().getColumn(0).setResizable(false);
            prodtable.getColumnModel().getColumn(0).setPreferredWidth(10);
            prodtable.getColumnModel().getColumn(1).setResizable(false);
            prodtable.getColumnModel().getColumn(2).setResizable(false);
            prodtable.getColumnModel().getColumn(3).setResizable(false);
            prodtable.getColumnModel().getColumn(4).setResizable(false);
            prodtable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 770, 132));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Productos Activos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Buscador:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        idtext.setForeground(java.awt.Color.lightGray);
        idtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idtext.setText("Ingrese el cuit del proveedor");
        idtext.setBorder(null);
        idtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idtextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idtextFocusLost(evt);
            }
        });
        add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 170, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 170, 10));

        buscarpane.setBackground(new java.awt.Color(0, 51, 51));

        buscarlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscarlabel.setForeground(new java.awt.Color(255, 255, 255));
        buscarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarlabel.setText("Buscar");
        buscarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarlabelMouseExited(evt);
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

        add(buscarpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, 30));

        modpane.setBackground(new java.awt.Color(51, 0, 51));
        modpane.setForeground(new java.awt.Color(51, 0, 102));

        modificarlabel.setForeground(new java.awt.Color(255, 255, 255));
        modificarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarlabel.setText("Modificar");
        modificarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modpaneLayout = new javax.swing.GroupLayout(modpane);
        modpane.setLayout(modpaneLayout);
        modpaneLayout.setHorizontalGroup(
            modpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        modpaneLayout.setVerticalGroup(
            modpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(modpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, 30));

        elimpane.setBackground(new java.awt.Color(102, 0, 0));
        elimpane.setPreferredSize(new java.awt.Dimension(110, 30));

        eliminarlabel.setForeground(new java.awt.Color(255, 255, 255));
        eliminarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarlabel.setText("Eliminar");
        eliminarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout elimpaneLayout = new javax.swing.GroupLayout(elimpane);
        elimpane.setLayout(elimpaneLayout);
        elimpaneLayout.setHorizontalGroup(
            elimpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elimpaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        elimpaneLayout.setVerticalGroup(
            elimpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elimpaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(elimpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        comprarPane.setBackground(new java.awt.Color(0, 0, 102));
        comprarPane.setPreferredSize(new java.awt.Dimension(110, 30));

        compraLab.setForeground(new java.awt.Color(255, 255, 255));
        compraLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compraLab.setText("Comprar");
        compraLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraLabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                compraLabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compraLabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout comprarPaneLayout = new javax.swing.GroupLayout(comprarPane);
        comprarPane.setLayout(comprarPaneLayout);
        comprarPaneLayout.setHorizontalGroup(
            comprarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compraLab, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        comprarPaneLayout.setVerticalGroup(
            comprarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compraLab, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(comprarPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        provbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuit / Razon Social" }));
        provbox.setBorder(null);
        provbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provboxActionPerformed(evt);
            }
        });
        add(provbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarlabelMouseClicked
        Proveedor prov; 
        try{
            if(!idtext.getText().equals("")){
                prov = proveD.buscarProveedorPorcuit(Long.parseLong(idtext.getText()));
                provbox.setSelectedItem(prov.getCuit()+ " / "+prov.getRazonSocial());
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo debe ingresar Numeros!!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe agregar un proveedor!!!");
        }
    }//GEN-LAST:event_buscarlabelMouseClicked

    private void idtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextFocusGained

        if(idtext.getText().equals("Ingrese el cuit del proveedor")){
           idtext.setText("");
           idtext.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_idtextFocusGained

    private void idtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextFocusLost
        if(idtext.getText().equals("")){
           idtext.setText("Ingrese el cuit del proveedor");
           idtext.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_idtextFocusLost

    private void provboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provboxActionPerformed
        String str = (String)provbox.getSelectedItem();
        String cuit = "";
        for(int i = 0; i<11;i++){
            cuit += str.charAt(i);
        }
        idtext.setText("");
        idtext.setForeground(Color.BLACK);
        idtext.setText(cuit);
    }//GEN-LAST:event_provboxActionPerformed

    private void compraLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraLabMouseClicked
        realizarCompraAngelo();
    }//GEN-LAST:event_compraLabMouseClicked

    private void modificarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarlabelMouseClicked
        realizarModificacion();
    }//GEN-LAST:event_modificarlabelMouseClicked

    private void eliminarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarlabelMouseClicked
        try{
            int fila = prodtable.getSelectedRow();
            System.out.println("Fila seleccionada: "+fila);
            Producto prod = proD.buscarProducto((Integer)prodtable.getValueAt(fila, 0));
            prod.setEstado(false);
            proD.modificarProducto(prod);
            cargarP();
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Seleccione almenos una fila!!!");
        }
        
    }//GEN-LAST:event_eliminarlabelMouseClicked

    private void buscarlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarlabelMouseEntered
        buscarpane.setBackground(buscarB);
    }//GEN-LAST:event_buscarlabelMouseEntered

    private void buscarlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarlabelMouseExited
        buscarpane.setBackground(buscarD);
    }//GEN-LAST:event_buscarlabelMouseExited

    private void compraLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraLabMouseEntered
        comprarPane.setBackground(comprarB);
    }//GEN-LAST:event_compraLabMouseEntered

    private void compraLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraLabMouseExited
        comprarPane.setBackground(comprarD);
    }//GEN-LAST:event_compraLabMouseExited

    private void modificarlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarlabelMouseEntered
        modpane.setBackground(modB);
    }//GEN-LAST:event_modificarlabelMouseEntered

    private void modificarlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarlabelMouseExited
        modpane.setBackground(modD);
    }//GEN-LAST:event_modificarlabelMouseExited

    private void eliminarlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarlabelMouseEntered
        elimpane.setBackground(eliminarB);
    }//GEN-LAST:event_eliminarlabelMouseEntered

    private void eliminarlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarlabelMouseExited
        elimpane.setBackground(eliminarD);
    }//GEN-LAST:event_eliminarlabelMouseExited

              
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarlabel;
    private javax.swing.JPanel buscarpane;
    private javax.swing.JLabel compraLab;
    private javax.swing.JPanel comprarPane;
    private javax.swing.JLabel eliminarlabel;
    private javax.swing.JPanel elimpane;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JLabel modificarlabel;
    private javax.swing.JPanel modpane;
    private javax.swing.JTable prodtable;
    private javax.swing.JComboBox<String> provbox;
    // End of variables declaration//GEN-END:variables
}
