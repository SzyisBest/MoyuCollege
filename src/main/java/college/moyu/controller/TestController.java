package college.moyu.controller;

import college.moyu.pojo.testStu;
import college.moyu.service.TestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    TestServiceInterface testService;

    @RequestMapping("/test")
    @ResponseBody
    public List<testStu> Test(){
        return testService.testData();
    }
}
