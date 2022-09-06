package college.moyu.controller;

import college.moyu.pojo.testStu;
import college.moyu.service.StudentRoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentRoleController {

    @Autowired
    StudentRoleServiceInterface testService;

    @RequestMapping("/test")
    @ResponseBody
    public List<testStu> Test(){
        return testService.testData();
    }
}
