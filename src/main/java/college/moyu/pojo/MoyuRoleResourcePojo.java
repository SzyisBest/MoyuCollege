package college.moyu.pojo;

import java.util.Date;

public class MoyuRoleResourcePojo {

    /**
     * id
     */
    private Double id;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 资源id
     */
    private Date resourceId;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Date getResourceId() {
        return resourceId;
    }

    public void setResourceId(Date resourceId) {
        this.resourceId = resourceId;
    }

    public MoyuRoleResourcePojo() {
    }

    public MoyuRoleResourcePojo(Double id, String roleId, Date resourceId) {
        this.id = id;
        this.roleId = roleId;
        this.resourceId = resourceId;
    }
}
