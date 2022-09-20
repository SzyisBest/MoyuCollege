package college.moyu.service;


import college.moyu.pojo.MoyuMenuPojo;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface SettingServiceInterface {

    List<MoyuMenuPojo> selectMenuList(JSONObject object);


}
