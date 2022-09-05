package college.moyu.service;

import college.moyu.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService implements TestServiceInterface{

    @Autowired
    TestMapper testMapper;

    @Override
    public List<String> testData() {
        return testMapper.testData();
    }
}
