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
public class TaoTaiKhoanPOJO {
    String usrNm;
    String pwd;
    String tblsp;
    String tblspTmp;
    String prf;
    
    String ck;
    
    String username;
    String accStts;
    String created;
    String exDate;
    String profile;
    String lstLgin;
    String tblspNm;

    public String getUsrNm() {
        return usrNm;
    }

    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

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

    public String getTblsp() {
        return tblsp;
    }

    public void setTblsp(String tblsp) {
        this.tblsp = tblsp;
    }

    public String getTblspTmp() {
        return tblspTmp;
    }

    public void setTblspTmp(String tblspTmp) {
        this.tblspTmp = tblspTmp;
    }

    public String getPrf() {
        return prf;
    }

    public void setPrf(String prf) {
        this.prf = prf;
    }

    public String getCk() {
        return ck;
    }

    public void setCk(String ck) {
        this.ck = ck;
    }
    
    public TaoTaiKhoanPOJO() {
    }

    public TaoTaiKhoanPOJO(String usrNm, String pwd, String tblsp, String tblspTmp, String prf, String ck, String username, String accStts, String created, String exDate, String profile, String lstLgin, String tblspNm) {
        this.usrNm = usrNm;
        this.pwd = pwd;
        this.tblsp = tblsp;
        this.tblspTmp = tblspTmp;
        this.prf = prf;
        this.ck = ck;
        this.username = username;
        this.accStts = accStts;
        this.created = created;
        this.exDate = exDate;
        this.profile = profile;
        this.lstLgin = lstLgin;
        this.tblspNm = tblspNm;
    }

    
}
