package college.moyu.service.impl;

import college.moyu.mapper.TeacherRoleMapper;
import college.moyu.service.TeacherRoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherRoleServiceImplements implements TeacherRoleServiceInterface {
    @Autowired
    TeacherRoleMapper teacherRoleMapper;
}
