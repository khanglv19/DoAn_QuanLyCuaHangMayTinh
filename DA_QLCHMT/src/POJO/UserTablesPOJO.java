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
public class UserTablesPOJO {
    String tblNm;
    String tblspcNm;

    public String getTblNm() {
        return tblNm;
    }

    public void setTblNm(String tblNm) {
        this.tblNm = tblNm;
    }

    public String getTblspcNm() {
        return tblspcNm;
    }

    public void setTblspcNm(String tblspcNm) {
        this.tblspcNm = tblspcNm;
    }

    public UserTablesPOJO() {
    }

    public UserTablesPOJO(String tblNm, String tblspcNm) {
        this.tblNm = tblNm;
        this.tblspcNm = tblspcNm;
    }

    
    
    
}
