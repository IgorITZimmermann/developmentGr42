package consultation;

import lesson11.Person;

public class TestJavaPerformance {
    static int i = 0;

    public static void main(String[] args) {
        while (true) {
            i = i*20000;
            System.out.println(i);
            Person person = new Person();
            person.setAge(i);
            System.out.println("Age" + person.getAge());
            i++;
        }
    }
}
