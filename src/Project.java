package BothoUlni;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.lang.String;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jomo Duncan Matswididi
 */
public class Project extends javax.swing.JFrame {

    /**
     * Creates new form Project
     */
    public Project() {
        initComponents();
        this.setLocationRelativeTo(null);
         EnglishLanguage();
    }
public void EnglishLanguage(){
     ArrayList<String> EnglishLanguage = new ArrayList<>();
        EnglishLanguage.add("Hello");
        EnglishLanguage.add("Goodnight");
        EnglishLanguage.add("Evening");
        EnglishLanguage.add("Good");
        EnglishLanguage.add("Sleep");
        EnglishLanguage.add("Car");
        EnglishLanguage.add("Handsome");
        EnglishLanguage.add("Boy");
        EnglishLanguage.add("Hell");
        EnglishLanguage.add("Help");
        EnglishLanguage.add("Girl");
        EnglishLanguage.add("Love");
        EnglishLanguage.add("Food");
        EnglishLanguage.add("Eat");
        EnglishLanguage.add("Plane");
        System.out.println("Words stored in ArrayList");
        System.out.println(EnglishLanguage);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TRANSLATOR");

        jTextField1.setText(" ");

        jTextField2.setEditable(true);
        jTextField2.setText(" ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("SEARCH");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SETSWANA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("FRENCH");

        jTextField3.setEditable(true);
        jTextField3.setText(" ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("OUTCOME");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jTextField3)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            if(jTextField1.getText() == "Hello"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Dumela");
                jTextField3.setText("bonjour");
            }
            if(jTextField1.getText() == "GoodNight"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Boroko");
                jTextField3.setText("Bonsoir");
            }
            if(jTextField1.getText() == "Evening"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Maitseboa");
                jTextField3.setText("soirée");
            }
            if(jTextField1.getText() == "Beautiful"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Bontle");
                jTextField3.setText("Belle");
            }
            if(jTextField1.getText() == "Sleep"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Robala");
                jTextField3.setText("Dormir");
            }
            if(jTextField1.getText() == "Car"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Koloi");
                jTextField3.setText("Auto");
            }
            if(jTextField1.getText() == "Handsome"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Lekau");
                jTextField3.setText("Belle");
            }
            if(jTextField1.getText() == "Boy"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Mosimane");
                jTextField3.setText("Garçon");
            }
            if(jTextField1.getText() == "Hell"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Molelo");
                jTextField3.setText("Enfer");
            }
            if(jTextField1.getText() == "Help"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Thuso");
                jTextField3.setText("Aider");
            }
            if(jTextField1.getText() == "Girl"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Mosetsana");
                jTextField3.setText("Fille");
            }
            if(jTextField1.getText() == "Love"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Lorato");
                jTextField3.setText("Aimer");
            }
            if(jTextField1.getText() == "Food"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Dijo");
                jTextField3.setText("Aliments");
            }
            if(jTextField1.getText() == "Eat"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Ja");
                jTextField3.setText("Manger");
            }
            if(jTextField1.getText() == "Plane"){
                JOptionPane.showMessageDialog(null, "Done");
                jTextField2.setText("Sefofane");
                jTextField3.setText("Avion");
            }
            else{
                JOptionPane.showMessageDialog(null, "Word"+ jTextField1.getText()+ " Is not Available in Library");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
