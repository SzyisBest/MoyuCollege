package college.moyu.service.impl;

import college.moyu.mapper.StudentRoleMapper;
import college.moyu.pojo.testStu;
import college.moyu.service.StudentRoleServiceInterface;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AdviceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class StudentRoleServiceImplements implements StudentRoleServiceInterface {

    @Autowired
    StudentRoleMapper studentRoleMapper;

    @Override
    public List<testStu> testData() {
        String str = JSON.toJSON(studentRoleMapper.testData()).toString();
        log.info(str);
//        studentRoleMapper.addData(new testStu(LocalDateTime.now().getMinute() + "分" + LocalDateTime.now().getSecond() + "秒",LocalDateTime.now().getSecond()));
        studentRoleMapper.addData(new testStu(1,"sszzyy",32,"男"));
        //运行时异常代码
        int[] a = new int[5];
        System.out.println(a[6]);
        return null;
    }
}
