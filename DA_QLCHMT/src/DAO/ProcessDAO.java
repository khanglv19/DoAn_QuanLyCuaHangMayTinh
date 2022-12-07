/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.ProcessPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class ProcessDAO {
    public static  ArrayList<ProcessPOJO> xemProcess(){
        ArrayList<ProcessPOJO> dsDB = new ArrayList<ProcessPOJO>();
        try {
            String sql = "select pid, pname, username, program, background from v$process";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                ProcessPOJO pc = new ProcessPOJO();
                pc.setpId(rs.getString("pid"));
                pc.setpName(rs.getString("pname"));
                pc.setUserName(rs.getString("username"));
                pc.setProgram(rs.getString("program"));
                pc.setBackground(rs.getString("background"));
                dsDB.add(pc);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDB;
    }
}
