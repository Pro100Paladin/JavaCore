package seminar2.hw2;

import static seminar2.hw2.Task1.countEvens;
import static seminar2.hw2.Task2.difference;
import static seminar2.hw2.Task3.truth;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        int[] array4 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] array5 = {-54, 10, 9, 5, 0, 0, 99, 10, 100};


        System.out.println("\u001b[34m" + "Количество чётных элементов:\n" + "\u001b[32m" + countEvens(array1));
        System.out.println(countEvens(array2));
        System.out.println(countEvens(array3));
        System.out.println(countEvens(array4));
        System.out.println(countEvens(array5));

        System.out.println();

        System.out.println("\u001b[34m" + "Разница между мин. и макс:\n" + "\u001b[32m" + difference(array1));
        System.out.println(difference(array2));
        System.out.println(difference(array3));
        System.out.println(difference(array4));
        System.out.println(difference(array5));

        System.out.println();

        System.out.println("\u001b[34m" + "Имеются ли два соседних элемента, с нулевым значением:\n" + "\u001b[32m" + truth(array1));
        System.out.println(truth(array2));
        System.out.println(truth(array3));
        System.out.println(truth(array4));
        System.out.println(truth(array5));
    }
}
