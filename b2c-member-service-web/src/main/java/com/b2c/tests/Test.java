package com.b2c.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.b2c.IStudentService;

/**
 * Created by Administrator on 2017/7/15 0015.
 */

@RestController
public class Test {

    @Autowired
    private IStudentService studentService;


    @RequestMapping("/aaa")
    public Student select(String name){

        Student student = studentService.selectByName(name);

        return student;
    }


}
