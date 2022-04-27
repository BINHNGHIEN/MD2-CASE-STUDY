package com.company.model;

import java.io.Serializable;
import java.security.PrivateKey;

public class NhomDanhBa implements Serializable {
    private int id;
    private String name;

    public NhomDanhBa() {
    }

    public NhomDanhBa(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NhomDanhBa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
