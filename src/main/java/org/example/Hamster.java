package org.example;


public class Hamster extends Animal{


    public Hamster (String name, String birthday, String skils, String view) {
        super(name, birthday, "бегает, лежит, играет", "pets");
    }

    public void setSkils (Hamster hamster) {
        this.skils = skils;
    }

    @Override
    public void PrintSkils() {
        System.out.println("Выполняет команды: бегает, лежит, играет" );
    }
}
