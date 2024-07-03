package seminar2.lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 7;

//        int[] resultArr = addNumber(arr, num);
        int[] resultArr = addIndex(arr, num, 0);

        System.out.println("исходный массив: " + Arrays.toString(arr));
        System.out.println("результат: " + Arrays.toString(resultArr));
    }

    public static int[] addNumber(int arr[], int num) {

        int[] tmpArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            tmpArr[i] = arr[i];
        }
        tmpArr[arr.length] = num;
        return tmpArr;
    }

    public static int[] addIndex(int[] arr, int num, int index) {

        if (!(index >= 0 && index <= arr.length)) {
            System.out.println("Индекс за пределами исходного массива");
            return null;
        } else if (index == arr.length) {
            return addNumber(arr, num);
        } else {
            int[] tmpArr = new int[arr.length + 1];
            int tmp = 0;

            for (int i = 0; i < arr.length + 1; i++) {
                if (i == index) {
                    tmpArr[i] = num;
                    tmp++;
                } else {
                    tmpArr[i] = arr[i - tmp];
                }
            }
            return tmpArr;
        }
    }

    //    решение преподавателя
    public static int[] insertIntoArray(int[] arr, int value, int index) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Индекс вышел за пределы массива: ");
        }
        int[] result = new int[arr.length + 1];

        System.arraycopy(arr, 0, result, 0, index);
        result[index] = value;

        System.arraycopy(arr, index, result, index + 1, arr.length - index);

        return result;
    }

    public static int[] insertIntoArray(int[] arr, int value) {
        return insertIntoArray(arr, value, arr.length);
    }
}
