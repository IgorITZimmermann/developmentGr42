package lesson15;

public class ErrorsToFind {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println("Проверка работы методов");
        int result = calculateDifference(10, 5);
        System.out.println("Разность чисел: " + result);
        printArray(data);
        int multiplicationResult = multiply(5, 3);
        System.out.println("Произведение чисел: " + multiplicationResult);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент массива: " + array[i]);
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int calculateDifference(int x, int y) {
        return x - y;
    }
}
