package college.moyu.controller;

import college.moyu.service.StudentRoleServiceInterface;
import college.moyu.annotation.CollectionLogger;
import college.moyu.utils.OpreationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentRoleController {

    @Autowired
    StudentRoleServiceInterface testService;

    @RequestMapping("/test")
    @ResponseBody
    @CollectionLogger(Description = "日志收集测试",OpreationType = OpreationType.TEST_TYPE)
    public Object Test(){
        return "2022年9月7日15:41:23";
    }
//    public List<testStu> Test(){
//        return testService.testData();
//    }
}
