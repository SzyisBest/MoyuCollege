package college.moyu.pojo;

import java.util.Date;

public class MoyuTaskPojo {

    /**
     * 任务id
     */
    private Double taskId;
    /**
     * 任务类型
     */
    private String taskType;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务描述
     */
    private String taskDescription;
    /**
     * 任务附件
     */
    private Date taskAccessory;
    /**
     * 教师id发起人
     */
    private String teacherId;
    /**
     * 班级id
     */
    private String classId;
    /**
     * 创建人
     */
    private Date createdName;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 修改人
     */
    private String updateName;
    /**
     * 数据有效性
     */
    private String useFlag;

    public MoyuTaskPojo(Double taskId, String taskType, String taskName, String taskDescription, Date taskAccessory, String teacherId, String classId, Date createdName, String createdTime, String updateTime, String updateName, String useFlag) {
        this.taskId = taskId;
        this.taskType = taskType;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskAccessory = taskAccessory;
        this.teacherId = teacherId;
        this.classId = classId;
        this.createdName = createdName;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
        this.useFlag = useFlag;
    }

    public MoyuTaskPojo() {
    }

    public Double getTaskId() {
        return taskId;
    }

    public void setTaskId(Double taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskAccessory() {
        return taskAccessory;
    }

    public void setTaskAccessory(Date taskAccessory) {
        this.taskAccessory = taskAccessory;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Date getCreatedName() {
        return createdName;
    }

    public void setCreatedName(Date createdName) {
        this.createdName = createdName;
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

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }
}
