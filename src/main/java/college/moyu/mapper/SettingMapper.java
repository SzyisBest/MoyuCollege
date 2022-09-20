package college.moyu.mapper;

import college.moyu.pojo.MoyuMenuPojo;

import java.util.List;

public interface SettingMapper {
    List<MoyuMenuPojo> selectMenuList(int roleId);
}
