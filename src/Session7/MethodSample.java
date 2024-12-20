package Session7;

public class MethodSample {
    public static void main(String[] args) {
    printMessage();
    showgreen("test");
    getMessage();
    System.out.println(getMessage());
    }
    public static void printMessage(){
        System.out.println("Message");
    }
    public static void showgreen(String name){
        System.out.println("Green" + name);
    }
    public static String getMessage(){
        showMessage();
        return "Hello";
    }
    public static void showMessage(){
        System.out.println("this is Message");

    }
}
