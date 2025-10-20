package com.myleaning.MVC.controller;

import com.myleaning.MVC.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@RestController
public class studentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(41, "ayush","dasayush483@gmail.com" );
    }
}
