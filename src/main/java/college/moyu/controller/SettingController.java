package college.moyu.controller;

import cn.hutool.http.server.HttpServerRequest;
import cn.hutool.http.server.HttpServerResponse;
import college.moyu.service.SettingServiceInterface;
import college.moyu.utils.RequestBody;
import college.moyu.utils.ResponseStatus;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/moyu")
@CrossOrigin
public class SettingController {
    @Autowired
    SettingServiceInterface settingServiceInterface;

    @RequestMapping("/menuList")
    @ResponseBody
    public JSONObject SelectMenuList(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return ResponseStatus.createSuccessStatus(settingServiceInterface.selectMenuList(RequestBody.RequestBodyExplain(httpServletRequest)));
    }

}
