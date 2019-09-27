package com.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * Description:
 *
 * @Author: wxn
 * @Date: 2019/7/10
 * @Version 1.0
 */
@Controller
public class HelloController {
//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private Integer age;
//    @Value("${sex}")
//    private String sex;
//    @RequestMapping("/hello")
//    public String hello(){
//        return name+age+sex;
//    }
    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));


        System.out.println("wolaiye");
        return "hello";
    }
}
