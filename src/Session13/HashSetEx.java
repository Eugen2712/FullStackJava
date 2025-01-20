package Session13;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("John");
        boolean isAdded = names.add("Jane");
        System.out.println(isAdded);
        boolean exists = names.contains("John");
        System.out.println(exists);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
