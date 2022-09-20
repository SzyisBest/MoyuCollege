package college.moyu.service.impl;

import college.moyu.mapper.SettingMapper;
import college.moyu.pojo.MoyuMenuPojo;
import college.moyu.service.SettingServiceInterface;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingServiceImpl implements SettingServiceInterface {

    @Autowired
    SettingMapper settingMapper;

    @Override
    public List<MoyuMenuPojo> selectMenuList(JSONObject object) {
        return settingMapper.selectMenuList(object.getInteger("id"));
    }
}
