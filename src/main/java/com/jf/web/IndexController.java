package com.jf.web;

import com.jf.pojo.User;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 展示数据
 * ouyangjie
 * 2019/4/10
 * 13:10
 */
@Controller
public class IndexController {

     static Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     *  没有数据的情况
     * @return
     */
    @RequestMapping("/")
    public String index(HttpServletRequest request){

        logger.info(" ★ ★★★ 进入测试页面   ★ ★★★  ");

        List<User> users = new ArrayList<>();

        User user = new User();
        user.setUserName("张三");
        user.setAge(10);
        user.setUserId(UUID.randomUUID().toString());
        user.setBirthday(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        request.setAttribute("user",user);
        users.add(user);

        User user2 = new User();
        user2.setUserName("李四");
        user2.setAge(20);
        user2.setUserId(UUID.randomUUID().toString());
        user2.setBirthday(DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date()));
        users.add(user2);

        User user3 = new User();
        user3.setUserName("王五");
        user3.setAge(30);
        user3.setUserId(UUID.randomUUID().toString());
        user3.setBirthday(DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date()));
        users.add(user3);

        User user4 = new User();
        user4.setUserName("赵六");
        user4.setAge(40);
        user4.setUserId(UUID.randomUUID().toString());
        user4.setBirthday(DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date()));
        users.add(user4);


        request.setAttribute("userIdStr",user.getUserId());
        request.setAttribute("user",user);
        request.setAttribute("userList",users);

        return "index";
    }

}
