package lesson3.homeWork3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();


        employees.add(new Employee("Борис", 12, 12, 2000, "Сварщик", 12000));
        employees.add(new Employee("Александр", 1, 9, 1987, "Монтажник", 10000));
        employees.add(new Manager("Евгений", 9, 7, 1990, "Менеджер", 20000));


        System.out.println("До повышения:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Manager.raiseSalaries(employees, 12350);

        System.out.println("\nПосле повышения:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nСравнение дат:");
        System.out.println("Борис vs Александр: " + employees.get(0).compareDates(employees.get(1)));
        System.out.println("Борис vs Евгений: " + employees.get(0).compareDates(employees.get(2)));

    }
}

