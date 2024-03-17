package lesson15;

public class DogRegistration {
    public static void main(String[] args) {

        Dog dogMops = new Dog("Hatiko", "black","Mops",false,false);
        Dog dogMopsBerlin = new Dog("Hatiko", "black","Mops",false,false);
        Dog dogBulldog = new Dog("Bully", "while", "Max", false, true);

        Dog [] registrate = {dogMops, dogBulldog};
        for(Dog dog: registrate){
            System.out.println(dog.getName());
        }


        //System.out.println("Color: " + dogMops.getColor());
        //System.out.println("Color: " + dogBulldog.getColor());
    }
}
