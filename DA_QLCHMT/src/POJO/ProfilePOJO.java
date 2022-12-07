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
public class ProfilePOJO {
    String tenProfile;
    String ssnsPerUsr;
    String cpuPerSssn;
    String flLgnAtp;
    String profile;
    String resource_name;
    String resource_type;
    String limit;

    public String getTenProfile() {
        return tenProfile;
    }

    public void setTenProfile(String tenProfile) {
        this.tenProfile = tenProfile;
    }

    public String getSsnsPerUsr() {
        return ssnsPerUsr;
    }

    public void setSsnsPerUsr(String ssnsPerUsr) {
        this.ssnsPerUsr = ssnsPerUsr;
    }

    public String getCpuPerSssn() {
        return cpuPerSssn;
    }

    public void setCpuPerSssn(String cpuPerSssn) {
        this.cpuPerSssn = cpuPerSssn;
    }

    public String getFlLgnAtp() {
        return flLgnAtp;
    }

    public void setFlLgnAtp(String flLgnAtp) {
        this.flLgnAtp = flLgnAtp;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ProfilePOJO() {
    }

    public ProfilePOJO(String tenProfile, String ssnsPerUsr, String cpuPerSssn, String flLgnAtp, String profile, String resource_name, String resource_type, String limit) {
        this.tenProfile = tenProfile;
        this.ssnsPerUsr = ssnsPerUsr;
        this.cpuPerSssn = cpuPerSssn;
        this.flLgnAtp = flLgnAtp;
        this.profile = profile;
        this.resource_name = resource_name;
        this.resource_type = resource_type;
        this.limit = limit;
    }

    
}
