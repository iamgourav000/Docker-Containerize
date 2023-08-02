package com.example.learn.containerizespringbootapp.controller;

import com.example.learn.containerizespringbootapp.entity.DemoEntity;
import com.example.learn.containerizespringbootapp.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DockerDemoController {

    @Autowired
    private DemoRepo demoRepo;

    @GetMapping("/check")
    public String checking(){
        return "working fine";
    }

    @PostMapping("/add")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity entity){
        return new ResponseEntity<>(demoRepo.save(entity), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<DemoEntity>> getAll(){
        return new ResponseEntity<>(demoRepo.findAll(),HttpStatus.OK);
    }
}
