package org.example;


import java.text.SimpleDateFormat;
import java.util.*;

public class ZooAccounting {

    public Map<String, Animal> animals;

    public ZooAccounting (){
        this.animals = new HashMap<>();
    }

    public void addAnimal(String newAnimal, String name, String birthday, String skils, String view){
        Animal animal;
        if (newAnimal.equalsIgnoreCase("Camel")){
            animal = new Camel(name, birthday, skils, view);
        } else  if (newAnimal.equalsIgnoreCase("Dog")){
            animal = new Dog(name, birthday, skils, view);
        } else  if (newAnimal.equalsIgnoreCase("Cat")){
            animal = new Cat(name, birthday, skils, view);
        } else  if (newAnimal.equalsIgnoreCase("Horse")){
            animal = new Horse(name, birthday, skils, view);
        } else  if (newAnimal.equalsIgnoreCase("Donkey")){
            animal = new Donkey(name, birthday, skils, view);
        } else  if (newAnimal.equalsIgnoreCase("Hamster")){
            animal = new Hamster(name, birthday, skils, view);
        } else {
            System.out.println("Вид некорректен");
            return;
        }
        animals.put(name, animal);
    }

    public void training (String name, String newskils){
        Animal animal = animals.get(name);
        if (name != null){
            animal.setSkils(animal.getSkils() + ", " + newskils);
            System.out.println("Ваш питомец " + name + " научился  теперь и " + newskils);
            System.out.println("Команды питомца: " + animal.getSkils());
        } else {
            System.out.println("Имя не может быть пустым или введено некорректно");
        }
    }

    public void skilsPrint (String name){
        Animal animal = animals.get(name);
        if (name != null){
            animal.PrintSkils();
        } else {
            System.out.println("Имя не может быть пустым или введено некорректно");
        }
    }

    public void sortingByBirthday(){
        System.out.println("Эта опция пока на стадии доработки");
        //C sorting-м по датам рождения не получилось
        //Map<String, Animal> ani = new HashMap<>();
        //for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            //String key = entry.getKey();
            //Animal value = entry.getValue();
            //ani.put(value.birthday, value);
        //}
        //Map.sort(ani, new animalComparator());
        //System.out.println(ani);

        // Еще 2 метода, не работает parse
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //format.parse(value.birthday);
        //Date date = new Date();
        //date.setTime(Date.parse(value.birthday));

    }

    public void animalCount (){
        System.out.println("В зоопарке: " + animals.size() + " питомцев");
    }


}