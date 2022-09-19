package college.moyu.pojo;

import java.util.Date;

public class MoyuMenuPojo {
    /**
     * 菜单id
     */
    private Double menuId;
    /**
     * 菜单名
     */
    private String menuName;
    /**
     * 菜单路径
     */
    private Date menuPath;
    /**
     * 菜单组件
     */
    private String menuComponet;
    /**
     * 菜单icon
     */
    private Date menuIcon;
    /**
     * 菜单父类id
     */
    private String menuParentid;
    /**
     * 是否隐藏
     */
    private String isHidden;
    /**
     * 菜单排序
     */
    private String orderNum;
    /**
     * 创建时间
     */
    private String createdtime;
    /**
     * 更新时间
     */
    private String updatetime;
    /**
     * 数据有效性
     */
    private String useFlag;

    public MoyuMenuPojo(Double menuId, String menuName, Date menuPath, String menuComponet, Date menuIcon, String menuParentid, String isHidden, String orderNum, String createdtime, String updatetime, String useFlag) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuPath = menuPath;
        this.menuComponet = menuComponet;
        this.menuIcon = menuIcon;
        this.menuParentid = menuParentid;
        this.isHidden = isHidden;
        this.orderNum = orderNum;
        this.createdtime = createdtime;
        this.updatetime = updatetime;
        this.useFlag = useFlag;
    }

    public MoyuMenuPojo() {
    }

    public Double getMenuId() {
        return menuId;
    }

    public void setMenuId(Double menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Date getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(Date menuPath) {
        this.menuPath = menuPath;
    }

    public String getMenuComponet() {
        return menuComponet;
    }

    public void setMenuComponet(String menuComponet) {
        this.menuComponet = menuComponet;
    }

    public Date getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(Date menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuParentid() {
        return menuParentid;
    }

    public void setMenuParentid(String menuParentid) {
        this.menuParentid = menuParentid;
    }

    public String getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }
}
