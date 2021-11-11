package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private List<Task> taskList = new ArrayList<>();
    private int id = 0;

    @PostMapping("/newtask")
    public void setNewTask(@RequestParam String name, @RequestParam String textTask){
        taskList.add(new Task(++id, name, textTask));
    }

    @GetMapping("/gettask/{id}")
    public Task getTask(@PathVariable int id){
        return taskList.get(id);
    }

    @GetMapping("/getalltasks")
    public List<Task> getAllTask(){
        return taskList;
    }

    @DeleteMapping("/deletetask/{id}")
    public String removeTask(@PathVariable int id){
        taskList.remove(id);
        return "task with id " + id + " was remove";
    }
    ////new commit

}
