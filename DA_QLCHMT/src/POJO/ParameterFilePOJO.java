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
public class ParameterFilePOJO {
    String num;
    String name;
    String dpVal;
    String idef;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpVal() {
        return dpVal;
    }

    public void setDpVal(String dpVal) {
        this.dpVal = dpVal;
    }

    public String getIdef() {
        return idef;
    }

    public void setIdef(String idef) {
        this.idef = idef;
    }

    public ParameterFilePOJO() {
    }

    public ParameterFilePOJO(String num, String name, String dpVal, String idef) {
        this.num = num;
        this.name = name;
        this.dpVal = dpVal;
        this.idef = idef;
    }

    
}
