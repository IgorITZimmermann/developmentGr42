package lesson21;

import java.util.HashSet;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i < 100; i++){
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Добавляю "  + randomNumber);
            hashSet.add(randomNumber);
            System.out.println(hashSet.hashCode());
        }

        System.out.println(hashSet.toArray().toString());
    }
}
