/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.OracleDataProvider;
import DAO.TaoTaiKhoanDAO;
import POJO.TaoTaiKhoanPOJO;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Vinh Khang
 */
public class GanQuyenDT extends javax.swing.JFrame {

    /**
     * Creates new form GanQuyenDT
     */
    public GanQuyenDT() {
        initComponents();
        String sqlCbbUser = "SELECT USERNAME FROM DBA_USERS";
        loadDuLieuCbbox(sqlCbbUser, this.cbbUser, "USERNAME");
    }
    
    public void loadDuLieuCbbox(String sql, JComboBox cbb, String bien)
    {
        try {
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                cbb.addItem(rs.getString(bien));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể nạp dữ liệu!", "Lỗi!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkbxSelect = new javax.swing.JCheckBox();
        chkbxInsert = new javax.swing.JCheckBox();
        chkbxUpdate = new javax.swing.JCheckBox();
        chkbxDelete = new javax.swing.JCheckBox();
        cbbUser = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnGanQuyen = new javax.swing.JButton();
        btnThuHoiQuyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkbxSelect.setText("Select");

        chkbxInsert.setText("Insert");

        chkbxUpdate.setText("Update");

        chkbxDelete.setText("Delete");
        chkbxDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("User");

        btnGanQuyen.setText("Gán quyền");
        btnGanQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGanQuyenActionPerformed(evt);
            }
        });

        btnThuHoiQuyen.setText("Thu hồi quyền");
        btnThuHoiQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuHoiQuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbxUpdate)
                                    .addComponent(chkbxSelect))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkbxDelete)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(chkbxInsert))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnThuHoiQuyen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGanQuyen)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGanQuyen, btnThuHoiQuyen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxSelect)
                    .addComponent(chkbxInsert))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxUpdate)
                    .addComponent(chkbxDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGanQuyen)
                    .addComponent(btnThuHoiQuyen))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkbxDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxDeleteActionPerformed

    private void btnGanQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGanQuyenActionPerformed
        // TODO add your handling code here:
        TaoTaiKhoanPOJO ttk = new TaoTaiKhoanPOJO();
        String tenND  = cbbUser.getSelectedItem().toString();
        String sl  = chkbxSelect.getText();
        String is  = chkbxInsert.getText();
        String ud  = chkbxUpdate.getText();
        String dl  = chkbxDelete.getText();
        String ck = "";
        if(chkbxSelect.isSelected())
            ck="Select";
        else if(chkbxInsert.isSelected())
            ck="Insert";
        else if (chkbxUpdate.isSelected())
            ck="Update";
        else if (chkbxDelete.isSelected())
            ck="Delete";
        else if (chkbxSelect.isSelected() && chkbxInsert.isSelected())
            ck="Select, Insert";
        else if (chkbxSelect.isSelected() && chkbxUpdate.isSelected())
            ck="Select, Update";
        else if (chkbxSelect.isSelected() && chkbxDelete.isSelected())
            ck="Select, Delete";
        else if (chkbxInsert.isSelected() && chkbxUpdate.isSelected())
            ck="Insert, Update";
        else if (chkbxInsert.isSelected() && chkbxDelete.isSelected())
            ck="Insert, Delete";
        else if (chkbxUpdate.isSelected() && chkbxDelete.isSelected())
            ck="Update, Delete";
        ttk.setUsrNm(tenND);
        ttk.setCk(ck);
        TaoTaiKhoanDAO.ganQuyenDT(tenND, ck);
    }//GEN-LAST:event_btnGanQuyenActionPerformed

    private void btnThuHoiQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuHoiQuyenActionPerformed
        // TODO add your handling code here:
        String tenND  = cbbUser.getSelectedItem().toString();
        TaoTaiKhoanPOJO ttk = new TaoTaiKhoanPOJO();
        ttk.setUsrNm(tenND);
        TaoTaiKhoanDAO.thuHoiQuyenDT(tenND);
    }//GEN-LAST:event_btnThuHoiQuyenActionPerformed

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
            java.util.logging.Logger.getLogger(GanQuyenDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GanQuyenDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GanQuyenDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GanQuyenDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GanQuyenDT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGanQuyen;
    private javax.swing.JButton btnThuHoiQuyen;
    private javax.swing.JComboBox<String> cbbUser;
    private javax.swing.JCheckBox chkbxDelete;
    private javax.swing.JCheckBox chkbxInsert;
    private javax.swing.JCheckBox chkbxSelect;
    private javax.swing.JCheckBox chkbxUpdate;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
