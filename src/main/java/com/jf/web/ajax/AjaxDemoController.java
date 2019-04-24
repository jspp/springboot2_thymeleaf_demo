package com.jf.web.ajax;

import com.jf.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *  ajax  相关用法
 */
@Controller
public class AjaxDemoController {

     static Logger logger = LoggerFactory.getLogger(AjaxDemoController.class);

    @RequestMapping("/ajax")
    @ResponseBody
    public List<User> ajax(HttpServletRequest request){
        logger.info(" ★ ★★★ /ajax   ★ ★★★  ");
        List<User> users = new ArrayList<>();
        User user  = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setCreateTime(new Date());
        users.add(user);
        return users;
    }

}
