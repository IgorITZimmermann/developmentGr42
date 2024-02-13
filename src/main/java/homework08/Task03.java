package homework08;

import java.util.Scanner;

public class Task03 {
    //Пользователь вводит число, посчитать сумму всех
    // натуральных чисел, которые идут до него включительно.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int result = 0;
        while (num >= 1) {
            result = result + num;
            num--;
        }
        System.out.println("Сумма всех натуральных чисел " + +result);

        System.out.println("----2-----");
        System.out.println("Введите число: ");
        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;//sum = sum + i;
        }
        System.out.println(sum);

        int number;
        sum = 0;
        result = 0;
        System.out.println("----3-----");
        System.out.println("Введите число");
        number = scanner.nextInt();
        while (number != 0) {
            sum = number;
            System.out.println("sum " + sum);
            number--;
            System.out.println("number " + number);
            result += sum;
            System.out.println("result " + result);
        }
        System.out.println("Ответ: " + result);
    }

}
