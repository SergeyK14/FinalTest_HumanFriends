package org.example;


import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ZooAccounting zoo = new ZooAccounting();




        while (true) {
            System.out.println("Выбeрите команду:");
            System.out.println("1. Добавить питомца");
            System.out.println("2. Обучить питомца навыку");
            System.out.println("3. Показать все навыки питомца");
            System.out.println("4. Отсортировать питомцев по дате рождения");
            System.out.println("5. Показать количество питомцев");
            System.out.println("6. Выход");

            Scanner sc = new Scanner(System.in);
            int com = sc.nextInt();
            sc.nextLine();


            switch (com){
                case 1:
                    System.out.println("Введите вид (Dog, Cat ... else): ");
                    String newAnimal = sc.nextLine();
                    System.out.println("Введите имя: ");
                    String name = sc.nextLine();
                    System.out.println("Введите дату рождения (в формате: 1111-11-11): ");
                    String birthday = sc.nextLine();
                    System.out.println("Введите навыки: ");
                    String skils = sc.nextLine();
                    System.out.println("Введите категорию (pets/pack animals): ");
                    String view = sc.nextLine();
                    zoo.addAnimal(newAnimal, name, birthday, skils, view);
                    break;
                case 2:
                    System.out.println("Введите имя питомца, которого хотите обучить: ");
                    String name1 = sc.nextLine();
                    System.out.println("Введите навык для обучения:  ");
                    String skils1 = sc.nextLine();
                    zoo.training (name1, skils1);
                    break;
                case 3:
                    System.out.println("Введите имя: ");
                    String name2 = sc.nextLine();
                    zoo.skilsPrint(name2);
                    break;
                case 4:
                    zoo.sortingByBirthday();
                    break;
                case 5:
                    zoo.animalCount();
                    break;
                case 6:
                    System.out.println("Счастливо!");
                    break;
                default:
                    System.out.println("Команда введена неправильно.");
            System.out.println("\n");
            return;

            }


        }

    }
}