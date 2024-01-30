package lesson04;

public class Task05 {
    /*
    Рассчитайте общую продолжительность трех песен,
    если известна продолжительность каждой из них в секундах.
    Преобразуйте продолжительность каждой песни из секунд
    в минуты и секунды.
     */




        public static void main(String[] args) {
            int age = 47;
            String name = "Азамат";
        /* День недели имеет сой порядковый номер от 1 до 7, где понедельник это - 1,
        вторник - 2 и т.д.
         */
            int dayOffWork = 6;
            // Сегодня - воскресенье, задаю этому дню номер 7
            int today = 7;

            boolean result = dayOffWork <= today;

            System.out.println("В свои " + age + " годков " + name + " прилежно выполнял домашнее задание в свой выходной день.");
            System.out.println("А выходной ли сегодня день? " + result);




        float songOne = 130f;
        float songTwo = 120f;
        float songThree = 240f;

        float out = songOne + songTwo + songThree;
        float outsongOne = songOne/60;
        float outsongTwo = songTwo/60;
        float outsongThree = songThree/60;

        System.out.println(out);
        System.out.println(outsongOne);
        System.out.println(outsongTwo);
        System.out.println(outsongThree);

        //В минутах и секундах
        int firstSong = 100;
        int minutesFirstSong = firstSong / 60;
        int secondsFirstSong = firstSong - minutesFirstSong*60;
        System.out.println("Minutes " + minutesFirstSong + " Seconds " + secondsFirstSong);


    }

}
