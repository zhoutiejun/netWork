package com.ztj.tourist.controller;

import com.ztj.tourist.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : zhoutiejun@youngyedu.com, 2019/11/19 0019 下午 16:18
 * @description :
 * @modified : zhoutiejun@youngyedu.com, 2019/11/19 0019 下午 16:18
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/home")
    public String  getaa(){
        return "index";
    }
}
