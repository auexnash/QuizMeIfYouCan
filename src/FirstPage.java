
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class FirstPage extends javax.swing.JFrame {
    public FirstPage() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enter = new javax.swing.JButton();
        close1 = new javax.swing.JButton();
        AllStudentResultButtn = new javax.swing.JButton();
        aboutUs = new javax.swing.JButton();
        bgOne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(960, 540));

        enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enter.png"))); // NOI18N
        enter.setBorder(null);
        enter.setBorderPainted(false);
        enter.setContentAreaFilled(false);
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        close1.setBorder(null);
        close1.setBorderPainted(false);
        close1.setContentAreaFilled(false);
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });

        AllStudentResultButtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllStudentResult.png"))); // NOI18N
        AllStudentResultButtn.setBorder(null);
        AllStudentResultButtn.setBorderPainted(false);
        AllStudentResultButtn.setContentAreaFilled(false);
        AllStudentResultButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentResultButtnActionPerformed(evt);
            }
        });

        aboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about Us.png"))); // NOI18N
        aboutUs.setBorder(null);
        aboutUs.setBorderPainted(false);
        aboutUs.setContentAreaFilled(false);
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });

        bgOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/designs (18).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(enter))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(AllStudentResultButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(aboutUs))
            .addComponent(bgOne)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(enter)
                .addGap(108, 108, 108)
                .addComponent(AllStudentResultButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(aboutUs))
            .addComponent(bgOne)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        new SecondPage();
        this.dispose();
    }//GEN-LAST:event_enterActionPerformed

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_close1ActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        new AboutUsPage();
        this.dispose();
    }//GEN-LAST:event_aboutUsActionPerformed

    private void AllStudentResultButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentResultButtnActionPerformed
        new AllStudentResult();
        this.dispose();
    }//GEN-LAST:event_AllStudentResultButtnActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            FirstPage Firstframe = new FirstPage();;
            Firstframe.setVisible(true);
            Firstframe.pack();
            Firstframe.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllStudentResultButtn;
    private javax.swing.JButton aboutUs;
    private javax.swing.JLabel bgOne;
    private javax.swing.JButton close1;
    private javax.swing.JButton enter;
    // End of variables declaration//GEN-END:variables
}
