package homework08;

public class Task01     {
    //Напечатать в консоль все парные числа (четные) от 1 до 20
    public static void main(String[] args) {
        int odd = 2;
        while (odd < 20) {
            if (odd % 2 == 0) {
                System.out.println(odd);
            }
            odd = odd + 2;
        }

        System.out.println("----2-----");

        odd = 2;
        while (odd <= 20) {
            System.out.println(odd);
            odd = odd + 2;
        }

        System.out.println("----3-----");
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }


}
