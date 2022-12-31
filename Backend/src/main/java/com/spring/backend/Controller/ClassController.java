package com.spring.backend.Controller;

import com.spring.backend.Entity.Class;
import com.spring.backend.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping("/class")
    public Class saveClass(@RequestBody Class aClass){
        return classService.save(aClass);
    }
    @GetMapping("/class")
    public List<Class> getAll(){
        return classService.getAll();
    }
}
