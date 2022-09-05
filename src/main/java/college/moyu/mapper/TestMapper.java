package college.moyu.mapper;

import college.moyu.pojo.testStu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {

    List<testStu> testData();
}
