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
public class DatafilePOJO {
//    String file;
//    String creationTime;
//    String status;
//    String enabled;
//    String checkpointTime;
//
//    public String getFile() {
//        return file;
//    }
//
//    public void setFile(String file) {
//        this.file = file;
//    }
//
//    public String getCreationTime() {
//        return creationTime;
//    }
//
//    public void setCreationTime(String creationTime) {
//        this.creationTime = creationTime;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(String enabled) {
//        this.enabled = enabled;
//    }
//
//    public String getCheckpointTime() {
//        return checkpointTime;
//    }
//
//    public void setCheckpointTime(String checkpointTime) {
//        this.checkpointTime = checkpointTime;
//    }
//
//    public DatafilePOJO() {
//    }
//
//    public DatafilePOJO(String file, String creationTime, String status, String enabled, String checkpointTime) {
//        this.file = file;
//        this.creationTime = creationTime;
//        this.status = status;
//        this.enabled = enabled;
//        this.checkpointTime = checkpointTime;
//    }
    
    String fileId;
    String fileName;
    String tblspcName;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTblspcName() {
        return tblspcName;
    }

    public void setTblspcName(String tblspcName) {
        this.tblspcName = tblspcName;
    }

    public DatafilePOJO() {
    }

    public DatafilePOJO(String fileId, String fileName, String tblspcName) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.tblspcName = tblspcName;
    }
    
    
}
