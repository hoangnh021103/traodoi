/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao1.NhanVienDAO;
import model.NhanVien;
import helper.Auth;
import helper.MsgBox;
import java.awt.Color;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 * @author HP
 */
public class DangnhapJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DangnhapJDialog
     */
    public DangnhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    NhanVienDAO dao = new NhanVienDAO();
    private Pattern pattern;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        lblQuenPass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UPCOFFEE - Đăng Nhập");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 552));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 158, 105));
        jLabel3.setText("Tài Khoản:");

        txtUserName.setBackground(new java.awt.Color(241, 241, 241));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(223, 158, 105)));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(223, 158, 105));
        jLabel4.setText("Mật Khẩu:");

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng nhập");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(223, 158, 105)));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thoát");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(223, 158, 105)));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(241, 241, 241));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(223, 158, 105)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel6.setText("Nhập");

        lblQuenPass.setForeground(new java.awt.Color(0, 51, 255));
        lblQuenPass.setText("Quên Mật Khẩu?");
        lblQuenPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblQuenPass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuenPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove-bg.ai_1711362921553.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Đăng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 277, Short.MAX_VALUE)
                .addComponent(jLabel5))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(check()){
            return;
        }else{
            dangNhap();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void lblQuenPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenPassMouseClicked
        lblQuenPass.setForeground(Color.red);
        new QuenMatKhauJDialog(null, true).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblQuenPassMouseClicked

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
            java.util.logging.Logger.getLogger(DangnhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangnhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangnhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangnhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangnhapJDialog dialog = new DangnhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblQuenPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

//    public void Check(){
//        if(txtUserName.getText().equals("") || jPasswordField1.getPassword().length==0){
//            if(txtUserName.getText().equals("")){
//                JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản!");
//                txtUserName.requestFocus();
//                return;
//            }else if(jPasswordField1.getPassword().length==0){
//                JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!");
//                jPasswordField1.requestFocus();
//                return;
//            }else{
//                JOptionPane.showMessageDialog(this, "Chưa nhập thông tin đăng nhập!");
//                txtUserName.requestFocus();
//                return;
//            }
//        }
//    }
    public boolean check(){
        String manv = txtUserName.getText().trim();
        String matKhau = new String(jPasswordField1.getPassword()).trim();
        NhanVien nhanVien = dao.selectByAccount(manv);
        Pattern regex = Pattern.compile("[^A-Za-z0-9]");
        if (txtUserName.getText().equals("") && jPasswordField1.getPassword().length == 0) {

            JOptionPane.showMessageDialog(this, "Chưa nhập thông tin đăng nhập!");
            txtUserName.requestFocus();
            return true;

        } else if (txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản!");
            txtUserName.requestFocus();
            return true;}
        else if(regex.matcher(manv).find()){
            JOptionPane.showMessageDialog(this, "Tài khoản chứa ký tự đặc biệt!");
            txtUserName.setText("");
            txtUserName.requestFocus();
            return true;
        }
        else if (jPasswordField1.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!");
            jPasswordField1.requestFocus();
            return true;
        }else if(regex.matcher(matKhau).find()){
             JOptionPane.showMessageDialog(this, "Mật khẩu chứa ký tự đặc biệt!");
             jPasswordField1.setText("");
             jPasswordField1.requestFocus();
            return true;
        }
        else if(nhanVien == null){
                JOptionPane.showMessageDialog(this, "Sai tài khoản");
                return true;
            }
        else if (!matKhau.equals(nhanVien.getPass())) {
            JOptionPane.showMessageDialog(this, " Sai mật khẩu");
            jPasswordField1.requestFocus();
            return true;
        }
        return false;
    }
   
    private void dangNhap() {
        String manv = txtUserName.getText().trim();
        String matKhau = new String(jPasswordField1.getPassword()).trim();
        NhanVien nhanVien = dao.selectByAccount(manv);

            Auth.user = nhanVien;
            if(nhanVien.isTrangThai() == true){
                if(Auth.isManager() == true){
             JOptionPane.showMessageDialog(this, " Đăng nhập thành công dưới quyền quản lý");   
            }else{
                JOptionPane.showMessageDialog(this, " Đăng nhập thành công dưới quyền nhân viên");   
            }
            }else{
                int result = JOptionPane.showConfirmDialog(this,"Tài khoản này đã bị khóa! Vui lòng liên hệ quản lý để mở!","Hệ thống quản lý UpCoffee",JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION){
                    new DangnhapJDialog(null, true).setVisible(false);
                txtUserName.setText("");
                jPasswordField1.setText("");
                txtUserName.requestFocus();
                return;
                }else{
                    System.exit(0);
                }
            }
            this.dispose();
            
        }
    
    

    private void ketThuc() {
        System.exit(0);
    }
}
