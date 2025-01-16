
import java.util.ArrayList;

public class ThirdPage extends javax.swing.JFrame {
    public ThirdPage() {
        initComponents();
        this.setVisible(true);
    }

    ThirdPage(ArrayList<String> score) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identification = new javax.swing.JButton();
        returnbotm = new javax.swing.JButton();
        multiChoice = new javax.swing.JButton();
        close3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        identification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/identification.png"))); // NOI18N
        identification.setBorder(null);
        identification.setBorderPainted(false);
        identification.setContentAreaFilled(false);
        identification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificationActionPerformed(evt);
            }
        });

        returnbotm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        returnbotm.setBorder(null);
        returnbotm.setBorderPainted(false);
        returnbotm.setContentAreaFilled(false);
        returnbotm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbotmActionPerformed(evt);
            }
        });

        multiChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiple choice.png"))); // NOI18N
        multiChoice.setBorder(null);
        multiChoice.setBorderPainted(false);
        multiChoice.setContentAreaFilled(false);
        multiChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiChoiceActionPerformed(evt);
            }
        });

        close3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        close3.setBorder(null);
        close3.setBorderPainted(false);
        close3.setContentAreaFilled(false);
        close3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/designs (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(close3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(multiChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(returnbotm, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(identification, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(close3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(multiChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(returnbotm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(identification, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void identificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificationActionPerformed
        new IdentiFirstPage();
        this.dispose();
    }//GEN-LAST:event_identificationActionPerformed

    private void close3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_close3ActionPerformed

    private void returnbotmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbotmActionPerformed
        new SecondPage();
        this.dispose();
    }//GEN-LAST:event_returnbotmActionPerformed

    private void multiChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiChoiceActionPerformed
        new MCFirstPage();
        this.dispose();
    }//GEN-LAST:event_multiChoiceActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThirdPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close3;
    private javax.swing.JButton identification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiChoice;
    private javax.swing.JButton returnbotm;
    // End of variables declaration//GEN-END:variables
}
