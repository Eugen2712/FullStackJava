package Session13;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String > studentGrades = new HashMap<>();
        studentGrades.put(101, "John");
        studentGrades.put(102, "Doe");
        studentGrades.put(11, "Jane");

        System.out.println(studentGrades);


        System.out.println(studentGrades.get(101));

        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
