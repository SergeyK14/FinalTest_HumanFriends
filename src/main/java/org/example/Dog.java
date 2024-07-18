package org.example;


public class Dog extends Animal{


    public Dog(String name, String birthday, String skils, String view) {
        super(name, birthday, "здоровается, бегает, лает, сидит", "pets");
    }

    public void setSkils (Dog dog) {
        this.skils = skils;
    }

    @Override
    public void PrintSkils() {
        System.out.println("Выполняет команды: здоровается, бегает, лает, сидит" );
    }
}
