package college.moyu.pojo;

import java.util.Date;

public class MoyuMenuPojo {
    /**
     * 菜单id
     */
    private int menuId;
    /**
     * 菜单名
     */
    private String menuName;
    /**
     * 菜单路径
     */
    private String menuPath;
    /**
     * 菜单组件
     */
    private String menuComponet;
    /**
     * 菜单icon
     */
    private String menuIcon;
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
    private int orderNum;
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
    private int useFlag;


    public MoyuMenuPojo() {
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(int useFlag) {
        this.useFlag = useFlag;
    }

    public MoyuMenuPojo(int menuId, String menuName, String menuPath, String menuComponet, String menuIcon, String menuParentid, String isHidden, int orderNum, String createdtime, String updatetime, int useFlag) {
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

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuComponet() {
        return menuComponet;
    }

    public void setMenuComponet(String menuComponet) {
        this.menuComponet = menuComponet;
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

}
