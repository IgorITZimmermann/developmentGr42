package homework08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
        System.out.println("--------------");

        //2
        int numberOne = 1;
        int numberTwo = number;
        while (numberOne <= 10) {
            int result = numberOne * numberTwo;
            System.out.println(numberOne + " * " + numberTwo + " = " + result);
            numberOne++;
        }

        //3
        System.out.println("-------3-------");
        numberOne = 1;
        do {
            int result = numberOne * numberTwo;
            System.out.println(numberOne + " * " + numberTwo + " = " + result);
            numberOne++;
        }
        while (numberOne <= 10);
        scanner.close();
    }
}
