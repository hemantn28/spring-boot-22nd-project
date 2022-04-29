package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBProfessorController {

    //create

    @Autowired
    ProfessorRepository repository;

    @RequestMapping(value = "add_professor_db", method = RequestMethod.POST)
    public String add(@RequestBody Professor professor){
        repository.save(professor);
        return "professor added to DB successfully";

    }

    //get

    @RequestMapping(value= "get_professor_db", method= RequestMethod.GET)
     public List<Professor> getAll(){
        return repository.findAll();
     }

     @RequestMapping(value= "update_professor_db",method = RequestMethod.PUT)
     public String update(@RequestParam String name,@RequestParam Integer id){
        Professor professor=repository.getById(id);
        professor.setName("OmPrakash");
        repository.save(professor);
        return "name updated in DB successfully";
     }

     @RequestMapping(value= "delete_professor_db",method = RequestMethod.DELETE)
     public String delete(@RequestParam Integer age){
        repository.deleteById(age);
        return "professor deleted successfully";

     }

}
