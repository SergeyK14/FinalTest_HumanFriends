package org.example;

import java.util.Date;

public abstract class Animal {
    protected String name;
    protected String birthday;
    protected String skils;
    protected String view;

    public Animal(String name, String birthday, String skils, String view){
        this.name = name;
        this.birthday = birthday;
        this.view = view;
        this.skils = skils;
    }

    public void setSkils (String skils) {
        this.skils = skils;
    }
    public String getSkils () {
        return skils;
    }

    public abstract void PrintSkils();

}