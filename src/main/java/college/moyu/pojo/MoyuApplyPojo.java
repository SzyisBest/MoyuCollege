package college.moyu.pojo;

import java.util.Date;

public class MoyuApplyPojo {

    /**
     * id
     */
    private Double id;
    /**
     * 申请类型
     */
    private String applyType;
    /**
     * 申请标题
     */
    private Date applyTitle;
    /**
     * 申请描述
     */
    private String applyDiscreption;
    /**
     * 申请人
     */
    private Date applyUser;
    /**
     * 申请时间
     */
    private String applyTime;
    /**
     * 申请人类型
     */
    private String applyUserType;
    /**
     * 申请附件
     */
    private String applyAccessory;
    /**
     * 申请到
     */
    private String applyTo;

    public MoyuApplyPojo() {
    }

    public MoyuApplyPojo(Double id, String applyType, Date applyTitle, String applyDiscreption, Date applyUser, String applyTime, String applyUserType, String applyAccessory, String applyTo) {
        this.id = id;
        this.applyType = applyType;
        this.applyTitle = applyTitle;
        this.applyDiscreption = applyDiscreption;
        this.applyUser = applyUser;
        this.applyTime = applyTime;
        this.applyUserType = applyUserType;
        this.applyAccessory = applyAccessory;
        this.applyTo = applyTo;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public Date getApplyTitle() {
        return applyTitle;
    }

    public void setApplyTitle(Date applyTitle) {
        this.applyTitle = applyTitle;
    }

    public String getApplyDiscreption() {
        return applyDiscreption;
    }

    public void setApplyDiscreption(String applyDiscreption) {
        this.applyDiscreption = applyDiscreption;
    }

    public Date getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(Date applyUser) {
        this.applyUser = applyUser;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyUserType() {
        return applyUserType;
    }

    public void setApplyUserType(String applyUserType) {
        this.applyUserType = applyUserType;
    }

    public String getApplyAccessory() {
        return applyAccessory;
    }

    public void setApplyAccessory(String applyAccessory) {
        this.applyAccessory = applyAccessory;
    }

    public String getApplyTo() {
        return applyTo;
    }

    public void setApplyTo(String applyTo) {
        this.applyTo = applyTo;
    }
}
