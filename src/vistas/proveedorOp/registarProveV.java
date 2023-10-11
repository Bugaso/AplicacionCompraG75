/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.proveedorOp;

import accesoADatos.ProveedorData;
import entidades.Proveedor;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author Bugaso
 */
public class registarProveV extends javax.swing.JPanel {

    private ProveedorData provData = null;
    private Proveedor prov = null;
    public registarProveV() {
        initComponents();
        Estilo();
    }
    public void Estilo(){
        razonsocial.setText("Ingrese el nombre o razon social");
        razonsocial.setForeground(Color.LIGHT_GRAY);
        ((AbstractDocument) razonsocial.getDocument()).setDocumentFilter(new DocumentSizeFilter(36));
        tooltipnombre.setVisible(false);
        
        domiciliotext.setText("Ingrese el domicilio");
        domiciliotext.setForeground(Color.LIGHT_GRAY);
        ((AbstractDocument) domiciliotext.getDocument()).setDocumentFilter(new DocumentSizeFilter(36));
        tooltipdomicilio.setVisible(false);
        
        cuittext.setText("Ingrese el cuit");
        cuittext.setForeground(Color.LIGHT_GRAY);
        ((AbstractDocument) cuittext.getDocument()).setDocumentFilter(new DocumentSizeFilter(11));
        tooltipcuit.setVisible(false);
        
        telefonotext.setText("Ingrese el telefono");
        telefonotext.setForeground(Color.LIGHT_GRAY);
        ((AbstractDocument) telefonotext.getDocument()).setDocumentFilter(new DocumentSizeFilter(15));
        tooltiptelefono.setVisible(false);
        
        
    }
    public void Guardar(){
        
        provData = new ProveedorData();
        prov = new Proveedor();
        Proveedor provB = new Proveedor();
        provB = provData.buscarProveedorPorcuit(Integer.parseInt(cuittext.getText()));
        prov.setCuit(Integer.parseInt(cuittext.getText()));
        prov.setDomicilio( domiciliotext.getText());
        prov.setRazonSocial(razonsocial.getText());
        prov.setTelefono(telefonotext.getText());
        if(provB != null){
            if(provB.getCuit() == prov.getCuit()){
                System.out.println("El proveedor ya existe");
                JOptionPane.showMessageDialog(null, "Ya existe un proveedor con el cuit = " + provB.getCuit());
            }
        }else{
                provData.guardarProveedor(prov);
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        razonsocial1 = new javax.swing.JTextField();
        razonsociallabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        razonsocial = new javax.swing.JTextField();
        razonsociallabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cuittext = new javax.swing.JTextField();
        cuitlabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        domiciliotext = new javax.swing.JTextField();
        domiciliolabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        telefonotext = new javax.swing.JTextField();
        telefonolabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        guardarPane = new javax.swing.JPanel();
        guardarlabel = new javax.swing.JLabel();
        refrescarPane = new javax.swing.JPanel();
        borrarlabel = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();
        tooltipcuit = new javax.swing.JLabel();
        tooltipnombre = new javax.swing.JLabel();
        tooltipdomicilio = new javax.swing.JLabel();
        tooltiptelefono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        razonsocial1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        razonsocial1.setText("razon social");
        razonsocial1.setBorder(null);

        razonsociallabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        razonsociallabel1.setForeground(new java.awt.Color(0, 0, 0));
        razonsociallabel1.setText("Razon social / Nombre");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(790, 680));
        setMinimumSize(new java.awt.Dimension(790, 680));
        setPreferredSize(new java.awt.Dimension(790, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Proveedor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 70, 374, -1));

        razonsocial.setForeground(java.awt.Color.lightGray);
        razonsocial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        razonsocial.setText("razon social");
        razonsocial.setToolTipText("");
        razonsocial.setBorder(null);
        razonsocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                razonsocialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                razonsocialFocusLost(evt);
            }
        });
        add(razonsocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 260, 20));

        razonsociallabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        razonsociallabel.setForeground(new java.awt.Color(0, 0, 0));
        razonsociallabel.setText("Razon social / Nombre");
        add(razonsociallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 160, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 260, 10));

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
        add(cuittext, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 260, 20));

        cuitlabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cuitlabel.setForeground(new java.awt.Color(0, 0, 0));
        cuitlabel.setText("Cuit");
        add(cuitlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 30, 40));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 260, 10));

        domiciliotext.setForeground(java.awt.Color.lightGray);
        domiciliotext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        domiciliotext.setText("domicilio");
        domiciliotext.setBorder(null);
        domiciliotext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                domiciliotextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                domiciliotextFocusLost(evt);
            }
        });
        add(domiciliotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 260, 20));

        domiciliolabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        domiciliolabel.setForeground(new java.awt.Color(0, 0, 0));
        domiciliolabel.setText("Domicilio");
        add(domiciliolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, 40));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, 10));

        telefonotext.setForeground(java.awt.Color.lightGray);
        telefonotext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telefonotext.setText("Telefono");
        telefonotext.setBorder(null);
        telefonotext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonotextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonotextFocusLost(evt);
            }
        });
        add(telefonotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 260, 20));

        telefonolabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        telefonolabel.setForeground(new java.awt.Color(0, 0, 0));
        telefonolabel.setText("Telefono");
        add(telefonolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 70, 40));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 260, 10));

        guardarPane.setBackground(new java.awt.Color(0, 51, 51));
        guardarPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        guardarlabel.setBackground(new java.awt.Color(204, 204, 204));
        guardarlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        guardarlabel.setForeground(new java.awt.Color(255, 255, 255));
        guardarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarlabel.setText("Guardar");
        guardarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout guardarPaneLayout = new javax.swing.GroupLayout(guardarPane);
        guardarPane.setLayout(guardarPaneLayout);
        guardarPaneLayout.setHorizontalGroup(
            guardarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        guardarPaneLayout.setVerticalGroup(
            guardarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        add(guardarPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 110, 30));

        refrescarPane.setBackground(new java.awt.Color(102, 0, 0));
        refrescarPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrarlabel.setBackground(new java.awt.Color(255, 255, 255));
        borrarlabel.setForeground(new java.awt.Color(255, 255, 255));
        borrarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrarlabel.setText("Borrar campos");
        borrarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrarlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrarlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout refrescarPaneLayout = new javax.swing.GroupLayout(refrescarPane);
        refrescarPane.setLayout(refrescarPaneLayout);
        refrescarPaneLayout.setHorizontalGroup(
            refrescarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        refrescarPaneLayout.setVerticalGroup(
            refrescarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        add(refrescarPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 110, 30));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1602174810825.jpeg"))); // NOI18N
        add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        tooltipcuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        tooltipcuit.setToolTipText("Porfabor ingrese correctamente los datos");
        add(tooltipcuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        tooltipnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        tooltipnombre.setToolTipText("Ingrese informacion a este campo!");
        add(tooltipnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        tooltipdomicilio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        tooltipdomicilio.setToolTipText("Ingrese informacion a este campo!");
        add(tooltipdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        tooltiptelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        tooltiptelefono.setToolTipText("Porfabor ingrese correctamente los datos");
        add(tooltiptelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel2.setText("@2023 TeamG75");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void borrarlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarlabelMouseEntered
        Color btn = new Color(162,0,0);
        refrescarPane.setBackground(btn);
    }//GEN-LAST:event_borrarlabelMouseEntered

    private void borrarlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarlabelMouseExited
       Color btn = new Color(102,0,0);
       refrescarPane.setBackground(btn);
    }//GEN-LAST:event_borrarlabelMouseExited

    private void guardarlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarlabelMouseEntered
        Color btn = new Color(0,101,101);
        guardarPane.setBackground(btn);
    }//GEN-LAST:event_guardarlabelMouseEntered

    private void guardarlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarlabelMouseExited
        Color btn = new Color(0,51,51);
        guardarPane.setBackground(btn);
    }//GEN-LAST:event_guardarlabelMouseExited

    private void borrarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarlabelMouseClicked
        Estilo();
    }//GEN-LAST:event_borrarlabelMouseClicked

    private void razonsocialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razonsocialFocusGained
        if(razonsocial.getText().equals("Ingrese el nombre o razon social")){
            razonsocial.setText("");
            razonsocial.setForeground(Color.black);
        }
    }//GEN-LAST:event_razonsocialFocusGained

    private void razonsocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razonsocialFocusLost
        if(razonsocial.getText().equals("")){
            razonsocial.setText("Ingrese el nombre o razon social");
            razonsocial.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_razonsocialFocusLost

    private void domiciliotextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_domiciliotextFocusGained
        if(domiciliotext.getText().equals("Ingrese el domicilio")){
            domiciliotext.setText("");
            domiciliotext.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_domiciliotextFocusGained

    private void domiciliotextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_domiciliotextFocusLost
            if(domiciliotext.getText().equals("")){
                domiciliotext.setText("Ingrese el domicilio");
                domiciliotext.setForeground(Color.LIGHT_GRAY);
            }
    }//GEN-LAST:event_domiciliotextFocusLost

    private void telefonotextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonotextFocusGained
            if(telefonotext.getText().equals("Ingrese el telefono")){
                telefonotext.setText("");
                telefonotext.setForeground(Color.BLACK);
            }
    }//GEN-LAST:event_telefonotextFocusGained

    private void telefonotextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonotextFocusLost
            if(telefonotext.getText().equals("")){
                telefonotext.setText("Ingrese el telefono");
                telefonotext.setForeground(Color.LIGHT_GRAY);
            }
    }//GEN-LAST:event_telefonotextFocusLost

    private void cuittextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuittextFocusGained
            if(cuittext.getText().equals("Ingrese el cuit")){
                 cuittext.setText("");
                 cuittext.setForeground(Color.BLACK);
            }
    }//GEN-LAST:event_cuittextFocusGained

    private void cuittextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuittextFocusLost
            if(cuittext.getText().equals("")){
                cuittext.setText("Ingrese el cuit");
                cuittext.setForeground(Color.LIGHT_GRAY);
            }
    }//GEN-LAST:event_cuittextFocusLost

    private void guardarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarlabelMouseClicked
        
        int cont = 0;
       
        try{
            Integer.parseInt(cuittext.getText());
            tooltipcuit.setVisible(false);
            cont++;
        }catch(NumberFormatException e){
            tooltipcuit.setVisible(true);
            if(cuittext.getText().equals("")|| cuittext.getText().equals("Ingrese el cuit")){
                tooltipcuit.setToolTipText("Ingrese informacion a este campo!");
            }else{
                 tooltipcuit.setToolTipText("Solo debe ingresar numeros sin espacios!");
            }
           
            cuittext.setForeground(Color.RED);
            cont = 0;
        }try{

            Integer.parseInt(telefonotext.getText());
            tooltiptelefono.setVisible(false);
            cont++;
        }catch(NumberFormatException e){
            tooltiptelefono.setVisible(true);
            if(telefonotext.getText().equals("")||telefonotext.getText().equals("Ingrese el telefono")){
                tooltiptelefono.setToolTipText("Ingrese informacion a este campo!");
            }else{
                tooltiptelefono.setToolTipText("Solo debe ingresar numeros sin espacios!");
            }
            
            telefonotext.setForeground(Color.red);
            cont = 0;
        }
        
       if(razonsocial.getForeground().equals(Color.LIGHT_GRAY)||razonsocial.getText().equals("")){
           tooltipnombre.setVisible(true);
           cont = 0;
       }else{
           cont++;
           tooltipnombre.setVisible(false);
       }
       if(domiciliotext.getForeground().equals(Color.LIGHT_GRAY) || domiciliotext.getText().equals("")){
           tooltipdomicilio.setVisible(true);
           cont = 0;
       }else{
           cont++;
           tooltipdomicilio.setVisible(false);
       }
       if(cont == 4){
          Guardar();
       }
       
       
    }//GEN-LAST:event_guardarlabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borrarlabel;
    private javax.swing.JLabel cuitlabel;
    private javax.swing.JTextField cuittext;
    private javax.swing.JLabel domiciliolabel;
    private javax.swing.JTextField domiciliotext;
    private javax.swing.JPanel guardarPane;
    private javax.swing.JLabel guardarlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logolabel;
    private javax.swing.JTextField razonsocial;
    private javax.swing.JTextField razonsocial1;
    private javax.swing.JLabel razonsociallabel;
    private javax.swing.JLabel razonsociallabel1;
    private javax.swing.JPanel refrescarPane;
    private javax.swing.JLabel telefonolabel;
    private javax.swing.JTextField telefonotext;
    private javax.swing.JLabel tooltipcuit;
    private javax.swing.JLabel tooltipdomicilio;
    private javax.swing.JLabel tooltipnombre;
    private javax.swing.JLabel tooltiptelefono;
    // End of variables declaration//GEN-END:variables
}
