package com.idopy.qcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 腾讯测试首页
 */
@RestController
@RequestMapping("/qcloud")
public class IndexController {


    @RequestMapping(value = {"","/"})
    public ModelAndView index(String method) {
        if (method.equals("post")) {
            return new ModelAndView("qcloud/index_post");
        }
        return new ModelAndView("qcloud/index_put");
    }
}
