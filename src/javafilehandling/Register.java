/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafilehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * @author 2ndyrGroupA
 */
public class Register extends javax.swing.JFrame {
    String fname;
    String lname;
    String Email;
    String pass;
    ArrayList<ArrayList> information = new ArrayList();
   
    public void submit() {
        System.out.println("writing...");
        Path path = Paths.get("C:\\Users\\2ndyrGroupA\\Desktop\\Register.txt");
        try {
//            Files.write(path, String.format("%d\t%s\t%s\n", id, username, password).getBytes(), StandardOpenOption.APPEND);
            for(ArrayList a : information){
//                a.get(0);
                Files.write(path, (String.format("%s\t\t%s\t\t%s\t\t%s\n",a.get(0),a.get(1),a.get(2),a.get(3))).getBytes(), StandardOpenOption.APPEND);
            }
            System.out.println("Details has been added!");
        } catch (RuntimeException re) {
            System.out.println(re);
        } catch (IOException ie) {
            System.out.println(ie);
        }
    }
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fn2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        register = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        repeat = new javax.swing.JLabel();
        fn3 = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        lnlabel = new javax.swing.JTextField();
        fnlabel = new javax.swing.JTextField();
        emaillabel = new javax.swing.JTextField();
        pass2field = new javax.swing.JPasswordField();
        pass1field = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        fn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fn2.setText("Firstname :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        register.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        register.setText("Register");

        ln.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ln.setText("Lastname :");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setText("Email :");

        repeat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repeat.setText("Repeat Password :");

        fn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fn3.setText("Firstname :");

        pass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass1.setText("Password :");

        lnlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnlabelActionPerformed(evt);
            }
        });

        fnlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnlabelActionPerformed(evt);
            }
        });

        emaillabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaillabelActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(102, 102, 255));
        Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(0, 204, 51));
        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fn3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repeat))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lnlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(emaillabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pass2field, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pass1field, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(147, Short.MAX_VALUE)
                    .addComponent(fnlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(fn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emaillabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass1field, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass2field, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(fnlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(315, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(441, Short.MAX_VALUE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnlabelActionPerformed

    private void fnlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnlabelActionPerformed

    private void emaillabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaillabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emaillabelActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
             System.out.println("submitting..");
        fname = fnlabel.getText();
        lname = lnlabel.getText();
        Email = emaillabel.getText();
        String pass01 = pass1field.getText();
        String pass02 = pass2field.getText();
       
        if(pass01.equals(pass02)){
            pass = pass01;
            ArrayList<String> infos = new ArrayList();
            infos.add(fname);
            infos.add(lname);
            infos.add(Email);
            infos.add(pass);
            information.add(infos);
//            submit(String fname, String lname, String email, String pass)
            submit();
        }
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Firstname : ");
//        String fname = input.nextLine();
//        System.out.print("Lastname : ");
//        String lname = input.nextLine();
//        System.out.print("Email: ");
//        String Email = input.nextLine();
//        System.out.print("Password : ");
//        String pass01 = input.nextLine();
//        System.out.print("Repeat password : ");
//        String pass02 = input.nextLine();
////        if on another class;;;
////        ClassName <variable> = new ClassName();
////        variable.submit(firstname,middlename,lastname);
//
//        submit("Firstname: " +fname, "\nLastname: " +lname, "Email:" +Email, "\nPassword: " + pass01, "\nRepeat Password : " + pass02);

//        retrieve();

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    public void read() {
        String filePath = "C:\\Users\\2ndyrGroupA\\Desktop\\Register.txt";
        String line = null;
        BufferedReader reader = null;
        FileReader freader = null;
//
        try {
            freader = new FileReader(filePath);
            reader = new BufferedReader(freader);
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
                String[] Lines = line.split("\t\t");
                ArrayList<String> lines = new ArrayList();
                lines.add(Lines[0]);
                lines.add(Lines[1]);
                lines.add(Lines[2]);
                lines.add(Lines[3]);
                information.add(lines);
            }
        } catch (RuntimeException re) {
            System.out.println(re);
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            try {
                reader.close();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emaillabel;
    private javax.swing.JLabel fn2;
    private javax.swing.JLabel fn3;
    private javax.swing.JTextField fnlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ln;
    private javax.swing.JTextField lnlabel;
    private javax.swing.JLabel pass1;
    private javax.swing.JPasswordField pass1field;
    private javax.swing.JPasswordField pass2field;
    private javax.swing.JLabel register;
    private javax.swing.JLabel repeat;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
