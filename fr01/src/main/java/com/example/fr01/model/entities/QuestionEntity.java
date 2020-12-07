package com.example.fr01.model.entities;

import javax.persistence.*;

@Entity
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String noidung;

    private String a,b,c,d;

    private String dapan;

    private String capdo;

    private String loaicauhoi;

    public QuestionEntity(){
    }

    @ManyToOne
    @JoinColumn(name = "id_ql")
    private ManagerEntity manager;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDapan() {
        return dapan;
    }

    public void setDapan(String dapan) {
        this.dapan = dapan;
    }

    public String getCapdo() {
        return capdo;
    }

    public void setCapdo(String capdo) {
        this.capdo = capdo;
    }

    public String getLoaicauhoi() {
        return loaicauhoi;
    }

    public void setLoaicauhoi(String loaicauhoi) {
        this.loaicauhoi = loaicauhoi;
    }
}
