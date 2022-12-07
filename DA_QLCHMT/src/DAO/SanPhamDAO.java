/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.SanPhamPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;
import GUI.DangNhap;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Vinh Khang
 */
public class SanPhamDAO {
    public static  ArrayList<SanPhamPOJO> layDanhSachSanPham(){
        ArrayList<SanPhamPOJO> dsSP = new ArrayList<SanPhamPOJO>();
        try {
            String sql = "select * from quanly.MATHANG ORDER BY MAHANG";
            //String sql = String.format("call quanly.xem_MatHang(?)");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                SanPhamPOJO sp = new SanPhamPOJO();
                sp.setMaHang(rs.getString("MAHANG"));
                sp.setTenHang(rs.getString("TENHANG"));
                sp.setNsx(rs.getString("NSX"));
                sp.setGiaBan(rs.getFloat("GIABAN"));
                sp.setSoLuongTon(rs.getInt("SOLUONGTON"));
                dsSP.add(sp);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }
    
    public static boolean themSanPham(SanPhamPOJO sp){
        try {
            boolean kq = false;
            //String sql = String.format("insert into quanly.MATHANG (MAHANG, TENHANG, NSX, GIABAN, SOLUONGTON) values ('%s',N'%s',N'%s', %f, %d)", sp.getMaHang(), sp.getTenHang(), sp.getNsx(), sp.getGiaBan(), sp.getSoLuongTon());
            String sql = String.format("call quanly.Them_MatHang('%s','%s','%s','%f','%d')", sp.getMaHang(), sp.getTenHang(), sp.getNsx(), sp.getGiaBan(), sp.getSoLuongTon());
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean xoaSanPham(String maSP){
        try {
            boolean kq = false;
            //String sql = String.format("delete from quanly.MATHANG where MAHANG = '%S'", maSP);
            String sql = String.format("call quanly.Xoa_MatHang('%s')", maSP);
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Xóa thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xóa thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public static boolean capNhatSanPham(SanPhamPOJO sp){
        try {
            boolean kq = false;
            //String sql = String.format("update quanly.MATHANG SET TENHANG = N'" + sp.getTenHang()+ "', NSX = '"+sp.getNsx()+"', GIABAN = '" + sp.getGiaBan()+ "', SOLUONGTON = '"+sp.getSoLuongTon()+"' where MAHANG ='" + sp.getMaHang()+ "'");
            String sql = String.format("call quanly.Sua_MatHang('%s','%s','%s','%f','%d')", sp.getMaHang(), sp.getTenHang(), sp.getNsx(), sp.getGiaBan(), sp.getSoLuongTon());
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } 
    }
    
//    public static SanPhamPOJO laySanPham(String maSP){
//        SanPhamPOJO sp = null;
//        try {
//            String sql = "select * from MATHANG where MAHANG = " + maSP;
//            OracleDataProvider provider = new OracleDataProvider();
//            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
//            ResultSet rs = provider.executeQuery(sql);
//            if(rs.next()){
//                sp = new SanPhamPOJO();
//                sp.setMaHang(rs.getString("MAHANG"));
//                sp.setTenHang(rs.getString("TENHANG"));
//                sp.setNsx(rs.getString("NSX"));
//                sp.setGiaBan(rs.getFloat("GIABAN"));
//                sp.setSoLuongTon(rs.getInt("SOLUONGTON"));
//            }
//            provider.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return sp;
//    }
}
