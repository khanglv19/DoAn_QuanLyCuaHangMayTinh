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
public class ProcessPOJO {
    String pId;
    String pName;
    String userName;
    String program;
    String background;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public ProcessPOJO() {
    }

    public ProcessPOJO(String pId, String pName, String userName, String program, String background) {
        this.pId = pId;
        this.pName = pName;
        this.userName = userName;
        this.program = program;
        this.background = background;
    }
    
    
}
