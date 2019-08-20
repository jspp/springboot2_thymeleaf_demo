package com.jf.config.thymeleafext;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * ouyangjie
 * 2019/8/15
 * 14:31
 */
@Component
public class Qiange {


    /**
     * 获取数据库对应的语言变量
     * @param langKey
     * @return
     */
    public  String getVal(String langKey){
            Locale locale = LocaleContextHolder.getLocale();
            return langKey+" ≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡ from back ≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡"+locale.getCountry();
    }


}
