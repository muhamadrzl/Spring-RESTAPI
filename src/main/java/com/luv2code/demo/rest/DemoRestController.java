package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {
    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Bojar", "Elek"));
        theStudents.add(new Student("Abizar","Mayan"));
        theStudents.add(new Student("Ohio" ,"Sumuk"));
//        return theStudents;
    }
    @GetMapping("/students")
    public List<Student> getStudent(){

        return theStudents;

    }

    @GetMapping("/students/{id}")
    public Student getId(@PathVariable Integer id){
        return theStudents.get(id);
    }

}
