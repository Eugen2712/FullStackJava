package Session12;
abstract class Vehicle {
   abstract void move();

   void fuel() {
       System.out.println("Filling fuel");
   }
}
class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {

    @Override
    void move() {
        System.out.println("Bike is moving");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fuel();
        Bike bike = new Bike();
        bike.move();
        bike.fuel();
        //AbstractClass abstractClass = new AbstractClass();
    }
}
