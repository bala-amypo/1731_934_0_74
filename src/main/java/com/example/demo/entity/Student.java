package com.example.demo.entity;

public class Studententity {
    private int id;
    private String name;
    private int cgp;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Studententity() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCgp() {
        return cgp;
    }
    public void setCgp(int cgp) {
        this.cgp = cgp;
    }
    public Studententity(int id, String name, int cgp) {
        this.id = id;
        this.name = name;
        this.cgp = cgp;
    }

}
