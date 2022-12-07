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
public class DatabasePOJO {
    String dbId;
    String name;
    String created;
    String dbRole;
    String dbUniN;
    String om;

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDbRole() {
        return dbRole;
    }

    public void setDbRole(String dbRole) {
        this.dbRole = dbRole;
    }

    public String getDbUniN() {
        return dbUniN;
    }

    public void setDbUniN(String dbUniN) {
        this.dbUniN = dbUniN;
    }

    public String getOm() {
        return om;
    }

    public void setOm(String om) {
        this.om = om;
    }

    public DatabasePOJO() {
    }

    public DatabasePOJO(String dbId, String name, String created, String dbRole, String dbUniN, String om) {
        this.dbId = dbId;
        this.name = name;
        this.created = created;
        this.dbRole = dbRole;
        this.dbUniN = dbUniN;
        this.om = om;
    }
    
    
}
