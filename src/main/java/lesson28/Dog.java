package lesson28;

public class Dog implements Animal{

    @Override
    public String makeSound() {
        System.out.println("Wuuf");
        return "WUUUUF";
    }
}
