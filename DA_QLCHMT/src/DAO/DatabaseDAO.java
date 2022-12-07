/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.DatabasePOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class DatabaseDAO {
    public static  ArrayList<DatabasePOJO> xemDatabase(){
        ArrayList<DatabasePOJO> dsDB = new ArrayList<DatabasePOJO>();
        try {
            String sql = "select dbid, name, created, database_role, db_unique_name, open_mode from v$database";
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                DatabasePOJO db = new DatabasePOJO();
                db.setDbId(rs.getString("dbid"));
                db.setName(rs.getString("name"));
                db.setCreated(rs.getString("created"));
                db.setDbRole(rs.getString("database_role"));
                db.setDbUniN(rs.getString("db_unique_name"));
                db.setOm(rs.getString("open_mode"));
                dsDB.add(db);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDB;
    }
}
