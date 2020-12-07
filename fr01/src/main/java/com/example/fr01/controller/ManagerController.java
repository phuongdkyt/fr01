package com.example.fr01.controller;

import com.example.fr01.services.ManagerService;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    //private ManagerService managerService;

    @GetMapping
    public List<Manager> read(){
        //return managerService.read();
    }


}
