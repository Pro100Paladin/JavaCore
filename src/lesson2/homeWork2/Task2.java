package lesson2.homeWork2;

/**
 * 2. Написать функцию, возвращающую разницу между самым большим и
 * самым маленьким элементами переданного не пустого массива.
 **/
public class Task2 {
    public static void main(String[] args) {
    }

    public static int difference(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (min > i)
                min = i;
            if (max < i)
                max = i;
        }
        return max - min;
    }
}

