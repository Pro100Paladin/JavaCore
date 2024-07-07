package lesson3.homeWork3;

import java.util.List;

/**2. Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя,
 * модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 **/
public class Manager extends Employee{
    public Manager(String name, int day, int month, int year, String post, float salary) {
        super(name, day, month, year, post, salary);
    }

    public static void raiseSalaries(List<Employee> employees, double amount) {
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                e.setSalary((float) (e.getSalary() + amount));
            }
        }
    }

    @Override
    public String toString() {
        return "Руководитель" + super.toString().substring(8);
    }
}
