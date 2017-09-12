package Formularios;


import javax.swing.JOptionPane;
public class Extraccion extends javax.swing.JFrame {

    long monto=0;
    long totalcaja=0;
    long debito=0;
    long [] cuenta=new long[10];//Se pueden crear un máximo de 10 cuentas
    long auxcuenta=0;
    int contadormonto=0;
    final String bienvenida="Bienvenido/a, ";
    String [] nombre=new String [10];
    int j=0;
    
    
    public Extraccion() {
        initComponents();
        //cuenta[0]=0;
        /*
        j=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de usuario"+" (Inicial= 0 y max:"+k));
        LabelEstadoCuenta.setText(String.valueOf("$"+cuenta[j]));
        LabelEstadoCuenta.setVisible(false);
        LabelBienvenida.setText(bienvenida+ABM_Cliente.nombre[ABM_Cliente.i]);
        */
        LabelEstadoCuenta.setText(String.valueOf("$"+cuenta[ABM_Cliente.i]));
        LabelEstadoCuenta.setVisible(false);
        this.setLocationRelativeTo(null);
        LabelBienvenida.setText(bienvenida+ABM_Cliente.nombre[ABM_Cliente.i]);
        
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
        LabelMonto = new javax.swing.JLabel();
        LabelDebito = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        TxtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtDebito = new javax.swing.JTextField();
        LabelEstadoTitulo = new javax.swing.JLabel();
        LabelEstadoCuenta = new javax.swing.JLabel();
        BtnDebitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelBienvenida = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        BtnVerEstado = new javax.swing.JButton();
        BtnMenuprincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero automatico");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(209, 173, 69)));
        jPanel1.setPreferredSize(new java.awt.Dimension(681, 379));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelMonto.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelMonto.setForeground(new java.awt.Color(255, 255, 255));
        LabelMonto.setText("Monto : ");
        jPanel1.add(LabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 30));

        LabelDebito.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LabelDebito.setForeground(new java.awt.Color(255, 255, 255));
        LabelDebito.setText("Debito : ");
        jPanel1.add(LabelDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBanco.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 270, 220));

        BtnAgregar.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        TxtMonto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(TxtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 150, 30));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 3, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Legacy Bank");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 310, 50));
        jPanel1.add(TxtDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 160, 30));

        LabelEstadoTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEstadoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelEstadoTitulo.setText("Estado de la cuenta:");
        jPanel1.add(LabelEstadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 30));

        LabelEstadoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        LabelEstadoCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelEstadoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 150, 30));

        BtnDebitar.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        BtnDebitar.setText("Debitar");
        BtnDebitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDebitarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnDebitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 110, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 290, -1));

        LabelBienvenida.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        LabelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        LabelBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 280, 30));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        BtnVerEstado.setText("Ver");
        BtnVerEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVerEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        BtnMenuprincipal.setText("Menu principal");
        BtnMenuprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuprincipalActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMenuprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
        if(TxtMonto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese algun monto a ingresar");
        }
        else{
            monto=Long.parseLong(this.TxtMonto.getText());
            cuenta[ABM_Cliente.i]+=monto;
            auxcuenta=cuenta[ABM_Cliente.i];
            LabelEstadoCuenta.setText(String.valueOf("$"+cuenta[ABM_Cliente.i]));
            TxtMonto.setText("");
            monto=0;
            contadormonto++;
            if (contadormonto==10){
                 JOptionPane.showMessageDialog(null,"Usted superó el limite de ingresos disponibles");
                 BtnAgregar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnDebitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDebitarActionPerformed
        // TODO add your handling code here:
        if(TxtDebito.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese algun monto a debitar");
        }
        else{
            if(cuenta[ABM_Cliente.i]==0){
                JOptionPane.showMessageDialog(null,"No puede debitar mas dinero");
            }
            else{
                debito=Long.parseLong(this.TxtDebito.getText());
                auxcuenta-=debito;
                if (auxcuenta<0){
                    JOptionPane.showMessageDialog(null,"No puede debitar esa cantidad");
                }
                else{    
                     cuenta[ABM_Cliente.i]-=debito;
                     auxcuenta=cuenta[ABM_Cliente.i];
                     debito=0;
                     LabelEstadoCuenta.setText(String.valueOf("$"+cuenta[ABM_Cliente.i]));
                     TxtDebito.setText("");
  
                }
            }
        }
    }//GEN-LAST:event_BtnDebitarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnVerEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerEstadoActionPerformed
        // TODO add your handling code here:
        if (LabelEstadoCuenta.isVisible()){
        LabelEstadoCuenta.setVisible(false);
        }
        else{
            LabelEstadoCuenta.setVisible(true);
        }
    }//GEN-LAST:event_BtnVerEstadoActionPerformed

    private void BtnMenuprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuprincipalActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new InicioAplicacion().setVisible(true);
    }//GEN-LAST:event_BtnMenuprincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Extraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extraccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extraccion().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnDebitar;
    private javax.swing.JButton BtnMenuprincipal;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVerEstado;
    private javax.swing.JLabel LabelBienvenida;
    private javax.swing.JLabel LabelDebito;
    private javax.swing.JLabel LabelEstadoCuenta;
    private javax.swing.JLabel LabelEstadoTitulo;
    private javax.swing.JLabel LabelMonto;
    private javax.swing.JTextField TxtDebito;
    private javax.swing.JTextField TxtMonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
