package homework04;

public class Homework {

    static String address = " Berlin";

    public static void main(String[] args) {
        /*
        Напишите программу, в которой вы объявите переменные
         для хранения вашего возраста,
         имени и является ли сегодня выходным (логическое значение).
          Инициализируйте эти переменные соответствующими значениями.
         */
        int age = 47;
        String name = "Azamat";
        int dayOfWork = 6;
        int today = 2;
        //Вариант 1
        boolean result = dayOfWork <= today;
        //Вариант 2
        boolean isWeekend = false;
        System.out.println("Age " + age + " Name " + name + "Weekend " + result + address);
        System.out.println("Age " + age + " Name " + name + "Weekend " + isWeekend);

        /*
        Создайте три переменные: две целочисленные переменные
         с любыми значениями и одну переменную для результата.
         Выполните суммирование первых двух переменных и сохраните
          результат в третьей переменной. Выведите результат на экран.
         */
        int num1 = 1356;
        int num2 = 1544;
        int sum = num1 + num2;
        System.out.println("Summa = " + sum);

        /*
        Объявите две строковые переменные и инициализируйте их названием песни
         и названием альбома. Создайте третью строковую переменную,
          которая будет содержать полную информацию,
           путем конкатенации (сложения) первых двух переменных.
            Выведите полную информацию на экран.
         */
        String album = "Zoom";
        String song = "My song";
        String zoomString = album + " " + song;
        System.out.println(zoomString);
        System.out.println("\"Zoom\"");
    }
}
