package Session6;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<>();
        studentList.put(1, "Eugen");
        studentList.put(2, "Mihai");
        studentList.put(3, "Andrei");
        studentList.put(4, "Ionut");

        System.out.println(studentList);
        studentList.put(2, "Mihai2");
        System.out.println(studentList);
    }
}
