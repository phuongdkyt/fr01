package com.example.fr01.controller;

import com.example.fr01.model.entities.QuestionEntity;
import com.example.fr01.model.in.QuestionCreate;
import com.example.fr01.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public List<QuestionEntity> read() {
        return questionService.read();
    }

    @PostMapping
    public QuestionEntity create(@RequestBody QuestionCreate userCreate) {
        return questionService.create(userCreate);
    }

    @DeleteMapping
    public String create(@PathVariable("/{id}") int id ) {
        return questionService.delete(id);
    }

}