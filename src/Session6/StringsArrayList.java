package Session6;

import java.util.ArrayList;

public class StringsArrayList {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Eugen");
        strList.add("Mihai");
        strList.add("Andrei");
        strList.add("Ionut");
        strList.add("Mihai");
        strList.add("Elena");
        System.out.println(strList);
        strList.remove(0);
        strList.remove("Mihai");
        System.out.println(strList);
       // strList.remove(100);

        System.out.println(strList.size());

    }
}
