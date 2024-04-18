package lesson26;

public class AnimalTest {
    public static void main(String[] args) {
        Dog hatiko = new Dog("Hatiko");
        System.out.println(hatiko.getName());
        hatiko.eat();

        Bird bird = new Bird("Fenix");
        bird.eat();
    }
}
