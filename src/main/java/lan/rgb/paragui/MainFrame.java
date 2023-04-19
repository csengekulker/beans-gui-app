/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lan.rgb.paragui;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class MainFrame extends javax.swing.JFrame {

    ArrayList<Employee> empList;
    Integer currentId;
    Connection conn;


    public MainFrame() {
        initComponents();
        empList = new ArrayList<Employee>();
        currentId = 0;
        readFile();
        loadEmployee(empList.get(currentId));
    }

    public void loadEmployee(Employee emp) {
        idField.setText(emp.id.toString());
        nameField.setText(emp.name);
        cityField.setText(emp.city);
        salaryField.setText(emp.salary.toString());
        birthField.setText(emp.birth.toString());
    }

    public void readFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }

    public void tryReadFile() throws FileNotFoundException {
        System.out.println("Feladat 01");
        File file = new File("dolgozok.csv");
        Scanner sc = new Scanner(file, "UTF-8");

        while (sc.hasNext()) {
            String line = sc.nextLine();

            String[] lineArray = line.split(",");

            Employee emp = new Employee(
                    Integer.parseInt(lineArray[0]),
                    lineArray[1],
                    lineArray[2],
                    Double.parseDouble(lineArray[3]),
                    LocalDate.parse(lineArray[4])
            );

            empList.add(emp);
        }

        sc.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        birthField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        storeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout());

        prevButton.setText("Előző");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        jPanel1.add(prevButton);

        nextButton.setText("Következő");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout());

        jLabel2.setText("Id:");
        jPanel2.add(jLabel2);

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel2.add(idField);

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout());

        jLabel3.setText("Név:");
        jPanel3.add(jLabel3);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel3.add(nameField);

        getContentPane().add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.GridLayout());

        jLabel4.setText("Város:");
        jPanel4.add(jLabel4);

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });
        jPanel4.add(cityField);

        getContentPane().add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout());

        jLabel5.setText("Fizetés:");
        jPanel5.add(jLabel5);

        salaryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryFieldActionPerformed(evt);
            }
        });
        jPanel5.add(salaryField);

        getContentPane().add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.GridLayout());

        jLabel6.setText("Születési idő:");
        jPanel6.add(jLabel6);

        birthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthFieldActionPerformed(evt);
            }
        });
        jPanel6.add(birthField);

        getContentPane().add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.GridLayout());

        storeButton.setText("Adatbázisba mentés");
        storeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeButtonActionPerformed(evt);
            }
        });
        jPanel7.add(storeButton);

        getContentPane().add(jPanel7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void salaryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryFieldActionPerformed

    private void birthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthFieldActionPerformed
    private void prevEmployee() {
        try {
            currentId--;

            loadEmployee(empList.get(currentId));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Nincs elozo dolgozo");
        }
    }

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        this.prevEmployee();
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextEmployee() {
        try {
            currentId++;

            loadEmployee(empList.get(currentId));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Nincs tobb dolgozo");
        }
    }

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        this.nextEmployee();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void tryStoreEmployee() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        Employee emp = retrieveEmployee();
        
        String url = "jdbc:mariadb://localhost:3306/para";
        conn = DriverManager.getConnection(url, "para", "titok");
        
        String query = "insert into employees" +
                "(name, city, salary, birth) values" +
                "(?, ?, ?, ?)";
        
        PreparedStatement pstmt = conn.prepareStatement(query);
        
        pstmt.setString(1, emp.name);
        pstmt.setString(2, emp.city);
        pstmt.setDouble(3, emp.salary);
        pstmt.setDate(4, java.sql.Date.valueOf(emp.birth));
        
        pstmt.execute();
        System.out.println("Mentve");
        conn.close();
        
    }
    
    private void storeEmployee() {
        try {
            tryStoreEmployee();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver nincs betoltve");
        } catch (SQLException e) {
            System.err.println("SQL hiba");
        }
        
    }
    
    private Employee retrieveEmployee() {
        
        return new Employee(
            Integer.parseInt(idField.getText()),
            nameField.getText(),
            cityField.getText(),
            Double.parseDouble(salaryField.getText()),
            LocalDate.parse(birthField.getText())
        );
    }
    
    private void storeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtonActionPerformed
        this.storeEmployee();
    }//GEN-LAST:event_storeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton storeButton;
    // End of variables declaration//GEN-END:variables
}
