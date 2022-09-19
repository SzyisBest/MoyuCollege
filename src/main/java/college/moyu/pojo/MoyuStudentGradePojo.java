package college.moyu.pojo;

public class MoyuStudentGradePojo {

    /**
     * id
     */
    private String id;
    /**
     * 课程id
     */
    private String classId;
    /**
     * 教师id
     */
    private String teacherId;
    /**
     * 学生id
     */
    private String stuId;

    public MoyuStudentGradePojo() {
    }

    public MoyuStudentGradePojo(String id, String classId, String teacherId, String stuId) {
        this.id = id;
        this.classId = classId;
        this.teacherId = teacherId;
        this.stuId = stuId;
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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
