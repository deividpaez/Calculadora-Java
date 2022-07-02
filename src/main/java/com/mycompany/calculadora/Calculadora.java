
package com.mycompany.calculadora;

/**
 *
 * @author deivid
 */
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
          setLocationRelativeTo(null);
    }
    public void addText(String number){
        textOperacion.setText(number);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textOperacion = new javax.swing.JLabel();
        textoResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_porcentaje = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_potencia = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        button_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));

        textOperacion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        textOperacion.setForeground(new java.awt.Color(102, 102, 102));
        textOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        textoResultado.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(51, 51, 51));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(textOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(textOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoResultado)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_porcentaje.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setBorder(null);
        btn_porcentaje.setContentAreaFilled(false);
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 50));

        btn_igual.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setContentAreaFilled(false);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Web Master\\Desktop\\Calculadora-Java-main\\images\\btn3.png")); // NOI18N
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 60, 50));

        btn_9.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setContentAreaFilled(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, 50));

        btn_potencia.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_potencia.setText("^");
        btn_potencia.setBorder(null);
        btn_potencia.setContentAreaFilled(false);
        btn_potencia.setFocusPainted(false);
        btn_potencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_potencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_potencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, 50));

        btn_division.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_division.setText("/");
        btn_division.setBorder(null);
        btn_division.setContentAreaFilled(false);
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, 50));

        btn_multiplicacion.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_multiplicacion.setText("x");
        btn_multiplicacion.setBorder(null);
        btn_multiplicacion.setContentAreaFilled(false);
        btn_multiplicacion.setFocusPainted(false);
        btn_multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 60, 50));

        btn_resta.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setBorder(null);
        btn_resta.setContentAreaFilled(false);
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 60, 60));

        btn_suma.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.setContentAreaFilled(false);
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 60, 50));

        button_c.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        button_c.setIcon(new javax.swing.ImageIcon("C:\\Users\\Web Master\\Desktop\\Calculadora-Java-main\\images\\btn1.png")); // NOI18N
        button_c.setText("C");
        button_c.setBorder(null);
        button_c.setContentAreaFilled(false);
        button_c.setFocusable(false);
        button_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        button_c.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Web Master\\Desktop\\Calculadora-Java-main\\images\\btn1_pressed.png")); // NOI18N
        button_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cActionPerformed(evt);
            }
        });
        jPanel2.add(button_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 50));

        btn_7.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setContentAreaFilled(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Web Master\\Desktop\\Calculadora-Java-main\\images\\btn1_pressed.png")); // NOI18N
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 50));

        btn_4.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setContentAreaFilled(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 50));

        btn_5.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setContentAreaFilled(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 60, 50));

        btn_6.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setContentAreaFilled(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, 50));

        btn_1.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setContentAreaFilled(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 50));

        btn_2.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setContentAreaFilled(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, 50));

        btn_3.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setContentAreaFilled(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 60, 50));

        btn_8.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setContentAreaFilled(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 50));

        btn_0.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setContentAreaFilled(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 60, 50));

        btn_punto.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.setContentAreaFilled(false);
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 60, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void button_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cActionPerformed
        // TODO add your handling code here:
        
        textOperacion.setText("");
        textoResultado.setText("");
    }//GEN-LAST:event_button_cActionPerformed

    private void btn_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_potenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_potenciaActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        addText(textOperacion.getText()+"0");
    }//GEN-LAST:event_btn_0ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_potencia;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton button_c;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textOperacion;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
