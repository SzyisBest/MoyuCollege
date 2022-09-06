package college.moyu.service.impl;

import college.moyu.mapper.MainCollegeRoleMapper;
import college.moyu.service.MainCollegeRoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainCollegeRoleServiceImplements implements MainCollegeRoleServiceInterface {

    @Autowired
    MainCollegeRoleMapper mainCollegeRoleMapperInterface;
}
