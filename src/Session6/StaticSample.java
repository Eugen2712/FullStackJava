package Session6;

import java.util.EventListener;

public class StaticSample {
    public static void main(String[] args) {
      String result =  oddOrEven(12);
        System.out.println(result);
    }
    public static String oddOrEven(int inputNr) {
        if (inputNr % 2 == 0) {
            System.out.println("Result: " + inputNr % 2);
            return "Even";
        } else {
            System.out.println("Result: " + inputNr % 2);
            return "Odd";
        }
    }
}
