package org.example;


public class Donkey extends Animal{


    public Donkey (String name, String birthday, String skils, String view) {
        super(name, birthday, "ходит, лежит", "pack animals");
    }

    public void setSkils (Donkey donkey) {
        this.skils = skils;
    }

    @Override
    public void PrintSkils() {
        System.out.println("Выполняет команды: ходит, лежит" );
    }
}
