package college.moyu.pojo;

import java.util.Date;

public class MoyuRoleMenuPojo {

    /**
     * id
     */
    private Double id;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 菜单id
     */
    private Date menuId;

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

    public Date getMenuId() {
        return menuId;
    }

    public void setMenuId(Date menuId) {
        this.menuId = menuId;
    }

    public MoyuRoleMenuPojo() {
    }

    public MoyuRoleMenuPojo(Double id, String roleId, Date menuId) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
    }
}
