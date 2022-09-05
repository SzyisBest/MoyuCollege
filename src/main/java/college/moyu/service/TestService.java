package college.moyu.service;

import college.moyu.mapper.TestMapper;
import college.moyu.pojo.testStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TestService implements TestServiceInterface{

    @Autowired
    TestMapper testMapper;

    @Override
    public List<testStu> testData() {
        return testMapper.testData();
    }
}
