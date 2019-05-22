package com.taxiagency.domain;

import java.security.PrivateKey;

public class Driver implements Entity{
    private String id;
    private String name;
    public Driver(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
