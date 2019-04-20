package com.jf.web.url;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * url 跳转 和 CTX 上下文
 */
@Controller
public class UrlDemoController {

     static Logger logger = LoggerFactory.getLogger(UrlDemoController.class);

    @RequestMapping("/url/demo")
    public String userInfo(HttpServletRequest request){
        logger.info(" ★ ★★★ /url   ★ ★★★  ");
        return "url/urldemo";
    }

}
