package Session12;

interface  Flyable {
    void fly();
}

interface Liftable {
    void lift();
}

class Bird implements Flyable, Liftable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void lift() {
        System.out.println("Bird is lifting");
    }
}
class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}

public class Interfaces {
    public static void main(String[] args) {
      Bird bird = new Bird();
      Flyable plane = new Plane();
        bird.fly();
        bird.lift();
        plane.fly();
    }
}
