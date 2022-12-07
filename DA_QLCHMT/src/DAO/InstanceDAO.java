/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.InstancePOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class InstanceDAO {
    public static  ArrayList<InstancePOJO> xemInstance(){
        ArrayList<InstancePOJO> dsInst = new ArrayList<InstancePOJO>();
        try {
            String sql = "SELECT INSTANCE_NUMBER, INSTANCE_NAME, STATUS, DATABASE_STATUS FROM V$INSTANCE";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                InstancePOJO inst = new InstancePOJO();
                inst.setSoInst(rs.getInt("INSTANCE_NUMBER"));
                inst.setTenInst(rs.getString("INSTANCE_NAME"));
                inst.setStatus(rs.getString("STATUS"));
                inst.setDbStatus(rs.getString("DATABASE_STATUS"));
                dsInst.add(inst);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsInst;
    }
}
