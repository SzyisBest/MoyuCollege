package college.moyu.pojo;

import java.util.Date;

public class MoyuRolePojo {
    /**
     * 角色id
     */
    private Double roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 数据有效性标记
     */
    private String useFlag;

    public MoyuRolePojo(Double roleId, String roleName, String createdTime, Date updateTime, String useFlag) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.useFlag = useFlag;
    }

    public MoyuRolePojo() {
    }

    public Double getRoleId() {
        return roleId;
    }

    public void setRoleId(Double roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }
}
