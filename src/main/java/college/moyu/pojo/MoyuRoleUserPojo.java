package college.moyu.pojo;

public class MoyuRoleUserPojo {

    /**
     * id
     */
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 角色id
     */
    private String roleId;

    public MoyuRoleUserPojo(String id, String userId, String roleId) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public MoyuRoleUserPojo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
