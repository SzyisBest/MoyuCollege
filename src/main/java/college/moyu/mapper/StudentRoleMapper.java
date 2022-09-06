package college.moyu.mapper;

import college.moyu.pojo.testStu;

import java.util.List;

public interface StudentRoleMapper {

    List<testStu> testData();

    void addData(testStu stu);
}
