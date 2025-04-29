package org.example.test.model;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int id;
    private String address;
    private String contact;

    public Student() {
    }

    public Student(int id, String name, String address, String contact) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
