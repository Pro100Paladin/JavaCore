package lesson3.homeWork3;


/**
 * 1. Написать прототип компаратора - метод внутри класса сотрудника,
 * сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 **/
public class Employee {

    protected static int idEmployee;
    private String name;
    private int day;
    private int month;
    private int year;
    private String post;
    private float salary;

    public Employee(String name, int day, int month, int year, String post, float salary) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.post = post;
        this.salary = salary;
    }

    public int compareDates(Employee other) {
        int[] thisDate = {this.day, this.month, this.year};
        int[] otherDate = {other.day, other.month, other.year};

        for (int i = 0; i < 3; i++) {
            int compare = Integer.compare(thisDate[i], otherDate[i]);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник: " + name  +
                " - Зарплата: " + salary;
    }
}
