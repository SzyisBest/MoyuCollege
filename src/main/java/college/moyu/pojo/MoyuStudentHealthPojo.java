package college.moyu.pojo;

public class MoyuStudentHealthPojo {

    /**
     * id
     */
    private String id;
    /**
     * 学生id
     */
    private String stuId;
    /**
     * 温度
     */
    private String stuTemperature;
    /**
     * 是否去过高风险
     */
    private String isHighrisk;
    /**
     * 是否发烧
     */
    private String isFever;
    /**
     * 是否有过密接
     */
    private String isContact;
    /**
     * 是否出外省
     */
    private String isGoout;
    /**
     * 家人健康状态
     */
    private String isFamilyhealth;
    /**
     * 位置
     */
    private String position;
    /**
     * 其他不适症状
     */
    private String elseOption;

    public MoyuStudentHealthPojo() {
    }

    public MoyuStudentHealthPojo(String id, String stuId, String stuTemperature, String isHighrisk, String isFever, String isContact, String isGoout, String isFamilyhealth, String position, String elseOption) {
        this.id = id;
        this.stuId = stuId;
        this.stuTemperature = stuTemperature;
        this.isHighrisk = isHighrisk;
        this.isFever = isFever;
        this.isContact = isContact;
        this.isGoout = isGoout;
        this.isFamilyhealth = isFamilyhealth;
        this.position = position;
        this.elseOption = elseOption;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuTemperature() {
        return stuTemperature;
    }

    public void setStuTemperature(String stuTemperature) {
        this.stuTemperature = stuTemperature;
    }

    public String getIsHighrisk() {
        return isHighrisk;
    }

    public void setIsHighrisk(String isHighrisk) {
        this.isHighrisk = isHighrisk;
    }

    public String getIsFever() {
        return isFever;
    }

    public void setIsFever(String isFever) {
        this.isFever = isFever;
    }

    public String getIsContact() {
        return isContact;
    }

    public void setIsContact(String isContact) {
        this.isContact = isContact;
    }

    public String getIsGoout() {
        return isGoout;
    }

    public void setIsGoout(String isGoout) {
        this.isGoout = isGoout;
    }

    public String getIsFamilyhealth() {
        return isFamilyhealth;
    }

    public void setIsFamilyhealth(String isFamilyhealth) {
        this.isFamilyhealth = isFamilyhealth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getElseOption() {
        return elseOption;
    }

    public void setElseOption(String elseOption) {
        this.elseOption = elseOption;
    }
}
