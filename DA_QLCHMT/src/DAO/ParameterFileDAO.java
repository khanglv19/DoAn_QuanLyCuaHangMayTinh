/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.ParameterFilePOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class ParameterFileDAO {
    public static  ArrayList<ParameterFilePOJO> xemParameter(){
        ArrayList<ParameterFilePOJO> dsPR = new ArrayList<ParameterFilePOJO>();
        try {
            String sql = "SELECT NUM, NAME, DISPLAY_VALUE, ISDEFAULT FROM V$PARAMETER";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                ParameterFilePOJO pr = new ParameterFilePOJO();
                pr.setNum(rs.getString("NUM"));
                pr.setName(rs.getString("NAME"));
                pr.setDpVal(rs.getString("DISPLAY_VALUE"));
                pr.setIdef(rs.getString("ISDEFAULT"));
                dsPR.add(pr);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsPR;
    }
}
