package lesson15;
public class ErrorPractice {
    private static int divisionResult;
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 100;
        int[] numbers = {1, 2, 3};
        String message = "Hello, world!";

        if (b == 0){
            System.out.println("Ошибка, нельзя делить на ноль");
        }
        else {
            divisionResult = divide(a, b);
            System.out.println("Результат деления: " + divisionResult);
        }

        System.out.println("Значение c: " + c);


        if (message.equals("Hello, world!")) {
            System.out.println("Приветствие обнаружено!");
        }
        else {
            System.out.println("Приветствие не обнаружено!");
        }

        for (int number : numbers) {
            System.out.println("Число: " + number);
        }
        if (isEven(a)) {
            System.out.println(a + " - четное число.");
        } else {
            System.out.println(a + " - нечетное число.");
        }
    }
    public static int divide(int x, int y) {
        if (y == 0){
            return  -1;
        }
        return x / y;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
