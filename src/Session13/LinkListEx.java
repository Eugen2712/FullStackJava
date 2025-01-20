package Session13;

import java.util.LinkedList;

public class LinkListEx {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Doe");
        names.add("Jane");

        System.out.println(names);
        names.addFirst("First");
        names.addLast("Last");
        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }


    }
}
