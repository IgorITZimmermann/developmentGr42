package lessson30;

abstract class Vehicle {

    private String brand;

    //Конструктор абстрактного класса
    public Vehicle(String brand) {
        this.brand = brand;
    }

    //абстрактный метод
    abstract void start();

    //Конкретный метод
    public void stop(){
        System.out.println("Vehicle stopped");
    }

    public String getBrand() {
        return brand;
    }
}
