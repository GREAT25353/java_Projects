/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class Student_Form extends javax.swing.JFrame {
Connection con;
PreparedStatement st;
String url,query,myId,myname,myfather,mycourse,mybranch;
    public Student_Form() {
        initComponents();
    }
    void connect() throws Exception{
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
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        father = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        courses = new javax.swing.JComboBox<>();
        branches = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(420, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        id.setBackground(new java.awt.Color(255, 255, 153));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 370, -1));

        name.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 370, -1));

        father.setBackground(new java.awt.Color(255, 255, 153));
        father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherActionPerformed(evt);
            }
        });
        getContentPane().add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 370, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Course name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Branch name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        courses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        courses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", " " }));
        getContentPane().add(courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 370, -1));

        branches.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branches.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EE", "ME", "ECE", "CE", "IT" }));
        getContentPane().add(branches, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 370, -1));

        Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/save-icon--1.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/red-x-mark-transparent-background-3.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/123456.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        try{
            connect();
            myId=id.getText();
            myname=name.getText();
            myfather=father.getText();
            mycourse=(String)courses.getSelectedItem();
            mybranch=(String)branches.getSelectedItem();
            query="insert into student_data(StudentId,name,Father_name,course_name,branch_name)" + "values(?,?,?,?,?)";
            st=con.prepareStatement(query);
            st.setString(1, myId);
            st.setString(2, myname);
            st.setString(3, myfather);
            st.setString(4, mycourse);
            st.setString(5, mybranch);
            int n=st.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(null, "Data Inserted");
                setVisible(false);
                new Student_Form().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error");
                setVisible(false);
                new Student_Form().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            setVisible(false);
            new Student_Form().setVisible(true);
        } 
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> branches;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> courses;
    private javax.swing.JTextField father;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
