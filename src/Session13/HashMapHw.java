package Session13;

import java.util.HashMap;

public class HashMapHw {
    public static void main(String[] args) {
        String words = "TiTle is the debut major-label studio album by American singer-songwriter Meghan Trainor (pictured), " +
                "released on January 9, 2015. Initially a songwriter for other artists in 2013, Trainor signed with Epic " +
                "Records the following year and began recording material she co-wrote with Kevin Kadish. They drew influence " +
                "from retro-styled music as they were tired of chasing radio trends. Title includes \"All About That Bass\", " +
                "which reached number one in 58 countries, and two other US Billboard Hot 100 top-10 singles: \"Lips Are Movin\" " +
                "and \"Like I'm Gonna Lose You\".";

        HashMap<Character, Integer> wordCount = new HashMap<>();
        for ( int i = 0; i < words.length(); i++ ) {
            if (wordCount.containsKey(words.charAt(i))){
                wordCount.put(words.charAt(i), wordCount.get(words.charAt(i)) + 1);
            } else {
                wordCount.put(words.charAt(i), 1);
            }
        }
        for (Character key : wordCount.keySet()) {
            System.out.println(key + "\t" + " Value = " + wordCount.get(key));
        }
    }
}
