package college.moyu.pojo;

public class MoyuClassPojo {

    /**
     * id
     */
    private String id;
    /**
     * 课程id
     */
    private String classId;
    /**
     * 课程名称
     */
    private String className;
    /**
     * 教师id
     */
    private String teacherId;
    /**
     * 数据有效性
     */
    private String useFlag;
    /**
     * 课程类型
     */
    private String classType;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 课程学分
     */
    private String classCredit;

    public MoyuClassPojo() {
    }

    public MoyuClassPojo(String id, String classId, String className, String teacherId, String useFlag, String classType, String createdTime, String updateTime, String classCredit) {
        this.id = id;
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
        this.useFlag = useFlag;
        this.classType = classType;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.classCredit = classCredit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
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

    public String getClassCredit() {
        return classCredit;
    }

    public void setClassCredit(String classCredit) {
        this.classCredit = classCredit;
    }
}
