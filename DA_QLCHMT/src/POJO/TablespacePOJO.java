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
public class TablespacePOJO {
    String tenTblsp;
    String path;
    String size;

    public String getTenTblsp() {
        return tenTblsp;
    }

    public void setTenTblsp(String tenTblsp) {
        this.tenTblsp = tenTblsp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public TablespacePOJO() {
    }

    public TablespacePOJO(String tenTblsp, String path, String size) {
        this.tenTblsp = tenTblsp;
        this.path = path;
        this.size = size;
    }

    
    
    
}
