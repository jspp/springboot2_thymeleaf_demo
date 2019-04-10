package com.jf.web;

import com.jf.pojo.User;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 国际化 测试
 * ouyangjie
 * 2019/4/10
 * 13:10
 */
@Controller
public class IndexController {


    /**
     *  没有数据的情况
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /** 有数据的情况
     * @return
     */
    @RequestMapping("/showCase")
    public String change(HttpServletRequest request){
        User user = new User();
        user.setUserName("张三");
        user.setAge(30);
        user.setUserId(UUID.randomUUID().toString());
        user.setBirthday(DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date()));
        request.setAttribute("user",user);
        return "index";
    }

}
