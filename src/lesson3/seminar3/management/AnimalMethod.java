package lesson3.seminar3.management;

import lesson3.seminar3.animals.Animal;
import lesson3.seminar3.animals.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AnimalMethod {

    public static ArrayList<Animal> animals = new ArrayList<>();

    public static void addNewAnimal(ArrayList<Animal> animals) {
        Scanner scanner = new Scanner(System.in);
        String string = "Формат ввода 'Имя', 'Цвет', 'Возраст'";

        System.out.println("выберите животное, которое хотите добавить: ");
        System.out.println("1: Cat");
        System.out.println("2: Dog");
        System.out.println("3: Bird");

        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(string);
            animals.add(new Cat(scanner.next(), scanner.next(), scanner.nextInt()));
        } else if (num == 2) {
            System.out.println(string);
            animals.add(new Dog(scanner.next(), scanner.next(), scanner.nextInt()));
        } else if (num == 3) {
            System.out.println(string);
            animals.add(new Bird(scanner.next(), scanner.next(), scanner.nextInt()));
        } else {
            System.out.println("Вы ввели не правильное значение:");
        }
    }

    public static ArrayList<Animal> getAnimals(ArrayList<Animal> animals) {
        return animals;
    }

//    public static int counter(Collections<Animal> animals) {
//        int count = Collections.frequency((animals), "Cat"); // почему у меня не считает?
//        System.out.println(count);
//        return count;
//    }
}

