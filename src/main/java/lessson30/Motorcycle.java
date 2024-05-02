package lessson30;

public class Motorcycle extends Vehicle{

    public Motorcycle(String brand) {
        super(brand);
    }


    @Override
    void start() {
        System.out.println("Mororcycle" + getBrand()+ " start");
    }
}
