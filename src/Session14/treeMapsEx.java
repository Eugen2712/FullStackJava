package Session14;

import java.util.Map;
import java.util.TreeMap;

public class treeMapsEx {
    public static void main(String[] args) {


        String sample = "Java is a simple and java is a powerful language";
        String[] words = sample.split(" ");

        TreeMap<String, Integer> counter = new TreeMap<>();
        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
