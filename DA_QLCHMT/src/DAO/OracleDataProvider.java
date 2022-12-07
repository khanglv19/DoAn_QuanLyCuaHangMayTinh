/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Luong Vinh Khang
 */
public class OracleDataProvider {
    Connection cnn;
    
    public boolean open(String sId, String strUser, String strPwd){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cnn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/" + sId, strUser, strPwd);
            System.out.println("Oracle JDBC Driver Registered!");
            return true;
        } catch (Exception e) {
            System.out.println("Connection Failed! Check output console!");
            e.printStackTrace();
            return false;
        }
    }
    
    public void close(){
        try {
            this.cnn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Trả kết quả
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            Statement sm = cnn.createStatement();
            rs = sm.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    //Kiểm tra
    public int executeUpdate(String sql){
        int n = -1;
        try {
            Statement sm = cnn.createStatement();
            n = sm.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
}

//    public void open(String sId, String strUser, String strPwd){
////        String sId = "qlchmt";
////        String strUser = "quanly";
////        String strPwd = "quanly";
//
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            cnn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/" + sId, strUser, strPwd);
//            System.out.println("Oracle JDBC Driver Registered!");
//        } catch (Exception e) {
//            System.out.println("Connection Failed! Check output console!");
//            e.printStackTrace();
//        }
//    }