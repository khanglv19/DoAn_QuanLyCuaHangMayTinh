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
public class SessionPOJO {
    String sid;
    String serial;
    String username;
    String schemaname;
    String program;
    String terminal;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String process) {
        this.terminal = process;
    }

    public SessionPOJO() {
    }

    public SessionPOJO(String sid, String serial, String username, String schemaname, String program, String terminal) {
        this.sid = sid;
        this.serial = serial;
        this.username = username;
        this.schemaname = schemaname;
        this.program = program;
        this.terminal = terminal;
    }
}
