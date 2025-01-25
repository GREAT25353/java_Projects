/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;

import java.sql.*;
import javax.swing.JOptionPane;
public class return_book extends javax.swing.JFrame {

    Connection con;
    PreparedStatement st;
    String url,query,Bo1,stu4,iss5,duel4,retr2;
    public return_book() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        B1 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        i4 = new javax.swing.JTextField();
        dd4 = new javax.swing.JTextField();
        searching = new javax.swing.JButton();
        return2 = new javax.swing.JButton();
        closer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        B1.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 380, -1));

        s1.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 380, -1));

        i4.setBackground(new java.awt.Color(255, 255, 153));
        i4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i4ActionPerformed(evt);
            }
        });
        getContentPane().add(i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 380, -1));

        dd4.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(dd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 380, -1));

        searching.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/search.png"))); // NOI18N
        searching.setText("Search");
        searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingActionPerformed(evt);
            }
        });
        getContentPane().add(searching, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        return2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        return2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/return book png.png"))); // NOI18N
        return2.setText("Return");
        return2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return2ActionPerformed(evt);
            }
        });
        getContentPane().add(return2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        closer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/red-x-mark-transparent-background-3.png"))); // NOI18N
        closer.setText("Close");
        closer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closerActionPerformed(evt);
            }
        });
        getContentPane().add(closer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/123456.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void i4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i4ActionPerformed

    private void closerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closerActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closerActionPerformed

    private void searchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingActionPerformed
        // TODO add your handling code here:
        try{
            connect();
            Bo1=B1.getText();
            stu4=s1.getText();
            query="select * from issue_data where bookId=? and studentId=?";
            st=con.prepareStatement(query);
            st.setString(1,Bo1);
            st.setString(2,stu4);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                iss5=rs.getString(3);
                duel4=rs.getString(4);
                i4.setText(iss5);
                dd4.setText(duel4);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book is not issue to this student");
                setVisible(false);
                new return_book().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchingActionPerformed

    private void return2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return2ActionPerformed
        // TODO add your handling code here:
        try{
            connect();
            Bo1=B1.getText();
            stu4=s1.getText();
            query="update issue_data set returnBook='YES' where bookId=? and studentId=?";
            st=con.prepareStatement(query);
            st.setString(1,Bo1);
            st.setString(2,stu4);
            int n=st.executeUpdate();
             if(n>0)
            {
                JOptionPane.showMessageDialog(null,"Book Successfully returned");
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
        }
    }//GEN-LAST:event_return2ActionPerformed

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
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new return_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B1;
    private javax.swing.JButton closer;
    private javax.swing.JTextField dd4;
    private javax.swing.JTextField i4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton return2;
    private javax.swing.JTextField s1;
    private javax.swing.JButton searching;
    // End of variables declaration//GEN-END:variables
}
