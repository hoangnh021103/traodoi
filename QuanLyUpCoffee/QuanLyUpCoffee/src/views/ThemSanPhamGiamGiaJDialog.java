/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao1.ChiTietGiamGiaDao;
import dao1.DaoGiamGia;
import dao1.DonViSanPhamDao;
import dao1.LoaiSanPhamDao;
import dao1.SanPhamDao;
import model.GiamGiaChiTiet;
import model.SanPham;
import model.GiamGia;
import helper.MsgBox;
import helper.Xdate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.list;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author HP
 */
public class ThemSanPhamGiamGiaJDialog extends javax.swing.JDialog {

    SanPhamDao daoSP = new SanPhamDao();
    LoaiSanPhamDao daoLSP = new LoaiSanPhamDao();
    DonViSanPhamDao daoDV = new DonViSanPhamDao();

    DefaultTableModel model = new DefaultTableModel();
    static int magg;
    static String masp;

    public ThemSanPhamGiamGiaJDialog(java.awt.Frame parent, boolean modal, int magiamgia, Date ngaybatdau) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        model = (DefaultTableModel) tblSanPham.getModel();
        fillToTableSP();
        magg = magiamgia;

//        txtidchitietgg.setText(magg);
    }

    public String getMasp() {
        return masp;
    }

    public static void setMasp(String masp) {
        ThemSanPhamGiamGiaJDialog.masp = masp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtGiam = new javax.swing.JTextField();
        btnxacnhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm Sản Phẩm Giảm Giá");

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đồ Uống", "Giá", "Chọn sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Giảm(%)");

        txtGiam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnxacnhan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnxacnhan.setText("Xác nhận");
        btnxacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxacnhanActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(btnxacnhan)
                        .addGap(40, 40, 40)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxacnhanActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnxacnhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ThemSanPhamGiaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ThemSanPhamGiaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ThemSanPhamGiaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ThemSanPhamGiaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ThemSanPhamGiaJDialog dialog = new ThemSanPhamGiaJDialog(new javax.swing.JFrame(), true, magg);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnxacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiam;
    // End of variables declaration//GEN-END:variables

    ChiTietGiamGiaDao dao = new ChiTietGiamGiaDao();
    int row;
    DaoGiamGia daogg = new DaoGiamGia();

    private void fillToTableSP() {
        model.setRowCount(0);
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String datenow = simple.format(date);
        date = Xdate.toDate(datenow, "yyyy-MM-dd");
        try {
            List<SanPham> list = daoSP.selectAll();
            for (SanPham x : list) {
                //               
                GiamGia gg = (GiamGia) daogg.selectKhoangNgay(x.getId_sp());
                if (gg == null) {
                    model.addRow(new Object[]{x.getId_sp(), x.getTen_sp(),
                        daoLSP.selectNameByID(x.getId_loaiSP()), x.getGia_sp()
                    });
                    continue;
                }
                if (date.before(gg.getNgayBD()) || date.after(gg.getNgayKT())) {
                    System.out.println(magg);
                    model.addRow(new Object[]{x.getId_sp(), x.getTen_sp(),
                        daoLSP.selectNameByID(x.getId_loaiSP()), x.getGia_sp()
                    });
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GiamGiaChiTiet getform() {
        GiamGiaChiTiet gg = new GiamGiaChiTiet();
        row = tblSanPham.getSelectedRow();
        System.out.println(magg);
        gg.setidgiamgia(magg);

        System.out.println(gg.getidgiamgia());

        gg.setidSp(tblSanPham.getValueAt(row, 0).toString());
        System.out.println(gg.getidSP());
        gg.setPhantramgiam(Integer.parseInt(txtGiam.getText()));
        return gg;
    }

    private void insert() {
        try {
            if (checkGiamGia()) return;
            if (MsgBox.confirm(this, "bạn có muốn thêm sản phẩm này cho sự kiện giảm giá ?")) {
                for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                    if (tblSanPham.getValueAt(i, 4) == null) {
                        continue;
                    }
                    if ((boolean) tblSanPham.getValueAt(i, 4).equals(true)) {
                        GiamGiaChiTiet gg = new GiamGiaChiTiet();
                        row = tblSanPham.getSelectedRow();
//                    System.out.println(magg);
                        gg.setidgiamgia(magg);
                        System.out.println(gg.getidgiamgia());
                        gg.setidSp(tblSanPham.getValueAt(i, 0).toString());

                        gg.setPhantramgiam(Integer.parseInt(txtGiam.getText()));
                        dao.insert(gg);
                    }
                };
                JOptionPane.showMessageDialog(this, "đã thêm sản phẩm vào giảm giá");
                fillToTableSP();
                dispose();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private boolean checkGiamGia(){
        String  regex  = "\\d+";
        if (txtGiam.getText().equals("")) {
            MsgBox.alert(this, "hãy nhập vào phần trăm giảm gía");
            return true;
        }
        else if (!txtGiam.getText().matches(regex)) {
             MsgBox.alert(this, " phần trăm giảm giá nhập là số");
            return true;
        }else;
        return false;
    }
}