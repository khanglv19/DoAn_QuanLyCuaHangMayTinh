/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.SessionPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Vinh Khang
 */
public class SessionDAO {
    public static  ArrayList<SessionPOJO> xemSession(){
        ArrayList<SessionPOJO> dsDB = new ArrayList<SessionPOJO>();
        try {
            String sql = "SELECT S.SID, S.SERIAL#, S.USERNAME, S.SCHEMANAME, S.PROGRAM, P.TERMINAL FROM V$SESSION S, V$PROCESS P ";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                SessionPOJO ss = new SessionPOJO();
                ss.setSid(rs.getString("SID"));
                ss.setSerial(rs.getString("SERIAL#"));
                ss.setUsername(rs.getString("USERNAME"));
                ss.setSchemaname(rs.getString("SCHEMANAME"));
                ss.setProgram(rs.getString("PROGRAM"));
                ss.setTerminal(rs.getString("TERMINAL"));
                dsDB.add(ss);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDB;
    }
    
    public static  ArrayList<SessionPOJO> xemSessionDangChay(){
        ArrayList<SessionPOJO> dsDB = new ArrayList<SessionPOJO>();
        try {
            String sql = "SELECT S.SID, S.SERIAL#, S.USERNAME, S.SCHEMANAME, S.PROGRAM, P.TERMINAL FROM V$SESSION S, V$PROCESS P WHERE S.PADDR=P.ADDR AND S.TYPE !='BACKGROUND'";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                SessionPOJO ss = new SessionPOJO();
                ss.setSid(rs.getString("SID"));
                ss.setSerial(rs.getString("SERIAL#"));
                ss.setUsername(rs.getString("USERNAME"));
                ss.setSchemaname(rs.getString("SCHEMANAME"));
                ss.setProgram(rs.getString("PROGRAM"));
                ss.setTerminal(rs.getString("TERMINAL"));
                dsDB.add(ss);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDB;
    }
    
    public static boolean killSession(String sId, String serial){
        try {
            boolean kq = false;
            String sql = String.format("ALTER SYSTEM KILL SESSION '" + sId + ", " + serial + "'");
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            int n = provider.executeUpdate(sql);
            if(n == 1)
                kq = true;
            provider.close();
            JOptionPane.showMessageDialog(null, "Kill Session thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return kq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kill Session thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
}
