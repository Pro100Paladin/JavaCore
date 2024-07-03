package seminar2;

import java.util.Scanner;

public class CaesarCode {
    public static void caesarCodeEncoder() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String code = scanner.nextLine();
        System.out.println("Введите ключ шифрования: ");
        int key = scanner.nextInt();

        char[] symbol = new char[code.length()];

        for (int i = 0; i < code.length(); i++) {
            if (Character.isLetter(code.charAt(i)) && Character.isUpperCase(code.charAt(i)))
                symbol[i] = (char) (code.charAt(i) + key);
            else if (Character.isLetter(code.charAt(i)) && Character.isLowerCase(code.charAt(i)))
                symbol[i] = (char) (code.charAt(i) + key);
            else symbol[i] = code.charAt(i);
        }
        System.out.println(symbol);
    }

    public static void caesarCodeDecoder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String code = scanner.nextLine();
        System.out.println("Введите ключ дешифровки: ");
        int key = scanner.nextInt() * -1;

        char[] symbol = new char[code.length()];

        for (int i = 0; i < code.length(); i++) {
            if
            (Character.isLetter(code.charAt(i)) && Character.isUpperCase(code.charAt(i)))
                symbol[i] = (char) (code.charAt(i) + key);
            else if
            (Character.isLetter(code.charAt(i)) && Character.isLowerCase(code.charAt(i)))
                symbol[i] = (char) (code.charAt(i) + key);
            else
                symbol[i] = code.charAt(i);
        }
        System.out.println(symbol);
    }

}
