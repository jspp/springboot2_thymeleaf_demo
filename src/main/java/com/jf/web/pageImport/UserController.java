package com.jf.web.pageImport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "pageImport/userInfo";
    }

    @RequestMapping("/userInfo02")
    public String userInfo02(HttpServletRequest request){
        logger.info(" ★ ★★★ /userInfo02   ★ ★★★  ");
        return "pageImport/userInfo02";
    }

    @RequestMapping("/userInfoAjax")
    @ResponseBody
    public String userInfoAjax(@RequestParam(name = "workCertUrls[]") String[] workCertUrls){
        logger.info(" ★ ★★★ /userInfoAjax   ★ ★★★ workCertUrls "+workCertUrls[0]);
        return "success";
    }

}
