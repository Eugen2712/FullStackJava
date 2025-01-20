package Session13;
class  Box<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public void display() {
        System.out.println("Value of t: " + t.getClass().getName());
    }
}
public class GenericEx {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());
        stringBox.display();

        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println(integerBox.get());
        integerBox.display();

    }
}
