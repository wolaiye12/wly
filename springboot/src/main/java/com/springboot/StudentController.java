package com.springboot;

import com.springboot.mapper.StudentMapper;
import com.springboot.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 *
 * @Author: wxn
 * @Date: 2019/7/11
 * @Version 1.0
 */


@Controller
public class StudentController{

    @Autowired
    StudentMapper mapperdd;
    @RequestMapping("/listStudent")
    public  String listStudent(Model model){
        List<Student> students=mapperdd.findAll();
        model.addAttribute("students",students);
        return "listStudent";
    }

}
