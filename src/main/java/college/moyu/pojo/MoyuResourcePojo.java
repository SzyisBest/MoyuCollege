package college.moyu.pojo;

import java.util.Date;

public class MoyuResourcePojo {
    /**
     * 资源id
     */
    private Double resourceId;
    /**
     * 资源名称
     */
    private String resourceName;
    /**
     * 权限路径
     */
    private Date resourceUrl;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 父类权限id
     */
    private Date parentId;
    /**
     * 是否匿名_0否_1是
     */
    private String isAnonymous;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 数据有效性
     */
    private String useFlag;

    public Double getResourceId() {
        return resourceId;
    }

    public void setResourceId(Double resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Date getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(Date resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public Date getParentId() {
        return parentId;
    }

    public void setParentId(Date parentId) {
        this.parentId = parentId;
    }

    public String getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(String isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public MoyuResourcePojo() {
    }

    public MoyuResourcePojo(Double resourceId, String resourceName, Date resourceUrl, String requestMethod, Date parentId, String isAnonymous, String createdTime, String updateTime, String useFlag) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceUrl = resourceUrl;
        this.requestMethod = requestMethod;
        this.parentId = parentId;
        this.isAnonymous = isAnonymous;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.useFlag = useFlag;
    }
}
