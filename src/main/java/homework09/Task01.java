package homework09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Калькулятор операций-------");
        boolean continueOperation = true;
        while (continueOperation) {
            System.out.println("Выбери операцию(сложение (+), вычитание (-), умножение (*), деление (/)) :  ");
            String operation = scanner.next();
            System.out.println("Введи первое число, с которым будет проведена операция: ");
            double number1 = scanner.nextDouble();
            System.out.println("Введи второе число, с которым будет проведена операция: ");
            double number2 = scanner.nextDouble();

            if (operation.equals("+")) {
                double sum = number1 + number2;
                System.out.println(sum);
            } else if (operation.equals("-")) {
                double difference = number1 - number2;
                System.out.println(difference);
            } else if (operation.equals("*")) {
                double valueOfProduct = number1 * number2;
                System.out.println(valueOfProduct);
            } else if (operation.equals("/")) {
                if (number2 != 0) {
                    double valueOfQuotient = number1 / number2;
                    System.out.println(valueOfQuotient);

                } else {
                    while (number2 == 0) {
                        System.out.println("Ошибка! Введи второе число еще раз:  ");
                        number2 = scanner.nextDouble();
                    }
                    double valueOfQuotient = number1 / number2;
                    System.out.println(valueOfQuotient);
                }
            }
            System.out.println("Хочешь продолжить? Да или Нет");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Нет")) {
                continueOperation = false;
                System.out.println("Конец");
                scanner.close();
            }
        }


        //-----------2----------------
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("Выберите операцию: +, -, *, /");
            String operation = sc.next();
            System.out.println("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = sc.nextInt();
            int result = 0;
            boolean valid = true;
            if (operation.equals("+")) {
                result = num1 + num2;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("*")) {
                result = num1 * num2;
            } else if (operation.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("Ошибка: неверная операция");
                valid = false;
            }
            if (valid) {
                System.out.println("Результат: " + result);
            }
            System.out.println("Хотите продолжить выполнение операций? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("n")) {
                repeat = false;
            }
        }
        sc.close();
    }
}
