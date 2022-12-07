/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.UserTablesPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class UserTablesDAO {
    public static  ArrayList<UserTablesPOJO> xemTablespace(){
        ArrayList<UserTablesPOJO> dsTblspc = new ArrayList<UserTablesPOJO>();
        try {
            String sql = "SELECT TABLE_NAME, TABLESPACE_NAME FROM USER_TABLES";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                UserTablesPOJO tblspc = new UserTablesPOJO();
                tblspc.setTblNm(rs.getString("TABLE_NAME"));
                tblspc.setTblspcNm(rs.getString("TABLESPACE_NAME"));
                dsTblspc.add(tblspc);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsTblspc;
    }
}
