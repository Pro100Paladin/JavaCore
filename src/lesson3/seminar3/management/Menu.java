package lesson3.seminar3.management;


import java.util.Collections;
import java.util.Scanner;

import static lesson3.seminar3.management.AnimalMethod.*;

public class Menu {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать: ");
        System.out.println();

        boolean exit = false;

        while (!exit) {
            System.out.println("1: Добавить животное");
            System.out.println("2: Посмотреть возможности животного");
            System.out.println("3: Список имеющихся животных");
            System.out.println("4: Количество имеющихся животных");
            System.out.println("5: Exit");
            System.out.println("Выберете пункт меню: ");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    AnimalMethod.addNewAnimal(animals);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(getAnimals(animals));
                    break;
                case 4:
                    System.out.println(Collections.frequency(animals, "Cat"));
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Не верный выбор меню! Попробуйте снова");
            }
        }
    }

}