package org.example;


public class Camel extends Animal{


    public Camel(String name, String birthday, String skils, String view) {
        super(name, birthday, "ходит, садится, плюет", "pets");
    }

    public void setSkils (Camel camel) {
        this.skils = skils;
    }

    @Override
    public void PrintSkils() {
        System.out.println("Выполняет команды: ходит, садится, плюет" );
    }
}
