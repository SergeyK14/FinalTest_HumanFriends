package org.example;


public class Horse extends Animal{


    public Horse (String name, String birthday, String skils, String view) {
        super(name, birthday, "бегает, ходит, лежит, перепрыгивает через препятствия", "pack animals");
    }

    public void setSkils (Horse horse) {
        this.skils = skils;
    }

    @Override
    public void PrintSkils() {
        System.out.println("Выполняет команды: бегает, ходит, лежит, перепрыгивает через препятствия" );
    }
}
