/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.TaoTaiKhoanPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Vinh Khang
 */
public class TaoTaiKhoanDAO {
    public static  ArrayList<TaoTaiKhoanPOJO> taoTaiKhoan(String usrNm, String pwd, String tblsp, String tmpTblsp, String prf){
        ArrayList<TaoTaiKhoanPOJO> creTK = new ArrayList<TaoTaiKhoanPOJO>();
        try {
            String sql = "CREATE USER "+usrNm+" IDENTIFIED BY "+pwd+" DEFAULT TABLESPACE "+tblsp+" TEMPORARY TABLESPACE "+tmpTblsp+" PROFILE "+prf+" ";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                TaoTaiKhoanPOJO tk = new TaoTaiKhoanPOJO();
                tk.setUsrNm(rs.getString(usrNm));
                tk.setPwd(rs.getString(pwd));
                tk.setTblsp(rs.getString(tblsp));
                tk.setTblspTmp(rs.getString(tmpTblsp));
                tk.setPrf(rs.getString(prf));
                creTK.add(tk);
            }
            provider.close();
            JOptionPane.showMessageDialog(null, "Tạo tài khoản thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tạo tài khoản thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        }
        return creTK;
    }
    
    public static  ArrayList<TaoTaiKhoanPOJO> doiMatKhau(String usrNm, String pwd){
        ArrayList<TaoTaiKhoanPOJO> doiMK = new ArrayList<TaoTaiKhoanPOJO>();
        try {
            String sql = "ALTER USER "+usrNm+" IDENTIFIED BY "+pwd+"";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                TaoTaiKhoanPOJO tk = new TaoTaiKhoanPOJO();
                tk.setUsrNm(rs.getString(usrNm));
                tk.setPwd(rs.getString(pwd));
                doiMK.add(tk);
            }
            provider.close();
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        }
        return doiMK;
    }
    
    public static  ArrayList<TaoTaiKhoanPOJO> xoaTaiKhoan(String usrNm){
        ArrayList<TaoTaiKhoanPOJO> xoaTK = new ArrayList<TaoTaiKhoanPOJO>();
        try {
            String sql = "DROP USER "+usrNm+" ";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                TaoTaiKhoanPOJO tk = new TaoTaiKhoanPOJO();
                tk.setUsrNm(rs.getString(usrNm));
                xoaTK.remove(tk);
            }
            provider.close();
            JOptionPane.showMessageDialog(null, "Xóa người dùng thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xóa người dùng thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        }
        return xoaTK;
    }
    
    public static boolean ganQuyenKN(String usrNm){
        try {
            boolean kq = false;
            String sql = String.format("GRANT CREATE SESSION, CONNECT TO " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Gán quyền thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gán quyền thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean thuHoiQuyenKN(String usrNm){
        try {
            boolean kq = false;
            String sql = String.format("REVOKE CREATE SESSION, CONNECT FROM " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Thu hồi quyền thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thu hồi quyền thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean ganQuyenDT(String usrNm, String ck){
//        if(chkbox.select ddc chon )
//            jdk.="select"
//                    else if(chkbox.select && chkinsert ddc chon)
//                        jdk.="select, insert"
        try {
            boolean kq = false;
            String sql = String.format("GRANT "+ck+" ON quanly.MATHANG TO " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Gán quyền thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gán quyền thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean ganQuyenDT(String usrNm){
        try {
            boolean kq = false;
            String sql = String.format("GRANT SELECT, INSERT, UPDATE ON quanly.MATHANG TO " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Gán quyền thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gán quyền thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean thuHoiQuyenDT(String usrNm){
        try {
            boolean kq = false;
            String sql = String.format("REVOKE SELECT, INSERT, UPDATE ON quanly.MATHANG FROM " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Thu hồi quyền thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thu hồi quyền thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean ganVaiTroHT(String usrNm){
        try {
            boolean kq = false;
            String sql = String.format("GRANT DBA TO " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Gán vai trò thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gán vai trò thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean thuHoiVaiTroHT(String usrNm){
        try {
             boolean kq = false;
            String sql = String.format("REVOKE DBA FROM " + usrNm + " ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Thu hồi vai trò thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thu hồi vai trò thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static  ArrayList<TaoTaiKhoanPOJO> xemNguoiDung(){
        ArrayList<TaoTaiKhoanPOJO> dsInst = new ArrayList<TaoTaiKhoanPOJO>();
        try {
            String sql = "SELECT USERNAME, ACCOUNT_STATUS, CREATED, EXPIRY_DATE, PROFILE, LAST_LOGIN, TABLESPACE_NAME FROM DBA_USERS, CDB_TABLESPACES";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                TaoTaiKhoanPOJO usr = new TaoTaiKhoanPOJO();
                usr.setUsername(rs.getString("USERNAME"));
                usr.setAccStts(rs.getString("ACCOUNT_STATUS"));
                usr.setCreated(rs.getString("CREATED"));
                usr.setExDate(rs.getString("EXPIRY_DATE"));
                usr.setProfile(rs.getString("PROFILE"));
                usr.setLstLgin(rs.getString("LAST_LOGIN"));
                usr.setTblspNm(rs.getString("TABLESPACE_NAME"));
                dsInst.add(usr);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsInst;
    }
    
    
    
//    public static  ArrayList<TaoTaiKhoanPOJO> xemTablespace(){
//        ArrayList<TaoTaiKhoanPOJO> dsTblspc = new ArrayList<TaoTaiKhoanPOJO>();
//        try {
//            String sql = "SELECT TABLESPACE_NAME FROM CDB_TABLESPACES";
//            OracleDataProvider provider = new OracleDataProvider();
//            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
//            ResultSet rs = provider.executeQuery(sql);
//            while(rs.next()){
//                TaoTaiKhoanPOJO tblspc = new TaoTaiKhoanPOJO();
//                tblspc.setTblspc(rs.getString("TABLESPACE_NAME"));
//                dsTblspc.add(tblspc);
//            }
//            provider.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return dsTblspc;
//    }
}
