package Session8;
class Person1 {
    public static String name = "John";
}
public class StaticExample {
    public static void main(String[] args) {
        Person1 p = new Person1();
        Person1 p2 = new Person1();
        System.out.println(p.name);
        p2.name = "Jane";
        System.out.println(p2.name);
    }
}


