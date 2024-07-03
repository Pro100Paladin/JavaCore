package seminar2;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicShiftingArray {

    public static void shiftingArray() {
        Scanner scanArray = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        String[] array = new String[Integer.parseInt(scanArray.nextLine())];
        String arr = null;
        System.out.println("Начните ввод");
        for (int i = 0; i < array.length; i++) {
            arr = scanArray.nextLine();
            array[i] = arr;
        }
        System.out.println(Arrays.toString(array));
    }
}

