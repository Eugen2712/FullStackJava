package Session13;

import java.util.HashMap;

public class ArrayTask {
    public static void main(String[] args) {
        String[] words = {"orange", "apple", "banana", "apple", "apple", "banana"};
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);
    }
}
