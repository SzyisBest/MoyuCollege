package college.moyu.controller;

import college.moyu.service.SettingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingController {
    @Autowired
    SettingServiceInterface settingServiceInterface;

}
