/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class New_Books extends javax.swing.JFrame {
Connection con;
PreparedStatement st;
String url,query,BookId,BookName,Publisher,Price,Year;
    public New_Books() {
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
        jLabel5 = new javax.swing.JLabel();
        idBook = new javax.swing.JTextField();
        nameBook = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        year2 = new javax.swing.JTextField();
        saveBook = new javax.swing.JButton();
        closeBook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(420, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Published Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        idBook.setBackground(new java.awt.Color(255, 255, 153));
        idBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBookActionPerformed(evt);
            }
        });
        getContentPane().add(idBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 370, -1));

        nameBook.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(nameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 370, -1));

        publisher.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 370, -1));

        price.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 370, -1));

        year2.setBackground(new java.awt.Color(255, 255, 153));
        year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year2ActionPerformed(evt);
            }
        });
        getContentPane().add(year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 370, -1));

        saveBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/save-icon--1.png"))); // NOI18N
        saveBook.setText("Save");
        saveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBookActionPerformed(evt);
            }
        });
        getContentPane().add(saveBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        closeBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeBook.setText("Close");
        closeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBookActionPerformed(evt);
            }
        });
        getContentPane().add(closeBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/123456.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBookActionPerformed

    private void year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year2ActionPerformed

    private void saveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBookActionPerformed
        // TODO add your handling code here:
        try{
            connect();
            BookId=idBook.getText();
            BookName=nameBook.getText();
            Publisher=publisher.getText();
            Price=price.getText();
            Year=year2.getText();
            query="insert into book_data(bookId,name,publisher,price,published_Year)" + "values(?,?,?,?,?)";
            st=con.prepareStatement(query);
            st.setString(1,BookId);
            st.setString(2,BookName);
            st.setString(3,Publisher);
            st.setString(4,Price);
            st.setString(5,Year);
            int n=st.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(null ,"Data inserted");
                setVisible(false);
                new New_Books().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null ,"Error");
                setVisible(false);
                new New_Books().setVisible(true);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null ,e);
            setVisible(false);
            new New_Books().setVisible(true);
        }
    }//GEN-LAST:event_saveBookActionPerformed

    private void closeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBookActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeBookActionPerformed

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
            java.util.logging.Logger.getLogger(New_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBook;
    private javax.swing.JTextField idBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameBook;
    private javax.swing.JTextField price;
    private javax.swing.JTextField publisher;
    private javax.swing.JButton saveBook;
    private javax.swing.JTextField year2;
    // End of variables declaration//GEN-END:variables
}
