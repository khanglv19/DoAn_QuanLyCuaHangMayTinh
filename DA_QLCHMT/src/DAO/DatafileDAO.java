/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.DangNhap;
import POJO.DatafilePOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luong Vinh Khang
 */
public class DatafileDAO {
    public static  ArrayList<DatafilePOJO> xemDatafile(){
        ArrayList<DatafilePOJO> dsDB = new ArrayList<DatafilePOJO>();
        try {
            String sql = "select file_id,file_name,tablespace_name from dba_data_files"; /*"select FILE#, CREATION_TIME, STATUS, ENABLED, CHECKPOINT_TIME from  V$DATAFILE";*/
            OracleDataProvider provider = new OracleDataProvider();
            provider.open(DangNhap.sid, DangNhap.usn, DangNhap.pwd);
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                DatafilePOJO df = new DatafilePOJO();
//                df.setFile(rs.getString("FILE#"));
//                df.setCreationTime(rs.getString("CREATION_TIME"));
//                df.setStatus(rs.getString("STATUS"));
//                df.setEnabled(rs.getString("ENABLED"));
//                df.setCheckpointTime(rs.getString("CHECKPOINT_TIME"));

                df.setFileId(rs.getString("file_id"));
                df.setFileName(rs.getString("file_name"));
                df.setTblspcName(rs.getString("tablespace_name"));
                dsDB.add(df);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDB;
    }
}
