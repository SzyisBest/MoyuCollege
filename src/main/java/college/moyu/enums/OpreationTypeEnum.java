package college.moyu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OpreationTypeEnum {

    /*
     新增
    */
    INSERT("新增", "INSERT"),
    /*
     添加
    */
    ADD("添加", "ADD"),
    /*
     更新
    */
    UPDATE("更新", "UPDATE"),
    /*
     修改
    */
    MODIFY("修改", "MODIFY"),
    /*
     修改
    */
    ALTER("修改", "ALTER"),
    /*
     删除
    */
    DELETE("删除", "DELETE"),
    /*
     取消
    */
    CANCEL("取消", "CANCEL"),
    /*
     移除
    */
    REMOVE("移除", "REMOVE"),
    /*
     测试
    */
    TEST("测试", "TEST"),
    /*
     查询
    */
    QUERY("查询", "QUERY"),
    /*
     查询
    */
    SELECT("查询", "SELECT"),
    /*
     查询
    */
    FIND("查询", "FIND");

    public final String desc;
    public final String type;


    //覆盖方法
    @Override
    public String toString() {
        return this.desc+"-"+this.type;
    }
}
