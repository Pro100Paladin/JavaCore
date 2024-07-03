package lesson2.homeWork2;


/**
 * 1. Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
**/
 public class Task1 {
    public static int countEvens(int[] arr){
//        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i : arr)
            if (i % 2 == 0) {
                count++;
            }
        return count;
    }
}
