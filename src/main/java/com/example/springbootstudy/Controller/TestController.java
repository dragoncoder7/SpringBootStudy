package com.example.springbootstudy.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    private static final Log logger  = LogFactory.getLog(TestController.class);
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg","跟一一哥学习SpringBoot中使用JSP功能!");
        //要跳转到的页面视图名称
        return "index";
    }
    //@RequestMapping(value = "/hello")
    public ModelAndView hello () {
        System.out.println("hello() 方法被调用1");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello, Ma Yuzhe!");
        mv.setViewName("/hello");
        return mv;
    }
    /*@RequestMapping(value = "/hello/index")
    public String index(){
        System.out.println("asdfasdfas");
        return "hello";
    }*/

    @RequestMapping(value = "/hello1")
    public String hello1(){
        System.out.println("hello.springboot的第一个controller");
        return "111";
    }
}