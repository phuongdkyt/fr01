package com.example.fr01.model.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private int pass;

    public ManagerEntity(){
    }

    @OneToMany(mappedBy = "manager")
    private List<StudentEntity> studentsList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public List<StudentEntity> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<StudentEntity> studentsList) {
        this.studentsList = studentsList;
    }
}
