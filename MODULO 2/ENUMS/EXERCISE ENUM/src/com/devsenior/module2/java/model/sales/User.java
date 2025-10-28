package com.devsenior.module2.java.model.sales;

public class User {
    private String name;
    private Boolean active;

    public User(String name, Boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {
        return active;
    }

}