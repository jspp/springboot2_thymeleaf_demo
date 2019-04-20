package com.jf.web.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 国际化相关用法
 */
@Controller
public class I18nDemoController {

     static Logger logger = LoggerFactory.getLogger(I18nDemoController.class);

    @RequestMapping("/i18n")
    public String userInfo(HttpServletRequest request){
        logger.info(" ★ ★★★ /i18n   ★ ★★★  ");
        return "i18n/i18ndemo";
    }

}
