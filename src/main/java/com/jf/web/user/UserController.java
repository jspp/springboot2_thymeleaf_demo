package com.jf.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户相关
 * ouyangjie
 * 2019/4/10
 * 13:10
 */
@Controller
public class UserController {

     static Logger logger = LoggerFactory.getLogger(UserController.class);


    @RequestMapping("/userInfo")
    public String userInfo(HttpServletRequest request){
        logger.info(" ★ ★★★ /userInfo   ★ ★★★  ");
        return "user/userInfo";
    }

    @RequestMapping("/userInfo02")
    public String userInfo02(HttpServletRequest request){
        logger.info(" ★ ★★★ /userInfo02   ★ ★★★  ");
        return "user/userInfo02";
    }

}
