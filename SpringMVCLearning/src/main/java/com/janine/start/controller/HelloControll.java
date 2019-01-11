package com.janine.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControll {
    
    // 绑定请求地址
    @RequestMapping("hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据，用于传递到jsp
        modelAndView.addObject("msg", "Hello, spring mvc");
        // 设置视图名字，用于响应用户
        modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");
        
        return modelAndView;
    }
}
