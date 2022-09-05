package college.moyu.controller;

import college.moyu.service.TestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    TestServiceInterface testService;

    @RequestMapping("/test")
    @ResponseBody
    public List<String> Test(){
        return testService.testData();
    }
}
