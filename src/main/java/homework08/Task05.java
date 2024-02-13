package homework08;

import java.util.Scanner;

public class Task05 {
    /*
    /*
    Напечатать "пирамидку" из звездочек
    Высота пирамидки вводится с клавиатуры
    Примерный вид:
    *
    **
    ***
    ****
    *****
    *******
    ******
    *****
    ****
    ***
    **
    *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту треугольника: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            /*
            1. Число отрицательное
            2. Значение не является числом
            3. Длинная сторока (10к символов)
            4. Вводится знак   --> 2
            5. Дробное число
            6. Пустая строка
            7. Долгое время ввода
             */
            System.out.println("ERROR!!!");
        } else {
            String up = "";
            String down = "";
            String temp = "";
            for (int i = 1; i <= n; i++) {
                temp +=  "\u263A";
                up += temp + "\n";
                if (i != n) {
                    down = temp + "\n" + down;
                }
            }
            System.out.println(up + down);
        }

        System.out.println("Введите высоту:");
        scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
