package college.moyu.pojo;

import java.util.Date;

public class MoyuUserPojo {

    /**
     * 用户id
     */
    private Double userId;
    /**
     * 用户信息id
     */
    private String userInfoId;
    /**
     * 用户名
     */
    private Date userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 登录类型
     */
    private String loginType;
    /**
     * 用户登录ip
     */
    private String ipAddress;
    /**
     * ip来源
     */
    private String ipSource;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 上次登录时间
     */
    private String lastLogintime;
    /**
     * 数据有效性
     */
    private String useFlag;

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Date getUserName() {
        return userName;
    }

    public void setUserName(Date userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(String lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public MoyuUserPojo(Double userId, String userInfoId, Date userName, String password, String loginType, String ipAddress, String ipSource, Date createdTime, String updateTime, String lastLogintime, String useFlag) {
        this.userId = userId;
        this.userInfoId = userInfoId;
        this.userName = userName;
        this.password = password;
        this.loginType = loginType;
        this.ipAddress = ipAddress;
        this.ipSource = ipSource;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.lastLogintime = lastLogintime;
        this.useFlag = useFlag;
    }

    public MoyuUserPojo() {
    }
}
