package com.myleaning.MVC.controller;

import com.myleaning.MVC.entity.student;
import com.myleaning.MVC.repository.studentRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class studentController {

    private final studentRepo studentRepo;

    public studentController(studentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    @GetMapping("/student")
    public List<student> getStudent(){
        return studentRepo.findAll();
    }




}
