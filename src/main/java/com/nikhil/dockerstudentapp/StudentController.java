package com.nikhil.dockerstudentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return repo.findAll();
//        return List.of(
//                new Student(1, "Nikhil", 21),
//                new Student(2, "Nithin", 23)
//        );
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Student s = new Student();
        s.setName("Madhukar");
        s.setAge(19);
        repo.save(s);
    }
}
