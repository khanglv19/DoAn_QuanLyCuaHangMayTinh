/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.TablespacePOJO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luong Vinh Khang
 */
public class TablespaceDAO {
    public static  ArrayList<TablespacePOJO> taoTablespace(String tenTblsp, String path, String size){
        ArrayList<TablespacePOJO> creTblsp = new ArrayList<TablespacePOJO>();
        try {
            String sql = "CREATE TABLESPACE "+tenTblsp+" DATAFILE '"+path+".dbf' SIZE "+size+" ";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                TablespacePOJO tblsp = new TablespacePOJO();
                tblsp.setTenTblsp(rs.getString(tenTblsp));
                tblsp.setPath(rs.getString(path));
                tblsp.setSize(rs.getString(size));
                creTblsp.add(tblsp);
            }
            provider.close();
            JOptionPane.showMessageDialog(null, "Tạo tablespace khoản thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tạo tablespace thất bại!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        }
        return creTblsp;
    }
}
