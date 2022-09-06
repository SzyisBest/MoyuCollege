package college.moyu.service.impl;

import college.moyu.mapper.SecondCollegeRoleMapper;
import college.moyu.service.SecondCollegeRoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondCollegeRoleServiceImplements implements SecondCollegeRoleServiceInterface {
    @Autowired
    SecondCollegeRoleMapper secondCollegeRoleMapper;
}
