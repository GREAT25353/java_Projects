/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class issue_books extends javax.swing.JFrame {

    Connection con;
    PreparedStatement st;
    String url,query,Booker,Studentid2,Issuer3,Duerel,returner;
    public issue_books() {
        initComponents();
    }

    void connect() throws Exception
    {
        url="jdbc:mysql://localhost:3306/libraries";
        con=DriverManager.getConnection(url,"root","root");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idBooker = new javax.swing.JTextField();
        idStud = new javax.swing.JTextField();
        DateIssue2 = new com.toedter.calendar.JDateChooser();
        Dater3 = new com.toedter.calendar.JDateChooser();
        Issuer = new javax.swing.JButton();
        CkoseIssue = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(420, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        idBooker.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(idBooker, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 400, -1));

        idStud.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(idStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 400, -1));

        DateIssue2.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(DateIssue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 400, -1));

        Dater3.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(Dater3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 400, -1));

        Issuer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Issuer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/issue book.png"))); // NOI18N
        Issuer.setText("Issue");
        Issuer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuerActionPerformed(evt);
            }
        });
        getContentPane().add(Issuer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        CkoseIssue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CkoseIssue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/red-x-mark-transparent-background-3.png"))); // NOI18N
        CkoseIssue.setText("Close");
        CkoseIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkoseIssueActionPerformed(evt);
            }
        });
        getContentPane().add(CkoseIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/123456.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CkoseIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkoseIssueActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CkoseIssueActionPerformed

    private void IssuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuerActionPerformed
        // TODO add your handling code here:
         
        try{
            connect();
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            Booker=idBooker.getText();
            Studentid2=idStud.getText();
            Issuer3=dFormat.format(DateIssue2.getDate());
            Duerel=dFormat.format(Dater3.getDate());
            returner="NO";
            query="insert into issue_data(bookId,studentId,IssueDate,DueDate,returnBook)" + "values(?,?,?,?,?)";
            st=con.prepareStatement(query);
            st.setString(1,Booker);
            st.setString(2,Studentid2);
            st.setString(3,Issuer3);
            st.setString(4,Duerel);
            st.setString(5,returner);
            int n=st.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(null,"Data inserted");
                setVisible(false);
                new issue_books().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error");
                setVisible(false);
                new issue_books().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            setVisible(false);
            new issue_books().setVisible(true);
        }
    }//GEN-LAST:event_IssuerActionPerformed

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
            java.util.logging.Logger.getLogger(issue_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue_books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CkoseIssue;
    private com.toedter.calendar.JDateChooser DateIssue2;
    private com.toedter.calendar.JDateChooser Dater3;
    private javax.swing.JButton Issuer;
    private javax.swing.JTextField idBooker;
    private javax.swing.JTextField idStud;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
