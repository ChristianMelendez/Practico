/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;


public class Divisas extends javax.swing.JFrame {
    double eurocompra=20.15;
    double euroventa=20.312;
    
    double yencompra=0.155;
    double yenventa=0.155;
    
    double dolarcompra=16.98;
    double dolarventa=17.43;
    
    double pesouruguayocompra=2.850;
    double pesouruguayoventa=2.861;
    
    double libracompra=22.392;
    double libraventa=22.575;
    
    int d;
    double auxcantidad;
    
    public void seleccionlista(double a, double b){
        TxtCompra.setText(String.valueOf(a));
        TxtVenta.setText(String.valueOf(b));
    }
    public void ventadivisas(){
        Double compra=Double.parseDouble(TxtVenta.getText());
        Double cantidad=Double.parseDouble(TxtCantidad.getText());
        Double totalcompra=compra*cantidad;
        ABM_Cliente.cuenta[ABM_Cliente.i]-=totalcompra;
        d=CmbCompra.getSelectedIndex();
       switch(d){
           case 0:
               ABM_Cliente.euros[ABM_Cliente.i]+=cantidad;
               break;
           case 1:    
               ABM_Cliente.dolares[ABM_Cliente.i]+=cantidad;
               break;
           case 2:
               ABM_Cliente.yenes[ABM_Cliente.i]+=cantidad;
               break;
           case 3:
               ABM_Cliente.pesosuyu[ABM_Cliente.i]+=cantidad;
               break;
           case 4:
               ABM_Cliente.libras[ABM_Cliente.i]+=cantidad;
               break;
                 
    }
   
    }
    public void compradivisas(){
        Double venta=Double.parseDouble(TxtCompra.getText());
        Double cantidad=Double.parseDouble(TxtCantidad.getText());
        Double totalventa=venta*cantidad;
        auxcantidad=cantidad;
        ABM_Cliente.cuenta[ABM_Cliente.i]+=totalventa;
         d=CmbCompra.getSelectedIndex();
       switch(d){
           case 0:
               if(auxcantidad>ABM_Cliente.euros[ABM_Cliente.i]){
                   JOptionPane.showMessageDialog(null, "No puede vender esa cantidad");
               }
               else{
                   ABM_Cliente.euros[ABM_Cliente.i]-=cantidad;
               }
               break;
           case 1:    
               if(auxcantidad>ABM_Cliente.dolares[ABM_Cliente.i]){
                   JOptionPane.showMessageDialog(null, "No puede vender esa cantidad");
               }
               else{
                   ABM_Cliente.dolares[ABM_Cliente.i]-=cantidad;
               }
               break;
           case 2:
               if(auxcantidad>ABM_Cliente.yenes[ABM_Cliente.i]){
                   JOptionPane.showMessageDialog(null, "No puede vender esa cantidad");
               }
               else{
                   ABM_Cliente.yenes[ABM_Cliente.i]-=cantidad;
               }
               break;
           case 3:
               if(auxcantidad>ABM_Cliente.pesosuyu[ABM_Cliente.i]){
                   JOptionPane.showMessageDialog(null, "No puede vender esa cantidad");
               }
               else{
                   ABM_Cliente.pesosuyu[ABM_Cliente.i]-=cantidad;
               }
               break;
           case 4:
               if(auxcantidad>ABM_Cliente.libras[ABM_Cliente.i]){
                   JOptionPane.showMessageDialog(null, "No puede vender esa cantidad");
               }
               else{
                   ABM_Cliente.libras[ABM_Cliente.i]-=cantidad;
               }
               break;
                 
            }       
       }
       
    public void refresh(){
        LabelFondostotal.setText(String.valueOf("$"+ABM_Cliente.cuenta[ABM_Cliente.i]));
        LabelLibrascuenta.setText(String.valueOf("$"+ABM_Cliente.libras[ABM_Cliente.i]));
        LabelEuroscuenta.setText(String.valueOf("$"+ABM_Cliente.euros[ABM_Cliente.i]));
        LabelDolarescuenta.setText(String.valueOf("$"+ABM_Cliente.dolares[ABM_Cliente.i]));
        Labelpesosuyu.setText(String.valueOf("$"+ABM_Cliente.pesosuyu[ABM_Cliente.i]));
        LabelYenescuenta.setText(String.valueOf("$"+ABM_Cliente.yenes[ABM_Cliente.i]));
    }
    /**
     * Creates new form Modelo
     */
    public Divisas() {
        initComponents();
        LabelFondostotal.setText(String.valueOf("$"+ABM_Cliente.cuenta[ABM_Cliente.i]));
        LabelLibrascuenta.setText(String.valueOf("$"+ABM_Cliente.libras[ABM_Cliente.i]));
        LabelEuroscuenta.setText(String.valueOf("$"+ABM_Cliente.euros[ABM_Cliente.i]));
        LabelDolarescuenta.setText(String.valueOf("$"+ABM_Cliente.dolares[ABM_Cliente.i]));
        Labelpesosuyu.setText(String.valueOf("$"+ABM_Cliente.pesosuyu[ABM_Cliente.i]));
        LabelYenescuenta.setText(String.valueOf("$"+ABM_Cliente.yenes[ABM_Cliente.i]));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelLibra = new javax.swing.JLabel();
        TxtCompra = new javax.swing.JTextField();
        LabelCantidad = new javax.swing.JLabel();
        TxtVenta = new javax.swing.JTextField();
        CmbCompra = new javax.swing.JComboBox<>();
        BtnCompra = new javax.swing.JButton();
        BtnVenta = new javax.swing.JButton();
        TxtCantidad = new javax.swing.JTextField();
        LabelMonto2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        LabelMonto1 = new javax.swing.JLabel();
        LabelLibrascuenta = new javax.swing.JLabel();
        LabelYenes = new javax.swing.JLabel();
        LabelDolares = new javax.swing.JLabel();
        LabelPesosuruguayos = new javax.swing.JLabel();
        LabelFondostotal = new javax.swing.JLabel();
        LabelFondos = new javax.swing.JLabel();
        LabelEuros1 = new javax.swing.JLabel();
        LabelEuroscuenta = new javax.swing.JLabel();
        LabelDolarescuenta = new javax.swing.JLabel();
        LabelYenescuenta = new javax.swing.JLabel();
        Labelpesosuyu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(209, 173, 69)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLibra.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelLibra.setForeground(new java.awt.Color(255, 255, 255));
        LabelLibra.setText("Libra esterlina: ");
        jPanel1.add(LabelLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 30));

        TxtCompra.setText(" ");
        TxtCompra.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        TxtCompra.setEnabled(false);
        TxtCompra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TxtCompraPropertyChange(evt);
            }
        });
        jPanel1.add(TxtCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 250, 30));

        LabelCantidad.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LabelCantidad.setText("Cantidad: ");
        jPanel1.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 30));

        TxtVenta.setText(" ");
        TxtVenta.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        TxtVenta.setEnabled(false);
        jPanel1.add(TxtVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 250, 30));

        CmbCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euros", "Dolares", "Yenes", "Peso uruguayo", "Libra" }));
        CmbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCompraActionPerformed(evt);
            }
        });
        jPanel1.add(CmbCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        BtnCompra.setText("Vender");
        BtnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCompraActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 90, 30));

        BtnVenta.setText("Comprar");
        BtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, 30));
        jPanel1.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 90, 30));

        LabelMonto2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelMonto2.setForeground(new java.awt.Color(255, 255, 255));
        LabelMonto2.setText("Venta: ");
        jPanel1.add(LabelMonto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 80, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Divisas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 270, 50));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 70, 40));

        LabelMonto1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelMonto1.setForeground(new java.awt.Color(255, 255, 255));
        LabelMonto1.setText("Compra: ");
        jPanel1.add(LabelMonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 70, 30));

        LabelLibrascuenta.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelLibrascuenta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LabelLibrascuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, 30));

        LabelYenes.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelYenes.setForeground(new java.awt.Color(255, 255, 255));
        LabelYenes.setText("Yenes: ");
        jPanel1.add(LabelYenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 30));

        LabelDolares.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelDolares.setForeground(new java.awt.Color(255, 255, 255));
        LabelDolares.setText("Dolares: ");
        jPanel1.add(LabelDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 30));

        LabelPesosuruguayos.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelPesosuruguayos.setForeground(new java.awt.Color(255, 255, 255));
        LabelPesosuruguayos.setText("Peso UYU: ");
        jPanel1.add(LabelPesosuruguayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        LabelFondostotal.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelFondostotal.setForeground(new java.awt.Color(255, 255, 255));
        LabelFondostotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFondostotal.setText(" ");
        jPanel1.add(LabelFondostotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 180, 30));

        LabelFondos.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelFondos.setForeground(new java.awt.Color(255, 255, 255));
        LabelFondos.setText("Fondos: ");
        jPanel1.add(LabelFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 70, 30));

        LabelEuros1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelEuros1.setForeground(new java.awt.Color(255, 255, 255));
        LabelEuros1.setText("Euros: ");
        jPanel1.add(LabelEuros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, 30));

        LabelEuroscuenta.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelEuroscuenta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LabelEuroscuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, 30));

        LabelDolarescuenta.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelDolarescuenta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LabelDolarescuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, 30));

        LabelYenescuenta.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelYenescuenta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LabelYenescuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 170, 30));

        Labelpesosuyu.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Labelpesosuyu.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Labelpesosuyu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, 30));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("(Todas las compras y ventas son segun el peso argentino)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 400, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCompraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TxtCompraPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TxtCompraPropertyChange

    private void CmbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCompraActionPerformed
        // TODO add your handling code here:
       d=CmbCompra.getSelectedIndex();
       switch(d){
           case 0:
               seleccionlista(eurocompra,euroventa);
               break;
           case 1:    
               seleccionlista(dolarcompra,dolarventa);
               break;
           case 2:
               seleccionlista(yencompra,yenventa);
               break;
           case 3:
               seleccionlista(pesouruguayocompra,pesouruguayoventa);
               break;
           case 4:
               seleccionlista(libracompra,libraventa);
               break;
                 
    }
    }//GEN-LAST:event_CmbCompraActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Ingreso().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCompraActionPerformed
        // TODO add your handling code here:
        if(TxtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese algun monto");
        }else{
            compradivisas();
            refresh();
        }
    }//GEN-LAST:event_BtnCompraActionPerformed

    private void BtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentaActionPerformed
        // TODO add your handling code here:
        if(TxtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese algun monto");
        }else{
            ventadivisas();
            refresh();
        }
    }//GEN-LAST:event_BtnVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCompra;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVenta;
    private javax.swing.JComboBox<String> CmbCompra;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelDolares;
    private javax.swing.JLabel LabelDolarescuenta;
    private javax.swing.JLabel LabelEuros1;
    private javax.swing.JLabel LabelEuroscuenta;
    private javax.swing.JLabel LabelFondos;
    private javax.swing.JLabel LabelFondostotal;
    private javax.swing.JLabel LabelLibra;
    private javax.swing.JLabel LabelLibrascuenta;
    private javax.swing.JLabel LabelMonto1;
    private javax.swing.JLabel LabelMonto2;
    private javax.swing.JLabel LabelPesosuruguayos;
    private javax.swing.JLabel LabelYenes;
    private javax.swing.JLabel LabelYenescuenta;
    private javax.swing.JLabel Labelpesosuyu;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtCompra;
    private javax.swing.JTextField TxtVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
