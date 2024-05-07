package lessson30;

import java.util.List;

abstract class Animal {

    //абстрактный метод
    abstract void makeSound();

    // конкретный метод
    void sleep(){
        System.out.println("Спит");
    }

    void eat(){
        System.out.println("Ест");
    }





}
