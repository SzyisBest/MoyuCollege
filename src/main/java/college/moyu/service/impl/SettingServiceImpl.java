package college.moyu.service.impl;

import college.moyu.mapper.SettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingServiceImpl {

    @Autowired
    SettingMapper settingMapper;
}
