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
public class XemNguoiDungPOJO {
    String username;
    String accStts;
    String created;
    String exDate;
    String profile;
    String lstLgin;
    String tblspNm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccStts() {
        return accStts;
    }

    public void setAccStts(String accStts) {
        this.accStts = accStts;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getLstLgin() {
        return lstLgin;
    }

    public void setLstLgin(String lstLgin) {
        this.lstLgin = lstLgin;
    }

    public String getTblspNm() {
        return tblspNm;
    }

    public void setTblspNm(String tblspNm) {
        this.tblspNm = tblspNm;
    }
    public XemNguoiDungPOJO() {
        
    }

    public XemNguoiDungPOJO(String username, String accStts, String created, String exDate, String profile, String lstLgin, String tblspNm) {
        this.username = username;
        this.accStts = accStts;
        this.created = created;
        this.exDate = exDate;
        this.profile = profile;
        this.lstLgin = lstLgin;
        this.tblspNm = tblspNm;
    }

    
    
}
