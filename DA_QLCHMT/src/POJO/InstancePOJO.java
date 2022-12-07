/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Luong Vinh Khang
 */
public class InstancePOJO {
    int soInst;
    String tenInst;
    String status;
    String dbStatus;

    public int getSoInst() {
        return soInst;
    }

    public void setSoInst(int soInst) {
        this.soInst = soInst;
    }

    public String getTenInst() {
        return tenInst;
    }

    public void setTenInst(String tenInst) {
        this.tenInst = tenInst;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
    }

    public InstancePOJO() {
    }

    public InstancePOJO(int soInst, String tenInst, String status, String dbStatus) {
        this.soInst = soInst;
        this.tenInst = tenInst;
        this.status = status;
        this.dbStatus = dbStatus;
    }
    
    
}
