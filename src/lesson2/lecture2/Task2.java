package lesson2.lecture2;

import java.util.Arrays;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 1, 2, 34, 1, 11, 4, 44, 32, 2, 2, 3, 4, 4, 5, 5, 5, 5, 2, 1};
        System.out.println("исходный: " + Arrays.toString(arr));
        System.out.println("сортировка: " + Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr) {
        int[] tmpArr = new int[arr.length];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println("map: " + map.toString());

        int i = 0;
        for (Integer key : map.keySet()) {
            for (int j = 0; j < map.get(key); j++) {
                tmpArr[i++] = key;
            }
        }
        return tmpArr;
    }
}
