package net.anjero.reader.module.folder.pojo;

import java.util.Date;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/24</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */
public class Folders {

    private Integer id;
    private String fileName;
    private Date inTime;
    private Date modifyDate;
    private Boolean isFolder;
    private String md5;
    private Long biteSize;
    private String fileSize;
    private String filePath;
    private Integer pathType;
    private Integer pid;//你文件夹，顶级文件为0
    private Integer userId;//用户
    private Integer status;//状态

    public Folders() {
    }

    public Folders(Integer id, String fileName, Date inTime, Date modifyDate, Boolean isFolder, String md5, Long biteSize, String fileSize, String filePath, Integer pathType, Integer pid, Integer userId, Integer status) {
        this.id = id;
        this.fileName = fileName;
        this.inTime = inTime;
        this.modifyDate = modifyDate;
        this.isFolder = isFolder;
        this.md5 = md5;
        this.biteSize = biteSize;
        this.fileSize = fileSize;
        this.filePath = filePath;
        this.pathType = pathType;
        this.pid = pid;
        this.userId = userId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getFolder() {
        return isFolder;
    }

    public void setFolder(Boolean folder) {
        isFolder = folder;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getBiteSize() {
        return biteSize;
    }

    public void setBiteSize(Long biteSize) {
        this.biteSize = biteSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getPathType() {
        return pathType;
    }

    public void setPathType(Integer pathType) {
        this.pathType = pathType;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
