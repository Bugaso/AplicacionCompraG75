/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.proveedorOp;


import accesoADatos.ProveedorData;
import entidades.Proveedor;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.AbstractDocument;


/**
 *
 * @author balta
 */
public class buscarProveV extends javax.swing.JPanel {

    /**
     * Creates new form buscarProveV
     */
    public buscarProveV() {
        initComponents();
        cargar();
        ((AbstractDocument) cuittext.getDocument()).setDocumentFilter(new DocumentSizeFilter(11));
        tooltipcuit.setVisible(false);
    }
    
      
    
    private ProveedorData proveD = new ProveedorData();
    
    public void Default(){
        nombretext.setText("Razon social / Nombre");
        nombretext.setForeground(Color.lightGray);
        domiciliotext.setText("Domicilio");
        domiciliotext.setForeground(Color.lightGray);
        telefonotext.setText("Telefono");
        telefonotext.setForeground(Color.lightGray);
        cuittext.setText("Cuit");
        cuittext.setForeground(Color.lightGray);
        idtext.setText("idProveedor");
        idtext.setForeground(Color.lightGray);
    }
    public void limpiar(){
        for(int i= buscarProv.getItemCount()-1;i>0;i--){
            buscarProv.removeItemAt(i);
        }
    }
    public void cargar(){
        limpiar();
        ArrayList<Proveedor> provedores = proveD.listarProveedor();

        for(Proveedor prov : provedores){
            buscarProv.addItem(prov.getCuit()+" / "+prov.getRazonSocial());
            System.out.println(prov.toString());
        }
    }
    public void mostrar(Long cuit){
        Proveedor prove = proveD.buscarProveedorPorcuit(cuit);
        nombretext.setText(prove.getRazonSocial());
        domiciliotext.setText(prove.getDomicilio());
        telefonotext.setText(prove.getTelefono());
        idtext.setText(String.valueOf(prove.getIdProveedor()));
        cuittext.setText(String.valueOf(prove.getCuit()));
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
        buscarProv = new javax.swing.JComboBox<>();
        nombretext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        domiciliotext = new javax.swing.JTextField();
        telefonotext = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cuittext = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        logolabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tooltipcuit = new javax.swing.JLabel();
        paneMod = new javax.swing.JPanel();
        labelmod = new javax.swing.JLabel();
        eliminarpan = new javax.swing.JPanel();
        eliminarlabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 680));
        setMinimumSize(new java.awt.Dimension(790, 680));
        setPreferredSize(new java.awt.Dimension(790, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Proveedor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        buscarProv.setBackground(new java.awt.Color(204, 204, 204));
        buscarProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuit / Nombre" }));
        buscarProv.setBorder(null);
        buscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProvActionPerformed(evt);
            }
        });
        add(buscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 240, -1));

        nombretext.setEditable(false);
        nombretext.setBackground(new java.awt.Color(255, 255, 255));
        nombretext.setForeground(java.awt.Color.lightGray);
        nombretext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombretext.setText("Razon social / Nombre");
        nombretext.setBorder(null);
        add(nombretext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 240, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, 10));

        domiciliotext.setEditable(false);
        domiciliotext.setBackground(new java.awt.Color(255, 255, 255));
        domiciliotext.setForeground(java.awt.Color.lightGray);
        domiciliotext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        domiciliotext.setText("Domicilio");
        domiciliotext.setBorder(null);
        add(domiciliotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 240, 20));

        telefonotext.setEditable(false);
        telefonotext.setBackground(new java.awt.Color(255, 255, 255));
        telefonotext.setForeground(java.awt.Color.lightGray);
        telefonotext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telefonotext.setText("Telefono");
        telefonotext.setBorder(null);
        add(telefonotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 240, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 240, 10));

        cuittext.setForeground(java.awt.Color.lightGray);
        cuittext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cuittext.setText("Cuit");
        cuittext.setBorder(null);
        cuittext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cuittextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cuittextFocusLost(evt);
            }
        });
        cuittext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cuittextKeyReleased(evt);
            }
        });
        add(cuittext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 240, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 240, 10));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el proveedor:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 190, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("idProveedor:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 100, -1));

        idtext.setEditable(false);
        idtext.setBackground(new java.awt.Color(255, 255, 255));
        idtext.setForeground(java.awt.Color.lightGray);
        idtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idtext.setText("idProveedor");
        idtext.setBorder(null);
        add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 10));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText(" Buscar ingresando cuit:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("  Razon social / Nombre:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Domicilio:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, -1));

        tooltipcuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        tooltipcuit.setToolTipText("Ingrese informacion a este campo!");
        add(tooltipcuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        paneMod.setBackground(new java.awt.Color(51, 0, 102));

        labelmod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelmod.setForeground(new java.awt.Color(255, 255, 255));
        labelmod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelmod.setText("Guardar modificacion");
        labelmod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelmodMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneModLayout = new javax.swing.GroupLayout(paneMod);
        paneMod.setLayout(paneModLayout);
        paneModLayout.setHorizontalGroup(
            paneModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneModLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmod, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paneModLayout.setVerticalGroup(
            paneModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneModLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(paneMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 130, 30));

        eliminarpan.setBackground(new java.awt.Color(102, 0, 0));

        eliminarlabel.setForeground(new java.awt.Color(255, 255, 255));
        eliminarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarlabel.setText("Refrescar");
        eliminarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eliminarpanLayout = new javax.swing.GroupLayout(eliminarpan);
        eliminarpan.setLayout(eliminarpanLayout);
        eliminarpanLayout.setHorizontalGroup(
            eliminarpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarpanLayout.createSequentialGroup()
                .addComponent(eliminarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        eliminarpanLayout.setVerticalGroup(
            eliminarpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarpanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(eliminarpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 120, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void cuittextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuittextFocusGained
        if(cuittext.getText().equals("Cuit")){
            cuittext.setText("");
            cuittext.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cuittextFocusGained

    private void cuittextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuittextFocusLost
        if(cuittext.getText().equals("")){
            cuittext.setText("Cuit");
            cuittext.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_cuittextFocusLost

    private void buscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProvActionPerformed
        if(!buscarProv.getSelectedItem().equals("Cuit / Nombre") && buscarProv.getSelectedItem() != null){
            nombretext.setEditable(true);
            domiciliotext.setEditable(true);
            telefonotext.setEditable(true);
            
            nombretext.setForeground(Color.BLACK);
            domiciliotext.setForeground(Color.BLACK);
            telefonotext.setForeground(Color.BLACK);
            String item = buscarProv.getSelectedItem().toString();
            String cuit = "";
                for(int i= 0 ; i<11;i++){
                    cuit += item.charAt(i);
                }
            mostrar(Long.parseLong(cuit));
        }else{
            Default();
        }
        
    }//GEN-LAST:event_buscarProvActionPerformed

    private void cuittextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuittextKeyReleased
        try{
        if(cuittext.getText().length() == 11){
             System.out.println(cuittext.getText());
             buscarProv.setSelectedItem(proveD.buscarProveedorPorcuit(Long.parseLong(cuittext.getText())).getCuit()
                     +" / "+
                     proveD.buscarProveedorPorcuit(Long.parseLong(cuittext.getText())).getRazonSocial());
             tooltipcuit.setVisible(false);
        }
        }catch(NullPointerException e){
           tooltipcuit.setToolTipText("El cuit ingresado no existe");
           tooltipcuit.setVisible(true);
       }catch(NumberFormatException e){
           tooltipcuit.setToolTipText("Ingrese solamente numeros!!!");
           tooltipcuit.setVisible(true);
       }
    }//GEN-LAST:event_cuittextKeyReleased

    private void labelmodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelmodMouseClicked

        Proveedor prove = new Proveedor();
        prove.setCuit(Long.parseLong(cuittext.getText()));
        prove.setRazonSocial(nombretext.getText());
        prove.setDomicilio(domiciliotext.getText());
        prove.setTelefono(telefonotext.getText());

        proveD.modificarProveedor(prove);
        
        cargar();
    }//GEN-LAST:event_labelmodMouseClicked

    private void eliminarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarlabelMouseClicked
        Default();
        
    }//GEN-LAST:event_eliminarlabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> buscarProv;
    private javax.swing.JTextField cuittext;
    private javax.swing.JTextField domiciliotext;
    private javax.swing.JLabel eliminarlabel;
    private javax.swing.JPanel eliminarpan;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelmod;
    private javax.swing.JLabel logolabel;
    private javax.swing.JTextField nombretext;
    private javax.swing.JPanel paneMod;
    private javax.swing.JTextField telefonotext;
    private javax.swing.JLabel tooltipcuit;
    // End of variables declaration//GEN-END:variables
}
