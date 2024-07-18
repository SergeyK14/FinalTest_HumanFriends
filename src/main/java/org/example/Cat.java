package org.example;


public class Cat extends Animal{


    public Cat (String name, String birthday, String skils, String view) {
        super(name, birthday, "бегает, мяукает, сидит, играет", "pets");
    }


    public void setSkils (Cat cat) {
        this.skils = skils;
    }



    @Override
    public void PrintSkils() {
        System.out.println("Выполняет команды: бегает, мяукает, сидит, играет" );
    }
}
