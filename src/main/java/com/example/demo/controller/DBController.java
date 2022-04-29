package com.example.demo.controller;

import com.example.demo.model.Worker;
import com.example.demo.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBController {

    //create
    @Autowired
    WorkerRepository repository;

    @RequestMapping(value = "/add_worker_db", method = RequestMethod.POST)
    public  String add(@RequestBody Worker worker){

        repository.save(worker);
        return "worker added to DB successfully";
    }

    //get

    @RequestMapping(value = "get_worker_db",method = RequestMethod.GET)
    public List<Worker> getAll(){
        return repository.findAll();
    }
    
    
    
    //update

    @RequestMapping(value="update_worker_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        Worker worker=repository.getById(id);
        worker.setName("Vikas");
        repository.save(worker);
        return "name updated in DB successfully";


    }

    //delete

    @RequestMapping(value = "delete_worker_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "worker deleted successful";
        
    }
}
