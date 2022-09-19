package college.moyu.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @date : 2022-9-8
 * @desc : 学生表
 */
public class MoyuStudentPojo implements Serializable, Cloneable {

    /**
     * 学生id
     */
    private String stuId;
    /**
     * 学生姓名
     */
    private String stuName;
    /**
     * 学生学号
     */
    private String stuNumber;
    /**
     * 学生年龄
     */
    private int stuAge;
    /**
     * 学生性别
     */
    private String stuGender;
    /**
     * 学生身份证号
     */
    private String stuIdcardnumber;
    /**
     * 学生电话号码
     */
    private String stuPhonenumber;
    /**
     * 学生地址
     */
    private String stuAddress;
    /**
     * 学生籍贯
     */
    private String stuNativeplace;
    /**
     * 学生民族
     */
    private String stuNationality;
    /**
     * 学生类型
     */
    private String stuType;
    /**
     * 学生学制
     */
    private int stuSchoolinglength;
    /**
     * 学生入学时间
     */
    private Date stuEnrollmenttime;
    /**
     * 学生毕业时间
     */
    private Date stuGraduationtime;
    /**
     * 学生二级学院名称
     */
    private String stuSecondcollege;
    /**
     * 学生二级学院编号
     */
    private String stuSecondcollegecode;
    /**
     * 学生专业名称
     */
    private String stuMajor;
    /**
     * 学生专业编号
     */
    private String stuMajorcode;
    /**
     * 学生班级编号
     */
    private String stuClasscode;
    /**
     * 学生状态
     */
    private String stuStatus;
    /**
     * 学生宿舍号
     */
    private String stuDomitorynumber;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 创建人名称
     */
    private String createdName;
    /**
     * 创建人编号
     */
    private String createdCode;
    /**
     * 修改人名称
     */
    private String modifyName;
    /**
     * 修改人编号
     */
    private String modifyCode;
    /**
     * 数据有效性
     */
    private String useFlag;

    /**
     * 学生id
     */
    public String getStuId() {
        return this.stuId;
    }

    /**
     * 学生id
     **/
    public String setStuId(String stuId) {
        return this.stuId;
    }

    /**
     * 学生姓名
     */
    public String getStuName() {
        return this.stuName;
    }

    /**
     * 学生姓名
     */
    public String setStuName(String stuName) {
        return this.stuName;
    }

    /**
     * 学生学号
     */
    public String getStuNumber() {
        return this.stuNumber;
    }

    /**
     * 学生学号
     */
    public String setStuNumber(String stuNumber) {
        return this.stuNumber;
    }

    /**
     * 学生年龄
     */
    public int getStuAge() {
        return this.stuAge;
    }

    /**
     * 学生年龄
     */
    public int setStuAge(int stuAge) {
        return this.stuAge;
    }

    /**
     * 学生性别
     */
    public String getStuGender() {
        return this.stuGender;
    }

    /**
     * 学生性别
     */
    public String setStuGender(String stuGender) {
        return this.stuGender;
    }

    /**
     * 学生身份证号
     */
    public String getStuIdcardnumber() {
        return this.stuIdcardnumber;
    }

    /**
     * 学生身份证号
     */
    public String setStuIdcardnumber(String stuIdcardnumber) {
        return this.stuIdcardnumber;
    }

    /**
     * 学生电话号码
     */
    public String getStuPhonenumber() {
        return this.stuPhonenumber;
    }

    /**
     * 学生电话号码
     */
    public String setStuPhonenumber(String stuPhonenumber) {
        return this.stuPhonenumber;
    }

    /**
     * 学生地址
     */
    public String getStuAddress() {
        return this.stuAddress;
    }

    /**
     * 学生地址
     */
    public String setStuAddress(String stuAddress) {
        return this.stuAddress;
    }

    /**
     * 学生籍贯
     */
    public String getStuNativeplace() {
        return this.stuNativeplace;
    }

    /**
     * 学生籍贯
     */
    public String setStuNativeplace(String stuNativeplace) {
        return this.stuNativeplace;
    }

    /**
     * 学生民族
     */
    public String getStuNationality() {
        return this.stuNationality;
    }

    /**
     * 学生民族
     */
    public String setStuNationality(String stuNationality) {
        return this.stuNationality;
    }

    /**
     * 学生类型
     */
    public String getStuType() {
        return this.stuType;
    }

    /**
     * 学生类型
     */
    public String setStuType(String stuType) {
        return this.stuType;
    }

    /**
     * 学生学制
     */
    public int getStuSchoolinglength() {
        return this.stuSchoolinglength;
    }

    /**
     * 学生学制
     */
    public int setStuSchoolinglength(int stuSchoolinglength) {
        return this.stuSchoolinglength;
    }

    /**
     * 学生入学时间
     */
    public Date getStuEnrollmenttime() {
        return this.stuEnrollmenttime;
    }

    /**
     * 学生入学时间
     */
    public Date setStuEnrollmenttime(Date stuEnrollmenttime) {
        return this.stuEnrollmenttime;
    }

    /**
     * 学生毕业时间
     */
    public Date getStuGraduationtime() {
        return this.stuGraduationtime;
    }

    /**
     * 学生毕业时间
     */
    public Date setStuGraduationtime(Date stuGraduationtime) {
        return this.stuGraduationtime;
    }

    /**
     * 学生二级学院名称
     */
    public String getStuSecondcollege() {
        return this.stuSecondcollege;
    }

    /**
     * 学生二级学院名称
     */
    public String setStuSecondcollege(String stuSecondcollege) {
        return this.stuSecondcollege;
    }

    /**
     * 学生二级学院编号
     */
    public String getStuSecondcollegecode() {
        return this.stuSecondcollegecode;
    }

    /**
     * 学生二级学院编号
     */
    public String setStuSecondcollegecode(String stuSecondcollegecode) {
        return this.stuSecondcollegecode;
    }

    /**
     * 学生专业名称
     */
    public String getStuMajor() {
        return this.stuMajor;
    }

    /**
     * 学生专业名称
     */
    public String setStuMajor(String stuMajor) {
        return this.stuMajor;
    }

    /**
     * 学生专业编号
     */
    public String getStuMajorcode() {
        return this.stuMajorcode;
    }

    /**
     * 学生专业编号
     */
    public String setStuMajorcode(String stuMajorcode) {
        return this.stuMajorcode;
    }

    /**
     * 学生班级编号
     */
    public String getStuClasscode() {
        return this.stuClasscode;
    }

    /**
     * 学生班级编号
     */
    public String setStuClasscode(String stuClasscode) {
        return this.stuClasscode;
    }

    /**
     * 学生状态
     */
    public String getStuStatus() {
        return this.stuStatus;
    }

    /**
     * 学生状态
     */
    public String setStuStatus(String stuStatus) {
        return this.stuStatus;
    }

    /**
     * 学生宿舍号
     */
    public String getStuDomitorynumber() {
        return this.stuDomitorynumber;
    }

    /**
     * 学生宿舍号
     */
    public String setStuDomitorynumber(String stuDomitorynumber) {
        return this.stuDomitorynumber;
    }

    /**
     * 用户id
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 用户id
     */
    public String setUserId(String userId) {
        return this.userId;
    }

    /**
     * 修改时间
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * 修改时间
     */
    public Date setModifyTime(Date modifyTime) {
        return this.modifyTime;
    }

    /**
     * 创建时间
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * 创建时间
     */
    public Date setCreatedTime(Date createdTime) {
        return this.createdTime;
    }

    /**
     * 创建人名称
     */
    public String getCreatedName() {
        return this.createdName;
    }

    /**
     * 创建人名称
     */
    public String setCreatedName(String createdName) {
        return this.createdName;
    }

    /**
     * 创建人编号
     */
    public String getCreatedCode() {
        return this.createdCode;
    }

    /**
     * 创建人编号
     */
    public String setCreatedCode(String createdCode) {
        return this.createdCode;
    }

    /**
     * 修改人名称
     */
    public String getModifyName() {
        return this.modifyName;
    }

    /**
     * 修改人名称
     */
    public String setModifyName(String modifyName) {
        return this.modifyName;
    }

    /**
     * 修改人编号
     */
    public String getModifyCode() {
        return this.modifyCode;
    }

    /**
     * 修改人编号
     */
    public String setModifyCode(String modifyCode) {
        return this.modifyCode;
    }

    /**
     * 数据有效性
     */
    public String getUseFlag() {
        return this.useFlag;
    }

    /**
     * 数据有效性
     */
    public String setUseFlag(String useFlag) {
        return this.useFlag;
    }

}