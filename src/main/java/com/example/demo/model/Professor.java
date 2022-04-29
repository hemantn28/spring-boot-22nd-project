package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name ="Professor_College")
public class Professor {

    @Id
    @GeneratedValue
    int id;
    String name;
    @Column(name= "Prof_sub")
    String subject;
    int age;

    public Professor() {
    }

    public Professor(String name, String subject, int age) {
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
