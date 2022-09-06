package college.moyu.service.impl;

import college.moyu.mapper.StudentRoleMapper;
import college.moyu.pojo.testStu;
import college.moyu.service.StudentRoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentRoleServiceImplements implements StudentRoleServiceInterface {

    @Autowired
    StudentRoleMapper studentRoleMapper;

    @Override
    public List<testStu> testData() {
        return studentRoleMapper.testData();
    }
}
