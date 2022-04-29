package com.example.demo.controller;

import com.example.demo.model.Worker;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WorkerController {

    ArrayList<Worker> workerArrayList=new ArrayList<>();

    //create

    @RequestMapping("/add_worker")
    public String add(@RequestBody Worker worker){
        //Worker worker=new Worker("Virendar","Accounting",8520);
        workerArrayList.add(worker);
        return "worker added successfully";
    }


    //Read => Get

    @RequestMapping("/get_worker")
    public ArrayList<Worker> getWorkerArrayList() {
        return workerArrayList;
    }


    //Update


    @RequestMapping("/update_worker")
    public String update(){
        workerArrayList.get(1).setDept("Sales");
        return "worker updated successfully";
    }


    //Delete

    @RequestMapping("/delete_worker")
    public String delete(){
        workerArrayList.remove(2);
        return "worker deleted successfully";
    }
}
