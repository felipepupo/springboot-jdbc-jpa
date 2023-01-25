package com.example.springbootjdbcjpa.entity;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String location;
    private Date birthDate;

    public Person() {
        
    }

    public Person(int id, String name, String location, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getbirthDate() {
        return birthDate;
    }

    public void setbirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
    }
}
