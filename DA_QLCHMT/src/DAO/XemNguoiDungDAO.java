/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.XemNguoiDungPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class XemNguoiDungDAO {
    public static  ArrayList<XemNguoiDungPOJO> xemNguoiDung(){
        ArrayList<XemNguoiDungPOJO> dsInst = new ArrayList<XemNguoiDungPOJO>();
        try {
            String sql = "SELECT USERNAME, ACCOUNT_STATUS, CREATED, EXPIRY_DATE, PROFILE, LAST_LOGIN FROM DBA_USERS";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                XemNguoiDungPOJO usr = new XemNguoiDungPOJO();
                usr.setUsername(rs.getString("USERNAME"));
                usr.setAccStts(rs.getString("ACCOUNT_STATUS"));
                usr.setCreated(rs.getString("CREATED"));
                usr.setExDate(rs.getString("EXPIRY_DATE"));
                usr.setProfile(rs.getString("PROFILE"));
                usr.setLstLgin(rs.getString("LAST_LOGIN"));
                dsInst.add(usr);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsInst;
    }
}
