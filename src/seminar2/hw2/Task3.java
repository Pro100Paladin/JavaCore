package seminar2.hw2;


/**
 * 1.
 * 3. Написать функцию, возвращающую истину,
 * если в переданном массиве есть два соседних элемента,
 * с нулевым значением.
 **/
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 2, 0, 0};
        System.out.println(truth(array));
    }

    public static boolean truth(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}

