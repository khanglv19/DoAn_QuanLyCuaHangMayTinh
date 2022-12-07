/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.ProfilePOJO;
import DAO.ProfileDAO;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Vinh Khang
 */
public class ProfileDAO {
    public static  ArrayList<ProfilePOJO> taoProfile(String tenProfile, String ssUsr, String cpuSs, String flLgnAtp){
        ArrayList<ProfilePOJO> creTK = new ArrayList<ProfilePOJO>();
        try {
            String sql = "CREATE PROFILE "+tenProfile+" LIMIT SESSIONS_PER_USER "+ssUsr+" CPU_PER_SESSION "+cpuSs+" FAILED_LOGIN_ATTEMPTS "+flLgnAtp+" ";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                ProfilePOJO prfl = new ProfilePOJO();
                prfl.setTenProfile(rs.getString(tenProfile));
                prfl.setSsnsPerUsr(rs.getString(ssUsr));
                prfl.setCpuPerSssn(rs.getString(cpuSs));
                prfl.setFlLgnAtp(rs.getString(flLgnAtp));
                creTK.add(prfl);
            }
            provider.close();
            JOptionPane.showMessageDialog(null, "Tạo profile profile thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tạo profile profile thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        }
        return creTK;
    }
    
    public static  ArrayList<ProfilePOJO> xemProfile(){
        ArrayList<ProfilePOJO> dsInst = new ArrayList<ProfilePOJO>();
        try {
            String sql = "SELECT PROFILE, RESOURCE_NAME, RESOURCE_TYPE, LIMIT FROM DBA_PROFILES";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                ProfilePOJO prf = new ProfilePOJO();
                prf.setProfile(rs.getString("PROFILE"));
                prf.setResource_name(rs.getString("RESOURCE_NAME"));
                prf.setResource_type(rs.getString("RESOURCE_TYPE"));
                prf.setLimit(rs.getString("LIMIT"));
                dsInst.add(prf);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsInst;
    }
    
    public static boolean xoaProfile(String tenProfile){
        try {
            boolean kq = false;
            String sql = String.format("DROP PROFILE " + tenProfile + " CASCADE ");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Xoá profile thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xoá profile thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
}
