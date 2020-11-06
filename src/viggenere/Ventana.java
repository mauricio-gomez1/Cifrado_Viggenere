package viggenere;

import java.awt.Color;

public class Ventana extends javax.swing.JFrame {

    char tablaCesar[]={'A', 'B', 'C', 'D', 'E', 'F',
                        'G', 'H', 'I', 'J', 'K', 'L', 
                        'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    public Ventana() {
        initComponents();
        err.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clave = new javax.swing.JTextField();
        texto = new javax.swing.JTextField();
        resul = new javax.swing.JTextField();
        cifrar = new javax.swing.JButton();
        decifrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA");
        setBackground(new java.awt.Color(255, 192, 203));

        clave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        texto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        resul.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        resul.setFocusable(false);

        cifrar.setBackground(new java.awt.Color(0, 0, 0));
        cifrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cifrar.setForeground(new java.awt.Color(255, 255, 255));
        cifrar.setText("Cifrar");
        cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarActionPerformed(evt);
            }
        });

        decifrar.setBackground(new java.awt.Color(0, 0, 0));
        decifrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        decifrar.setForeground(new java.awt.Color(255, 255, 255));
        decifrar.setText("Decifrar");
        decifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decifrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CLAVE");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TEXTO ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CIFRADO");

        err.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setText("El texto no puede ser mas pequeño o igual de largo que la clave");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("CIFRADO VIGGENERE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(err)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clave, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                                .addComponent(texto)))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cifrar)
                        .addGap(131, 131, 131)
                        .addComponent(decifrar)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cifrar)
                    .addComponent(decifrar))
                .addGap(39, 39, 39)
                .addComponent(err)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarActionPerformed
        Vigikawaii en = new Vigikawaii();
        String text = texto.getText().toUpperCase();
        String clav = clave.getText().toUpperCase();
        if(validar()){
            resul.setText(en.encriptarTextoClaro(text, clav));
            //No inventes solo es una suma
        }else{
            err.setVisible(true);
        }
    }//GEN-LAST:event_cifrarActionPerformed

    private void decifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decifrarActionPerformed
        Vigikawaii en = new Vigikawaii();
        String text = texto.getText().toUpperCase();
        String clav = clave.getText().toUpperCase();
        if(validar()){
            resul.setText(en.desencriptarTextoClaro(text, clav));
        }else{
            err.setVisible(true);
        }
    }//GEN-LAST:event_decifrarActionPerformed

    public boolean validar(){
        boolean s=true;
        String clav=clave.getText().toUpperCase();
        int ind = 0;
        for (int i = 0; i < clave.getText().length(); i++) {
            for (int j = 0; j < tablaCesar.length; j++) {
                if(clav.charAt(i) == tablaCesar[j]){
                    ind++;
                    break;
                }
            }
        }
        if(ind!=clav.length()){
            s=false;
            err.setText("Clave no valida");
        }
        if(texto.getText().length()>clave.getText().length()){
            err.setVisible(false);
        }else{
            s=false;
        }
        if(texto.getText().isEmpty() || clave.getText().isEmpty()){
            err.setText("Ingrese datos en los campos texto y clave");
        }
        return s;
    }
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cifrar;
    private javax.swing.JTextField clave;
    private javax.swing.JButton decifrar;
    private javax.swing.JLabel err;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField resul;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
