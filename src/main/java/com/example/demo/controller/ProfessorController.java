package com.example.demo.controller;

import com.example.demo.model.Professor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProfessorController {

    ArrayList<Professor> professorArrayList=new ArrayList<>();

    @RequestMapping("/add_professor")
    public String add(@RequestBody Professor professor){
        professorArrayList.add(professor);
        return "professor added to DB successfully";

    }

}
